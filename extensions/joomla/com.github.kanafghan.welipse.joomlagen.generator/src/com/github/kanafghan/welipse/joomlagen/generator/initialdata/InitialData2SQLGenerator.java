package com.github.kanafghan.welipse.joomlagen.generator.initialdata;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Enumeration;
import java.util.zip.ZipEntry;
import java.util.zip.ZipException;
import java.util.zip.ZipFile;

import org.eclipse.emf.common.util.EList;

import com.github.kanafghan.welipse.joomlagen.DatabaseTable;
import com.github.kanafghan.welipse.joomlagen.JoomlaGenModel;

public class InitialData2SQLGenerator {
	
	public String generateInsertSQL(JoomlaGenModel genModel) {
		// Do we have any data to process?
		String data = genModel.getInitialData();
		if (data == null || data.isEmpty()) {
			return "";
		}
		
		// Do we have any database tables
		EList<DatabaseTable> tables = genModel.getDatabaseTables();
		if (tables.isEmpty()) {
			return "";
		}
		
		// The result of building the SQL INSERT queries
		StringBuilder sql = new StringBuilder();
		
		ZipFile zf = null;
		try {
			zf = new ZipFile(data);
			
			Enumeration<? extends ZipEntry> entry = zf.entries();
			while (entry.hasMoreElements()) {
				ZipEntry ze = entry.nextElement();
				if (!ze.isDirectory()) {					
					String name = ze.getName();
					if (name.endsWith(".csv")) {
						String tableName = name.substring(0, name.indexOf(".csv"));
						
						for (DatabaseTable table : tables) {
							if (table.getName().equalsIgnoreCase(tableName)) {
								InputStream in = zf.getInputStream(ze);
								BufferedReader reader = new BufferedReader(new InputStreamReader(in));
								
								sql.append("INSERT INTO ");
								sql.append(genModel.getDatabaseTablePrefix().concat(table.getName()) +" ");
								
								int columnCount = table.getColumns().size() + table.getForeignKeys().size();
								int lineNumber = 1;
								String line;
								boolean readColumnNames = true;
								while ((line = reader.readLine()) != null) {
									if (!line.isEmpty()) {
										String[] columns = line.split(";");
										// Check whether columns are equal
										if (columns.length != columnCount) {
											System.err.println("Table column mismatch with provided initial data. "
													+ "Table = "+ tableName
													+ ", Line: "+ lineNumber);
											continue;
										} 
										
										if (readColumnNames) {
											sql.append("(`"+ columns[0] +"`");
											for (int i=1; i<columns.length; i++) {
												sql.append(", `"+ columns[i] +"`");
											}
											sql.append(")");
											sql.append(" VALUES\n");
											readColumnNames = false;
										} else {
											sql.append("('"+ columns[0] +"'");
											for (int i=1; i<columns.length; i++) {
												sql.append(", '"+ columns[i] +"'");
											}
											sql.append("),\n");
										}
									}
									lineNumber++;
								}
								
								sql.replace(sql.length()-2, sql.length(), ";\n\n");
							}
						}
					}
				}
			}
		} catch (ZipException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (zf != null) {
				try {
					zf.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}		
		
		return sql.toString();
	}
}
