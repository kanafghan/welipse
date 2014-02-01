package com.github.kanafghan.welipse.webdsl.diagram.navigator;

import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserOptions;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.viewers.ITreePathLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.viewers.ViewerLabel;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonLabelProvider;

import com.github.kanafghan.welipse.webdsl.Website;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.ActualParameterEditPart;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.ActualParameterIdentifierEditPart;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.Button2EditPart;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.ButtonEditPart;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.ButtonValue2EditPart;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.ButtonValueEditPart;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.Cancel2EditPart;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.CancelEditPart;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.CancelValue2EditPart;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.CancelValueEditPart;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.CustomAction2EditPart;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.CustomActionEditPart;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.CustomActionValue2EditPart;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.CustomActionValueEditPart;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.ExternalLink2EditPart;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.ExternalLink3EditPart;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.ExternalLinkEditPart;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.ExternalLinkName2EditPart;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.ExternalLinkName3EditPart;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.ExternalLinkNameEditPart;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.Form2EditPart;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.FormEditPart;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.FormName2EditPart;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.FormNameEditPart;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.Group2EditPart;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.Group3EditPart;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.GroupEditPart;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.GroupName2EditPart;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.GroupName3EditPart;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.GroupNameEditPart;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.Image2EditPart;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.Image3EditPart;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.Image4EditPart;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.ImageEditPart;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.ImageExpression2EditPart;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.ImageExpression3EditPart;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.ImageExpression4EditPart;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.ImageExpressionEditPart;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.InternalLink2EditPart;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.InternalLink3EditPart;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.InternalLinkEditPart;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.InternalLinkName2EditPart;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.InternalLinkName3EditPart;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.InternalLinkNameEditPart;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.InternalLinkTargetEditPart;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.List2EditPart;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.List3EditPart;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.ListEditPart;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.ListExpressionEditPart;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.ListVariable2EditPart;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.ListVariableEditPart;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.PageEditPart;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.PageNameEditPart;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.ParameterDeclarationEditPart;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.ParameterEditPart;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.Reset2EditPart;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.ResetEditPart;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.ResetValue2EditPart;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.ResetValueEditPart;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.Save2EditPart;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.SaveEditPart;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.SaveValue2EditPart;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.SaveValueEditPart;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.SelectionList2EditPart;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.SelectionListEditPart;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.SelectionListLabelExpression2EditPart;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.SelectionListLabelExpressionEditPart;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.Text2EditPart;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.Text3EditPart;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.Text4EditPart;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.TextEditPart;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.TextExpression2EditPart;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.TextExpression3EditPart;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.TextExpression4EditPart;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.TextExpressionEditPart;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.TextInput2EditPart;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.TextInputEditPart;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.TextInputLabelExpression2EditPart;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.TextInputLabelExpressionEditPart;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.VariableInitializationDeclarationEditPart;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.VariableInitializationEditPart;
import com.github.kanafghan.welipse.webdsl.diagram.edit.parts.WebsiteEditPart;
import com.github.kanafghan.welipse.webdsl.diagram.part.WebdslDiagramEditorPlugin;
import com.github.kanafghan.welipse.webdsl.diagram.part.WebdslVisualIDRegistry;
import com.github.kanafghan.welipse.webdsl.diagram.providers.WebdslElementTypes;
import com.github.kanafghan.welipse.webdsl.diagram.providers.WebdslParserProvider;

/**
 * @generated
 */
