package com.github.kanafghan.welipse.webdsl.expressions;

import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.ETypedElement;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;

import com.github.kanafghan.welipse.webdsl.ClassifierOperation;
import com.github.kanafghan.welipse.webdsl.Expression;
import com.github.kanafghan.welipse.webdsl.ExternalLink;
import com.github.kanafghan.welipse.webdsl.Image;
import com.github.kanafghan.welipse.webdsl.Page;
import com.github.kanafghan.welipse.webdsl.PageElement;
import com.github.kanafghan.welipse.webdsl.Parameter;
import com.github.kanafghan.welipse.webdsl.PresentationElement;
import com.github.kanafghan.welipse.webdsl.PropertyOperation;
import com.github.kanafghan.welipse.webdsl.StructuralExp;
import com.github.kanafghan.welipse.webdsl.Text;
import com.github.kanafghan.welipse.webdsl.VariableInitialization;
import com.github.kanafghan.welipse.webdsl.WebDSLPackage;
import com.github.kanafghan.welipse.webdsl.parsers.ExpressionsLanguage;

public class ExpressionsAnalyzer {
	
	private EditingDomain editingDomain;
	private Page page;
	private PresentationElement element;
	private String expression;	
	
	public ExpressionsAnalyzer(EditingDomain editingDomain, 
			PresentationElement element,
			String expression) {
		this.editingDomain = editingDomain;
		this.element = element;
		this.expression = expression;
	}
	
	public ExpressionsAnalyzer(EditingDomain editingDomain, 
			Page page, 
			String expression) {
		this.editingDomain = editingDomain;
		this.page = page;
		this.expression = expression;
	}

	public void analyzeExpression() {
		final Job job = new Job("Analyzing expression: "+ expression) {
			@Override
			protected IStatus run(IProgressMonitor monitor) {
				String PLUGIN_ID = "com.github.kanafghan.welipse.webdsl";
				
				// initialize the parser
				ExpressionsLanguage parser = ExpressionsLanguage.getInstace();
				parser.setExpression(expression);
				
				try {
					// parse the expression
					Expression e = parser.getExpression();
					if (e != null) {
						// Initialize the expression
						e.initialize(getPage(element));
						
						// Type check the expression
						EClassifier type = e.type();
						
						// Create and execute the command
						EClass eClass = element.eClass();
					    EStructuralFeature f = null;
						if (element instanceof Text) {
							f = eClass.getEStructuralFeature(WebDSLPackage.TEXT__CONTENT);
						} else if (element instanceof Image) {
							f = eClass.getEStructuralFeature(WebDSLPackage.IMAGE__SOURCE);
						} else if (element instanceof com.github.kanafghan.welipse.webdsl.List) {
							if (e instanceof PropertyOperation) {
								ETypedElement elem = null;
								if (e instanceof ClassifierOperation) {
									elem = ((ClassifierOperation) e).getOperation();
								} else if (e instanceof StructuralExp) {
									elem = ((StructuralExp) e).getFeature();
								}
								
								if (elem != null) {
									if (!(elem.getUpperBound() > 1 || elem.getUpperBound() == -1)) {
										editingDomain.getCommandStack().undo();
										return new Status(Status.ERROR, PLUGIN_ID,
											"The expression '"+ expression +"' is not a valid expression for the "
												+ "collection property of the list. It must result in a "
												+ "list of elements of type "+ type.getName());
									}
								}
							} else {
								editingDomain.getCommandStack().undo();
								return new Status(Status.ERROR, PLUGIN_ID,
										"The expression '"+ expression +"' is not a valid expression for the "
											+ "collection property of the list. It must be either a "
											+ "classifier operation or a structural expression.");
							}
							f = eClass.getEStructuralFeature(WebDSLPackage.LIST__COLLECTION);
						} else if (element instanceof ExternalLink) {
							f = eClass.getEStructuralFeature(WebDSLPackage.EXTERNAL_LINK__TARGET);
						}
						
						if (f != null) {											
							editingDomain.getCommandStack().execute(SetCommand.create(editingDomain, element, f, e));
						}
					} else {
						editingDomain.getCommandStack().undo();
						return new Status(Status.ERROR, PLUGIN_ID,
								"The expression '"+ expression +"' could not be parsed.");
					}
				} catch (Exception e) {
					editingDomain.getCommandStack().undo();
					return new Status(Status.ERROR, PLUGIN_ID,
							"The expression '"+ expression +"' could not be parsed: "+ e.getMessage(), e);
				} catch (Error e) {
					editingDomain.getCommandStack().undo();
					return new Status(Status.ERROR, PLUGIN_ID,
							"The expression '"+ expression +"' is not correct: "+ e.getMessage(), e);
				}
				
				monitor.worked(1);
				return new Status(Status.OK, PLUGIN_ID, "Analyzed successfully.");
			}
		};
	
		// enqueue the job
		job.setRule(ResourcesPlugin.getWorkspace().getRoot());
		job.setUser(true);
		job.schedule();							
	}

