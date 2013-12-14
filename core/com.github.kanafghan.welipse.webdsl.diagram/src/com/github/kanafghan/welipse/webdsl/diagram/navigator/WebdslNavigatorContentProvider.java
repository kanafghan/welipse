package com.github.kanafghan.welipse.webdsl.diagram.navigator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.workspace.util.WorkspaceSynchronizer;
import org.eclipse.gmf.runtime.emf.core.GMFEditingDomainFactory;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonContentProvider;

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
import com.github.kanafghan.welipse.webdsl.diagram.part.Messages;
import com.github.kanafghan.welipse.webdsl.diagram.part.WebdslVisualIDRegistry;

/**
 * @generated
 */
public class WebdslNavigatorContentProvider implements ICommonContentProvider {

	/**
	 * @generated
	 */
	private static final Object[] EMPTY_ARRAY = new Object[0];

	/**
	 * @generated
	 */
	private Viewer myViewer;

	/**
	 * @generated
	 */
	private AdapterFactoryEditingDomain myEditingDomain;

	/**
	 * @generated
	 */
	private WorkspaceSynchronizer myWorkspaceSynchronizer;

	/**
	 * @generated
	 */
	private Runnable myViewerRefreshRunnable;

	/**
	 * @generated
	 */
	@SuppressWarnings({ "unchecked", "serial", "rawtypes" })
	public WebdslNavigatorContentProvider() {
		TransactionalEditingDomain editingDomain = GMFEditingDomainFactory.INSTANCE
				.createEditingDomain();
		myEditingDomain = (AdapterFactoryEditingDomain) editingDomain;
		myEditingDomain.setResourceToReadOnlyMap(new HashMap() {
			public Object get(Object key) {
				if (!containsKey(key)) {
					put(key, Boolean.TRUE);
				}
				return super.get(key);
			}
		});
		myViewerRefreshRunnable = new Runnable() {
			public void run() {
				if (myViewer != null) {
					myViewer.refresh();
				}
			}
		};
		myWorkspaceSynchronizer = new WorkspaceSynchronizer(editingDomain,
				new WorkspaceSynchronizer.Delegate() {
					public void dispose() {
					}

					public boolean handleResourceChanged(final Resource resource) {
						unloadAllResources();
						asyncRefresh();
						return true;
					}

					public boolean handleResourceDeleted(Resource resource) {
						unloadAllResources();
						asyncRefresh();
						return true;
					}

					public boolean handleResourceMoved(Resource resource,
							final URI newURI) {
						unloadAllResources();
						asyncRefresh();
						return true;
					}
				});
	}

	/**
	 * @generated
	 */
	public void dispose() {
		myWorkspaceSynchronizer.dispose();
		myWorkspaceSynchronizer = null;
		myViewerRefreshRunnable = null;
		myViewer = null;
		unloadAllResources();
		((TransactionalEditingDomain) myEditingDomain).dispose();
		myEditingDomain = null;
	}

