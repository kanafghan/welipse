package com.github.kanafghan.welipse.joomlagen.generator.context;

import org.eclipse.emf.ecore.EClass;

import com.github.kanafghan.welipse.joomlagen.generator.Utils;
import com.github.kanafghan.welipse.joomlagen.generator.Utils.ControllerType;


public class ControllerContext {
	
	final private Context context;
	private boolean isMain;
	private String name;
	private ControllerType type;
	private EClass model;
	private boolean isBackEndController;
	
	public ControllerContext(Context context, boolean isBackEndController) {
		super();
		this.context = context;
		this.isMain = true;
		this.name = "";
		this.type = Utils.ControllerType.Controller;
		this.isBackEndController = isBackEndController;
		this.model = null;
	}
	
	public ControllerContext(Context context, 
			Utils.ControllerType type, String name) {
		super();
		this.context = context;
		this.isMain = false;
		this.isBackEndController = false;
		this.type = type;
		this.name = name;
		this.model = null;
	}

	public Context getContext() {
		return context;
	}

	public String getName() {
		return name;
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

	public void setName(String name) {
		this.name = name;
	}

	public EClass getModel() {
		return model;
	}

	public void setModel(EClass model) {
		this.model = model;
	}
}
