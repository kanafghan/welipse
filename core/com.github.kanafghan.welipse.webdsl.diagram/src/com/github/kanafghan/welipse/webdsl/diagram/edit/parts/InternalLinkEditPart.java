package com.github.kanafghan.welipse.webdsl.diagram.edit.parts;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.draw2d.BorderLayout;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.LineBorder;
import org.eclipse.draw2d.MarginBorder;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gef.editpolicies.NonResizableEditPolicy;
import org.eclipse.gef.requests.CreateRequest;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.graphics.Color;

import com.github.kanafghan.welipse.webdsl.diagram.edit.policies.InternalLinkItemSemanticEditPolicy;
import com.github.kanafghan.welipse.webdsl.diagram.part.WebdslVisualIDRegistry;
import com.github.kanafghan.welipse.webdsl.diagram.providers.WebdslElementTypes;

/**
 * @generated
 */
public class InternalLinkEditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 3007;

	/**
	 * @generated
	 */
	protected IFigure contentPane;

	/**
	 * @generated
	 */
	protected IFigure primaryShape;

	/**
	 * @generated
	 */
	public InternalLinkEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new InternalLinkItemSemanticEditPolicy());
		installEditPolicy(EditPolicy.LAYOUT_ROLE, createLayoutEditPolicy());
		// XXX need an SCR to runtime to have another abstract superclass that would let children add reasonable editpolicies
		// removeEditPolicy(org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles.CONNECTION_HANDLES_ROLE);
	}

	/**
	 * @generated
	 */
	protected LayoutEditPolicy createLayoutEditPolicy() {
		org.eclipse.gmf.runtime.diagram.ui.editpolicies.LayoutEditPolicy lep = new org.eclipse.gmf.runtime.diagram.ui.editpolicies.LayoutEditPolicy() {

			protected EditPolicy createChildEditPolicy(EditPart child) {
				EditPolicy result = child
						.getEditPolicy(EditPolicy.PRIMARY_DRAG_ROLE);
				if (result == null) {
					result = new NonResizableEditPolicy();
				}
				return result;
			}

			protected Command getMoveChildrenCommand(Request request) {
				return null;
			}

			protected Command getCreateCommand(CreateRequest request) {
				return null;
			}
		};
		return lep;
	}

	/**
	 * @generated
	 */
	protected IFigure createNodeShape() {
		return primaryShape = new InternalLinkFigure();
	}

	/**
	 * @generated
	 */
	public InternalLinkFigure getPrimaryShape() {
		return (InternalLinkFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof InternalLinkNameEditPart) {
			((InternalLinkNameEditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureInternalLinkNameFigure());
			return true;
		}
		if (childEditPart instanceof InternalLinkInternalLinkSourceCompartment3EditPart) {
			IFigure pane = getPrimaryShape()
					.getFigureInternalLinkSourceCompartmentFigure();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.add(((InternalLinkInternalLinkSourceCompartment3EditPart) childEditPart)
					.getFigure());
			return true;
		}
		if (childEditPart instanceof InternalLinkInternalLinkActualParametersCompartment3EditPart) {
			IFigure pane = getPrimaryShape()
					.getFigureInternalLinkActualParametersCompartmentFigure();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.add(((InternalLinkInternalLinkActualParametersCompartment3EditPart) childEditPart)
					.getFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof InternalLinkNameEditPart) {
			return true;
		}
		if (childEditPart instanceof InternalLinkInternalLinkSourceCompartment3EditPart) {
			IFigure pane = getPrimaryShape()
					.getFigureInternalLinkSourceCompartmentFigure();
			pane.remove(((InternalLinkInternalLinkSourceCompartment3EditPart) childEditPart)
					.getFigure());
			return true;
		}
		if (childEditPart instanceof InternalLinkInternalLinkActualParametersCompartment3EditPart) {
			IFigure pane = getPrimaryShape()
					.getFigureInternalLinkActualParametersCompartmentFigure();
			pane.remove(((InternalLinkInternalLinkActualParametersCompartment3EditPart) childEditPart)
					.getFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected void addChildVisual(EditPart childEditPart, int index) {
		if (addFixedChild(childEditPart)) {
			return;
		}
		super.addChildVisual(childEditPart, -1);
	}

	/**
	 * @generated
	 */
	protected void removeChildVisual(EditPart childEditPart) {
		if (removeFixedChild(childEditPart)) {
			return;
		}
		super.removeChildVisual(childEditPart);
	}

	/**
	 * @generated
	 */
	protected IFigure getContentPaneFor(IGraphicalEditPart editPart) {
		if (editPart instanceof InternalLinkInternalLinkSourceCompartment3EditPart) {
			return getPrimaryShape()
					.getFigureInternalLinkSourceCompartmentFigure();
		}
		if (editPart instanceof InternalLinkInternalLinkActualParametersCompartment3EditPart) {
			return getPrimaryShape()
					.getFigureInternalLinkActualParametersCompartmentFigure();
		}
		return getContentPane();
	}

	/**
	 * @generated
	 */
	protected NodeFigure createNodePlate() {
		DefaultSizeNodeFigure result = new DefaultSizeNodeFigure(130, 100);
		return result;
	}

	/**
	 * Creates figure for this edit part.
	 * 
	 * Body of this method does not depend on settings in generation model
	 * so you may safely remove <i>generated</i> tag and modify it.
	 * 
	 * @generated
	 */
	protected NodeFigure createNodeFigure() {
		NodeFigure figure = createNodePlate();
		figure.setLayoutManager(new StackLayout());
		IFigure shape = createNodeShape();
		figure.add(shape);
		contentPane = setupContentPane(shape);
		return figure;
	}

	/**
	 * Default implementation treats passed figure as content pane.
	 * Respects layout one may have set for generated figure.
	 * @param nodeShape instance of generated figure class
	 * @generated
	 */
	protected IFigure setupContentPane(IFigure nodeShape) {
		if (nodeShape.getLayoutManager() == null) {
			ConstrainedToolbarLayout layout = new ConstrainedToolbarLayout();
			layout.setSpacing(5);
			nodeShape.setLayoutManager(layout);
		}
		return nodeShape; // use nodeShape itself as contentPane
	}

	/**
	 * @generated
	 */
	public IFigure getContentPane() {
		if (contentPane != null) {
			return contentPane;
		}
		return super.getContentPane();
	}

	/**
	 * @generated
	 */
	protected void setForegroundColor(Color color) {
		if (primaryShape != null) {
			primaryShape.setForegroundColor(color);
		}
	}

	/**
	 * @generated
	 */
	protected void setBackgroundColor(Color color) {
		if (primaryShape != null) {
			primaryShape.setBackgroundColor(color);
		}
	}

	/**
	 * @generated
	 */
	protected void setLineWidth(int width) {
		if (primaryShape instanceof Shape) {
			((Shape) primaryShape).setLineWidth(width);
		}
	}

	/**
	 * @generated
	 */
	protected void setLineType(int style) {
		if (primaryShape instanceof Shape) {
			((Shape) primaryShape).setLineStyle(style);
		}
	}

	/**
	 * @generated
	 */
	public EditPart getPrimaryChildEditPart() {
		return getChildBySemanticHint(WebdslVisualIDRegistry
				.getType(InternalLinkNameEditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnSource() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(1);
		types.add(WebdslElementTypes.InternalLinkTarget_4004);
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnSourceAndTarget(
			IGraphicalEditPart targetEditPart) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof TextEditPart) {
			types.add(WebdslElementTypes.InternalLinkTarget_4004);
		}
		if (targetEditPart instanceof ImageEditPart) {
			types.add(WebdslElementTypes.InternalLinkTarget_4004);
		}
		if (targetEditPart instanceof ListEditPart) {
			types.add(WebdslElementTypes.InternalLinkTarget_4004);
		}
		if (targetEditPart instanceof Text2EditPart) {
			types.add(WebdslElementTypes.InternalLinkTarget_4004);
		}
		if (targetEditPart instanceof Image2EditPart) {
			types.add(WebdslElementTypes.InternalLinkTarget_4004);
		}
		if (targetEditPart instanceof List2EditPart) {
			types.add(WebdslElementTypes.InternalLinkTarget_4004);
		}
		if (targetEditPart instanceof Group2EditPart) {
			types.add(WebdslElementTypes.InternalLinkTarget_4004);
		}
		if (targetEditPart instanceof Text3EditPart) {
			types.add(WebdslElementTypes.InternalLinkTarget_4004);
		}
		if (targetEditPart instanceof Image3EditPart) {
			types.add(WebdslElementTypes.InternalLinkTarget_4004);
		}
		if (targetEditPart instanceof List3EditPart) {
			types.add(WebdslElementTypes.InternalLinkTarget_4004);
		}
		if (targetEditPart instanceof InternalLink2EditPart) {
			types.add(WebdslElementTypes.InternalLinkTarget_4004);
		}
		if (targetEditPart instanceof Text4EditPart) {
			types.add(WebdslElementTypes.InternalLinkTarget_4004);
		}
		if (targetEditPart instanceof Image4EditPart) {
			types.add(WebdslElementTypes.InternalLinkTarget_4004);
		}
		if (targetEditPart instanceof ExternalLink2EditPart) {
			types.add(WebdslElementTypes.InternalLinkTarget_4004);
		}
		if (targetEditPart instanceof Group3EditPart) {
			types.add(WebdslElementTypes.InternalLinkTarget_4004);
		}
		if (targetEditPart instanceof FormEditPart) {
			types.add(WebdslElementTypes.InternalLinkTarget_4004);
		}
		if (targetEditPart instanceof InternalLink3EditPart) {
			types.add(WebdslElementTypes.InternalLinkTarget_4004);
		}
		if (targetEditPart instanceof ExternalLink3EditPart) {
			types.add(WebdslElementTypes.InternalLinkTarget_4004);
		}
		if (targetEditPart instanceof TextInputEditPart) {
			types.add(WebdslElementTypes.InternalLinkTarget_4004);
		}
		if (targetEditPart instanceof SelectionListEditPart) {
			types.add(WebdslElementTypes.InternalLinkTarget_4004);
		}
		if (targetEditPart instanceof ButtonEditPart) {
			types.add(WebdslElementTypes.InternalLinkTarget_4004);
		}
		if (targetEditPart instanceof CustomActionEditPart) {
			types.add(WebdslElementTypes.InternalLinkTarget_4004);
		}
		if (targetEditPart instanceof SaveEditPart) {
			types.add(WebdslElementTypes.InternalLinkTarget_4004);
		}
		if (targetEditPart instanceof ResetEditPart) {
			types.add(WebdslElementTypes.InternalLinkTarget_4004);
		}
		if (targetEditPart instanceof CancelEditPart) {
			types.add(WebdslElementTypes.InternalLinkTarget_4004);
		}
		if (targetEditPart instanceof GroupEditPart) {
			types.add(WebdslElementTypes.InternalLinkTarget_4004);
		}
		if (targetEditPart instanceof Form2EditPart) {
			types.add(WebdslElementTypes.InternalLinkTarget_4004);
		}
		if (targetEditPart instanceof com.github.kanafghan.welipse.webdsl.diagram.edit.parts.InternalLinkEditPart) {
			types.add(WebdslElementTypes.InternalLinkTarget_4004);
		}
		if (targetEditPart instanceof ExternalLinkEditPart) {
			types.add(WebdslElementTypes.InternalLinkTarget_4004);
		}
		if (targetEditPart instanceof TextInput2EditPart) {
			types.add(WebdslElementTypes.InternalLinkTarget_4004);
		}
		if (targetEditPart instanceof SelectionList2EditPart) {
			types.add(WebdslElementTypes.InternalLinkTarget_4004);
		}
		if (targetEditPart instanceof Button2EditPart) {
			types.add(WebdslElementTypes.InternalLinkTarget_4004);
		}
		if (targetEditPart instanceof CustomAction2EditPart) {
			types.add(WebdslElementTypes.InternalLinkTarget_4004);
		}
		if (targetEditPart instanceof Save2EditPart) {
			types.add(WebdslElementTypes.InternalLinkTarget_4004);
		}
		if (targetEditPart instanceof Reset2EditPart) {
			types.add(WebdslElementTypes.InternalLinkTarget_4004);
		}
		if (targetEditPart instanceof Cancel2EditPart) {
			types.add(WebdslElementTypes.InternalLinkTarget_4004);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMATypesForTarget(IElementType relationshipType) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (relationshipType == WebdslElementTypes.InternalLinkTarget_4004) {
			types.add(WebdslElementTypes.Text_3003);
			types.add(WebdslElementTypes.Image_3004);
			types.add(WebdslElementTypes.List_3005);
			types.add(WebdslElementTypes.Text_3010);
			types.add(WebdslElementTypes.Image_3011);
			types.add(WebdslElementTypes.List_3012);
			types.add(WebdslElementTypes.Group_3013);
			types.add(WebdslElementTypes.Text_3016);
			types.add(WebdslElementTypes.Image_3017);
			types.add(WebdslElementTypes.List_3018);
			types.add(WebdslElementTypes.InternalLink_3014);
			types.add(WebdslElementTypes.Text_3022);
			types.add(WebdslElementTypes.Image_3023);
			types.add(WebdslElementTypes.ExternalLink_3015);
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
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnTarget() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(1);
		types.add(WebdslElementTypes.InternalLinkTarget_4004);
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMATypesForSource(IElementType relationshipType) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (relationshipType == WebdslElementTypes.InternalLinkTarget_4004) {
			types.add(WebdslElementTypes.InternalLink_3014);
			types.add(WebdslElementTypes.InternalLink_3020);
			types.add(WebdslElementTypes.InternalLink_3007);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public class InternalLinkFigure extends RectangleFigure {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureInternalLinkNameFigure;
		/**
		 * @generated
		 */
		private RectangleFigure fFigureInternalLinkSourceCompartmentFigure;
		/**
		 * @generated
		 */
		private RectangleFigure fFigureInternalLinkActualParametersCompartmentFigure;

		/**
		 * @generated
		 */
		public InternalLinkFigure() {

			BorderLayout layoutThis = new BorderLayout();
			this.setLayoutManager(layoutThis);

			this.setPreferredSize(new Dimension(getMapMode().DPtoLP(130),
					getMapMode().DPtoLP(100)));
			this.setBorder(new LineBorder(THIS_BORDER, getMapMode().DPtoLP(1)));
			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureInternalLinkNameFigure = new WrappingLabel();

			fFigureInternalLinkNameFigure.setText("<name>");

			fFigureInternalLinkNameFigure.setBorder(new MarginBorder(
					getMapMode().DPtoLP(2), getMapMode().DPtoLP(3),
					getMapMode().DPtoLP(2), getMapMode().DPtoLP(3)));

			this.add(fFigureInternalLinkNameFigure, BorderLayout.TOP);

			fFigureInternalLinkSourceCompartmentFigure = new RectangleFigure();

			fFigureInternalLinkSourceCompartmentFigure
					.setBorder(new LineBorder(
							FFIGUREINTERNALLINKSOURCECOMPARTMENTFIGURE_BORDER,
							getMapMode().DPtoLP(1)));

			this.add(fFigureInternalLinkSourceCompartmentFigure,
					BorderLayout.CENTER);

			fFigureInternalLinkActualParametersCompartmentFigure = new RectangleFigure();

			fFigureInternalLinkActualParametersCompartmentFigure
					.setBorder(new LineBorder(
							FFIGUREINTERNALLINKACTUALPARAMETERSCOMPARTMENTFIGURE_BORDER,
							getMapMode().DPtoLP(1)));

			this.add(fFigureInternalLinkActualParametersCompartmentFigure,
					BorderLayout.BOTTOM);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureInternalLinkNameFigure() {
			return fFigureInternalLinkNameFigure;
		}

		/**
		 * @generated
		 */
		public RectangleFigure getFigureInternalLinkSourceCompartmentFigure() {
			return fFigureInternalLinkSourceCompartmentFigure;
		}

		/**
		 * @generated
		 */
		public RectangleFigure getFigureInternalLinkActualParametersCompartmentFigure() {
			return fFigureInternalLinkActualParametersCompartmentFigure;
		}

	}

	/**
	 * @generated
	 */
	static final Color THIS_BORDER = new Color(null, 0, 0, 0);

	/**
	 * @generated
	 */
	static final Color FFIGUREINTERNALLINKSOURCECOMPARTMENTFIGURE_BORDER = new Color(
			null, 0, 0, 0);

	/**
	 * @generated
	 */
	static final Color FFIGUREINTERNALLINKACTUALPARAMETERSCOMPARTMENTFIGURE_BORDER = new Color(
			null, 0, 0, 0);

}
