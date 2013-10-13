import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EPackage;

import com.github.kanafghan.welipse.joomlagen.generator.*;
import com.github.kanafghan.welipse.joomlagen.generator.Utils.ControllerType;
import com.github.kanafghan.welipse.joomlagen.generator.context.*;

public class CLASS extends JExtension {

	protected ControllerContext context;

	protected void initialize(Object argument) {
		ControllerContext context = (ControllerContext) argument; 
		this.joomlaGenModel = context.getContext().getGenModel();
		this.context = context;
	}
	
	private String getName() {
		return Utils.toUpperFirst(this.context.getName());
	}
	
	private String getModelName() {
		if (this.context.getModel() != null) {			
			return this.context.getModel().getName();
		}
		return getName();
	}
	
	private String getType() {
		String type = "";
		switch (this.context.getType()) {
		case ControllerAdmin:
			type = "ControllerAdmin";
			break;
		case ControllerForm:
			type = "ControllerForm";
			break;
		case Controller:
		default:
			type = "Controller";
			break;
		}
		return type;
	}
	
	private boolean isMain() {
		return this.context.isMain();
	}
	
	private boolean isBackEnd() {
		return this.context.isBackEndController();
	}
	
	private boolean isFormBased() {
		return this.context.getType() == ControllerType.ControllerForm;
	}
	
	private boolean isAdmin() {
		return this.context.getType() == ControllerType.ControllerAdmin;
	}
	
	private String getListViewName() {
		return (this.context.getName() + Utils.MODEL_LIST_NAME_SUFFIX).toLowerCase();
	}
	
	private String getDefaultView() {
		if (this.context.isBackEndController()) {
			if (this.joomlaGenModel != null) {
				// Get and return the name of the first class
				EPackage data = this.joomlaGenModel.getDatamodel();
				if (data != null) {
					for (EClassifier classifier : data.getEClassifiers()) {
						if (classifier instanceof EClass) {
							return classifier.getName().toLowerCase() 
									+ Utils.MODEL_LIST_NAME_SUFFIX.toLowerCase();
						}
					}
				}
			}
			return "";
		} 
		return getHomePageName();
	}
	
	public String generate(Object argument) {
		return "";
	}
}
