package com.github.kanafghan.welipse.joomlagen.generator.context;

import org.eclipse.emf.ecore.EClass;

import com.github.kanafghan.welipse.joomlagen.generator.Utils;
import com.github.kanafghan.welipse.joomlagen.generator.Utils.ModelType;

public class ModelContext {
	
	final private Context context;
	final private EClass model;
	
	private Utils.ModelType type;
	private boolean isBackEndModel;
	
	public ModelContext(Context context, EClass model, Utils.ModelType type) {
		super();
		this.context = context;
		this.model = model;
		this.type = type;
		this.isBackEndModel = type == ModelType.ModelAdmin;
	}

	public Context getContext() {
		return context;
	}

	public EClass getModel() {
		return model;
	}

	public Utils.ModelType getType() {
		return type;
	}

	public void setType(Utils.ModelType type) {
		this.type = type;
	}

	public boolean isBackEndModel() {
		return isBackEndModel;
	}

	public void setBackEndModel(boolean isBackEndModel) {
		this.isBackEndModel = isBackEndModel;
	}
}
