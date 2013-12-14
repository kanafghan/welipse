package com.github.kanafghan.welipse.webdsl.diagram.providers;

import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypeImages;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypes;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;

import com.github.kanafghan.welipse.webdsl.WebDSLPackage;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.ActualParameterEditPart;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.ExternalLink2EditPart;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.ExternalLink3EditPart;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.ExternalLinkEditPart;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.Group2EditPart;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.Group3EditPart;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.GroupEditPart;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.Image2EditPart;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.Image3EditPart;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.Image4EditPart;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.ImageEditPart;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.InternalLink2EditPart;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.InternalLink3EditPart;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.InternalLinkEditPart;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.InternalLinkTargetEditPart;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.List2EditPart;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.List3EditPart;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.ListEditPart;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.PageEditPart;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.ParameterEditPart;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.Text2EditPart;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.Text3EditPart;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.Text4EditPart;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.TextEditPart;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.VariableInitializationEditPart;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.WebsiteEditPart;
import com.github.kanafghan.welipse.webdsl.diagram.part.WebdslDiagramEditorPlugin;

/**
 * @generated
 */
public class WebdslElementTypes {

	/**
	 * @generated
	 */
	private WebdslElementTypes() {
	}

	/**
	 * @generated
	 */
	private static Map<IElementType, ENamedElement> elements;

	/**
	 * @generated
	 */
	private static DiagramElementTypeImages elementTypeImages = new DiagramElementTypeImages(
			WebdslDiagramEditorPlugin.getInstance()
					.getItemProvidersAdapterFactory());

	/**
	 * @generated
	 */
	private static Set<IElementType> KNOWN_ELEMENT_TYPES;

