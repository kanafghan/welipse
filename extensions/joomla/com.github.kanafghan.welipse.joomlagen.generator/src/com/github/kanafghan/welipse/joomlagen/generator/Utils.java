package com.github.kanafghan.welipse.joomlagen.generator;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.InputStream;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.SubProgressMonitor;
import org.eclipse.emf.ecore.EClass;

import com.github.kanafghan.welipse.joomlagen.GenClass;
import com.github.kanafghan.welipse.joomlagen.JoomlaGenModel;
import com.github.kanafghan.welipse.webdsl.ClassifierOperation;
import com.github.kanafghan.welipse.webdsl.CustomAction;
import com.github.kanafghan.welipse.webdsl.Expression;
import com.github.kanafghan.welipse.webdsl.Form;
import com.github.kanafghan.welipse.webdsl.Page;
import com.github.kanafghan.welipse.webdsl.PageElement;
import com.github.kanafghan.welipse.webdsl.Save;
import com.github.kanafghan.welipse.webdsl.StandardAction;

public class Utils {
	
	public enum ControllerType {
		FEController, ControllerAdmin, ControllerForm, BEController 
	}
	
	public enum ModelType {
		Model, ModelItem, ModelList, ModelForm, ModelAdmin
	}
	
	/**
	 * @deprecated
	 */
	public static final String SQL_TABLE_NAME_PREFIX = "#__";
	
	/**
	 * @deprecated
	 */
	public static final String MODEL_LIST_NAME_SUFFIX = "List";
	
	/**
	 * @deprecated
	 */
	public static final String CSS_FILES_SEPARATOR = ";";
	
	private static int counter;
	
	private static Utils instance;
	
	private Utils() {
		counter = 0;
	}
	
	public static synchronized Utils getInstance() {
		if (instance == null) {
			instance = new Utils();
		}
		return instance;
	}
	
	public int genID() {
		int id = ++counter;
		return id;
	}
	
	public static String generateID() {
		return ""+ getInstance().genID();
	}
	
	/**
	 * @deprecated Use {@link JoomlaGenModel.getExtensionName()}
	 * @param joomlaGenModel
	 * @return
	 */
	public static synchronized String getExtensionName(JoomlaGenModel joomlaGenModel) {
		if (joomlaGenModel.getExtensionName().isEmpty()) {
//			return joomlaGenModel.getExtension().getName();
		}
		return joomlaGenModel.getExtensionName();
	}
	
	/**
	 * @deprecated Use {@link JoomlaGenModel.getComponentName()}
	 * @param joomlaGenModel
	 * @return
	 */
	public static synchronized String getComponent(JoomlaGenModel joomlaGenModel) {
		return "com_"+ getExtensionName(joomlaGenModel).toLowerCase();
	}
	
	public static synchronized String toUpperFirst(String word) {
		if (word.length() > 0) {			
			return word.substring(0,1).toUpperCase() + word.substring(1);
		}
		return word;
	}
	
	/**
	 * @deprecated Use {@link JoomlaGenModel.getExtensionName().toUpperFirst()}
	 * @param joomlaGenModel
	 * @return
	 */
	public static synchronized String getComponentName(JoomlaGenModel joomlaGenModel) {
		return toUpperFirst(getExtensionName(joomlaGenModel));
	}

	public static synchronized String getPageName(Page page) {
		if (page != null) {			
			if (!page.getName().isEmpty()) {
				return page.getName();
			}
		}
		return "Page"+ generateID();
	}
	
	/**
	 * @deprecated Use {@link GenClass.getDatabaseTableName}
	 * @param table
	 * @param genModel
	 * @return
	 */
	public static synchronized String getTableName(EClass table, JoomlaGenModel genModel) {
		String name = table.getName().toLowerCase();
		return SQL_TABLE_NAME_PREFIX +
				getExtensionName(genModel) +
				'_' + name;
	}
	
	public static synchronized String getFileName(String path) {
		File file = new File(path);
		return file.getName();
	}
	
	public static synchronized IFolder getFolder(IFolder folder, IProgressMonitor monitor) throws CoreException {
		if (!folder.exists()) {
			monitor = monitor == null ? new NullProgressMonitor() : monitor;
			folder.create(true, false, monitor);
			Utils.generateBlankPage(folder, monitor);
		}
		return folder;
	}
	
	public static synchronized void generateBlankPage(IFolder folder, IProgressMonitor monitor) throws CoreException {
		IFile index = folder.getFile("index.html");
		if (!index.exists()) {
			String html = "<html><body bgcolor=\"#FFFFFF\"></body></html>";
			InputStream contents = new ByteArrayInputStream(html.getBytes());
			index.create(contents , true, new SubProgressMonitor(monitor, 1));
		}
	}
	
	public static synchronized Expression getFormObject(Form form) {
		for (PageElement element : form.getElements()) {
			if (element instanceof StandardAction) {
				if (element instanceof Save) {
					return ((Save) element).getPerformer();
				}
			} else if (element instanceof CustomAction) {
				CustomAction customAction = (CustomAction) element;
				Expression performer = customAction.getPerformer();
				if (performer instanceof ClassifierOperation) {
					ClassifierOperation expression = (ClassifierOperation) performer;
					return expression.getSource();
				}
			}
		}
		return null;
	}
	
	public static synchronized Page getElementPage(PageElement pageElement) {
		if (pageElement != null) {
			if (pageElement.getPage() != null) {
				return pageElement.getPage();
			}
			return getElementPage((PageElement) pageElement.eContainer());
		}
		
		return null;
	}
}