	/**
	 * @generated
	 */
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		myViewer = viewer;
	}

	/**
	 * @generated
	 */
	void unloadAllResources() {
		for (Resource nextResource : myEditingDomain.getResourceSet()
				.getResources()) {
			nextResource.unload();
		}
	}

	/**
	 * @generated
	 */
	void asyncRefresh() {
		if (myViewer != null && !myViewer.getControl().isDisposed()) {
			myViewer.getControl().getDisplay()
					.asyncExec(myViewerRefreshRunnable);
		}
	}

	/**
	 * @generated
	 */
	public Object[] getElements(Object inputElement) {
		return getChildren(inputElement);
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
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	 * @generated
	 */
	public Object[] getChildren(Object parentElement) {
		if (parentElement instanceof IFile) {
			IFile file = (IFile) parentElement;
			URI fileURI = URI.createPlatformResourceURI(file.getFullPath()
					.toString(), true);
			Resource resource = myEditingDomain.getResourceSet().getResource(
					fileURI, true);
			ArrayList<WebdslNavigatorItem> result = new ArrayList<WebdslNavigatorItem>();
			ArrayList<View> topViews = new ArrayList<View>(resource
					.getContents().size());
			for (EObject o : resource.getContents()) {
				if (o instanceof View) {
					topViews.add((View) o);
				}
			}
			result.addAll(createNavigatorItems(
					selectViewsByType(topViews, WebsiteEditPart.MODEL_ID),
					file, false));
			return result.toArray();
		}

		if (parentElement instanceof WebdslNavigatorGroup) {
			WebdslNavigatorGroup group = (WebdslNavigatorGroup) parentElement;
			return group.getChildren();
		}

		if (parentElement instanceof WebdslNavigatorItem) {
			WebdslNavigatorItem navigatorItem = (WebdslNavigatorItem) parentElement;
			if (navigatorItem.isLeaf() || !isOwnView(navigatorItem.getView())) {
				return EMPTY_ARRAY;
			}
			return getViewChildren(navigatorItem.getView(), parentElement);
		}

		return EMPTY_ARRAY;
	}

	/**
	 * @generated
	 */
	private Object[] getViewChildren(View view, Object parentElement) {
		switch (WebdslVisualIDRegistry.getVisualID(view)) {

		case WebsiteEditPart.VISUAL_ID: {
			LinkedList<WebdslAbstractNavigatorItem> result = new LinkedList<WebdslAbstractNavigatorItem>();
			Diagram sv = (Diagram) view;
			WebdslNavigatorGroup links = new WebdslNavigatorGroup(
					Messages.NavigatorGroupName_Website_1000_links,
					"icons/linksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					WebdslVisualIDRegistry.getType(PageEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					WebdslVisualIDRegistry
							.getType(InternalLinkTargetEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			if (!links.isEmpty()) {
				result.add(links);
			}
			return result.toArray();
		}

		case PageEditPart.VISUAL_ID: {
			LinkedList<WebdslAbstractNavigatorItem> result = new LinkedList<WebdslAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					WebdslVisualIDRegistry
							.getType(PagePageParametersCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					WebdslVisualIDRegistry.getType(ParameterEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					WebdslVisualIDRegistry
							.getType(PagePageVariablesCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					WebdslVisualIDRegistry
							.getType(VariableInitializationEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					WebdslVisualIDRegistry
							.getType(PagePageElementsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					WebdslVisualIDRegistry.getType(TextEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					WebdslVisualIDRegistry
							.getType(PagePageElementsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					WebdslVisualIDRegistry.getType(ImageEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					WebdslVisualIDRegistry
							.getType(PagePageElementsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					WebdslVisualIDRegistry.getType(ListEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					WebdslVisualIDRegistry
							.getType(PagePageElementsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					WebdslVisualIDRegistry.getType(GroupEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					WebdslVisualIDRegistry
							.getType(PagePageElementsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					WebdslVisualIDRegistry
							.getType(InternalLinkEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					WebdslVisualIDRegistry
							.getType(PagePageElementsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					WebdslVisualIDRegistry
							.getType(ExternalLinkEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case TextEditPart.VISUAL_ID: {
			LinkedList<WebdslAbstractNavigatorItem> result = new LinkedList<WebdslAbstractNavigatorItem>();
			Node sv = (Node) view;
			WebdslNavigatorGroup incominglinks = new WebdslNavigatorGroup(
					Messages.NavigatorGroupName_Text_3003_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					WebdslVisualIDRegistry
							.getType(InternalLinkTargetEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case ImageEditPart.VISUAL_ID: {
			LinkedList<WebdslAbstractNavigatorItem> result = new LinkedList<WebdslAbstractNavigatorItem>();
			Node sv = (Node) view;
			WebdslNavigatorGroup incominglinks = new WebdslNavigatorGroup(
					Messages.NavigatorGroupName_Image_3004_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					WebdslVisualIDRegistry
							.getType(InternalLinkTargetEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case ListEditPart.VISUAL_ID: {
			LinkedList<WebdslAbstractNavigatorItem> result = new LinkedList<WebdslAbstractNavigatorItem>();
			Node sv = (Node) view;
			WebdslNavigatorGroup incominglinks = new WebdslNavigatorGroup(
					Messages.NavigatorGroupName_List_3005_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					WebdslVisualIDRegistry
							.getType(ListListElementsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					WebdslVisualIDRegistry.getType(Text2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					WebdslVisualIDRegistry
							.getType(ListListElementsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					WebdslVisualIDRegistry.getType(Image2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					WebdslVisualIDRegistry
							.getType(ListListElementsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					WebdslVisualIDRegistry.getType(List2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					WebdslVisualIDRegistry
							.getType(ListListElementsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					WebdslVisualIDRegistry.getType(Group2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					WebdslVisualIDRegistry
							.getType(ListListElementsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					WebdslVisualIDRegistry
							.getType(InternalLink2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					WebdslVisualIDRegistry
							.getType(ListListElementsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					WebdslVisualIDRegistry
							.getType(ExternalLink2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					WebdslVisualIDRegistry
							.getType(InternalLinkTargetEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case GroupEditPart.VISUAL_ID: {
			LinkedList<WebdslAbstractNavigatorItem> result = new LinkedList<WebdslAbstractNavigatorItem>();
			Node sv = (Node) view;
			WebdslNavigatorGroup incominglinks = new WebdslNavigatorGroup(
					Messages.NavigatorGroupName_Group_3006_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					WebdslVisualIDRegistry
							.getType(GroupGroupElementsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					WebdslVisualIDRegistry.getType(Text3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					WebdslVisualIDRegistry
							.getType(GroupGroupElementsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					WebdslVisualIDRegistry.getType(Image3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					WebdslVisualIDRegistry
							.getType(GroupGroupElementsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					WebdslVisualIDRegistry.getType(List3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					WebdslVisualIDRegistry
							.getType(GroupGroupElementsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					WebdslVisualIDRegistry.getType(Group3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					WebdslVisualIDRegistry
							.getType(GroupGroupElementsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					WebdslVisualIDRegistry
							.getType(InternalLink3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					WebdslVisualIDRegistry
							.getType(GroupGroupElementsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					WebdslVisualIDRegistry
							.getType(ExternalLink3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					WebdslVisualIDRegistry
							.getType(InternalLinkTargetEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case InternalLinkEditPart.VISUAL_ID: {
			LinkedList<WebdslAbstractNavigatorItem> result = new LinkedList<WebdslAbstractNavigatorItem>();
			Node sv = (Node) view;
			WebdslNavigatorGroup incominglinks = new WebdslNavigatorGroup(
					Messages.NavigatorGroupName_InternalLink_3007_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			WebdslNavigatorGroup outgoinglinks = new WebdslNavigatorGroup(
					Messages.NavigatorGroupName_InternalLink_3007_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					WebdslVisualIDRegistry
							.getType(InternalLinkInternalLinkActualParametersCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					WebdslVisualIDRegistry
							.getType(ActualParameterEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					WebdslVisualIDRegistry
							.getType(InternalLinkInternalLinkSourceCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					WebdslVisualIDRegistry.getType(Text4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					WebdslVisualIDRegistry
							.getType(InternalLinkInternalLinkSourceCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					WebdslVisualIDRegistry.getType(Image4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					WebdslVisualIDRegistry
							.getType(InternalLinkTargetEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					WebdslVisualIDRegistry
							.getType(InternalLinkTargetEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case ExternalLinkEditPart.VISUAL_ID: {
			LinkedList<WebdslAbstractNavigatorItem> result = new LinkedList<WebdslAbstractNavigatorItem>();
			Node sv = (Node) view;
			WebdslNavigatorGroup incominglinks = new WebdslNavigatorGroup(
					Messages.NavigatorGroupName_ExternalLink_3009_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					WebdslVisualIDRegistry
							.getType(ExternalLinkExternalLinkSourceCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					WebdslVisualIDRegistry.getType(Text4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					WebdslVisualIDRegistry
							.getType(ExternalLinkExternalLinkSourceCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					WebdslVisualIDRegistry.getType(Image4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					WebdslVisualIDRegistry
							.getType(InternalLinkTargetEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case Text2EditPart.VISUAL_ID: {
			LinkedList<WebdslAbstractNavigatorItem> result = new LinkedList<WebdslAbstractNavigatorItem>();
			Node sv = (Node) view;
			WebdslNavigatorGroup incominglinks = new WebdslNavigatorGroup(
					Messages.NavigatorGroupName_Text_3010_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					WebdslVisualIDRegistry
							.getType(InternalLinkTargetEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case Image2EditPart.VISUAL_ID: {
			LinkedList<WebdslAbstractNavigatorItem> result = new LinkedList<WebdslAbstractNavigatorItem>();
			Node sv = (Node) view;
			WebdslNavigatorGroup incominglinks = new WebdslNavigatorGroup(
					Messages.NavigatorGroupName_Image_3011_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					WebdslVisualIDRegistry
							.getType(InternalLinkTargetEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case List2EditPart.VISUAL_ID: {
			LinkedList<WebdslAbstractNavigatorItem> result = new LinkedList<WebdslAbstractNavigatorItem>();
			Node sv = (Node) view;
			WebdslNavigatorGroup incominglinks = new WebdslNavigatorGroup(
					Messages.NavigatorGroupName_List_3012_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					WebdslVisualIDRegistry
							.getType(ListListElementsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					WebdslVisualIDRegistry.getType(Text2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					WebdslVisualIDRegistry
							.getType(ListListElementsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					WebdslVisualIDRegistry.getType(Image2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					WebdslVisualIDRegistry
							.getType(ListListElementsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					WebdslVisualIDRegistry.getType(List2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					WebdslVisualIDRegistry
							.getType(ListListElementsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					WebdslVisualIDRegistry.getType(Group2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					WebdslVisualIDRegistry
							.getType(ListListElementsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					WebdslVisualIDRegistry
							.getType(InternalLink2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					WebdslVisualIDRegistry
							.getType(ListListElementsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					WebdslVisualIDRegistry
							.getType(ExternalLink2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					WebdslVisualIDRegistry
							.getType(InternalLinkTargetEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case Group2EditPart.VISUAL_ID: {
			LinkedList<WebdslAbstractNavigatorItem> result = new LinkedList<WebdslAbstractNavigatorItem>();
			Node sv = (Node) view;
			WebdslNavigatorGroup incominglinks = new WebdslNavigatorGroup(
					Messages.NavigatorGroupName_Group_3013_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					WebdslVisualIDRegistry
							.getType(GroupGroupElementsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					WebdslVisualIDRegistry.getType(Text3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					WebdslVisualIDRegistry
							.getType(GroupGroupElementsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					WebdslVisualIDRegistry.getType(Image3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					WebdslVisualIDRegistry
							.getType(GroupGroupElementsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					WebdslVisualIDRegistry.getType(List3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					WebdslVisualIDRegistry
							.getType(GroupGroupElementsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					WebdslVisualIDRegistry.getType(Group3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					WebdslVisualIDRegistry
							.getType(GroupGroupElementsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					WebdslVisualIDRegistry
							.getType(InternalLink3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					WebdslVisualIDRegistry
							.getType(GroupGroupElementsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					WebdslVisualIDRegistry
							.getType(ExternalLink3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					WebdslVisualIDRegistry
							.getType(InternalLinkTargetEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case InternalLink2EditPart.VISUAL_ID: {
			LinkedList<WebdslAbstractNavigatorItem> result = new LinkedList<WebdslAbstractNavigatorItem>();
			Node sv = (Node) view;
			WebdslNavigatorGroup incominglinks = new WebdslNavigatorGroup(
					Messages.NavigatorGroupName_InternalLink_3014_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			WebdslNavigatorGroup outgoinglinks = new WebdslNavigatorGroup(
					Messages.NavigatorGroupName_InternalLink_3014_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					WebdslVisualIDRegistry
							.getType(InternalLinkInternalLinkActualParametersCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					WebdslVisualIDRegistry
							.getType(ActualParameterEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					WebdslVisualIDRegistry
							.getType(InternalLinkInternalLinkSourceCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					WebdslVisualIDRegistry.getType(Text4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					WebdslVisualIDRegistry
							.getType(InternalLinkInternalLinkSourceCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					WebdslVisualIDRegistry.getType(Image4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					WebdslVisualIDRegistry
							.getType(InternalLinkTargetEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					WebdslVisualIDRegistry
							.getType(InternalLinkTargetEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case ExternalLink2EditPart.VISUAL_ID: {
			LinkedList<WebdslAbstractNavigatorItem> result = new LinkedList<WebdslAbstractNavigatorItem>();
			Node sv = (Node) view;
			WebdslNavigatorGroup incominglinks = new WebdslNavigatorGroup(
					Messages.NavigatorGroupName_ExternalLink_3015_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					WebdslVisualIDRegistry
							.getType(ExternalLinkExternalLinkSourceCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					WebdslVisualIDRegistry.getType(Text4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					WebdslVisualIDRegistry
							.getType(ExternalLinkExternalLinkSourceCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					WebdslVisualIDRegistry.getType(Image4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					WebdslVisualIDRegistry
							.getType(InternalLinkTargetEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case Text3EditPart.VISUAL_ID: {
			LinkedList<WebdslAbstractNavigatorItem> result = new LinkedList<WebdslAbstractNavigatorItem>();
			Node sv = (Node) view;
			WebdslNavigatorGroup incominglinks = new WebdslNavigatorGroup(
					Messages.NavigatorGroupName_Text_3016_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					WebdslVisualIDRegistry
							.getType(InternalLinkTargetEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case Image3EditPart.VISUAL_ID: {
			LinkedList<WebdslAbstractNavigatorItem> result = new LinkedList<WebdslAbstractNavigatorItem>();
			Node sv = (Node) view;
			WebdslNavigatorGroup incominglinks = new WebdslNavigatorGroup(
					Messages.NavigatorGroupName_Image_3017_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					WebdslVisualIDRegistry
							.getType(InternalLinkTargetEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case List3EditPart.VISUAL_ID: {
			LinkedList<WebdslAbstractNavigatorItem> result = new LinkedList<WebdslAbstractNavigatorItem>();
			Node sv = (Node) view;
			WebdslNavigatorGroup incominglinks = new WebdslNavigatorGroup(
					Messages.NavigatorGroupName_List_3018_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					WebdslVisualIDRegistry
							.getType(ListListElementsCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					WebdslVisualIDRegistry.getType(Text2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					WebdslVisualIDRegistry
							.getType(ListListElementsCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					WebdslVisualIDRegistry.getType(Image2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					WebdslVisualIDRegistry
							.getType(ListListElementsCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					WebdslVisualIDRegistry.getType(List2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					WebdslVisualIDRegistry
							.getType(ListListElementsCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					WebdslVisualIDRegistry.getType(Group2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					WebdslVisualIDRegistry
							.getType(ListListElementsCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					WebdslVisualIDRegistry
							.getType(InternalLink2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					WebdslVisualIDRegistry
							.getType(ListListElementsCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					WebdslVisualIDRegistry
							.getType(ExternalLink2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					WebdslVisualIDRegistry
							.getType(InternalLinkTargetEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case Group3EditPart.VISUAL_ID: {
			LinkedList<WebdslAbstractNavigatorItem> result = new LinkedList<WebdslAbstractNavigatorItem>();
			Node sv = (Node) view;
			WebdslNavigatorGroup incominglinks = new WebdslNavigatorGroup(
					Messages.NavigatorGroupName_Group_3019_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					WebdslVisualIDRegistry
							.getType(GroupGroupElementsCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					WebdslVisualIDRegistry.getType(Text3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					WebdslVisualIDRegistry
							.getType(GroupGroupElementsCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					WebdslVisualIDRegistry.getType(Image3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					WebdslVisualIDRegistry
							.getType(GroupGroupElementsCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					WebdslVisualIDRegistry.getType(List3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					WebdslVisualIDRegistry
							.getType(GroupGroupElementsCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					WebdslVisualIDRegistry.getType(Group3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					WebdslVisualIDRegistry
							.getType(GroupGroupElementsCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					WebdslVisualIDRegistry
							.getType(InternalLink3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					WebdslVisualIDRegistry
							.getType(GroupGroupElementsCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					WebdslVisualIDRegistry
							.getType(ExternalLink3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					WebdslVisualIDRegistry
							.getType(InternalLinkTargetEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case InternalLink3EditPart.VISUAL_ID: {
			LinkedList<WebdslAbstractNavigatorItem> result = new LinkedList<WebdslAbstractNavigatorItem>();
			Node sv = (Node) view;
			WebdslNavigatorGroup incominglinks = new WebdslNavigatorGroup(
					Messages.NavigatorGroupName_InternalLink_3020_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			WebdslNavigatorGroup outgoinglinks = new WebdslNavigatorGroup(
					Messages.NavigatorGroupName_InternalLink_3020_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					WebdslVisualIDRegistry
							.getType(InternalLinkInternalLinkActualParametersCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					WebdslVisualIDRegistry
							.getType(ActualParameterEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					WebdslVisualIDRegistry
							.getType(InternalLinkInternalLinkSourceCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					WebdslVisualIDRegistry.getType(Text4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					WebdslVisualIDRegistry
							.getType(InternalLinkInternalLinkSourceCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					WebdslVisualIDRegistry.getType(Image4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					WebdslVisualIDRegistry
							.getType(InternalLinkTargetEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					WebdslVisualIDRegistry
							.getType(InternalLinkTargetEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case ExternalLink3EditPart.VISUAL_ID: {
			LinkedList<WebdslAbstractNavigatorItem> result = new LinkedList<WebdslAbstractNavigatorItem>();
			Node sv = (Node) view;
			WebdslNavigatorGroup incominglinks = new WebdslNavigatorGroup(
					Messages.NavigatorGroupName_ExternalLink_3021_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					WebdslVisualIDRegistry
							.getType(ExternalLinkExternalLinkSourceCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					WebdslVisualIDRegistry.getType(Text4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					WebdslVisualIDRegistry
							.getType(ExternalLinkExternalLinkSourceCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					WebdslVisualIDRegistry.getType(Image4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					WebdslVisualIDRegistry
							.getType(InternalLinkTargetEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case Text4EditPart.VISUAL_ID: {
			LinkedList<WebdslAbstractNavigatorItem> result = new LinkedList<WebdslAbstractNavigatorItem>();
			Node sv = (Node) view;
			WebdslNavigatorGroup incominglinks = new WebdslNavigatorGroup(
					Messages.NavigatorGroupName_Text_3022_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					WebdslVisualIDRegistry
							.getType(InternalLinkTargetEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case Image4EditPart.VISUAL_ID: {
			LinkedList<WebdslAbstractNavigatorItem> result = new LinkedList<WebdslAbstractNavigatorItem>();
			Node sv = (Node) view;
			WebdslNavigatorGroup incominglinks = new WebdslNavigatorGroup(
					Messages.NavigatorGroupName_Image_3023_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					WebdslVisualIDRegistry
							.getType(InternalLinkTargetEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case InternalLinkTargetEditPart.VISUAL_ID: {
			LinkedList<WebdslAbstractNavigatorItem> result = new LinkedList<WebdslAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			WebdslNavigatorGroup target = new WebdslNavigatorGroup(
					Messages.NavigatorGroupName_InternalLinkTarget_4004_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			WebdslNavigatorGroup source = new WebdslNavigatorGroup(
					Messages.NavigatorGroupName_InternalLinkTarget_4004_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					WebdslVisualIDRegistry.getType(TextEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					WebdslVisualIDRegistry.getType(ImageEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					WebdslVisualIDRegistry.getType(ListEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					WebdslVisualIDRegistry.getType(Text2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					WebdslVisualIDRegistry.getType(Image2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					WebdslVisualIDRegistry.getType(List2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					WebdslVisualIDRegistry.getType(Group2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					WebdslVisualIDRegistry.getType(Text3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					WebdslVisualIDRegistry.getType(Image3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					WebdslVisualIDRegistry.getType(List3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					WebdslVisualIDRegistry
							.getType(InternalLink2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					WebdslVisualIDRegistry.getType(Text4EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					WebdslVisualIDRegistry.getType(Image4EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					WebdslVisualIDRegistry
							.getType(ExternalLink2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					WebdslVisualIDRegistry.getType(Group3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					WebdslVisualIDRegistry
							.getType(InternalLink3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					WebdslVisualIDRegistry
							.getType(ExternalLink3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					WebdslVisualIDRegistry.getType(GroupEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					WebdslVisualIDRegistry
							.getType(InternalLinkEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					WebdslVisualIDRegistry
							.getType(ExternalLinkEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					WebdslVisualIDRegistry
							.getType(InternalLink2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					WebdslVisualIDRegistry
							.getType(InternalLink3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					WebdslVisualIDRegistry
							.getType(InternalLinkEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}
		}
		return EMPTY_ARRAY;
	}

	/**
	 * @generated
	 */
	private Collection<View> getLinksSourceByType(Collection<Edge> edges,
			String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (Edge nextEdge : edges) {
			View nextEdgeSource = nextEdge.getSource();
			if (type.equals(nextEdgeSource.getType())
					&& isOwnView(nextEdgeSource)) {
				result.add(nextEdgeSource);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getLinksTargetByType(Collection<Edge> edges,
			String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (Edge nextEdge : edges) {
			View nextEdgeTarget = nextEdge.getTarget();
			if (type.equals(nextEdgeTarget.getType())
					&& isOwnView(nextEdgeTarget)) {
				result.add(nextEdgeTarget);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getOutgoingLinksByType(
			Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getSourceEdges(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getIncomingLinksByType(
			Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getTargetEdges(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getChildrenByType(
			Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getChildren(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getDiagramLinksByType(
			Collection<Diagram> diagrams, String type) {
		ArrayList<View> result = new ArrayList<View>();
		for (Diagram nextDiagram : diagrams) {
			result.addAll(selectViewsByType(nextDiagram.getEdges(), type));
		}
		return result;
	}

	// TODO refactor as static method
	/**
	 * @generated
	 */
	private Collection<View> selectViewsByType(Collection<View> views,
			String type) {
		ArrayList<View> result = new ArrayList<View>();
		for (View nextView : views) {
			if (type.equals(nextView.getType()) && isOwnView(nextView)) {
				result.add(nextView);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isOwnView(View view) {
		return WebsiteEditPart.MODEL_ID.equals(WebdslVisualIDRegistry
				.getModelID(view));
	}

	/**
	 * @generated
	 */
	private Collection<WebdslNavigatorItem> createNavigatorItems(
			Collection<View> views, Object parent, boolean isLeafs) {
		ArrayList<WebdslNavigatorItem> result = new ArrayList<WebdslNavigatorItem>(
				views.size());
		for (View nextView : views) {
			result.add(new WebdslNavigatorItem(nextView, parent, isLeafs));
		}
		return result;
	}

	/**
	 * @generated
	 */
	public Object getParent(Object element) {
		if (element instanceof WebdslAbstractNavigatorItem) {
			WebdslAbstractNavigatorItem abstractNavigatorItem = (WebdslAbstractNavigatorItem) element;
			return abstractNavigatorItem.getParent();
		}
		return null;
	}

	/**
	 * @generated
	 */
	public boolean hasChildren(Object element) {
		return element instanceof IFile || getChildren(element).length > 0;
	}

}
