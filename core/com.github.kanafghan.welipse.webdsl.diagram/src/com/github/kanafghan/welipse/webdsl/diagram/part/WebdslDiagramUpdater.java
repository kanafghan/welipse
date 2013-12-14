package com.github.kanafghan.welipse.webdsl.diagram.part;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.update.DiagramUpdater;

import com.github.kanafghan.welipse.webdsl.ActualParameter;
import com.github.kanafghan.welipse.webdsl.ExternalLink;
import com.github.kanafghan.welipse.webdsl.Group;
import com.github.kanafghan.welipse.webdsl.Image;
import com.github.kanafghan.welipse.webdsl.InternalLink;
import com.github.kanafghan.welipse.webdsl.Page;
import com.github.kanafghan.welipse.webdsl.PageElement;
import com.github.kanafghan.welipse.webdsl.Parameter;
import com.github.kanafghan.welipse.webdsl.Text;
import com.github.kanafghan.welipse.webdsl.VariableInitialization;
import com.github.kanafghan.welipse.webdsl.WebDSLPackage;
import com.github.kanafghan.welipse.webdsl.Website;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.ActualParameterEditPart;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.ExternalLink2EditPart;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.ExternalLink3EditPart;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.ExternalLinkEditPart;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.ExternalLinkExternalLinkSourceCompartment2EditPart;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.ExternalLinkExternalLinkSourceCompartment3EditPart;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.ExternalLinkExternalLinkSourceCompartmentEditPart;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.Group2EditPart;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.Group3EditPart;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.GroupEditPart;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.GroupGroupElementsCompartment2EditPart;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.GroupGroupElementsCompartment3EditPart;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.GroupGroupElementsCompartmentEditPart;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.Image2EditPart;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.Image3EditPart;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.Image4EditPart;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.ImageEditPart;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.InternalLink2EditPart;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.InternalLink3EditPart;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.InternalLinkEditPart;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.InternalLinkInternalLinkActualParametersCompartment2EditPart;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.InternalLinkInternalLinkActualParametersCompartment3EditPart;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.InternalLinkInternalLinkActualParametersCompartmentEditPart;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.InternalLinkInternalLinkSourceCompartment2EditPart;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.InternalLinkInternalLinkSourceCompartment3EditPart;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.InternalLinkInternalLinkSourceCompartmentEditPart;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.InternalLinkTargetEditPart;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.List2EditPart;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.List3EditPart;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.ListEditPart;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.ListListElementsCompartment2EditPart;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.ListListElementsCompartment3EditPart;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.ListListElementsCompartmentEditPart;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.PageEditPart;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.PagePageElementsCompartmentEditPart;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.PagePageParametersCompartmentEditPart;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.PagePageVariablesCompartmentEditPart;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.ParameterEditPart;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.Text2EditPart;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.Text3EditPart;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.Text4EditPart;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.TextEditPart;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.VariableInitializationEditPart;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.WebsiteEditPart;
import com.github.kanafghan.welipse.webdsl.diagram.providers.WebdslElementTypes;

/**
 * @generated
 */
public class WebdslDiagramUpdater {

