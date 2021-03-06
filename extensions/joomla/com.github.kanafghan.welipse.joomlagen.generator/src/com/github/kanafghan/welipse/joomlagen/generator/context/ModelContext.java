package com.github.kanafghan.welipse.joomlagen.generator.context;

import com.github.kanafghan.welipse.joomlagen.GenClass;
import com.github.kanafghan.welipse.joomlagen.generator.Utils;
import com.github.kanafghan.welipse.joomlagen.generator.Utils.ModelType;

public class ModelContext extends MVCContext {
		
	private Utils.ModelType type;
	private boolean isBackEndModel;
	
	public ModelContext(Context context, GenClass model, Utils.ModelType type) {
		super(context, model);
		this.type = type;
		this.isBackEndModel = type == ModelType.ModelAdmin;
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
