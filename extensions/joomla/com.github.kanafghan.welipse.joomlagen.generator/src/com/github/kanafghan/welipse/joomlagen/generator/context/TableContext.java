package com.github.kanafghan.welipse.joomlagen.generator.context;

import com.github.kanafghan.welipse.joomlagen.DatabaseTable;

public class TableContext {
	
	final private Context context;
	final private DatabaseTable table;
	
	public TableContext(Context context, DatabaseTable table) {
		super();
		this.context = context;
		this.table = table;
	}

	public Context getContext() {
		return context;
	}

	public DatabaseTable getTable() {
		return table;
	}
}