	//TODO this is a fix - we should do something about the context of initialization
	protected Page getPage(PageElement pageElement) {
		if (pageElement.getPage() != null) {
			return pageElement.getPage();
		}
		return getPage((PageElement) pageElement.eContainer());
	}

	public void analyzeVariable() {
		final Job job = new Job("Analyzing variable: "+ expression) {
			@Override
			protected IStatus run(IProgressMonitor monitor) {
				String PLUGIN_ID = "com.github.kanafghan.welipse.webdsl";
				
				// initialize the parser
				ExpressionsLanguage parser = ExpressionsLanguage.getInstace();
				parser.setExpression(expression);
				
				try {
					// parse the parameter declaration
					VariableInitialization var = parser.getVariable();
					if (var != null) {
						// Initialize the variable
						var.initialize(page);
						
						EClassifier type = var.getInitExp().type();
						if (type == null) {
							editingDomain.getCommandStack().undo();
							return new Status(Status.ERROR, PLUGIN_ID,
									"The type of the expresion  in the variable declaration '"
											+ expression +"' is not defined.");
						}
						
						if (!var.getType().getName().equals(type.getName())) {
							editingDomain.getCommandStack().undo();
							return new Status(Status.ERROR, PLUGIN_ID,
									"The type of the variable in '"+ expression +"' is different from the "
											+ "expression initializing it. (variable type: "
											+ var.getType().getName() +", expression type: "
											+ type.getName());
						}
						
						// Create and execute the command
						EClass eClass = page.eClass();
					    EStructuralFeature f = eClass.getEStructuralFeature(WebDSLPackage.PAGE__VARIABLES);
					    editingDomain.getCommandStack().execute(AddCommand.create(editingDomain, page, f, var));
					} else {
						editingDomain.getCommandStack().undo();
						return new Status(Status.ERROR, PLUGIN_ID,
								"The variable declaration '"+ expression +"' could not be parsed.");
					}
				} catch (Exception e) {
					editingDomain.getCommandStack().undo();
					return new Status(Status.ERROR, PLUGIN_ID,
							"The variable declaration '"+ expression +"' could not be parsed: "+ e.getMessage(), e);
				} catch (Error e) {
					editingDomain.getCommandStack().undo();
					return new Status(Status.ERROR, PLUGIN_ID,
							"The variable declaration '"+ expression +"' is not correct: "+ e.getMessage(), e);
				}
				
				monitor.worked(1);
				return new Status(Status.OK, PLUGIN_ID, "Analyzed successfully.");
			}
		};
	
		// enqueue the job
		job.setRule(ResourcesPlugin.getWorkspace().getRoot());
		job.setUser(true);
		job.schedule();
	}

