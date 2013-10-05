import java.util.*;

import com.github.kanafghan.welipse.joomlagen.generator.*;
import com.github.kanafghan.welipse.joomlagen.generator.context.*;
import com.github.kanafghan.welipse.webdsl.PageElement;

import org.eclipse.emf.ecore.*;

public class CLASS extends JExtension {
	
	protected EPackage datamodel;
	
	protected void initialize(Object argument) {
		Context context = (Context) argument;
		this.joomlaGenModel = context.getGenModel();
		this.datamodel = this.joomlaGenModel.getDatamodel();
	}

	protected List<EClass> getTables() {
		List<EClass> classes = new ArrayList<EClass>();
		if (this.datamodel != null) {
			for (EClassifier classifier : this.datamodel.getEClassifiers()) {
				if (classifier instanceof EClass) {
					classes.add((EClass) classifier);
				}
			}
		}
		return classes;
	}
	
	protected List<EAttribute> getTableFields(EClass table) {
		List<EAttribute> fields = new ArrayList<EAttribute>();
		for (EAttribute field : table.getEAllAttributes()) {
			fields.add(field);
		}
		return fields;
	}
	
	protected String getTableName(EClass object) {
		return Utils.getTableName(object, this.joomlaGenModel);
	}
	
	protected String getTableFieldType(EAttribute field) {
		if (field.getEType().getName().equals("EString")) {
			return "varchar(250)";
		}
		if (field.getEType().getName().equals("EInt")) {
			return "int(11)";
		}
		if (field.getEType().getName().equals("EDate")) {
			return "date";
		}
		
		return "varchar(20)";
	}
	
	public String generate(Object argument) {
		return "";
	}
	
}
