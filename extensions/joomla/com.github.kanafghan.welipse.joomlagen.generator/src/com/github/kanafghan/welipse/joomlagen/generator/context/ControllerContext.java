package com.github.kanafghan.welipse.joomlagen.generator.context;

import com.github.kanafghan.welipse.joomlagen.GenClass;

import com.github.kanafghan.welipse.joomlagen.generator.Utils;
import com.github.kanafghan.welipse.joomlagen.generator.Utils.ControllerType;


public class ControllerContext extends MVCContext {
	
	private boolean isMain;
	private ControllerType type;
	private boolean isBackEndController;

	public ControllerContext(Context context, GenClass genClass) {
		super(context, genClass);
		this.isMain = false;
		this.type = Utils.ControllerType.BEController;
		this.isBackEndController = false;
	}

	public boolean isMain() {
		return isMain;
	}

	public void setMain(boolean isMain) {
		this.isMain = isMain;
	}

	public ControllerType getType() {
		return type;
	}

	public void setType(ControllerType type) {
		this.type = type;
	}

	public boolean isBackEndController() {
		return isBackEndController;
	}

	public void setBackEndController(boolean isBackEndController) {
		this.isBackEndController = isBackEndController;
	}
}
