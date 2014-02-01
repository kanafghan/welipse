package com.github.kanafghan.welipse.webdsl.diagram.providers;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.modelingassistant.ModelingAssistantProvider;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.dialogs.ElementListSelectionDialog;

import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.Button2EditPart;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.ButtonEditPart;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.Cancel2EditPart;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.CancelEditPart;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.CustomAction2EditPart;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.CustomActionEditPart;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.ExternalLink2EditPart;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.ExternalLink3EditPart;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.ExternalLinkEditPart;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.ExternalLinkExternalLinkSourceCompartment2EditPart;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.ExternalLinkExternalLinkSourceCompartment3EditPart;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.ExternalLinkExternalLinkSourceCompartmentEditPart;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.Form2EditPart;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.FormEditPart;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.FormFormElementsCompartment2EditPart;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.FormFormElementsCompartmentEditPart;
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
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.List2EditPart;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.List3EditPart;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.ListEditPart;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.ListListElementsCompartment2EditPart;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.ListListElementsCompartment3EditPart;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.ListListElementsCompartmentEditPart;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.PagePageElementsCompartmentEditPart;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.PagePageParametersCompartmentEditPart;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.PagePageVariablesCompartmentEditPart;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.Reset2EditPart;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.ResetEditPart;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.Save2EditPart;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.SaveEditPart;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.SelectionList2EditPart;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.SelectionListEditPart;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.Text2EditPart;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.Text3EditPart;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.Text4EditPart;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.TextEditPart;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.TextInput2EditPart;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.TextInputEditPart;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.WebsiteEditPart;
import com.github.kanafghan.welipse.webdsl.diagram.part.Messages;
import com.github.kanafghan.welipse.webdsl.diagram.part.WebdslDiagramEditorPlugin;

/**
 * @generated
 */
public class WebdslModelingAssistantProvider extends ModelingAssistantProvider {

