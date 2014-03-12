package com.github.kanafghan.welipse.joomlagen.generator.context;

import com.github.kanafghan.welipse.joomlagen.GenClass;

public abstract class MVCContext extends CommonContext {

	final private GenClass genClass;
	
	public MVCContext(Context context, GenClass genClass) {
		super(context);
		this.genClass = genClass;
	}
	
	public GenClass getGenClass() {
		return genClass;
	}

}
