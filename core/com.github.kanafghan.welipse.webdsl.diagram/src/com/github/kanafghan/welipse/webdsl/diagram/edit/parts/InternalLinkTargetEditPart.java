package com.github.kanafghan.welipse.webdsl.diagram.edit.parts;

import org.eclipse.draw2d.Connection;
import org.eclipse.draw2d.LineBorder;
import org.eclipse.draw2d.PolylineDecoration;
import org.eclipse.draw2d.RotatableDecoration;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITreeBranchEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.graphics.Color;

import com.github.kanafghan.welipse.webdsl.diagram.edit.policies.InternalLinkTargetItemSemanticEditPolicy;

/**
 * @generated
 */
public class InternalLinkTargetEditPart extends ConnectionNodeEditPart
		implements ITreeBranchEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 4004;

	/**
	 * @generated
	 */
	public InternalLinkTargetEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new InternalLinkTargetItemSemanticEditPolicy());
	}

	/**
	 * Creates figure for this edit part.
	 * 
	 * Body of this method does not depend on settings in generation model
	 * so you may safely remove <i>generated</i> tag and modify it.
	 * 
	 * @generated
	 */

	protected Connection createConnectionFigure() {
		return new InternalLinkTargetFigure();
	}

	/**
	 * @generated
	 */
	public InternalLinkTargetFigure getPrimaryShape() {
		return (InternalLinkTargetFigure) getFigure();
	}

	/**
	 * @generated
	 */
	public class InternalLinkTargetFigure extends PolylineConnectionEx {

		/**
		 * @generated
		 */
		public InternalLinkTargetFigure() {
			this.setForegroundColor(THIS_FORE);

			setTargetDecoration(createTargetDecoration());
		}

		/**
		 * @generated
		 */
		private RotatableDecoration createTargetDecoration() {
			PolylineDecoration df = new PolylineDecoration();
			df.setForegroundColor(DF_FORE);
			return df;
		}

	}

	/**
	 * @generated
	 */
	static final Color THIS_FORE = new Color(null, 0, 0, 255);
	/**
	 * @generated
	 */
	static final Color DF_FORE = new Color(null, 0, 0, 0);

}
