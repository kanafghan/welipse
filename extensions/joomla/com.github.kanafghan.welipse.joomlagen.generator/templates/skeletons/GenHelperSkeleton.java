import com.github.kanafghan.welipse.joomlagen.JoomlaGenModel;
import com.github.kanafghan.welipse.joomlagen.generator.*;
import com.github.kanafghan.welipse.joomlagen.generator.Utils.ModelType;
import com.github.kanafghan.welipse.joomlagen.generator.context.*;
import com.github.kanafghan.welipse.webdsl.*;

import java.util.*;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.*;

public class CLASS extends JExtension {

	protected HelperContext context;
	
	protected void initialize(Object argument) {
		HelperContext helperContext = (HelperContext) argument; 
		this.joomlaGenModel = helperContext.getContext().getGenModel();
		this.context = helperContext;
	}
	
	private String getHelperName() {
		return Utils.toUpperFirst(this.context.getName());
	}
	
	private String getLinkbarLabel(EClass view) {
		return view.getName();
	}
	
	private String getViewName(EClass view) {
		return view.getName().toLowerCase() + Utils.MODEL_LIST_NAME_SUFFIX.toLowerCase();
	}
	
	private List<EClass> getLinkbarViews() {
		List<EClass> result = new ArrayList<EClass>();
		if (this.joomlaGenModel != null) {
			EPackage dataModel = this.joomlaGenModel.getDatamodel();
			if (dataModel != null) {
				EList<EClassifier> models = dataModel.getEClassifiers();
				for (EClassifier classifier : models) {
					if (classifier instanceof EClass) {
						result.add((EClass) classifier);
					}
				}	
			}	
		}
		return result;
	}
	
	public String generate(Object argument) {
		return "";
	}
}
