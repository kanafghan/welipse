import com.github.kanafghan.welipse.joomlagen.generator.*;
import com.github.kanafghan.welipse.joomlagen.generator.context.*;
import com.github.kanafghan.welipse.webdsl.*;

import java.util.*;

import org.eclipse.emf.ecore.*;

public class CLASS extends JExtension {

	protected FormContext context;
	protected EClass model;
	
	protected void initialize(Object argument) {
		FormContext formContext = (FormContext) argument; 
		this.joomlaGenModel = formContext.getContext().getGenModel();
		this.model = formContext.getModel();
		this.context = formContext;
	}
	
	private java.util.List<EAttribute> getFields() {
		return (java.util.List<EAttribute>) this.model.getEAllAttributes();
	}
	
	private String getFieldType(EAttribute field) {
		if (field.getEType().getName().equals("EString") || field.getEType().getName().equals("EInt")) {
			return "text";
		}
		if (field.getEType().getName().equals("EDate")) {
			return "calendar";
		}
		
		return "text";
	}
	
	public String generate(Object argument) {
		return "";
	}
}