	/**
	 * @generated
	 */
	public static List<WebdslNodeDescriptor> getSemanticChildren(View view) {
		switch (WebdslVisualIDRegistry.getVisualID(view)) {
		case WebsiteEditPart.VISUAL_ID:
			return getWebsite_1000SemanticChildren(view);
		case PagePageParametersCompartmentEditPart.VISUAL_ID:
			return getPagePageParametersCompartment_7001SemanticChildren(view);
		case PagePageVariablesCompartmentEditPart.VISUAL_ID:
			return getPagePageVariablesCompartment_7002SemanticChildren(view);
		case PagePageElementsCompartmentEditPart.VISUAL_ID:
			return getPagePageElementsCompartment_7003SemanticChildren(view);
		case ListListElementsCompartmentEditPart.VISUAL_ID:
			return getListListElementsCompartment_7004SemanticChildren(view);
		case ListListElementsCompartment2EditPart.VISUAL_ID:
			return getListListElementsCompartment_7005SemanticChildren(view);
		case GroupGroupElementsCompartmentEditPart.VISUAL_ID:
			return getGroupGroupElementsCompartment_7006SemanticChildren(view);
		case ListListElementsCompartment3EditPart.VISUAL_ID:
			return getListListElementsCompartment_7008SemanticChildren(view);
		case InternalLinkInternalLinkSourceCompartmentEditPart.VISUAL_ID:
			return getInternalLinkInternalLinkSourceCompartment_7010SemanticChildren(view);
		case InternalLinkInternalLinkActualParametersCompartmentEditPart.VISUAL_ID:
			return getInternalLinkInternalLinkActualParametersCompartment_7011SemanticChildren(view);
		case ExternalLinkExternalLinkSourceCompartmentEditPart.VISUAL_ID:
			return getExternalLinkExternalLinkSourceCompartment_7016SemanticChildren(view);
		case GroupGroupElementsCompartment3EditPart.VISUAL_ID:
			return getGroupGroupElementsCompartment_7009SemanticChildren(view);
		case InternalLinkInternalLinkSourceCompartment2EditPart.VISUAL_ID:
			return getInternalLinkInternalLinkSourceCompartment_7012SemanticChildren(view);
		case InternalLinkInternalLinkActualParametersCompartment2EditPart.VISUAL_ID:
			return getInternalLinkInternalLinkActualParametersCompartment_7013SemanticChildren(view);
		case ExternalLinkExternalLinkSourceCompartment2EditPart.VISUAL_ID:
			return getExternalLinkExternalLinkSourceCompartment_7017SemanticChildren(view);
		case GroupGroupElementsCompartment2EditPart.VISUAL_ID:
			return getGroupGroupElementsCompartment_7007SemanticChildren(view);
		case InternalLinkInternalLinkSourceCompartment3EditPart.VISUAL_ID:
			return getInternalLinkInternalLinkSourceCompartment_7014SemanticChildren(view);
		case InternalLinkInternalLinkActualParametersCompartment3EditPart.VISUAL_ID:
			return getInternalLinkInternalLinkActualParametersCompartment_7015SemanticChildren(view);
		case ExternalLinkExternalLinkSourceCompartment3EditPart.VISUAL_ID:
			return getExternalLinkExternalLinkSourceCompartment_7018SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebdslNodeDescriptor> getWebsite_1000SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		Website modelElement = (Website) view.getElement();
		LinkedList<WebdslNodeDescriptor> result = new LinkedList<WebdslNodeDescriptor>();
		for (Iterator<?> it = modelElement.getPages().iterator(); it.hasNext();) {
			Page childElement = (Page) it.next();
			int visualID = WebdslVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == PageEditPart.VISUAL_ID) {
				result.add(new WebdslNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<WebdslNodeDescriptor> getPagePageParametersCompartment_7001SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Page modelElement = (Page) containerView.getElement();
		LinkedList<WebdslNodeDescriptor> result = new LinkedList<WebdslNodeDescriptor>();
		for (Iterator<?> it = modelElement.getParameters().iterator(); it
				.hasNext();) {
			Parameter childElement = (Parameter) it.next();
			int visualID = WebdslVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ParameterEditPart.VISUAL_ID) {
				result.add(new WebdslNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<WebdslNodeDescriptor> getPagePageVariablesCompartment_7002SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Page modelElement = (Page) containerView.getElement();
		LinkedList<WebdslNodeDescriptor> result = new LinkedList<WebdslNodeDescriptor>();
		for (Iterator<?> it = modelElement.getVariables().iterator(); it
				.hasNext();) {
			VariableInitialization childElement = (VariableInitialization) it
					.next();
			int visualID = WebdslVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == VariableInitializationEditPart.VISUAL_ID) {
				result.add(new WebdslNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<WebdslNodeDescriptor> getPagePageElementsCompartment_7003SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Page modelElement = (Page) containerView.getElement();
		LinkedList<WebdslNodeDescriptor> result = new LinkedList<WebdslNodeDescriptor>();
		for (Iterator<?> it = modelElement.getElements().iterator(); it
				.hasNext();) {
			PageElement childElement = (PageElement) it.next();
			int visualID = WebdslVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == TextEditPart.VISUAL_ID) {
				result.add(new WebdslNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ImageEditPart.VISUAL_ID) {
				result.add(new WebdslNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ListEditPart.VISUAL_ID) {
				result.add(new WebdslNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == GroupEditPart.VISUAL_ID) {
				result.add(new WebdslNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == InternalLinkEditPart.VISUAL_ID) {
				result.add(new WebdslNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ExternalLinkEditPart.VISUAL_ID) {
				result.add(new WebdslNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<WebdslNodeDescriptor> getListListElementsCompartment_7004SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		com.github.kanafghan.welipse.webdsl.List modelElement = (com.github.kanafghan.welipse.webdsl.List) containerView
				.getElement();
		LinkedList<WebdslNodeDescriptor> result = new LinkedList<WebdslNodeDescriptor>();
		for (Iterator<?> it = modelElement.getElements().iterator(); it
				.hasNext();) {
			PageElement childElement = (PageElement) it.next();
			int visualID = WebdslVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Text2EditPart.VISUAL_ID) {
				result.add(new WebdslNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Image2EditPart.VISUAL_ID) {
				result.add(new WebdslNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == List2EditPart.VISUAL_ID) {
				result.add(new WebdslNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Group2EditPart.VISUAL_ID) {
				result.add(new WebdslNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == InternalLink2EditPart.VISUAL_ID) {
				result.add(new WebdslNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ExternalLink2EditPart.VISUAL_ID) {
				result.add(new WebdslNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<WebdslNodeDescriptor> getListListElementsCompartment_7005SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		com.github.kanafghan.welipse.webdsl.List modelElement = (com.github.kanafghan.welipse.webdsl.List) containerView
				.getElement();
		LinkedList<WebdslNodeDescriptor> result = new LinkedList<WebdslNodeDescriptor>();
		for (Iterator<?> it = modelElement.getElements().iterator(); it
				.hasNext();) {
			PageElement childElement = (PageElement) it.next();
			int visualID = WebdslVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Text2EditPart.VISUAL_ID) {
				result.add(new WebdslNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Image2EditPart.VISUAL_ID) {
				result.add(new WebdslNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == List2EditPart.VISUAL_ID) {
				result.add(new WebdslNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Group2EditPart.VISUAL_ID) {
				result.add(new WebdslNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == InternalLink2EditPart.VISUAL_ID) {
				result.add(new WebdslNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ExternalLink2EditPart.VISUAL_ID) {
				result.add(new WebdslNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<WebdslNodeDescriptor> getGroupGroupElementsCompartment_7006SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Group modelElement = (Group) containerView.getElement();
		LinkedList<WebdslNodeDescriptor> result = new LinkedList<WebdslNodeDescriptor>();
		for (Iterator<?> it = modelElement.getElements().iterator(); it
				.hasNext();) {
			PageElement childElement = (PageElement) it.next();
			int visualID = WebdslVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Text3EditPart.VISUAL_ID) {
				result.add(new WebdslNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Image3EditPart.VISUAL_ID) {
				result.add(new WebdslNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == List3EditPart.VISUAL_ID) {
				result.add(new WebdslNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Group3EditPart.VISUAL_ID) {
				result.add(new WebdslNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == InternalLink3EditPart.VISUAL_ID) {
				result.add(new WebdslNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ExternalLink3EditPart.VISUAL_ID) {
				result.add(new WebdslNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<WebdslNodeDescriptor> getListListElementsCompartment_7008SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		com.github.kanafghan.welipse.webdsl.List modelElement = (com.github.kanafghan.welipse.webdsl.List) containerView
				.getElement();
		LinkedList<WebdslNodeDescriptor> result = new LinkedList<WebdslNodeDescriptor>();
		for (Iterator<?> it = modelElement.getElements().iterator(); it
				.hasNext();) {
			PageElement childElement = (PageElement) it.next();
			int visualID = WebdslVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Text2EditPart.VISUAL_ID) {
				result.add(new WebdslNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Image2EditPart.VISUAL_ID) {
				result.add(new WebdslNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == List2EditPart.VISUAL_ID) {
				result.add(new WebdslNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Group2EditPart.VISUAL_ID) {
				result.add(new WebdslNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == InternalLink2EditPart.VISUAL_ID) {
				result.add(new WebdslNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ExternalLink2EditPart.VISUAL_ID) {
				result.add(new WebdslNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<WebdslNodeDescriptor> getInternalLinkInternalLinkSourceCompartment_7010SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		InternalLink modelElement = (InternalLink) containerView.getElement();
		LinkedList<WebdslNodeDescriptor> result = new LinkedList<WebdslNodeDescriptor>();
		{
			PageElement childElement = modelElement.getSource();
			int visualID = WebdslVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Text4EditPart.VISUAL_ID) {
				result.add(new WebdslNodeDescriptor(childElement, visualID));
			}
			if (visualID == Image4EditPart.VISUAL_ID) {
				result.add(new WebdslNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<WebdslNodeDescriptor> getInternalLinkInternalLinkActualParametersCompartment_7011SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		InternalLink modelElement = (InternalLink) containerView.getElement();
		LinkedList<WebdslNodeDescriptor> result = new LinkedList<WebdslNodeDescriptor>();
		for (Iterator<?> it = modelElement.getActualParameters().iterator(); it
				.hasNext();) {
			ActualParameter childElement = (ActualParameter) it.next();
			int visualID = WebdslVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ActualParameterEditPart.VISUAL_ID) {
				result.add(new WebdslNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<WebdslNodeDescriptor> getExternalLinkExternalLinkSourceCompartment_7016SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		ExternalLink modelElement = (ExternalLink) containerView.getElement();
		LinkedList<WebdslNodeDescriptor> result = new LinkedList<WebdslNodeDescriptor>();
		{
			PageElement childElement = modelElement.getSource();
			int visualID = WebdslVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Text4EditPart.VISUAL_ID) {
				result.add(new WebdslNodeDescriptor(childElement, visualID));
			}
			if (visualID == Image4EditPart.VISUAL_ID) {
				result.add(new WebdslNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<WebdslNodeDescriptor> getGroupGroupElementsCompartment_7009SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Group modelElement = (Group) containerView.getElement();
		LinkedList<WebdslNodeDescriptor> result = new LinkedList<WebdslNodeDescriptor>();
		for (Iterator<?> it = modelElement.getElements().iterator(); it
				.hasNext();) {
			PageElement childElement = (PageElement) it.next();
			int visualID = WebdslVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Text3EditPart.VISUAL_ID) {
				result.add(new WebdslNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Image3EditPart.VISUAL_ID) {
				result.add(new WebdslNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == List3EditPart.VISUAL_ID) {
				result.add(new WebdslNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Group3EditPart.VISUAL_ID) {
				result.add(new WebdslNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == InternalLink3EditPart.VISUAL_ID) {
				result.add(new WebdslNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ExternalLink3EditPart.VISUAL_ID) {
				result.add(new WebdslNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<WebdslNodeDescriptor> getInternalLinkInternalLinkSourceCompartment_7012SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		InternalLink modelElement = (InternalLink) containerView.getElement();
		LinkedList<WebdslNodeDescriptor> result = new LinkedList<WebdslNodeDescriptor>();
		{
			PageElement childElement = modelElement.getSource();
			int visualID = WebdslVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Text4EditPart.VISUAL_ID) {
				result.add(new WebdslNodeDescriptor(childElement, visualID));
			}
			if (visualID == Image4EditPart.VISUAL_ID) {
				result.add(new WebdslNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<WebdslNodeDescriptor> getInternalLinkInternalLinkActualParametersCompartment_7013SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		InternalLink modelElement = (InternalLink) containerView.getElement();
		LinkedList<WebdslNodeDescriptor> result = new LinkedList<WebdslNodeDescriptor>();
		for (Iterator<?> it = modelElement.getActualParameters().iterator(); it
				.hasNext();) {
			ActualParameter childElement = (ActualParameter) it.next();
			int visualID = WebdslVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ActualParameterEditPart.VISUAL_ID) {
				result.add(new WebdslNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<WebdslNodeDescriptor> getExternalLinkExternalLinkSourceCompartment_7017SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		ExternalLink modelElement = (ExternalLink) containerView.getElement();
		LinkedList<WebdslNodeDescriptor> result = new LinkedList<WebdslNodeDescriptor>();
		{
			PageElement childElement = modelElement.getSource();
			int visualID = WebdslVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Text4EditPart.VISUAL_ID) {
				result.add(new WebdslNodeDescriptor(childElement, visualID));
			}
			if (visualID == Image4EditPart.VISUAL_ID) {
				result.add(new WebdslNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<WebdslNodeDescriptor> getGroupGroupElementsCompartment_7007SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Group modelElement = (Group) containerView.getElement();
		LinkedList<WebdslNodeDescriptor> result = new LinkedList<WebdslNodeDescriptor>();
		for (Iterator<?> it = modelElement.getElements().iterator(); it
				.hasNext();) {
			PageElement childElement = (PageElement) it.next();
			int visualID = WebdslVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Text3EditPart.VISUAL_ID) {
				result.add(new WebdslNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Image3EditPart.VISUAL_ID) {
				result.add(new WebdslNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == List3EditPart.VISUAL_ID) {
				result.add(new WebdslNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Group3EditPart.VISUAL_ID) {
				result.add(new WebdslNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == InternalLink3EditPart.VISUAL_ID) {
				result.add(new WebdslNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ExternalLink3EditPart.VISUAL_ID) {
				result.add(new WebdslNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<WebdslNodeDescriptor> getInternalLinkInternalLinkSourceCompartment_7014SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		InternalLink modelElement = (InternalLink) containerView.getElement();
		LinkedList<WebdslNodeDescriptor> result = new LinkedList<WebdslNodeDescriptor>();
		{
			PageElement childElement = modelElement.getSource();
			int visualID = WebdslVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Text4EditPart.VISUAL_ID) {
				result.add(new WebdslNodeDescriptor(childElement, visualID));
			}
			if (visualID == Image4EditPart.VISUAL_ID) {
				result.add(new WebdslNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<WebdslNodeDescriptor> getInternalLinkInternalLinkActualParametersCompartment_7015SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		InternalLink modelElement = (InternalLink) containerView.getElement();
		LinkedList<WebdslNodeDescriptor> result = new LinkedList<WebdslNodeDescriptor>();
		for (Iterator<?> it = modelElement.getActualParameters().iterator(); it
				.hasNext();) {
			ActualParameter childElement = (ActualParameter) it.next();
			int visualID = WebdslVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ActualParameterEditPart.VISUAL_ID) {
				result.add(new WebdslNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<WebdslNodeDescriptor> getExternalLinkExternalLinkSourceCompartment_7018SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		ExternalLink modelElement = (ExternalLink) containerView.getElement();
		LinkedList<WebdslNodeDescriptor> result = new LinkedList<WebdslNodeDescriptor>();
		{
			PageElement childElement = modelElement.getSource();
			int visualID = WebdslVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Text4EditPart.VISUAL_ID) {
				result.add(new WebdslNodeDescriptor(childElement, visualID));
			}
			if (visualID == Image4EditPart.VISUAL_ID) {
				result.add(new WebdslNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<WebdslLinkDescriptor> getContainedLinks(View view) {
		switch (WebdslVisualIDRegistry.getVisualID(view)) {
		case WebsiteEditPart.VISUAL_ID:
			return getWebsite_1000ContainedLinks(view);
		case PageEditPart.VISUAL_ID:
			return getPage_2001ContainedLinks(view);
		case ParameterEditPart.VISUAL_ID:
			return getParameter_3001ContainedLinks(view);
		case VariableInitializationEditPart.VISUAL_ID:
			return getVariableInitialization_3002ContainedLinks(view);
		case TextEditPart.VISUAL_ID:
			return getText_3003ContainedLinks(view);
		case ImageEditPart.VISUAL_ID:
			return getImage_3004ContainedLinks(view);
		case ListEditPart.VISUAL_ID:
			return getList_3005ContainedLinks(view);
		case Text2EditPart.VISUAL_ID:
			return getText_3010ContainedLinks(view);
		case Image2EditPart.VISUAL_ID:
			return getImage_3011ContainedLinks(view);
		case List2EditPart.VISUAL_ID:
			return getList_3012ContainedLinks(view);
		case Group2EditPart.VISUAL_ID:
			return getGroup_3013ContainedLinks(view);
		case Text3EditPart.VISUAL_ID:
			return getText_3016ContainedLinks(view);
		case Image3EditPart.VISUAL_ID:
			return getImage_3017ContainedLinks(view);
		case List3EditPart.VISUAL_ID:
			return getList_3018ContainedLinks(view);
		case InternalLink2EditPart.VISUAL_ID:
			return getInternalLink_3014ContainedLinks(view);
		case ActualParameterEditPart.VISUAL_ID:
			return getActualParameter_3008ContainedLinks(view);
		case Text4EditPart.VISUAL_ID:
			return getText_3022ContainedLinks(view);
		case Image4EditPart.VISUAL_ID:
			return getImage_3023ContainedLinks(view);
		case ExternalLink2EditPart.VISUAL_ID:
			return getExternalLink_3015ContainedLinks(view);
		case Group3EditPart.VISUAL_ID:
			return getGroup_3019ContainedLinks(view);
		case InternalLink3EditPart.VISUAL_ID:
			return getInternalLink_3020ContainedLinks(view);
		case ExternalLink3EditPart.VISUAL_ID:
			return getExternalLink_3021ContainedLinks(view);
		case GroupEditPart.VISUAL_ID:
			return getGroup_3006ContainedLinks(view);
		case InternalLinkEditPart.VISUAL_ID:
			return getInternalLink_3007ContainedLinks(view);
		case ExternalLinkEditPart.VISUAL_ID:
			return getExternalLink_3009ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebdslLinkDescriptor> getIncomingLinks(View view) {
		switch (WebdslVisualIDRegistry.getVisualID(view)) {
		case PageEditPart.VISUAL_ID:
			return getPage_2001IncomingLinks(view);
		case ParameterEditPart.VISUAL_ID:
			return getParameter_3001IncomingLinks(view);
		case VariableInitializationEditPart.VISUAL_ID:
			return getVariableInitialization_3002IncomingLinks(view);
		case TextEditPart.VISUAL_ID:
			return getText_3003IncomingLinks(view);
		case ImageEditPart.VISUAL_ID:
			return getImage_3004IncomingLinks(view);
		case ListEditPart.VISUAL_ID:
			return getList_3005IncomingLinks(view);
		case Text2EditPart.VISUAL_ID:
			return getText_3010IncomingLinks(view);
		case Image2EditPart.VISUAL_ID:
			return getImage_3011IncomingLinks(view);
		case List2EditPart.VISUAL_ID:
			return getList_3012IncomingLinks(view);
		case Group2EditPart.VISUAL_ID:
			return getGroup_3013IncomingLinks(view);
		case Text3EditPart.VISUAL_ID:
			return getText_3016IncomingLinks(view);
		case Image3EditPart.VISUAL_ID:
			return getImage_3017IncomingLinks(view);
		case List3EditPart.VISUAL_ID:
			return getList_3018IncomingLinks(view);
		case InternalLink2EditPart.VISUAL_ID:
			return getInternalLink_3014IncomingLinks(view);
		case ActualParameterEditPart.VISUAL_ID:
			return getActualParameter_3008IncomingLinks(view);
		case Text4EditPart.VISUAL_ID:
			return getText_3022IncomingLinks(view);
		case Image4EditPart.VISUAL_ID:
			return getImage_3023IncomingLinks(view);
		case ExternalLink2EditPart.VISUAL_ID:
			return getExternalLink_3015IncomingLinks(view);
		case Group3EditPart.VISUAL_ID:
			return getGroup_3019IncomingLinks(view);
		case InternalLink3EditPart.VISUAL_ID:
			return getInternalLink_3020IncomingLinks(view);
		case ExternalLink3EditPart.VISUAL_ID:
			return getExternalLink_3021IncomingLinks(view);
		case GroupEditPart.VISUAL_ID:
			return getGroup_3006IncomingLinks(view);
		case InternalLinkEditPart.VISUAL_ID:
			return getInternalLink_3007IncomingLinks(view);
		case ExternalLinkEditPart.VISUAL_ID:
			return getExternalLink_3009IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebdslLinkDescriptor> getOutgoingLinks(View view) {
		switch (WebdslVisualIDRegistry.getVisualID(view)) {
		case PageEditPart.VISUAL_ID:
			return getPage_2001OutgoingLinks(view);
		case ParameterEditPart.VISUAL_ID:
			return getParameter_3001OutgoingLinks(view);
		case VariableInitializationEditPart.VISUAL_ID:
			return getVariableInitialization_3002OutgoingLinks(view);
		case TextEditPart.VISUAL_ID:
			return getText_3003OutgoingLinks(view);
		case ImageEditPart.VISUAL_ID:
			return getImage_3004OutgoingLinks(view);
		case ListEditPart.VISUAL_ID:
			return getList_3005OutgoingLinks(view);
		case Text2EditPart.VISUAL_ID:
			return getText_3010OutgoingLinks(view);
		case Image2EditPart.VISUAL_ID:
			return getImage_3011OutgoingLinks(view);
		case List2EditPart.VISUAL_ID:
			return getList_3012OutgoingLinks(view);
		case Group2EditPart.VISUAL_ID:
			return getGroup_3013OutgoingLinks(view);
		case Text3EditPart.VISUAL_ID:
			return getText_3016OutgoingLinks(view);
		case Image3EditPart.VISUAL_ID:
			return getImage_3017OutgoingLinks(view);
		case List3EditPart.VISUAL_ID:
			return getList_3018OutgoingLinks(view);
		case InternalLink2EditPart.VISUAL_ID:
			return getInternalLink_3014OutgoingLinks(view);
		case ActualParameterEditPart.VISUAL_ID:
			return getActualParameter_3008OutgoingLinks(view);
		case Text4EditPart.VISUAL_ID:
			return getText_3022OutgoingLinks(view);
		case Image4EditPart.VISUAL_ID:
			return getImage_3023OutgoingLinks(view);
		case ExternalLink2EditPart.VISUAL_ID:
			return getExternalLink_3015OutgoingLinks(view);
		case Group3EditPart.VISUAL_ID:
			return getGroup_3019OutgoingLinks(view);
		case InternalLink3EditPart.VISUAL_ID:
			return getInternalLink_3020OutgoingLinks(view);
		case ExternalLink3EditPart.VISUAL_ID:
			return getExternalLink_3021OutgoingLinks(view);
		case GroupEditPart.VISUAL_ID:
			return getGroup_3006OutgoingLinks(view);
		case InternalLinkEditPart.VISUAL_ID:
			return getInternalLink_3007OutgoingLinks(view);
		case ExternalLinkEditPart.VISUAL_ID:
			return getExternalLink_3009OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebdslLinkDescriptor> getWebsite_1000ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebdslLinkDescriptor> getPage_2001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebdslLinkDescriptor> getParameter_3001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebdslLinkDescriptor> getVariableInitialization_3002ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebdslLinkDescriptor> getText_3003ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebdslLinkDescriptor> getImage_3004ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebdslLinkDescriptor> getList_3005ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebdslLinkDescriptor> getText_3010ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebdslLinkDescriptor> getImage_3011ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebdslLinkDescriptor> getList_3012ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebdslLinkDescriptor> getGroup_3013ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebdslLinkDescriptor> getText_3016ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebdslLinkDescriptor> getImage_3017ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebdslLinkDescriptor> getList_3018ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebdslLinkDescriptor> getInternalLink_3014ContainedLinks(
			View view) {
		InternalLink modelElement = (InternalLink) view.getElement();
		LinkedList<WebdslLinkDescriptor> result = new LinkedList<WebdslLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_InternalLink_Target_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<WebdslLinkDescriptor> getActualParameter_3008ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebdslLinkDescriptor> getText_3022ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebdslLinkDescriptor> getImage_3023ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebdslLinkDescriptor> getExternalLink_3015ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebdslLinkDescriptor> getGroup_3019ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebdslLinkDescriptor> getInternalLink_3020ContainedLinks(
			View view) {
		InternalLink modelElement = (InternalLink) view.getElement();
		LinkedList<WebdslLinkDescriptor> result = new LinkedList<WebdslLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_InternalLink_Target_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<WebdslLinkDescriptor> getExternalLink_3021ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebdslLinkDescriptor> getGroup_3006ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebdslLinkDescriptor> getInternalLink_3007ContainedLinks(
			View view) {
		InternalLink modelElement = (InternalLink) view.getElement();
		LinkedList<WebdslLinkDescriptor> result = new LinkedList<WebdslLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_InternalLink_Target_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<WebdslLinkDescriptor> getExternalLink_3009ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebdslLinkDescriptor> getPage_2001IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebdslLinkDescriptor> getParameter_3001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebdslLinkDescriptor> getVariableInitialization_3002IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebdslLinkDescriptor> getText_3003IncomingLinks(View view) {
		Text modelElement = (Text) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<WebdslLinkDescriptor> result = new LinkedList<WebdslLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_InternalLink_Target_4004(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<WebdslLinkDescriptor> getImage_3004IncomingLinks(
			View view) {
		Image modelElement = (Image) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<WebdslLinkDescriptor> result = new LinkedList<WebdslLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_InternalLink_Target_4004(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<WebdslLinkDescriptor> getList_3005IncomingLinks(View view) {
		com.github.kanafghan.welipse.webdsl.List modelElement = (com.github.kanafghan.welipse.webdsl.List) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<WebdslLinkDescriptor> result = new LinkedList<WebdslLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_InternalLink_Target_4004(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<WebdslLinkDescriptor> getText_3010IncomingLinks(View view) {
		Text modelElement = (Text) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<WebdslLinkDescriptor> result = new LinkedList<WebdslLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_InternalLink_Target_4004(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<WebdslLinkDescriptor> getImage_3011IncomingLinks(
			View view) {
		Image modelElement = (Image) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<WebdslLinkDescriptor> result = new LinkedList<WebdslLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_InternalLink_Target_4004(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<WebdslLinkDescriptor> getList_3012IncomingLinks(View view) {
		com.github.kanafghan.welipse.webdsl.List modelElement = (com.github.kanafghan.welipse.webdsl.List) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<WebdslLinkDescriptor> result = new LinkedList<WebdslLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_InternalLink_Target_4004(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<WebdslLinkDescriptor> getGroup_3013IncomingLinks(
			View view) {
		Group modelElement = (Group) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<WebdslLinkDescriptor> result = new LinkedList<WebdslLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_InternalLink_Target_4004(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<WebdslLinkDescriptor> getText_3016IncomingLinks(View view) {
		Text modelElement = (Text) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<WebdslLinkDescriptor> result = new LinkedList<WebdslLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_InternalLink_Target_4004(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<WebdslLinkDescriptor> getImage_3017IncomingLinks(
			View view) {
		Image modelElement = (Image) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<WebdslLinkDescriptor> result = new LinkedList<WebdslLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_InternalLink_Target_4004(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<WebdslLinkDescriptor> getList_3018IncomingLinks(View view) {
		com.github.kanafghan.welipse.webdsl.List modelElement = (com.github.kanafghan.welipse.webdsl.List) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<WebdslLinkDescriptor> result = new LinkedList<WebdslLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_InternalLink_Target_4004(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<WebdslLinkDescriptor> getInternalLink_3014IncomingLinks(
			View view) {
		InternalLink modelElement = (InternalLink) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<WebdslLinkDescriptor> result = new LinkedList<WebdslLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_InternalLink_Target_4004(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<WebdslLinkDescriptor> getActualParameter_3008IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebdslLinkDescriptor> getText_3022IncomingLinks(View view) {
		Text modelElement = (Text) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<WebdslLinkDescriptor> result = new LinkedList<WebdslLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_InternalLink_Target_4004(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<WebdslLinkDescriptor> getImage_3023IncomingLinks(
			View view) {
		Image modelElement = (Image) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<WebdslLinkDescriptor> result = new LinkedList<WebdslLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_InternalLink_Target_4004(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<WebdslLinkDescriptor> getExternalLink_3015IncomingLinks(
			View view) {
		ExternalLink modelElement = (ExternalLink) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<WebdslLinkDescriptor> result = new LinkedList<WebdslLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_InternalLink_Target_4004(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<WebdslLinkDescriptor> getGroup_3019IncomingLinks(
			View view) {
		Group modelElement = (Group) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<WebdslLinkDescriptor> result = new LinkedList<WebdslLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_InternalLink_Target_4004(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<WebdslLinkDescriptor> getInternalLink_3020IncomingLinks(
			View view) {
		InternalLink modelElement = (InternalLink) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<WebdslLinkDescriptor> result = new LinkedList<WebdslLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_InternalLink_Target_4004(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<WebdslLinkDescriptor> getExternalLink_3021IncomingLinks(
			View view) {
		ExternalLink modelElement = (ExternalLink) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<WebdslLinkDescriptor> result = new LinkedList<WebdslLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_InternalLink_Target_4004(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<WebdslLinkDescriptor> getGroup_3006IncomingLinks(
			View view) {
		Group modelElement = (Group) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<WebdslLinkDescriptor> result = new LinkedList<WebdslLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_InternalLink_Target_4004(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<WebdslLinkDescriptor> getInternalLink_3007IncomingLinks(
			View view) {
		InternalLink modelElement = (InternalLink) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<WebdslLinkDescriptor> result = new LinkedList<WebdslLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_InternalLink_Target_4004(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<WebdslLinkDescriptor> getExternalLink_3009IncomingLinks(
			View view) {
		ExternalLink modelElement = (ExternalLink) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<WebdslLinkDescriptor> result = new LinkedList<WebdslLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_InternalLink_Target_4004(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<WebdslLinkDescriptor> getPage_2001OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebdslLinkDescriptor> getParameter_3001OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebdslLinkDescriptor> getVariableInitialization_3002OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebdslLinkDescriptor> getText_3003OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebdslLinkDescriptor> getImage_3004OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebdslLinkDescriptor> getList_3005OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebdslLinkDescriptor> getText_3010OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebdslLinkDescriptor> getImage_3011OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebdslLinkDescriptor> getList_3012OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebdslLinkDescriptor> getGroup_3013OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebdslLinkDescriptor> getText_3016OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebdslLinkDescriptor> getImage_3017OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebdslLinkDescriptor> getList_3018OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebdslLinkDescriptor> getInternalLink_3014OutgoingLinks(
			View view) {
		InternalLink modelElement = (InternalLink) view.getElement();
		LinkedList<WebdslLinkDescriptor> result = new LinkedList<WebdslLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_InternalLink_Target_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<WebdslLinkDescriptor> getActualParameter_3008OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebdslLinkDescriptor> getText_3022OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebdslLinkDescriptor> getImage_3023OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebdslLinkDescriptor> getExternalLink_3015OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebdslLinkDescriptor> getGroup_3019OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebdslLinkDescriptor> getInternalLink_3020OutgoingLinks(
			View view) {
		InternalLink modelElement = (InternalLink) view.getElement();
		LinkedList<WebdslLinkDescriptor> result = new LinkedList<WebdslLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_InternalLink_Target_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<WebdslLinkDescriptor> getExternalLink_3021OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebdslLinkDescriptor> getGroup_3006OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WebdslLinkDescriptor> getInternalLink_3007OutgoingLinks(
			View view) {
		InternalLink modelElement = (InternalLink) view.getElement();
		LinkedList<WebdslLinkDescriptor> result = new LinkedList<WebdslLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_InternalLink_Target_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<WebdslLinkDescriptor> getExternalLink_3009OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	private static Collection<WebdslLinkDescriptor> getIncomingFeatureModelFacetLinks_InternalLink_Target_4004(
			PageElement target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<WebdslLinkDescriptor> result = new LinkedList<WebdslLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == WebDSLPackage.eINSTANCE
					.getInternalLink_Target()) {
				result.add(new WebdslLinkDescriptor(setting.getEObject(),
						target, WebdslElementTypes.InternalLinkTarget_4004,
						InternalLinkTargetEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<WebdslLinkDescriptor> getOutgoingFeatureModelFacetLinks_InternalLink_Target_4004(
			InternalLink source) {
		LinkedList<WebdslLinkDescriptor> result = new LinkedList<WebdslLinkDescriptor>();
		PageElement destination = source.getTarget();
		if (destination == null) {
			return result;
		}
		result.add(new WebdslLinkDescriptor(source, destination,
				WebdslElementTypes.InternalLinkTarget_4004,
				InternalLinkTargetEditPart.VISUAL_ID));
		return result;
	}

	/**
	 * @generated
	 */
	public static final DiagramUpdater TYPED_INSTANCE = new DiagramUpdater() {
		/**
		 * @generated
		 */
		@Override
		public List<WebdslNodeDescriptor> getSemanticChildren(View view) {
			return WebdslDiagramUpdater.getSemanticChildren(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<WebdslLinkDescriptor> getContainedLinks(View view) {
			return WebdslDiagramUpdater.getContainedLinks(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<WebdslLinkDescriptor> getIncomingLinks(View view) {
			return WebdslDiagramUpdater.getIncomingLinks(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<WebdslLinkDescriptor> getOutgoingLinks(View view) {
			return WebdslDiagramUpdater.getOutgoingLinks(view);
		}
	};

}
