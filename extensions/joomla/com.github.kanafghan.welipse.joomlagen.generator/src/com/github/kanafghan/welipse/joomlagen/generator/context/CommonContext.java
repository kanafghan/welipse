package com.github.kanafghan.welipse.joomlagen.generator.context;

public abstract class CommonContext {

	final private Context context;
	
	public CommonContext(Context context) {
		this.context = context;
	}
	
	public Context getContext() {
		return context;
	}
}
