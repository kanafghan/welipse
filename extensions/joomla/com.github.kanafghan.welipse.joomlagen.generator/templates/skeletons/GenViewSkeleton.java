import java.util.ArrayList;

import com.github.kanafghan.welipse.joomlagen.generator.*;
import com.github.kanafghan.welipse.joomlagen.generator.Utils.ModelType;
import com.github.kanafghan.welipse.joomlagen.generator.context.*;
import com.github.kanafghan.welipse.webdsl.*;

import org.eclipse.emf.ecore.*;

public class CLASS extends JExtension {

	protected ViewContext context;
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
		this.context = viewContext;
		this.page = viewContext.getPage();
		this.models = new ArrayList<EClass>();
		if (this.page != null) {			
			this.extractModels((java.util.List<PageElement>) this.page.getElements());
		}
		this.elements = new ArrayList<PageElement>();
	}
	
	private boolean isListView() {
		return this.context.getModelType() == ModelType.ModelList;
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
		if (this.page != null) {			
			return Utils.toUpperFirst(this.page.getName());
		}
		if (this.context.getModel() != null) {
			if (this.isListView()) {
				return Utils.toUpperFirst(this.context.getModel().getName()) 
						+ Utils.MODEL_LIST_NAME_SUFFIX;
			} else {
				return Utils.toUpperFirst(this.context.getModel().getName());
			}
		}
		return "";
	}
	
	private String getListViewName() {
		return this.getViewName() + Utils.MODEL_LIST_NAME_SUFFIX;
	}
	
	private String getModelName(EClass model) {
		return Utils.toUpperFirst(model.getName());
	}
	
	private String getFormName() {
		return this.context.getModel().getName();
	}
	
	private String echoField(EAttribute field) {
		String result = "$this->escape($item->"+ field.getName() +")";
		
		if (field.getEType().getName().equals("EInt")) {
			result = "$item->"+ field.getName();
		}
		
		return result;
	}
	
	private boolean isEditView() {
		return this.context.getModelType() == ModelType.ModelAdmin;
	}
	
	private boolean isEditLayout() {
		return this.context.getModel() != null && isEditView();
	}
	
	private java.util.List<EAttribute> getFormFields() {
		return (java.util.List<EAttribute>) this.context.getModel().getEAllAttributes();
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
			InternalLink lnk = (InternalLink) link;
			url = "?option="+ getComponent();
			PageElement target = lnk.getTarget();
			if (target != null) {				
				Page targetPage = target.getPage();
				if (targetPage != null) {
					url += "&view="+ targetPage.getName().toLowerCase();
					if (lnk.getContent() instanceof DynamicText) {
						DynamicText dTxt = (DynamicText) lnk.getContent();
						url += "&id=<?php echo $this->"+ getObjectName(dTxt.getContent()) +"->id; ?>"; 
					}
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
			EClass cls = (EClass) dImg.getSource().getEType();
			src = "$this->"+ cls.getName().toLowerCase() +"->"+ dImg.getSource().getName();
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