	/**
	 * @generated
	 */
	public static final IElementType Website_1000 = getElementType("com.github.kanafghan.welipse.webdsl.diagram.Website_1000"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Page_2001 = getElementType("com.github.kanafghan.welipse.webdsl.diagram.Page_2001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Parameter_3001 = getElementType("com.github.kanafghan.welipse.webdsl.diagram.Parameter_3001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType VariableInitialization_3002 = getElementType("com.github.kanafghan.welipse.webdsl.diagram.VariableInitialization_3002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Text_3003 = getElementType("com.github.kanafghan.welipse.webdsl.diagram.Text_3003"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Image_3004 = getElementType("com.github.kanafghan.welipse.webdsl.diagram.Image_3004"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType List_3005 = getElementType("com.github.kanafghan.welipse.webdsl.diagram.List_3005"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Text_3010 = getElementType("com.github.kanafghan.welipse.webdsl.diagram.Text_3010"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Image_3011 = getElementType("com.github.kanafghan.welipse.webdsl.diagram.Image_3011"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType List_3012 = getElementType("com.github.kanafghan.welipse.webdsl.diagram.List_3012"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Group_3013 = getElementType("com.github.kanafghan.welipse.webdsl.diagram.Group_3013"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Text_3016 = getElementType("com.github.kanafghan.welipse.webdsl.diagram.Text_3016"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Image_3017 = getElementType("com.github.kanafghan.welipse.webdsl.diagram.Image_3017"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType List_3018 = getElementType("com.github.kanafghan.welipse.webdsl.diagram.List_3018"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType InternalLink_3014 = getElementType("com.github.kanafghan.welipse.webdsl.diagram.InternalLink_3014"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ActualParameter_3008 = getElementType("com.github.kanafghan.welipse.webdsl.diagram.ActualParameter_3008"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Text_3022 = getElementType("com.github.kanafghan.welipse.webdsl.diagram.Text_3022"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Image_3023 = getElementType("com.github.kanafghan.welipse.webdsl.diagram.Image_3023"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ExternalLink_3015 = getElementType("com.github.kanafghan.welipse.webdsl.diagram.ExternalLink_3015"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Group_3019 = getElementType("com.github.kanafghan.welipse.webdsl.diagram.Group_3019"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType InternalLink_3020 = getElementType("com.github.kanafghan.welipse.webdsl.diagram.InternalLink_3020"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ExternalLink_3021 = getElementType("com.github.kanafghan.welipse.webdsl.diagram.ExternalLink_3021"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Group_3006 = getElementType("com.github.kanafghan.welipse.webdsl.diagram.Group_3006"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType InternalLink_3007 = getElementType("com.github.kanafghan.welipse.webdsl.diagram.InternalLink_3007"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ExternalLink_3009 = getElementType("com.github.kanafghan.welipse.webdsl.diagram.ExternalLink_3009"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType InternalLinkTarget_4004 = getElementType("com.github.kanafghan.welipse.webdsl.diagram.InternalLinkTarget_4004"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(ENamedElement element) {
		return elementTypeImages.getImageDescriptor(element);
	}

	/**
	 * @generated
	 */
	public static Image getImage(ENamedElement element) {
		return elementTypeImages.getImage(element);
	}

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(IAdaptable hint) {
		return getImageDescriptor(getElement(hint));
	}

	/**
	 * @generated
	 */
	public static Image getImage(IAdaptable hint) {
		return getImage(getElement(hint));
	}

	/**
	 * Returns 'type' of the ecore object associated with the hint.
	 * 
	 * @generated
	 */
	public static ENamedElement getElement(IAdaptable hint) {
		Object type = hint.getAdapter(IElementType.class);
		if (elements == null) {
			elements = new IdentityHashMap<IElementType, ENamedElement>();

			elements.put(Website_1000, WebDSLPackage.eINSTANCE.getWebsite());

			elements.put(Page_2001, WebDSLPackage.eINSTANCE.getPage());

			elements.put(Parameter_3001, WebDSLPackage.eINSTANCE.getParameter());

			elements.put(VariableInitialization_3002,
					WebDSLPackage.eINSTANCE.getVariableInitialization());

			elements.put(Text_3003, WebDSLPackage.eINSTANCE.getText());

			elements.put(Image_3004, WebDSLPackage.eINSTANCE.getImage());

			elements.put(List_3005, WebDSLPackage.eINSTANCE.getList());

			elements.put(Text_3010, WebDSLPackage.eINSTANCE.getText());

			elements.put(Image_3011, WebDSLPackage.eINSTANCE.getImage());

			elements.put(List_3012, WebDSLPackage.eINSTANCE.getList());

			elements.put(Group_3013, WebDSLPackage.eINSTANCE.getGroup());

			elements.put(Text_3016, WebDSLPackage.eINSTANCE.getText());

			elements.put(Image_3017, WebDSLPackage.eINSTANCE.getImage());

			elements.put(List_3018, WebDSLPackage.eINSTANCE.getList());

			elements.put(InternalLink_3014,
					WebDSLPackage.eINSTANCE.getInternalLink());

			elements.put(ActualParameter_3008,
					WebDSLPackage.eINSTANCE.getActualParameter());

			elements.put(Text_3022, WebDSLPackage.eINSTANCE.getText());

			elements.put(Image_3023, WebDSLPackage.eINSTANCE.getImage());

			elements.put(ExternalLink_3015,
					WebDSLPackage.eINSTANCE.getExternalLink());

			elements.put(Group_3019, WebDSLPackage.eINSTANCE.getGroup());

			elements.put(InternalLink_3020,
					WebDSLPackage.eINSTANCE.getInternalLink());

			elements.put(ExternalLink_3021,
					WebDSLPackage.eINSTANCE.getExternalLink());

			elements.put(Group_3006, WebDSLPackage.eINSTANCE.getGroup());

			elements.put(InternalLink_3007,
					WebDSLPackage.eINSTANCE.getInternalLink());

			elements.put(ExternalLink_3009,
					WebDSLPackage.eINSTANCE.getExternalLink());

			elements.put(InternalLinkTarget_4004,
					WebDSLPackage.eINSTANCE.getInternalLink_Target());
		}
		return (ENamedElement) elements.get(type);
	}

	/**
	 * @generated
	 */
	private static IElementType getElementType(String id) {
		return ElementTypeRegistry.getInstance().getType(id);
	}

	/**
	 * @generated
	 */
	public static boolean isKnownElementType(IElementType elementType) {
		if (KNOWN_ELEMENT_TYPES == null) {
			KNOWN_ELEMENT_TYPES = new HashSet<IElementType>();
			KNOWN_ELEMENT_TYPES.add(Website_1000);
			KNOWN_ELEMENT_TYPES.add(Page_2001);
			KNOWN_ELEMENT_TYPES.add(Parameter_3001);
			KNOWN_ELEMENT_TYPES.add(VariableInitialization_3002);
			KNOWN_ELEMENT_TYPES.add(Text_3003);
			KNOWN_ELEMENT_TYPES.add(Image_3004);
			KNOWN_ELEMENT_TYPES.add(List_3005);
			KNOWN_ELEMENT_TYPES.add(Text_3010);
			KNOWN_ELEMENT_TYPES.add(Image_3011);
			KNOWN_ELEMENT_TYPES.add(List_3012);
			KNOWN_ELEMENT_TYPES.add(Group_3013);
			KNOWN_ELEMENT_TYPES.add(Text_3016);
			KNOWN_ELEMENT_TYPES.add(Image_3017);
			KNOWN_ELEMENT_TYPES.add(List_3018);
			KNOWN_ELEMENT_TYPES.add(InternalLink_3014);
			KNOWN_ELEMENT_TYPES.add(ActualParameter_3008);
			KNOWN_ELEMENT_TYPES.add(Text_3022);
			KNOWN_ELEMENT_TYPES.add(Image_3023);
			KNOWN_ELEMENT_TYPES.add(ExternalLink_3015);
			KNOWN_ELEMENT_TYPES.add(Group_3019);
			KNOWN_ELEMENT_TYPES.add(InternalLink_3020);
			KNOWN_ELEMENT_TYPES.add(ExternalLink_3021);
			KNOWN_ELEMENT_TYPES.add(Group_3006);
			KNOWN_ELEMENT_TYPES.add(InternalLink_3007);
			KNOWN_ELEMENT_TYPES.add(ExternalLink_3009);
			KNOWN_ELEMENT_TYPES.add(InternalLinkTarget_4004);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	 * @generated
	 */
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case WebsiteEditPart.VISUAL_ID:
			return Website_1000;
		case PageEditPart.VISUAL_ID:
			return Page_2001;
		case ParameterEditPart.VISUAL_ID:
			return Parameter_3001;
		case VariableInitializationEditPart.VISUAL_ID:
			return VariableInitialization_3002;
		case TextEditPart.VISUAL_ID:
			return Text_3003;
		case ImageEditPart.VISUAL_ID:
			return Image_3004;
		case ListEditPart.VISUAL_ID:
			return List_3005;
		case Text2EditPart.VISUAL_ID:
			return Text_3010;
		case Image2EditPart.VISUAL_ID:
			return Image_3011;
		case List2EditPart.VISUAL_ID:
			return List_3012;
		case Group2EditPart.VISUAL_ID:
			return Group_3013;
		case Text3EditPart.VISUAL_ID:
			return Text_3016;
		case Image3EditPart.VISUAL_ID:
			return Image_3017;
		case List3EditPart.VISUAL_ID:
			return List_3018;
		case InternalLink2EditPart.VISUAL_ID:
			return InternalLink_3014;
		case ActualParameterEditPart.VISUAL_ID:
			return ActualParameter_3008;
		case Text4EditPart.VISUAL_ID:
			return Text_3022;
		case Image4EditPart.VISUAL_ID:
			return Image_3023;
		case ExternalLink2EditPart.VISUAL_ID:
			return ExternalLink_3015;
		case Group3EditPart.VISUAL_ID:
			return Group_3019;
		case InternalLink3EditPart.VISUAL_ID:
			return InternalLink_3020;
		case ExternalLink3EditPart.VISUAL_ID:
			return ExternalLink_3021;
		case GroupEditPart.VISUAL_ID:
			return Group_3006;
		case InternalLinkEditPart.VISUAL_ID:
			return InternalLink_3007;
		case ExternalLinkEditPart.VISUAL_ID:
			return ExternalLink_3009;
		case InternalLinkTargetEditPart.VISUAL_ID:
			return InternalLinkTarget_4004;
		}
		return null;
	}

	/**
	 * @generated
	 */
	public static final DiagramElementTypes TYPED_INSTANCE = new DiagramElementTypes(
			elementTypeImages) {

		/**
		 * @generated
		 */
		@Override
		public boolean isKnownElementType(IElementType elementType) {
			return com.github.kanafghan.welipse.webdsl.diagram.providers.WebdslElementTypes
					.isKnownElementType(elementType);
		}

		/**
		 * @generated
		 */
		@Override
		public IElementType getElementTypeForVisualId(int visualID) {
			return com.github.kanafghan.welipse.webdsl.diagram.providers.WebdslElementTypes
					.getElementType(visualID);
		}

		/**
		 * @generated
		 */
		@Override
		public ENamedElement getDefiningNamedElement(
				IAdaptable elementTypeAdapter) {
			return com.github.kanafghan.welipse.webdsl.diagram.providers.WebdslElementTypes
					.getElement(elementTypeAdapter);
		}
	};

}
