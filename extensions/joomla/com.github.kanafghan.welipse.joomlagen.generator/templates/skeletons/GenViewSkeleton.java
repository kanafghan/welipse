import com.github.kanafghan.welipse.joomlagen.generator.*;
import com.github.kanafghan.welipse.joomlagen.generator.context.*;
import com.github.kanafghan.welipse.webdsl.*;
import com.github.kanafghan.welipse.webdsl.List;

import java.util.*;

import org.eclipse.emf.ecore.*;

public class CLASS extends JExtension {

	protected Page page;
	protected java.util.List<EClass> models;
	
	protected java.util.List<PageElement> elements;
	protected List list;
	protected Text text;
	protected StaticText sText;
	protected DynamicText dText;
	protected Image img;
	protected StaticImage sImg;
	protected DynamicImage dImg;
	protected Link link;
	protected InternalLink iLink;
	protected ExternalLink xLink;
	
	protected void initialize(Object argument) {
		ViewContext viewContext = (ViewContext) argument; 
		this.joomlaGenModel = viewContext.getContext().getGenModel();
		this.page = viewContext.getPage();
		this.models = new ArrayList<EClass>();
		this.extractModels((java.util.List<PageElement>) this.page.getElements());
		this.elements = new ArrayList<PageElement>();
	}
	
	private void extractModels(java.util.List<PageElement> elements) {
		for (PageElement element : elements) {
			if (element instanceof DynamicText) {
				ETypedElement content = ((DynamicText) element).getContent();
				if (content instanceof EStructuralFeature) {
					EStructuralFeature structuralFeature = (EStructuralFeature) content;
					if (!models.contains(structuralFeature.getEContainingClass())) {						
						models.add(structuralFeature.getEContainingClass());
					}
				}
			}
			if (element instanceof List) {
				List list = (List) element;
				if (!models.contains(list.getType())) {					
					models.add(list.getType());
				}
				this.extractModels((java.util.List<PageElement>) list.getContent());
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
	
	private java.util.List<PageElement> getElements() {
		if (page != null) {			
			return (java.util.List<PageElement>) this.page.getElements();
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
	
	private String getStaticImageSource(StaticImage sImg) {
		String src = "";
		if (sImg.isIsURL()) {
			src = sImg.getSource();
			return src;
		} else {
			src += "<?php echo JURI::base(); ?>media/";
			src += this.getExtensionName();
			src += "/images/"+ Utils.getImageName(sImg.getSource());
			return src;
		}
	}
	
	private String getDynamicImageSource(DynamicImage dImg) {
		//TODO implementation needed
		String src = "";
		if (dImg.isIsURL()) {
			src = "";
			return src;
		} else {
			src = "";
			return src;
		}
	}
	
	public String generate(Object argument) {
		return "";
	}
}
