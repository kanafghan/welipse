package com.github.kanafghan.welipse.joomlagen.generator.context;

import com.github.kanafghan.welipse.webdsl.Page;

public class ViewContext {
	
	final private Context context;
	final private Page page;
	
	public ViewContext(Context context, Page page) {
		super();
		this.context = context;
		this.page = page;
	}

	public Context getContext() {
		return context;
	}

	public Page getPage() {
		return page;
	}

}
