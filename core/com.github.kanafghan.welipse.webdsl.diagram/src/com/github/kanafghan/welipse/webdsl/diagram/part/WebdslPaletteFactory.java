package com.github.kanafghan.welipse.webdsl.diagram.part;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.eclipse.gef.Tool;
import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteGroup;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeConnectionTool;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeCreationTool;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import com.github.kanafghan.welipse.webdsl.diagram.providers.WebdslElementTypes;

/**
 * @generated
 */
public class WebdslPaletteFactory {

	/**
	 * @generated
	 */
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createWebModel1Group());
	}

	/**
	 * Creates "Web Model" palette tool group
	 * @generated
	 */
	private PaletteContainer createWebModel1Group() {
		PaletteGroup paletteContainer = new PaletteGroup(
				Messages.WebModel1Group_title);
		paletteContainer.setId("createWebModel1Group"); //$NON-NLS-1$
		paletteContainer.setDescription(Messages.WebModel1Group_desc);
		paletteContainer.add(createPage1CreationTool());
		paletteContainer.add(createParameter2CreationTool());
		paletteContainer.add(createVariable3CreationTool());
		paletteContainer.add(createText4CreationTool());
		paletteContainer.add(createImage5CreationTool());
		paletteContainer.add(createList6CreationTool());
		paletteContainer.add(createGroup7CreationTool());
		paletteContainer.add(createInternalLink8CreationTool());
		paletteContainer.add(createActualParameter9CreationTool());
		paletteContainer.add(createTarget10CreationTool());
		paletteContainer.add(createExternalLink11CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createPage1CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Page1CreationTool_title,
				Messages.Page1CreationTool_desc,
				Collections.singletonList(WebdslElementTypes.Page_2001));
		entry.setId("createPage1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(WebdslElementTypes
				.getImageDescriptor(WebdslElementTypes.Page_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createParameter2CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Parameter2CreationTool_title,
				Messages.Parameter2CreationTool_desc,
				Collections.singletonList(WebdslElementTypes.Parameter_3001));
		entry.setId("createParameter2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(WebdslElementTypes
				.getImageDescriptor(WebdslElementTypes.Parameter_3001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createVariable3CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Variable3CreationTool_title,
				Messages.Variable3CreationTool_desc,
				Collections
						.singletonList(WebdslElementTypes.VariableInitialization_3002));
		entry.setId("createVariable3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(WebdslElementTypes
				.getImageDescriptor(WebdslElementTypes.VariableInitialization_3002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createText4CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(4);
		types.add(WebdslElementTypes.Text_3003);
		types.add(WebdslElementTypes.Text_3010);
		types.add(WebdslElementTypes.Text_3016);
		types.add(WebdslElementTypes.Text_3022);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Text4CreationTool_title,
				Messages.Text4CreationTool_desc, types);
		entry.setId("createText4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(WebdslElementTypes
				.getImageDescriptor(WebdslElementTypes.Text_3003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createImage5CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(4);
		types.add(WebdslElementTypes.Image_3004);
		types.add(WebdslElementTypes.Image_3011);
		types.add(WebdslElementTypes.Image_3017);
		types.add(WebdslElementTypes.Image_3023);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Image5CreationTool_title,
				Messages.Image5CreationTool_desc, types);
		entry.setId("createImage5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(WebdslElementTypes
				.getImageDescriptor(WebdslElementTypes.Image_3004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createList6CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(3);
		types.add(WebdslElementTypes.List_3005);
		types.add(WebdslElementTypes.List_3012);
		types.add(WebdslElementTypes.List_3018);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.List6CreationTool_title,
				Messages.List6CreationTool_desc, types);
		entry.setId("createList6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(WebdslElementTypes
				.getImageDescriptor(WebdslElementTypes.List_3005));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createGroup7CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(3);
		types.add(WebdslElementTypes.Group_3013);
		types.add(WebdslElementTypes.Group_3019);
		types.add(WebdslElementTypes.Group_3006);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Group7CreationTool_title,
				Messages.Group7CreationTool_desc, types);
		entry.setId("createGroup7CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(WebdslElementTypes
				.getImageDescriptor(WebdslElementTypes.Group_3013));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createInternalLink8CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(3);
		types.add(WebdslElementTypes.InternalLink_3014);
		types.add(WebdslElementTypes.InternalLink_3020);
		types.add(WebdslElementTypes.InternalLink_3007);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.InternalLink8CreationTool_title,
				Messages.InternalLink8CreationTool_desc, types);
		entry.setId("createInternalLink8CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(WebdslElementTypes
				.getImageDescriptor(WebdslElementTypes.InternalLink_3014));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createActualParameter9CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.ActualParameter9CreationTool_title,
				Messages.ActualParameter9CreationTool_desc,
				Collections
						.singletonList(WebdslElementTypes.ActualParameter_3008));
		entry.setId("createActualParameter9CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(WebdslElementTypes
				.getImageDescriptor(WebdslElementTypes.ActualParameter_3008));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createTarget10CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.Target10CreationTool_title,
				Messages.Target10CreationTool_desc,
				Collections
						.singletonList(WebdslElementTypes.InternalLinkTarget_4004));
		entry.setId("createTarget10CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(WebdslElementTypes
				.getImageDescriptor(WebdslElementTypes.InternalLinkTarget_4004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createExternalLink11CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(3);
		types.add(WebdslElementTypes.ExternalLink_3015);
		types.add(WebdslElementTypes.ExternalLink_3021);
		types.add(WebdslElementTypes.ExternalLink_3009);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.ExternalLink11CreationTool_title,
				Messages.ExternalLink11CreationTool_desc, types);
		entry.setId("createExternalLink11CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(WebdslElementTypes
				.getImageDescriptor(WebdslElementTypes.ExternalLink_3015));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private static class NodeToolEntry extends ToolEntry {

		/**
		 * @generated
		 */
		private final List<IElementType> elementTypes;

		/**
		 * @generated
		 */
		private NodeToolEntry(String title, String description,
				List<IElementType> elementTypes) {
			super(title, description, null, null);
			this.elementTypes = elementTypes;
		}

		/**
		 * @generated
		 */
		public Tool createTool() {
			Tool tool = new UnspecifiedTypeCreationTool(elementTypes);
			tool.setProperties(getToolProperties());
			return tool;
		}
	}

	/**
	 * @generated
	 */
	private static class LinkToolEntry extends ToolEntry {

		/**
		 * @generated
		 */
		private final List<IElementType> relationshipTypes;

		/**
		 * @generated
		 */
		private LinkToolEntry(String title, String description,
				List<IElementType> relationshipTypes) {
			super(title, description, null, null);
			this.relationshipTypes = relationshipTypes;
		}

		/**
		 * @generated
		 */
		public Tool createTool() {
			Tool tool = new UnspecifiedTypeConnectionTool(relationshipTypes);
			tool.setProperties(getToolProperties());
			return tool;
		}
	}
}
