package com.github.kanafghan.welipse.joomlagen.generator.context;

import com.github.kanafghan.welipse.joomlagen.DatabaseTable;

public class TableContext extends CommonContext {
	
	final private DatabaseTable table;
	
	public TableContext(Context context, DatabaseTable table) {
		super(context);
		this.table = table;
	}

	public DatabaseTable getTable() {
		return table;
	}
}
