package com.github.kanafghan.welipse.joomlagen.generator.context;

import com.github.kanafghan.welipse.joomlagen.GenClass;

import com.github.kanafghan.welipse.joomlagen.generator.Utils.ModelType;
import com.github.kanafghan.welipse.webdsl.Page;

public class ViewContext extends MVCContext {
	
	final private Page page;	
	private ModelType modelType;
	private boolean isBackEndView;
	
	public ViewContext(Context context, GenClass genClass, Page page) {
		super(context, genClass);
		this.page = page;
		this.modelType = ModelType.Model;
		this.isBackEndView = (page == null);
	}

	public Page getPage() {
		return page;
	}
	
	public ModelType getModelType() {
		return modelType;
	}

	public void setModelType(ModelType modelType) {
		this.modelType = modelType;
	}

//	public String getLayoutName() {
//		if (modelType == ModelType.ModelAdmin) {
//			return "edit";
//		}
//		return "default";
//	}

	public boolean isBackEndView() {
		return isBackEndView;
	}
	
	public void setIsBackEndView(boolean isBackEndView) {
		this.isBackEndView = isBackEndView;
	}

}
