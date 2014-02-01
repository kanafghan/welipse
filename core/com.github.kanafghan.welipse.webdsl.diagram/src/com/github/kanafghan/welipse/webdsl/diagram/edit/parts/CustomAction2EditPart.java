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

import com.github.kanafghan.welipse.webdsl.diagram.edit.policies.CustomAction2ItemSemanticEditPolicy;
import com.github.kanafghan.welipse.webdsl.diagram.part.WebdslVisualIDRegistry;
import com.github.kanafghan.welipse.webdsl.diagram.providers.WebdslElementTypes;

/**
 * @generated
 */
public class CustomAction2EditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 3033;

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
	public CustomAction2EditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new CustomAction2ItemSemanticEditPolicy());
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
		return primaryShape = new CustomActionFigure();
	}

	/**
	 * @generated
	 */
	public CustomActionFigure getPrimaryShape() {
		return (CustomActionFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof CustomActionValue2EditPart) {
			((CustomActionValue2EditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureCustomActionValueFigure());
			return true;
		}
		if (childEditPart instanceof CustomActionPerformerExpression2EditPart) {
			((CustomActionPerformerExpression2EditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureCustomActionPerformerExpression());
			return true;
		}
		if (childEditPart instanceof CustomActionValidatorExpression2EditPart) {
			((CustomActionValidatorExpression2EditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureCustomActionValidatorExpression());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof CustomActionValue2EditPart) {
			return true;
		}
		if (childEditPart instanceof CustomActionPerformerExpression2EditPart) {
			return true;
		}
		if (childEditPart instanceof CustomActionValidatorExpression2EditPart) {
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
		return getContentPane();
	}

	/**
	 * @generated
	 */
	protected NodeFigure createNodePlate() {
		DefaultSizeNodeFigure result = new DefaultSizeNodeFigure(200, 52);
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
				.getType(CustomActionValue2EditPart.VISUAL_ID));
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
	public class CustomActionFigure extends RectangleFigure {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureCustomActionValueFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureCustomActionValidatorExpression;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureCustomActionPerformerExpression;

		/**
		 * @generated
		 */
		public CustomActionFigure() {

			BorderLayout layoutThis = new BorderLayout();
			this.setLayoutManager(layoutThis);

			this.setPreferredSize(new Dimension(getMapMode().DPtoLP(200),
					getMapMode().DPtoLP(52)));

			this.setBorder(new MarginBorder(getMapMode().DPtoLP(3),
					getMapMode().DPtoLP(3), getMapMode().DPtoLP(3),
					getMapMode().DPtoLP(3)));
			this.setBorder(new LineBorder(THIS_BORDER, getMapMode().DPtoLP(1)));
			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureCustomActionValueFigure = new WrappingLabel();

			fFigureCustomActionValueFigure.setText("<...>");

			this.add(fFigureCustomActionValueFigure, BorderLayout.TOP);

			fFigureCustomActionPerformerExpression = new WrappingLabel();

			fFigureCustomActionPerformerExpression.setText("<performer>");
			fFigureCustomActionPerformerExpression.setBorder(new LineBorder(
					FFIGURECUSTOMACTIONPERFORMEREXPRESSION_BORDER, getMapMode()
							.DPtoLP(1)));

			this.add(fFigureCustomActionPerformerExpression,
					BorderLayout.CENTER);

			fFigureCustomActionValidatorExpression = new WrappingLabel();

			fFigureCustomActionValidatorExpression.setText("<validator>");
			fFigureCustomActionValidatorExpression.setBorder(new LineBorder(
					FFIGURECUSTOMACTIONVALIDATOREXPRESSION_BORDER, getMapMode()
							.DPtoLP(1)));

			this.add(fFigureCustomActionValidatorExpression,
					BorderLayout.BOTTOM);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureCustomActionValueFigure() {
			return fFigureCustomActionValueFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureCustomActionValidatorExpression() {
			return fFigureCustomActionValidatorExpression;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureCustomActionPerformerExpression() {
			return fFigureCustomActionPerformerExpression;
		}

	}

	/**
	 * @generated
	 */
	static final Color THIS_BORDER = new Color(null, 0, 0, 0);

	/**
	 * @generated
	 */
	static final Color FFIGURECUSTOMACTIONPERFORMEREXPRESSION_BORDER = new Color(
			null, 0, 0, 0);

	/**
	 * @generated
	 */
	static final Color FFIGURECUSTOMACTIONVALIDATOREXPRESSION_BORDER = new Color(
			null, 0, 0, 0);

}
