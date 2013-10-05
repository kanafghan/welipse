package com.github.kanafghan.welipse.joomlagen.generator.context;

import org.eclipse.emf.ecore.EClass;

public class TableContext {
	
	final private Context context;
	final private EClass table;
	
	public TableContext(Context context, EClass table) {
		super();
		this.context = context;
		this.table = table;
	}

	public Context getContext() {
		return context;
	}

	public EClass getTable() {
		return table;
	}
}
