import com.github.kanafghan.welipse.joomlagen.generator.*;
import com.github.kanafghan.welipse.joomlagen.generator.context.*;
import com.github.kanafghan.welipse.webdsl.*;

import java.util.*;

import org.eclipse.emf.ecore.*;

public class CLASS extends JExtension {

	protected EClass model;
	
	protected void initialize(Object argument) {
		ModelContext modelContext = (ModelContext) argument; 
		this.joomlaGenModel = modelContext.getContext().getGenModel();
		this.model = modelContext.getModel();
	}
	
	private String getModelName() {
		String name = this.model.getName();
		return name.substring(0,1).toUpperCase() + name.substring(1);
	}
	
	private java.util.List<EOperation> getOperations() {
		return (java.util.List<EOperation>) this.model.getEAllOperations();
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
	
	public String generate(Object argument) {
		return "";
	}
}
