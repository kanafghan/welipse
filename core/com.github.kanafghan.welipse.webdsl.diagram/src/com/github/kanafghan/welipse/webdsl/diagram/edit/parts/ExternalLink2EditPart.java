package com.github.kanafghan.welipse.webdsl.diagram.edit.parts;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.draw2d.BorderLayout;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.LineBorder;
import org.eclipse.draw2d.MarginBorder;
import org.eclipse.draw2d.PositionConstants;
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
import org.eclipse.gef.editpolicies.ResizableEditPolicy;
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

import com.github.kanafghan.welipse.webdsl.diagram.edit.policies.ExternalLink2ItemSemanticEditPolicy;
import com.github.kanafghan.welipse.webdsl.diagram.part.WebdslVisualIDRegistry;
import com.github.kanafghan.welipse.webdsl.diagram.providers.WebdslElementTypes;

/**
 * @generated
 */
public class ExternalLink2EditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 3015;

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
	public ExternalLink2EditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new ExternalLink2ItemSemanticEditPolicy());
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
		return primaryShape = new ExternalLinkFigure();
	}

	/**
	 * @generated
	 */
	public ExternalLinkFigure getPrimaryShape() {
		return (ExternalLinkFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof ExternalLinkName2EditPart) {
			((ExternalLinkName2EditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureExternalLinkNameFigure());
			return true;
		}
		if (childEditPart instanceof ExternalLinkTargetExpressionEditPart) {
			((ExternalLinkTargetExpressionEditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureExternalLinkTargetExpressionFigure());
			return true;
		}
		if (childEditPart instanceof ExternalLinkExternalLinkSourceCompartmentEditPart) {
			IFigure pane = getPrimaryShape()
					.getFigureExternalLinkSourceCompartmentFigure();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.add(((ExternalLinkExternalLinkSourceCompartmentEditPart) childEditPart)
					.getFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof ExternalLinkName2EditPart) {
			return true;
		}
		if (childEditPart instanceof ExternalLinkTargetExpressionEditPart) {
			return true;
		}
		if (childEditPart instanceof ExternalLinkExternalLinkSourceCompartmentEditPart) {
			IFigure pane = getPrimaryShape()
					.getFigureExternalLinkSourceCompartmentFigure();
			pane.remove(((ExternalLinkExternalLinkSourceCompartmentEditPart) childEditPart)
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
		if (editPart instanceof ExternalLinkExternalLinkSourceCompartmentEditPart) {
			return getPrimaryShape()
					.getFigureExternalLinkSourceCompartmentFigure();
		}
		return getContentPane();
	}

	/**
	 * @generated
	 */
	protected NodeFigure createNodePlate() {
		DefaultSizeNodeFigure result = new DefaultSizeNodeFigure(130, 75);
		return result;
	}

	/**
	 * @generated
	 */
	public EditPolicy getPrimaryDragEditPolicy() {
		EditPolicy result = super.getPrimaryDragEditPolicy();
		if (result instanceof ResizableEditPolicy) {
			ResizableEditPolicy ep = (ResizableEditPolicy) result;
			ep.setResizeDirections(PositionConstants.WEST
					| PositionConstants.EAST);
		}
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
				.getType(ExternalLinkName2EditPart.VISUAL_ID));
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
	public class ExternalLinkFigure extends RectangleFigure {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureExternalLinkNameFigure;
		/**
		 * @generated
		 */
		private RectangleFigure fFigureExternalLinkSourceCompartmentFigure;

		/**
		 * @generated
		 */
		private WrappingLabel fFigureExternalLinkTargetExpressionFigure;

		/**
		 * @generated
		 */
		public ExternalLinkFigure() {

			BorderLayout layoutThis = new BorderLayout();
			this.setLayoutManager(layoutThis);

			this.setPreferredSize(new Dimension(getMapMode().DPtoLP(130),
					getMapMode().DPtoLP(75)));
			this.setBorder(new LineBorder(THIS_BORDER, getMapMode().DPtoLP(1)));
			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureExternalLinkNameFigure = new WrappingLabel();

			fFigureExternalLinkNameFigure.setText("<...>");

			fFigureExternalLinkNameFigure.setBorder(new MarginBorder(
					getMapMode().DPtoLP(2), getMapMode().DPtoLP(3),
					getMapMode().DPtoLP(2), getMapMode().DPtoLP(3)));

			this.add(fFigureExternalLinkNameFigure, BorderLayout.TOP);

			fFigureExternalLinkSourceCompartmentFigure = new RectangleFigure();

			fFigureExternalLinkSourceCompartmentFigure
					.setBorder(new LineBorder(
							FFIGUREEXTERNALLINKSOURCECOMPARTMENTFIGURE_BORDER,
							getMapMode().DPtoLP(1)));

			this.add(fFigureExternalLinkSourceCompartmentFigure,
					BorderLayout.CENTER);

			fFigureExternalLinkTargetExpressionFigure = new WrappingLabel();

			fFigureExternalLinkTargetExpressionFigure.setText("");
			fFigureExternalLinkTargetExpressionFigure.setBorder(new LineBorder(
					FFIGUREEXTERNALLINKTARGETEXPRESSIONFIGURE_BORDER,
					getMapMode().DPtoLP(1)));

			this.add(fFigureExternalLinkTargetExpressionFigure,
					BorderLayout.BOTTOM);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureExternalLinkNameFigure() {
			return fFigureExternalLinkNameFigure;
		}

		/**
		 * @generated
		 */
		public RectangleFigure getFigureExternalLinkSourceCompartmentFigure() {
			return fFigureExternalLinkSourceCompartmentFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureExternalLinkTargetExpressionFigure() {
			return fFigureExternalLinkTargetExpressionFigure;
		}

	}

	/**
	 * @generated
	 */
	static final Color THIS_BORDER = new Color(null, 0, 0, 0);

	/**
	 * @generated
	 */
	static final Color FFIGUREEXTERNALLINKSOURCECOMPARTMENTFIGURE_BORDER = new Color(
			null, 0, 0, 0);

	/**
	 * @generated
	 */
	static final Color FFIGUREEXTERNALLINKTARGETEXPRESSIONFIGURE_BORDER = new Color(
			null, 0, 0, 0);

}