public class WebdslNavigatorLabelProvider extends LabelProvider implements
		ICommonLabelProvider, ITreePathLabelProvider {

	/**
	 * @generated
	 */
	static {
		WebdslDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?UnknownElement", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
		WebdslDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?ImageNotFound", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof WebdslNavigatorItem
				&& !isOwnView(((WebdslNavigatorItem) element).getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	 * @generated
	 */
	public Image getImage(Object element) {
		if (element instanceof WebdslNavigatorGroup) {
			WebdslNavigatorGroup group = (WebdslNavigatorGroup) element;
			return WebdslDiagramEditorPlugin.getInstance().getBundledImage(
					group.getIcon());
		}

		if (element instanceof WebdslNavigatorItem) {
			WebdslNavigatorItem navigatorItem = (WebdslNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return super.getImage(element);
			}
			return getImage(navigatorItem.getView());
		}

		return super.getImage(element);
	}

	/**
	 * @generated
	 */
	public Image getImage(View view) {
		switch (WebdslVisualIDRegistry.getVisualID(view)) {
		case WebsiteEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Diagram?http://github.com/kanafghan/welipse/webdsl/1.0?Website", WebdslElementTypes.Website_1000); //$NON-NLS-1$
		case PageEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://github.com/kanafghan/welipse/webdsl/1.0?Page", WebdslElementTypes.Page_2001); //$NON-NLS-1$
		case ParameterEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://github.com/kanafghan/welipse/webdsl/1.0?Parameter", WebdslElementTypes.Parameter_3001); //$NON-NLS-1$
		case VariableInitializationEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://github.com/kanafghan/welipse/webdsl/1.0?VariableInitialization", WebdslElementTypes.VariableInitialization_3002); //$NON-NLS-1$
		case TextEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://github.com/kanafghan/welipse/webdsl/1.0?Text", WebdslElementTypes.Text_3003); //$NON-NLS-1$
		case ImageEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://github.com/kanafghan/welipse/webdsl/1.0?Image", WebdslElementTypes.Image_3004); //$NON-NLS-1$
		case ListEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://github.com/kanafghan/welipse/webdsl/1.0?List", WebdslElementTypes.List_3005); //$NON-NLS-1$
		case GroupEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://github.com/kanafghan/welipse/webdsl/1.0?Group", WebdslElementTypes.Group_3006); //$NON-NLS-1$
		case InternalLinkEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://github.com/kanafghan/welipse/webdsl/1.0?InternalLink", WebdslElementTypes.InternalLink_3007); //$NON-NLS-1$
		case ActualParameterEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://github.com/kanafghan/welipse/webdsl/1.0?ActualParameter", WebdslElementTypes.ActualParameter_3008); //$NON-NLS-1$
		case ExternalLinkEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://github.com/kanafghan/welipse/webdsl/1.0?ExternalLink", WebdslElementTypes.ExternalLink_3009); //$NON-NLS-1$
		case Text2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://github.com/kanafghan/welipse/webdsl/1.0?Text", WebdslElementTypes.Text_3010); //$NON-NLS-1$
		case Image2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://github.com/kanafghan/welipse/webdsl/1.0?Image", WebdslElementTypes.Image_3011); //$NON-NLS-1$
		case List2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://github.com/kanafghan/welipse/webdsl/1.0?List", WebdslElementTypes.List_3012); //$NON-NLS-1$
		case Group2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://github.com/kanafghan/welipse/webdsl/1.0?Group", WebdslElementTypes.Group_3013); //$NON-NLS-1$
		case InternalLink2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://github.com/kanafghan/welipse/webdsl/1.0?InternalLink", WebdslElementTypes.InternalLink_3014); //$NON-NLS-1$
		case ExternalLink2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://github.com/kanafghan/welipse/webdsl/1.0?ExternalLink", WebdslElementTypes.ExternalLink_3015); //$NON-NLS-1$
		case Text3EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://github.com/kanafghan/welipse/webdsl/1.0?Text", WebdslElementTypes.Text_3016); //$NON-NLS-1$
		case Image3EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://github.com/kanafghan/welipse/webdsl/1.0?Image", WebdslElementTypes.Image_3017); //$NON-NLS-1$
		case List3EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://github.com/kanafghan/welipse/webdsl/1.0?List", WebdslElementTypes.List_3018); //$NON-NLS-1$
		case Group3EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://github.com/kanafghan/welipse/webdsl/1.0?Group", WebdslElementTypes.Group_3019); //$NON-NLS-1$
		case InternalLink3EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://github.com/kanafghan/welipse/webdsl/1.0?InternalLink", WebdslElementTypes.InternalLink_3020); //$NON-NLS-1$
		case ExternalLink3EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://github.com/kanafghan/welipse/webdsl/1.0?ExternalLink", WebdslElementTypes.ExternalLink_3021); //$NON-NLS-1$
		case Text4EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://github.com/kanafghan/welipse/webdsl/1.0?Text", WebdslElementTypes.Text_3022); //$NON-NLS-1$
		case Image4EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://github.com/kanafghan/welipse/webdsl/1.0?Image", WebdslElementTypes.Image_3023); //$NON-NLS-1$
		case FormEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://github.com/kanafghan/welipse/webdsl/1.0?Form", WebdslElementTypes.Form_3024); //$NON-NLS-1$
		case Form2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://github.com/kanafghan/welipse/webdsl/1.0?Form", WebdslElementTypes.Form_3025); //$NON-NLS-1$
		case TextInputEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://github.com/kanafghan/welipse/webdsl/1.0?TextInput", WebdslElementTypes.TextInput_3026); //$NON-NLS-1$
		case TextInput2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://github.com/kanafghan/welipse/webdsl/1.0?TextInput", WebdslElementTypes.TextInput_3027); //$NON-NLS-1$
		case SelectionListEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://github.com/kanafghan/welipse/webdsl/1.0?SelectionList", WebdslElementTypes.SelectionList_3028); //$NON-NLS-1$
		case SelectionList2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://github.com/kanafghan/welipse/webdsl/1.0?SelectionList", WebdslElementTypes.SelectionList_3029); //$NON-NLS-1$
		case ButtonEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://github.com/kanafghan/welipse/webdsl/1.0?Button", WebdslElementTypes.Button_3030); //$NON-NLS-1$
		case Button2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://github.com/kanafghan/welipse/webdsl/1.0?Button", WebdslElementTypes.Button_3031); //$NON-NLS-1$
		case CustomActionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://github.com/kanafghan/welipse/webdsl/1.0?CustomAction", WebdslElementTypes.CustomAction_3032); //$NON-NLS-1$
		case CustomAction2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://github.com/kanafghan/welipse/webdsl/1.0?CustomAction", WebdslElementTypes.CustomAction_3033); //$NON-NLS-1$
		case SaveEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://github.com/kanafghan/welipse/webdsl/1.0?Save", WebdslElementTypes.Save_3034); //$NON-NLS-1$
		case Save2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://github.com/kanafghan/welipse/webdsl/1.0?Save", WebdslElementTypes.Save_3035); //$NON-NLS-1$
		case ResetEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://github.com/kanafghan/welipse/webdsl/1.0?Reset", WebdslElementTypes.Reset_3036); //$NON-NLS-1$
		case Reset2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://github.com/kanafghan/welipse/webdsl/1.0?Reset", WebdslElementTypes.Reset_3037); //$NON-NLS-1$
		case CancelEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://github.com/kanafghan/welipse/webdsl/1.0?Cancel", WebdslElementTypes.Cancel_3038); //$NON-NLS-1$
		case Cancel2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://github.com/kanafghan/welipse/webdsl/1.0?Cancel", WebdslElementTypes.Cancel_3039); //$NON-NLS-1$
		case InternalLinkTargetEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://github.com/kanafghan/welipse/webdsl/1.0?InternalLink?target", WebdslElementTypes.InternalLinkTarget_4004); //$NON-NLS-1$
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = WebdslDiagramEditorPlugin.getInstance()
				.getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null && elementType != null
				&& WebdslElementTypes.isKnownElementType(elementType)) {
			image = WebdslElementTypes.getImage(elementType);
			imageRegistry.put(key, image);
		}

		if (image == null) {
			image = imageRegistry.get("Navigator?ImageNotFound"); //$NON-NLS-1$
			imageRegistry.put(key, image);
		}
		return image;
	}

	/**
	 * @generated
	 */
	public String getText(Object element) {
		if (element instanceof WebdslNavigatorGroup) {
			WebdslNavigatorGroup group = (WebdslNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof WebdslNavigatorItem) {
			WebdslNavigatorItem navigatorItem = (WebdslNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return null;
			}
			return getText(navigatorItem.getView());
		}

		return super.getText(element);
	}

	/**
	 * @generated
	 */
	public String getText(View view) {
		if (view.getElement() != null && view.getElement().eIsProxy()) {
			return getUnresolvedDomainElementProxyText(view);
		}
		switch (WebdslVisualIDRegistry.getVisualID(view)) {
		case WebsiteEditPart.VISUAL_ID:
			return getWebsite_1000Text(view);
		case PageEditPart.VISUAL_ID:
			return getPage_2001Text(view);
		case ParameterEditPart.VISUAL_ID:
			return getParameter_3001Text(view);
		case VariableInitializationEditPart.VISUAL_ID:
			return getVariableInitialization_3002Text(view);
		case TextEditPart.VISUAL_ID:
			return getText_3003Text(view);
		case ImageEditPart.VISUAL_ID:
			return getImage_3004Text(view);
		case ListEditPart.VISUAL_ID:
			return getList_3005Text(view);
		case GroupEditPart.VISUAL_ID:
			return getGroup_3006Text(view);
		case InternalLinkEditPart.VISUAL_ID:
			return getInternalLink_3007Text(view);
		case ActualParameterEditPart.VISUAL_ID:
			return getActualParameter_3008Text(view);
		case ExternalLinkEditPart.VISUAL_ID:
			return getExternalLink_3009Text(view);
		case Text2EditPart.VISUAL_ID:
			return getText_3010Text(view);
		case Image2EditPart.VISUAL_ID:
			return getImage_3011Text(view);
		case List2EditPart.VISUAL_ID:
			return getList_3012Text(view);
		case Group2EditPart.VISUAL_ID:
			return getGroup_3013Text(view);
		case InternalLink2EditPart.VISUAL_ID:
			return getInternalLink_3014Text(view);
		case ExternalLink2EditPart.VISUAL_ID:
			return getExternalLink_3015Text(view);
		case Text3EditPart.VISUAL_ID:
			return getText_3016Text(view);
		case Image3EditPart.VISUAL_ID:
			return getImage_3017Text(view);
		case List3EditPart.VISUAL_ID:
			return getList_3018Text(view);
		case Group3EditPart.VISUAL_ID:
			return getGroup_3019Text(view);
		case InternalLink3EditPart.VISUAL_ID:
			return getInternalLink_3020Text(view);
		case ExternalLink3EditPart.VISUAL_ID:
			return getExternalLink_3021Text(view);
		case Text4EditPart.VISUAL_ID:
			return getText_3022Text(view);
		case Image4EditPart.VISUAL_ID:
			return getImage_3023Text(view);
		case FormEditPart.VISUAL_ID:
			return getForm_3024Text(view);
		case Form2EditPart.VISUAL_ID:
			return getForm_3025Text(view);
		case TextInputEditPart.VISUAL_ID:
			return getTextInput_3026Text(view);
		case TextInput2EditPart.VISUAL_ID:
			return getTextInput_3027Text(view);
		case SelectionListEditPart.VISUAL_ID:
			return getSelectionList_3028Text(view);
		case SelectionList2EditPart.VISUAL_ID:
			return getSelectionList_3029Text(view);
		case ButtonEditPart.VISUAL_ID:
			return getButton_3030Text(view);
		case Button2EditPart.VISUAL_ID:
			return getButton_3031Text(view);
		case CustomActionEditPart.VISUAL_ID:
			return getCustomAction_3032Text(view);
		case CustomAction2EditPart.VISUAL_ID:
			return getCustomAction_3033Text(view);
		case SaveEditPart.VISUAL_ID:
			return getSave_3034Text(view);
		case Save2EditPart.VISUAL_ID:
			return getSave_3035Text(view);
		case ResetEditPart.VISUAL_ID:
			return getReset_3036Text(view);
		case Reset2EditPart.VISUAL_ID:
			return getReset_3037Text(view);
		case CancelEditPart.VISUAL_ID:
			return getCancel_3038Text(view);
		case Cancel2EditPart.VISUAL_ID:
			return getCancel_3039Text(view);
		case InternalLinkTargetEditPart.VISUAL_ID:
			return getInternalLinkTarget_4004Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	 * @generated
	 */
	private String getWebsite_1000Text(View view) {
		Website domainModelElement = (Website) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			WebdslDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 1000); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getPage_2001Text(View view) {
		IParser parser = WebdslParserProvider.getParser(
				WebdslElementTypes.Page_2001,
				view.getElement() != null ? view.getElement() : view,
				WebdslVisualIDRegistry.getType(PageNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WebdslDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getParameter_3001Text(View view) {
		IParser parser = WebdslParserProvider.getParser(
				WebdslElementTypes.Parameter_3001,
				view.getElement() != null ? view.getElement() : view,
				WebdslVisualIDRegistry
						.getType(ParameterDeclarationEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WebdslDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getVariableInitialization_3002Text(View view) {
		IParser parser = WebdslParserProvider
				.getParser(
						WebdslElementTypes.VariableInitialization_3002,
						view.getElement() != null ? view.getElement() : view,
						WebdslVisualIDRegistry
								.getType(VariableInitializationDeclarationEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WebdslDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getText_3003Text(View view) {
		IParser parser = WebdslParserProvider.getParser(
				WebdslElementTypes.Text_3003,
				view.getElement() != null ? view.getElement() : view,
				WebdslVisualIDRegistry
						.getType(TextExpressionEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WebdslDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5004); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getImage_3004Text(View view) {
		IParser parser = WebdslParserProvider.getParser(
				WebdslElementTypes.Image_3004,
				view.getElement() != null ? view.getElement() : view,
				WebdslVisualIDRegistry
						.getType(ImageExpressionEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WebdslDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5023); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getList_3005Text(View view) {
		IParser parser = WebdslParserProvider.getParser(
				WebdslElementTypes.List_3005,
				view.getElement() != null ? view.getElement() : view,
				WebdslVisualIDRegistry
						.getType(ListExpressionEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WebdslDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5024); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getGroup_3006Text(View view) {
		IParser parser = WebdslParserProvider.getParser(
				WebdslElementTypes.Group_3006,
				view.getElement() != null ? view.getElement() : view,
				WebdslVisualIDRegistry.getType(GroupNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WebdslDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5025); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getInternalLink_3007Text(View view) {
		IParser parser = WebdslParserProvider.getParser(
				WebdslElementTypes.InternalLink_3007,
				view.getElement() != null ? view.getElement() : view,
				WebdslVisualIDRegistry
						.getType(InternalLinkNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WebdslDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5027); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getActualParameter_3008Text(View view) {
		IParser parser = WebdslParserProvider.getParser(
				WebdslElementTypes.ActualParameter_3008,
				view.getElement() != null ? view.getElement() : view,
				WebdslVisualIDRegistry
						.getType(ActualParameterIdentifierEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WebdslDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5026); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getExternalLink_3009Text(View view) {
		IParser parser = WebdslParserProvider.getParser(
				WebdslElementTypes.ExternalLink_3009,
				view.getElement() != null ? view.getElement() : view,
				WebdslVisualIDRegistry
						.getType(ExternalLinkNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WebdslDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5028); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getText_3010Text(View view) {
		IParser parser = WebdslParserProvider.getParser(
				WebdslElementTypes.Text_3010,
				view.getElement() != null ? view.getElement() : view,
				WebdslVisualIDRegistry
						.getType(TextExpression2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WebdslDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5029); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getImage_3011Text(View view) {
		IParser parser = WebdslParserProvider.getParser(
				WebdslElementTypes.Image_3011,
				view.getElement() != null ? view.getElement() : view,
				WebdslVisualIDRegistry
						.getType(ImageExpression2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WebdslDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5031); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getList_3012Text(View view) {
		IParser parser = WebdslParserProvider.getParser(
				WebdslElementTypes.List_3012,
				view.getElement() != null ? view.getElement() : view,
				WebdslVisualIDRegistry.getType(ListVariableEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WebdslDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5035); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getGroup_3013Text(View view) {
		IParser parser = WebdslParserProvider.getParser(
				WebdslElementTypes.Group_3013,
				view.getElement() != null ? view.getElement() : view,
				WebdslVisualIDRegistry.getType(GroupName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WebdslDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5032); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getInternalLink_3014Text(View view) {
		IParser parser = WebdslParserProvider.getParser(
				WebdslElementTypes.InternalLink_3014,
				view.getElement() != null ? view.getElement() : view,
				WebdslVisualIDRegistry
						.getType(InternalLinkName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WebdslDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5033); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getExternalLink_3015Text(View view) {
		IParser parser = WebdslParserProvider.getParser(
				WebdslElementTypes.ExternalLink_3015,
				view.getElement() != null ? view.getElement() : view,
				WebdslVisualIDRegistry
						.getType(ExternalLinkName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WebdslDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5034); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getText_3016Text(View view) {
		IParser parser = WebdslParserProvider.getParser(
				WebdslElementTypes.Text_3016,
				view.getElement() != null ? view.getElement() : view,
				WebdslVisualIDRegistry
						.getType(TextExpression3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WebdslDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5037); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getImage_3017Text(View view) {
		IParser parser = WebdslParserProvider.getParser(
				WebdslElementTypes.Image_3017,
				view.getElement() != null ? view.getElement() : view,
				WebdslVisualIDRegistry
						.getType(ImageExpression3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WebdslDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5038); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getList_3018Text(View view) {
		IParser parser = WebdslParserProvider
				.getParser(WebdslElementTypes.List_3018,
						view.getElement() != null ? view.getElement() : view,
						WebdslVisualIDRegistry
								.getType(ListVariable2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WebdslDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5039); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getGroup_3019Text(View view) {
		IParser parser = WebdslParserProvider.getParser(
				WebdslElementTypes.Group_3019,
				view.getElement() != null ? view.getElement() : view,
				WebdslVisualIDRegistry.getType(GroupName3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WebdslDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5043); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getInternalLink_3020Text(View view) {
		IParser parser = WebdslParserProvider.getParser(
				WebdslElementTypes.InternalLink_3020,
				view.getElement() != null ? view.getElement() : view,
				WebdslVisualIDRegistry
						.getType(InternalLinkName3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WebdslDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5041); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getExternalLink_3021Text(View view) {
		IParser parser = WebdslParserProvider.getParser(
				WebdslElementTypes.ExternalLink_3021,
				view.getElement() != null ? view.getElement() : view,
				WebdslVisualIDRegistry
						.getType(ExternalLinkName3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WebdslDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5042); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getText_3022Text(View view) {
		IParser parser = WebdslParserProvider.getParser(
				WebdslElementTypes.Text_3022,
				view.getElement() != null ? view.getElement() : view,
				WebdslVisualIDRegistry
						.getType(TextExpression4EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WebdslDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5044); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getImage_3023Text(View view) {
		IParser parser = WebdslParserProvider.getParser(
				WebdslElementTypes.Image_3023,
				view.getElement() != null ? view.getElement() : view,
				WebdslVisualIDRegistry
						.getType(ImageExpression4EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WebdslDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5045); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getForm_3024Text(View view) {
		IParser parser = WebdslParserProvider.getParser(
				WebdslElementTypes.Form_3024,
				view.getElement() != null ? view.getElement() : view,
				WebdslVisualIDRegistry.getType(FormNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WebdslDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5046); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getForm_3025Text(View view) {
		IParser parser = WebdslParserProvider.getParser(
				WebdslElementTypes.Form_3025,
				view.getElement() != null ? view.getElement() : view,
				WebdslVisualIDRegistry.getType(FormName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WebdslDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5047); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getTextInput_3026Text(View view) {
		IParser parser = WebdslParserProvider.getParser(
				WebdslElementTypes.TextInput_3026,
				view.getElement() != null ? view.getElement() : view,
				WebdslVisualIDRegistry
						.getType(TextInputLabelExpressionEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WebdslDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5048); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getTextInput_3027Text(View view) {
		IParser parser = WebdslParserProvider.getParser(
				WebdslElementTypes.TextInput_3027,
				view.getElement() != null ? view.getElement() : view,
				WebdslVisualIDRegistry
						.getType(TextInputLabelExpression2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WebdslDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5050); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getSelectionList_3028Text(View view) {
		IParser parser = WebdslParserProvider
				.getParser(
						WebdslElementTypes.SelectionList_3028,
						view.getElement() != null ? view.getElement() : view,
						WebdslVisualIDRegistry
								.getType(SelectionListLabelExpressionEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WebdslDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5052); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getSelectionList_3029Text(View view) {
		IParser parser = WebdslParserProvider
				.getParser(
						WebdslElementTypes.SelectionList_3029,
						view.getElement() != null ? view.getElement() : view,
						WebdslVisualIDRegistry
								.getType(SelectionListLabelExpression2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WebdslDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5055); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getButton_3030Text(View view) {
		IParser parser = WebdslParserProvider.getParser(
				WebdslElementTypes.Button_3030,
				view.getElement() != null ? view.getElement() : view,
				WebdslVisualIDRegistry.getType(ButtonValueEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WebdslDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5058); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getButton_3031Text(View view) {
		IParser parser = WebdslParserProvider.getParser(
				WebdslElementTypes.Button_3031,
				view.getElement() != null ? view.getElement() : view,
				WebdslVisualIDRegistry.getType(ButtonValue2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WebdslDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5059); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCustomAction_3032Text(View view) {
		IParser parser = WebdslParserProvider.getParser(
				WebdslElementTypes.CustomAction_3032,
				view.getElement() != null ? view.getElement() : view,
				WebdslVisualIDRegistry
						.getType(CustomActionValueEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WebdslDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5060); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCustomAction_3033Text(View view) {
		IParser parser = WebdslParserProvider.getParser(
				WebdslElementTypes.CustomAction_3033,
				view.getElement() != null ? view.getElement() : view,
				WebdslVisualIDRegistry
						.getType(CustomActionValue2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WebdslDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5063); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getSave_3034Text(View view) {
		IParser parser = WebdslParserProvider.getParser(
				WebdslElementTypes.Save_3034,
				view.getElement() != null ? view.getElement() : view,
				WebdslVisualIDRegistry.getType(SaveValueEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WebdslDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5066); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getSave_3035Text(View view) {
		IParser parser = WebdslParserProvider.getParser(
				WebdslElementTypes.Save_3035,
				view.getElement() != null ? view.getElement() : view,
				WebdslVisualIDRegistry.getType(SaveValue2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WebdslDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5069); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getReset_3036Text(View view) {
		IParser parser = WebdslParserProvider.getParser(
				WebdslElementTypes.Reset_3036,
				view.getElement() != null ? view.getElement() : view,
				WebdslVisualIDRegistry.getType(ResetValueEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WebdslDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5072); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getReset_3037Text(View view) {
		IParser parser = WebdslParserProvider.getParser(
				WebdslElementTypes.Reset_3037,
				view.getElement() != null ? view.getElement() : view,
				WebdslVisualIDRegistry.getType(ResetValue2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WebdslDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5075); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCancel_3038Text(View view) {
		IParser parser = WebdslParserProvider.getParser(
				WebdslElementTypes.Cancel_3038,
				view.getElement() != null ? view.getElement() : view,
				WebdslVisualIDRegistry.getType(CancelValueEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WebdslDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5078); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCancel_3039Text(View view) {
		IParser parser = WebdslParserProvider.getParser(
				WebdslElementTypes.Cancel_3039,
				view.getElement() != null ? view.getElement() : view,
				WebdslVisualIDRegistry.getType(CancelValue2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WebdslDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5081); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getInternalLinkTarget_4004Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getUnknownElementText(View view) {
		return "<UnknownElement Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	 * @generated
	 */
	private String getUnresolvedDomainElementProxyText(View view) {
		return "<Unresolved domain element Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	 * @generated
	 */
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	 * @generated
	 */
	public void restoreState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public void saveState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public String getDescription(Object anElement) {
		return null;
	}

	/**
	 * @generated
	 */
	private boolean isOwnView(View view) {
		return WebsiteEditPart.MODEL_ID.equals(WebdslVisualIDRegistry
				.getModelID(view));
	}

}
