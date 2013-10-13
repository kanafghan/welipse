import com.github.kanafghan.welipse.joomlagen.generator.*;
import com.github.kanafghan.welipse.joomlagen.generator.Utils.ModelType;
import com.github.kanafghan.welipse.joomlagen.generator.context.*;
import com.github.kanafghan.welipse.webdsl.*;

import java.util.*;

import org.eclipse.emf.ecore.*;

public class CLASS extends JExtension {

	protected ModelContext context;
	protected EClass model;
	
	protected void initialize(Object argument) {
		ModelContext modelContext = (ModelContext) argument; 
		this.joomlaGenModel = modelContext.getContext().getGenModel();
		this.model = modelContext.getModel();
		this.context = modelContext;
	}
	
	private String getType() {
		String type = "";
		switch (this.context.getType()) {
			case ModelList:
				type = "ModelList";
				break;
			case ModelItem:
				type = "ModelItem";
				break;
			case ModelForm:
				type = "ModelForm";
				break;
			case ModelAdmin:
				type = "ModelAdmin";
				break;
			case Model:
			default:
				type = "Model";
				break;
		}
		return type;
	}
	
	private String getName() {
		String name = this.getModelName();
		if (this.context.getType() == ModelType.ModelList) {
			name += Utils.MODEL_LIST_NAME_SUFFIX;
		}
		return name;
	}
	
	private String getModelName() {
		return Utils.toUpperFirst(this.model.getName());
	}
	
	private String getTableName() {
		return Utils.getTableName(this.model, joomlaGenModel);
	}
	
	private java.util.List<EOperation> getOperations() {
		return (java.util.List<EOperation>) this.model.getEAllOperations();
	}
	
	private String getOperationType(EOperation operation) {
		String type = "mixed";
		EClassifier eType = operation.getEType();
		if (eType != null) {
			type = eType.getName().toLowerCase();
		}
		return type;
	}
	
	private String generateOperationParameters(EOperation operation) {
		String params = "";
		if (operation.getEParameters().size() > 0) {
			EParameter param = operation.getEParameters().get(0);
			if (param != null) {
				params += "$"+ param.getName();
			}
		}
		
		for (int i = 1; i < operation.getEParameters().size(); i++) {
			params += ", $"+ operation.getEParameters().get(i).getName();
		}
		
		return params;
	}
	
	private String generateOperationReturnStatement(EOperation operation) {
		EClassifier type = operation.getEType();
		if (type != null) {
			if (type.getName().equals("EInt")) {
				return operation.getUpperBound() > 1 ? "return array();" : "return 0;";
			}
			if (type.getName().equals("EString")) {
				return operation.getUpperBound() > 1 ? "return array();" : "return '';";
			}
			if (type.getName().equals("EBoolean")) {
				return operation.getUpperBound() > 1 ? "return array();" : "return false;";
			}
			return operation.getUpperBound() > 1 ? "return array();" : "return '';";
		}
		return "";
	}
	
	private boolean isFormBasedModel() {
		return context.getType() == ModelType.ModelForm 
				|| context.getType() == ModelType.ModelAdmin;
	}
	
	private boolean isListBasedModel() {
		return context.getType() == ModelType.ModelList;
	}
	
	public String generate(Object argument) {
		return "";
	}
}