	public void analyzeParameter() {
		final Job job = new Job("Analyzing parameter: "+ expression) {
			@Override
			protected IStatus run(IProgressMonitor monitor) {
				String PLUGIN_ID = "com.github.kanafghan.welipse.webdsl";
				
				// initialize the parser
				ExpressionsLanguage parser = ExpressionsLanguage.getInstace();
				parser.setExpression(expression);
				
				try {
					// parse the parameter declaration
					Parameter param = parser.getParameter();
					if (param != null) {
						// Initialize the expression
						param.initialize(page);
						
						// Create and execute the command
						EClass eClass = page.eClass();
					    EStructuralFeature f = eClass.getEStructuralFeature(WebDSLPackage.PAGE__PARAMETERS);
					    editingDomain.getCommandStack().execute(AddCommand.create(editingDomain, page, f, param));
					} else {
						editingDomain.getCommandStack().undo();
						return new Status(Status.ERROR, PLUGIN_ID,
								"The parameter '"+ expression +"' could not be parsed.");
					}
				} catch (Exception e) {
					editingDomain.getCommandStack().undo();
					return new Status(Status.ERROR, PLUGIN_ID,
							"The parameter '"+ expression +"' could not be parsed: "+ e.getMessage(), e);
				} catch (Error e) {
					editingDomain.getCommandStack().undo();
					return new Status(Status.ERROR, PLUGIN_ID,
							"The parameter declaration '"+ expression +"' is not correct: "+ e.getMessage(), e);
				}
				
				monitor.worked(1);
				return new Status(Status.OK, PLUGIN_ID, "Analyzed successfully.");
			}
		};
	
		// enqueue the job
		job.setRule(ResourcesPlugin.getWorkspace().getRoot());
		job.setUser(true);
		job.schedule();									
	}

	public void analyzeIteratorVariable() {
		final Job job = new Job("Analyzing iterator variable: "+ expression) {
			@Override
			protected IStatus run(IProgressMonitor monitor) {
				String PLUGIN_ID = "com.github.kanafghan.welipse.webdsl";
				
				// initialize the parser
				ExpressionsLanguage parser = ExpressionsLanguage.getInstace();
				parser.setExpression(expression);
				
				try {
					// parse the declaration (as a parameter)
					Parameter iteratorVar = parser.getParameter();
					if (iteratorVar != null) {
						// Initialize the expression
						iteratorVar.initialize(getPage(element));
						
						// Create and execute the command
						EClass eClass = element.eClass();
					    EStructuralFeature f = eClass.getEStructuralFeature(WebDSLPackage.LIST__ITERATOR_VARIABLE);
					    editingDomain.getCommandStack().execute(SetCommand.create(editingDomain, element, f, iteratorVar));
					} else {
						editingDomain.getCommandStack().undo();
						return new Status(Status.ERROR, PLUGIN_ID,
								"The iterator variable '"+ expression +"' could not be parsed.");
					}
				} catch (Exception e) {
					editingDomain.getCommandStack().undo();
					return new Status(Status.ERROR, PLUGIN_ID,
							"The iterator variable '"+ expression +"' could not be parsed: "+ e.getMessage(), e);
				} catch (Error e) {
					editingDomain.getCommandStack().undo();
					return new Status(Status.ERROR, PLUGIN_ID,
							"The iterator variable declaration '"+ expression +"' is not correct: "+ e.getMessage(), e);
				}
				
				monitor.worked(1);
				return new Status(Status.OK, PLUGIN_ID, "Analyzed successfully.");
			}
		};
	
		// enqueue the job
		job.setRule(ResourcesPlugin.getWorkspace().getRoot());
		job.setUser(true);
		job.schedule();
	}
	
	public void setExpression(String expression) {
		this.expression = expression;
	}

	public void setEditingDomain(EditingDomain editingDomain) {
		this.editingDomain = editingDomain;
	}

	public void setPage(Page page) {
		this.page = page;
	}

	public void setElement(PresentationElement element) {
		this.element = element;
	}
}
