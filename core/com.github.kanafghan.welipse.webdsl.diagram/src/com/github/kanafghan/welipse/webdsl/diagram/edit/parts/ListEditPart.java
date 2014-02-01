package com.github.kanafghan.welipse.webdsl.diagram.edit.parts;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.draw2d.BorderLayout;
import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.GridData;
import org.eclipse.draw2d.GridLayout;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.LineBorder;
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
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.widgets.Display;

import com.github.kanafghan.welipse.webdsl.diagram.edit.policies.ListItemSemanticEditPolicy;
import com.github.kanafghan.welipse.webdsl.diagram.part.WebdslVisualIDRegistry;
import com.github.kanafghan.welipse.webdsl.diagram.providers.WebdslElementTypes;

/**
 * @generated
 */
public class ListEditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 3005;

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
	public ListEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new ListItemSemanticEditPolicy());
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
		return primaryShape = new ListFigure();
	}

	/**
	 * @generated
	 */
	public ListFigure getPrimaryShape() {
		return (ListFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof ListExpressionEditPart) {
			((ListExpressionEditPart) childEditPart).setLabel(getPrimaryShape()
					.getFigureListVariableFigure());
			return true;
		}
		if (childEditPart instanceof ListExpression2EditPart) {
			((ListExpression2EditPart) childEditPart)
					.setLabel(getPrimaryShape().getFigureListExpressionFigure());
			return true;
		}
		if (childEditPart instanceof ListListElementsCompartmentEditPart) {
			IFigure pane = getPrimaryShape()
					.getFigureListElementsCompartmentFigure();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.add(((ListListElementsCompartmentEditPart) childEditPart)
					.getFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof ListExpressionEditPart) {
			return true;
		}
		if (childEditPart instanceof ListExpression2EditPart) {
			return true;
		}
		if (childEditPart instanceof ListListElementsCompartmentEditPart) {
			IFigure pane = getPrimaryShape()
					.getFigureListElementsCompartmentFigure();
			pane.remove(((ListListElementsCompartmentEditPart) childEditPart)
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
		if (editPart instanceof ListListElementsCompartmentEditPart) {
			return getPrimaryShape().getFigureListElementsCompartmentFigure();
		}
		return getContentPane();
	}

	/**
	 * @generated
	 */
	protected NodeFigure createNodePlate() {
		DefaultSizeNodeFigure result = new DefaultSizeNodeFigure(200, 150);
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
				.getType(ListExpressionEditPart.VISUAL_ID));
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
	public class ListFigure extends RectangleFigure {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureListExpressionFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureListVariableFigure;
		/**
		 * @generated
		 */
		private RectangleFigure fFigureListElementsCompartmentFigure;

		/**
		 * @generated
		 */
		public ListFigure() {

			BorderLayout layoutThis = new BorderLayout();
			this.setLayoutManager(layoutThis);

			this.setPreferredSize(new Dimension(getMapMode().DPtoLP(200),
					getMapMode().DPtoLP(150)));
			this.setBorder(new LineBorder(THIS_BORDER, getMapMode().DPtoLP(1)));
			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			RectangleFigure listHeaderContainerFigure0 = new RectangleFigure();

			listHeaderContainerFigure0.setOutline(false);
			listHeaderContainerFigure0.setFill(false);
			listHeaderContainerFigure0.setOpaque(false);

			this.add(listHeaderContainerFigure0, BorderLayout.TOP);

			GridLayout layoutListHeaderContainerFigure0 = new GridLayout();
			layoutListHeaderContainerFigure0.numColumns = 3;
			layoutListHeaderContainerFigure0.makeColumnsEqualWidth = false;
			listHeaderContainerFigure0
					.setLayoutManager(layoutListHeaderContainerFigure0);

			fFigureListVariableFigure = new WrappingLabel();

			fFigureListVariableFigure.setText("<variable>");

			GridData constraintFFigureListVariableFigure = new GridData();
			constraintFFigureListVariableFigure.verticalAlignment = GridData.CENTER;
			constraintFFigureListVariableFigure.horizontalAlignment = GridData.CENTER;
			constraintFFigureListVariableFigure.horizontalIndent = 1;
			constraintFFigureListVariableFigure.horizontalSpan = 1;
			constraintFFigureListVariableFigure.verticalSpan = 0;
			constraintFFigureListVariableFigure.grabExcessHorizontalSpace = false;
			constraintFFigureListVariableFigure.grabExcessVerticalSpace = false;
			listHeaderContainerFigure0.add(fFigureListVariableFigure,
					constraintFFigureListVariableFigure);

			WrappingLabel listInFigure1 = new WrappingLabel();

			listInFigure1.setText("in");
			listInFigure1.setForegroundColor(ColorConstants.black);

			listInFigure1.setFont(LISTINFIGURE1_FONT);

			GridData constraintListInFigure1 = new GridData();
			constraintListInFigure1.verticalAlignment = GridData.CENTER;
			constraintListInFigure1.horizontalAlignment = GridData.CENTER;
			constraintListInFigure1.horizontalIndent = 1;
			constraintListInFigure1.horizontalSpan = 1;
			constraintListInFigure1.verticalSpan = 0;
			constraintListInFigure1.grabExcessHorizontalSpace = false;
			constraintListInFigure1.grabExcessVerticalSpace = false;
			listHeaderContainerFigure0.add(listInFigure1,
					constraintListInFigure1);

			fFigureListExpressionFigure = new WrappingLabel();

			fFigureListExpressionFigure.setText("<expression>");

			GridData constraintFFigureListExpressionFigure = new GridData();
			constraintFFigureListExpressionFigure.verticalAlignment = GridData.CENTER;
			constraintFFigureListExpressionFigure.horizontalAlignment = GridData.CENTER;
			constraintFFigureListExpressionFigure.horizontalIndent = 1;
			constraintFFigureListExpressionFigure.horizontalSpan = 1;
			constraintFFigureListExpressionFigure.verticalSpan = 0;
			constraintFFigureListExpressionFigure.grabExcessHorizontalSpace = false;
			constraintFFigureListExpressionFigure.grabExcessVerticalSpace = false;
			listHeaderContainerFigure0.add(fFigureListExpressionFigure,
					constraintFFigureListExpressionFigure);

			fFigureListElementsCompartmentFigure = new RectangleFigure();

			fFigureListElementsCompartmentFigure
					.setBackgroundColor(FFIGURELISTELEMENTSCOMPARTMENTFIGURE_BACK);
			fFigureListElementsCompartmentFigure.setBorder(new LineBorder(
					FFIGURELISTELEMENTSCOMPARTMENTFIGURE_BORDER, getMapMode()
							.DPtoLP(1)));

			this.add(fFigureListElementsCompartmentFigure, BorderLayout.CENTER);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureListExpressionFigure() {
			return fFigureListExpressionFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureListVariableFigure() {
			return fFigureListVariableFigure;
		}

		/**
		 * @generated
		 */
		public RectangleFigure getFigureListElementsCompartmentFigure() {
			return fFigureListElementsCompartmentFigure;
		}

	}

	/**
	 * @generated
	 */
	static final Color THIS_BORDER = new Color(null, 0, 0, 0);

	/**
	 * @generated
	 */
	static final Font LISTINFIGURE1_FONT = new Font(Display.getCurrent(),
			"Arial", 9, SWT.BOLD);

	/**
	 * @generated
	 */
	static final Color FFIGURELISTELEMENTSCOMPARTMENTFIGURE_BACK = new Color(
			null, 213, 216, 242);

	/**
	 * @generated
	 */
	static final Color FFIGURELISTELEMENTSCOMPARTMENTFIGURE_BORDER = new Color(
			null, 0, 0, 0);

}
