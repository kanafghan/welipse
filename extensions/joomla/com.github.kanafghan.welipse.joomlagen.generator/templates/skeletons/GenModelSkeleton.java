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
	
	public String generate(Object argument) {
		return "";
	}
}
