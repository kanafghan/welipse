package com.github.kanafghan.welipse.joomlagen.generator.context;

import org.eclipse.emf.ecore.EClass;

public class ModelContext {
	
	final private Context context;
	final private EClass model;
	
	public ModelContext(Context context, EClass model) {
		super();
		this.context = context;
		this.model = model;
	}

	public Context getContext() {
		return context;
	}

	public EClass getModel() {
		return model;
	}
}
