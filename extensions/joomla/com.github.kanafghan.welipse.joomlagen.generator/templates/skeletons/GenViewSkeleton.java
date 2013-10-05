import com.github.kanafghan.welipse.joomlagen.generator.*;
import com.github.kanafghan.welipse.joomlagen.generator.context.*;
import com.github.kanafghan.welipse.webdsl.*;

import java.util.*;

import org.eclipse.emf.ecore.*;

public class CLASS extends JExtension {

	protected Page page;
	protected List<EClass> models;
	
	protected void initialize(Object argument) {
		ViewContext viewContext = (ViewContext) argument; 
		this.joomlaGenModel = viewContext.getContext().getGenModel();
		this.page = viewContext.getPage();
		this.models = new ArrayList<EClass>();
		for (PageElement element : this.page.getElements()) {
			if (element instanceof DynamicText) {
				ETypedElement content = ((DynamicText) element).getContent();
				if (content instanceof EStructuralFeature) {
					EStructuralFeature structuralFeature = (EStructuralFeature) content;
					models.add(structuralFeature.getEContainingClass());
				}
			}
		}
	}
	
	private String getViewName() {
		String name = this.page.getName();
		return name.substring(0,1).toUpperCase() + name.substring(1);
	}
	
	private String getModelName(EClass model) {
		String name = model.getName();
		return name.substring(0,1).toUpperCase() + name.substring(1);
	}
	
	private List<PageElement> getElements() {
		if (page != null) {			
			return (List<PageElement>) this.page.getElements();
		}
		return new ArrayList<PageElement>();
	}
	
	private String buildURL(Link link) {
		String url = "";
		if (link instanceof InternalLink) {
			url = "?option="+ getComponent();
			PageElement target = ((InternalLink) link).getTarget();
			if (target != null) {				
				Page targetPage = target.getPage();
				if (targetPage != null) {
					url += "&view="+ targetPage.getName().toLowerCase();
				}
			}
		}
		return url;
	}
	
	private String getObjectName(ETypedElement element) {
		if (element instanceof EStructuralFeature) {			
			return ((EStructuralFeature) element).getEContainingClass().getName().toLowerCase();
		}
		return " ";
	}
	
	private String getObjectAttributeName(ETypedElement element) {
		return element.getName().toLowerCase();
	}
	
	private boolean hasModels() {
		return !this.models.isEmpty();
	}
	
	public String generate(Object argument) {
		return "";
	}
}