	/**
	 * @generated
	 */
	public List getTypesForPopupBar(IAdaptable host) {
		IGraphicalEditPart editPart = (IGraphicalEditPart) host
				.getAdapter(IGraphicalEditPart.class);
		if (editPart instanceof WebsiteEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(1);
			types.add(WebdslElementTypes.Page_2001);
			return types;
		}
		if (editPart instanceof PagePageParametersCompartmentEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(1);
			types.add(WebdslElementTypes.Parameter_3001);
			return types;
		}
		if (editPart instanceof PagePageVariablesCompartmentEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(1);
			types.add(WebdslElementTypes.VariableInitialization_3002);
			return types;
		}
		if (editPart instanceof PagePageElementsCompartmentEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(14);
			types.add(WebdslElementTypes.Text_3003);
			types.add(WebdslElementTypes.Image_3004);
			types.add(WebdslElementTypes.List_3005);
			types.add(WebdslElementTypes.Group_3006);
			types.add(WebdslElementTypes.Form_3025);
			types.add(WebdslElementTypes.InternalLink_3007);
			types.add(WebdslElementTypes.ExternalLink_3009);
			types.add(WebdslElementTypes.TextInput_3027);
			types.add(WebdslElementTypes.SelectionList_3029);
			types.add(WebdslElementTypes.Button_3031);
			types.add(WebdslElementTypes.CustomAction_3033);
			types.add(WebdslElementTypes.Save_3035);
			types.add(WebdslElementTypes.Reset_3037);
			types.add(WebdslElementTypes.Cancel_3039);
			return types;
		}
		if (editPart instanceof ListListElementsCompartmentEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(6);
			types.add(WebdslElementTypes.Text_3010);
			types.add(WebdslElementTypes.Image_3011);
			types.add(WebdslElementTypes.List_3012);
			types.add(WebdslElementTypes.Group_3013);
			types.add(WebdslElementTypes.InternalLink_3014);
			types.add(WebdslElementTypes.ExternalLink_3015);
			return types;
		}
		if (editPart instanceof ListListElementsCompartment2EditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(6);
			types.add(WebdslElementTypes.Text_3010);
			types.add(WebdslElementTypes.Image_3011);
			types.add(WebdslElementTypes.List_3012);
			types.add(WebdslElementTypes.Group_3013);
			types.add(WebdslElementTypes.InternalLink_3014);
			types.add(WebdslElementTypes.ExternalLink_3015);
			return types;
		}
		if (editPart instanceof GroupGroupElementsCompartmentEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(14);
			types.add(WebdslElementTypes.Text_3016);
			types.add(WebdslElementTypes.Image_3017);
			types.add(WebdslElementTypes.List_3018);
			types.add(WebdslElementTypes.Group_3019);
			types.add(WebdslElementTypes.Form_3024);
			types.add(WebdslElementTypes.InternalLink_3020);
			types.add(WebdslElementTypes.ExternalLink_3021);
			types.add(WebdslElementTypes.TextInput_3026);
			types.add(WebdslElementTypes.SelectionList_3028);
			types.add(WebdslElementTypes.Button_3030);
			types.add(WebdslElementTypes.CustomAction_3032);
			types.add(WebdslElementTypes.Save_3034);
			types.add(WebdslElementTypes.Reset_3036);
			types.add(WebdslElementTypes.Cancel_3038);
			return types;
		}
		if (editPart instanceof ListListElementsCompartment3EditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(6);
			types.add(WebdslElementTypes.Text_3010);
			types.add(WebdslElementTypes.Image_3011);
			types.add(WebdslElementTypes.List_3012);
			types.add(WebdslElementTypes.Group_3013);
			types.add(WebdslElementTypes.InternalLink_3014);
			types.add(WebdslElementTypes.ExternalLink_3015);
			return types;
		}
		if (editPart instanceof InternalLinkInternalLinkSourceCompartmentEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(2);
			types.add(WebdslElementTypes.Text_3022);
			types.add(WebdslElementTypes.Image_3023);
			return types;
		}
		if (editPart instanceof InternalLinkInternalLinkActualParametersCompartmentEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(1);
			types.add(WebdslElementTypes.ActualParameter_3008);
			return types;
		}
		if (editPart instanceof ExternalLinkExternalLinkSourceCompartmentEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(2);
			types.add(WebdslElementTypes.Text_3022);
			types.add(WebdslElementTypes.Image_3023);
			return types;
		}
		if (editPart instanceof GroupGroupElementsCompartment3EditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(14);
			types.add(WebdslElementTypes.Text_3016);
			types.add(WebdslElementTypes.Image_3017);
			types.add(WebdslElementTypes.List_3018);
			types.add(WebdslElementTypes.Group_3019);
			types.add(WebdslElementTypes.Form_3024);
			types.add(WebdslElementTypes.InternalLink_3020);
			types.add(WebdslElementTypes.ExternalLink_3021);
			types.add(WebdslElementTypes.TextInput_3026);
			types.add(WebdslElementTypes.SelectionList_3028);
			types.add(WebdslElementTypes.Button_3030);
			types.add(WebdslElementTypes.CustomAction_3032);
			types.add(WebdslElementTypes.Save_3034);
			types.add(WebdslElementTypes.Reset_3036);
			types.add(WebdslElementTypes.Cancel_3038);
			return types;
		}
		if (editPart instanceof FormFormElementsCompartmentEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(1);
			types.add(WebdslElementTypes.Text_3016);
			return types;
		}
		if (editPart instanceof InternalLinkInternalLinkSourceCompartment2EditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(2);
			types.add(WebdslElementTypes.Text_3022);
			types.add(WebdslElementTypes.Image_3023);
			return types;
		}
		if (editPart instanceof InternalLinkInternalLinkActualParametersCompartment2EditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(1);
			types.add(WebdslElementTypes.ActualParameter_3008);
			return types;
		}
		if (editPart instanceof ExternalLinkExternalLinkSourceCompartment2EditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(2);
			types.add(WebdslElementTypes.Text_3022);
			types.add(WebdslElementTypes.Image_3023);
			return types;
		}
		if (editPart instanceof GroupGroupElementsCompartment2EditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(14);
			types.add(WebdslElementTypes.Text_3016);
			types.add(WebdslElementTypes.Image_3017);
			types.add(WebdslElementTypes.List_3018);
			types.add(WebdslElementTypes.Group_3019);
			types.add(WebdslElementTypes.Form_3024);
			types.add(WebdslElementTypes.InternalLink_3020);
			types.add(WebdslElementTypes.ExternalLink_3021);
			types.add(WebdslElementTypes.TextInput_3026);
			types.add(WebdslElementTypes.SelectionList_3028);
			types.add(WebdslElementTypes.Button_3030);
			types.add(WebdslElementTypes.CustomAction_3032);
			types.add(WebdslElementTypes.Save_3034);
			types.add(WebdslElementTypes.Reset_3036);
			types.add(WebdslElementTypes.Cancel_3038);
			return types;
		}
		if (editPart instanceof FormFormElementsCompartment2EditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(1);
			types.add(WebdslElementTypes.Text_3016);
			return types;
		}
		if (editPart instanceof InternalLinkInternalLinkSourceCompartment3EditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(2);
			types.add(WebdslElementTypes.Text_3022);
			types.add(WebdslElementTypes.Image_3023);
			return types;
		}
		if (editPart instanceof InternalLinkInternalLinkActualParametersCompartment3EditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(1);
			types.add(WebdslElementTypes.ActualParameter_3008);
			return types;
		}
		if (editPart instanceof ExternalLinkExternalLinkSourceCompartment3EditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(2);
			types.add(WebdslElementTypes.Text_3022);
			types.add(WebdslElementTypes.Image_3023);
			return types;
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		if (sourceEditPart instanceof InternalLink2EditPart) {
			return ((InternalLink2EditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof InternalLink3EditPart) {
			return ((InternalLink3EditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof InternalLinkEditPart) {
			return ((InternalLinkEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		if (targetEditPart instanceof TextEditPart) {
			return ((TextEditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof ImageEditPart) {
			return ((ImageEditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof ListEditPart) {
			return ((ListEditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof Text2EditPart) {
			return ((Text2EditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof Image2EditPart) {
			return ((Image2EditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof List2EditPart) {
			return ((List2EditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof Group2EditPart) {
			return ((Group2EditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof Text3EditPart) {
			return ((Text3EditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof Image3EditPart) {
			return ((Image3EditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof List3EditPart) {
			return ((List3EditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof InternalLink2EditPart) {
			return ((InternalLink2EditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof Text4EditPart) {
			return ((Text4EditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof Image4EditPart) {
			return ((Image4EditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof ExternalLink2EditPart) {
			return ((ExternalLink2EditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof Group3EditPart) {
			return ((Group3EditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof FormEditPart) {
			return ((FormEditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof InternalLink3EditPart) {
			return ((InternalLink3EditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof ExternalLink3EditPart) {
			return ((ExternalLink3EditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof TextInputEditPart) {
			return ((TextInputEditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof SelectionListEditPart) {
			return ((SelectionListEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof ButtonEditPart) {
			return ((ButtonEditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof CustomActionEditPart) {
			return ((CustomActionEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof SaveEditPart) {
			return ((SaveEditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof ResetEditPart) {
			return ((ResetEditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof CancelEditPart) {
			return ((CancelEditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof GroupEditPart) {
			return ((GroupEditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof Form2EditPart) {
			return ((Form2EditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof InternalLinkEditPart) {
			return ((InternalLinkEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof ExternalLinkEditPart) {
			return ((ExternalLinkEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof TextInput2EditPart) {
			return ((TextInput2EditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof SelectionList2EditPart) {
			return ((SelectionList2EditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof Button2EditPart) {
			return ((Button2EditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof CustomAction2EditPart) {
			return ((CustomAction2EditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof Save2EditPart) {
			return ((Save2EditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof Reset2EditPart) {
			return ((Reset2EditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof Cancel2EditPart) {
			return ((Cancel2EditPart) targetEditPart).getMARelTypesOnTarget();
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getRelTypesOnSourceAndTarget(IAdaptable source,
			IAdaptable target) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		if (sourceEditPart instanceof InternalLink2EditPart) {
			return ((InternalLink2EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof InternalLink3EditPart) {
			return ((InternalLink3EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof InternalLinkEditPart) {
			return ((InternalLinkEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getTypesForSource(IAdaptable target,
			IElementType relationshipType) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		if (targetEditPart instanceof TextEditPart) {
			return ((TextEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof ImageEditPart) {
			return ((ImageEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof ListEditPart) {
			return ((ListEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof Text2EditPart) {
			return ((Text2EditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof Image2EditPart) {
			return ((Image2EditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof List2EditPart) {
			return ((List2EditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof Group2EditPart) {
			return ((Group2EditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof Text3EditPart) {
			return ((Text3EditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof Image3EditPart) {
			return ((Image3EditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof List3EditPart) {
			return ((List3EditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof InternalLink2EditPart) {
			return ((InternalLink2EditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof Text4EditPart) {
			return ((Text4EditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof Image4EditPart) {
			return ((Image4EditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof ExternalLink2EditPart) {
			return ((ExternalLink2EditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof Group3EditPart) {
			return ((Group3EditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof FormEditPart) {
			return ((FormEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof InternalLink3EditPart) {
			return ((InternalLink3EditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof ExternalLink3EditPart) {
			return ((ExternalLink3EditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof TextInputEditPart) {
			return ((TextInputEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof SelectionListEditPart) {
			return ((SelectionListEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof ButtonEditPart) {
			return ((ButtonEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof CustomActionEditPart) {
			return ((CustomActionEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof SaveEditPart) {
			return ((SaveEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof ResetEditPart) {
			return ((ResetEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof CancelEditPart) {
			return ((CancelEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof GroupEditPart) {
			return ((GroupEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof Form2EditPart) {
			return ((Form2EditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof InternalLinkEditPart) {
			return ((InternalLinkEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof ExternalLinkEditPart) {
			return ((ExternalLinkEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof TextInput2EditPart) {
			return ((TextInput2EditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof SelectionList2EditPart) {
			return ((SelectionList2EditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof Button2EditPart) {
			return ((Button2EditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof CustomAction2EditPart) {
			return ((CustomAction2EditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof Save2EditPart) {
			return ((Save2EditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof Reset2EditPart) {
			return ((Reset2EditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof Cancel2EditPart) {
			return ((Cancel2EditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getTypesForTarget(IAdaptable source,
			IElementType relationshipType) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		if (sourceEditPart instanceof InternalLink2EditPart) {
			return ((InternalLink2EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof InternalLink3EditPart) {
			return ((InternalLink3EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof InternalLinkEditPart) {
			return ((InternalLinkEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public EObject selectExistingElementForSource(IAdaptable target,
			IElementType relationshipType) {
		return selectExistingElement(target,
				getTypesForSource(target, relationshipType));
	}

	/**
	 * @generated
	 */
	public EObject selectExistingElementForTarget(IAdaptable source,
			IElementType relationshipType) {
		return selectExistingElement(source,
				getTypesForTarget(source, relationshipType));
	}

	/**
	 * @generated
	 */
	protected EObject selectExistingElement(IAdaptable host, Collection types) {
		if (types.isEmpty()) {
			return null;
		}
		IGraphicalEditPart editPart = (IGraphicalEditPart) host
				.getAdapter(IGraphicalEditPart.class);
		if (editPart == null) {
			return null;
		}
		Diagram diagram = (Diagram) editPart.getRoot().getContents().getModel();
		HashSet<EObject> elements = new HashSet<EObject>();
		for (Iterator<EObject> it = diagram.getElement().eAllContents(); it
				.hasNext();) {
			EObject element = it.next();
			if (isApplicableElement(element, types)) {
				elements.add(element);
			}
		}
		if (elements.isEmpty()) {
			return null;
		}
		return selectElement((EObject[]) elements.toArray(new EObject[elements
				.size()]));
	}

	/**
	 * @generated
	 */
	protected boolean isApplicableElement(EObject element, Collection types) {
		IElementType type = ElementTypeRegistry.getInstance().getElementType(
				element);
		return types.contains(type);
	}

	/**
	 * @generated
	 */
	protected EObject selectElement(EObject[] elements) {
		Shell shell = Display.getCurrent().getActiveShell();
		ILabelProvider labelProvider = new AdapterFactoryLabelProvider(
				WebdslDiagramEditorPlugin.getInstance()
						.getItemProvidersAdapterFactory());
		ElementListSelectionDialog dialog = new ElementListSelectionDialog(
				shell, labelProvider);
		dialog.setMessage(Messages.WebdslModelingAssistantProviderMessage);
		dialog.setTitle(Messages.WebdslModelingAssistantProviderTitle);
		dialog.setMultipleSelection(false);
		dialog.setElements(elements);
		EObject selected = null;
		if (dialog.open() == Window.OK) {
			selected = (EObject) dialog.getFirstResult();
		}
		return selected;
	}
}
