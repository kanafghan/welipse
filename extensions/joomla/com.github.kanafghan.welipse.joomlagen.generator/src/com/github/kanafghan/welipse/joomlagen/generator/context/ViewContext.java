package com.github.kanafghan.welipse.joomlagen.generator.context;

import com.github.kanafghan.welipse.joomlagen.GenClass;

import com.github.kanafghan.welipse.joomlagen.generator.Utils.ModelType;
import com.github.kanafghan.welipse.webdsl.Page;

public class ViewContext {
	
	final private Context context;
	final private Page page;
	final private GenClass model;
	
	private ModelType modelType;
	private boolean isBackEndView;
	
	public ViewContext(Context context, Page page, GenClass model) {
		super();
		this.context = context;
		this.page = page;
		this.model = model;
		this.modelType = ModelType.Model;
		this.isBackEndView = (page == null);
	}

	public Context getContext() {
		return context;
	}

	public Page getPage() {
		return page;
	}
	
	public GenClass getModel() {
		return model;
	}

	public ModelType getModelType() {
		return modelType;
	}

	public void setModelType(ModelType modelType) {
		this.modelType = modelType;
	}

	public String getLayoutName() {
		if (modelType == ModelType.ModelAdmin) {
			return "edit";
		}
		return "default";
	}

	public boolean isBackEndView() {
		return isBackEndView;
	}
	
	public void setIsBackEndView(boolean isBackEndView) {
		this.isBackEndView = isBackEndView;
	}

}
