package com.example.spring.boot.apachepoi.rest.helper;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ActorHelper {

	private static final String EXCEL_NAME = "actors";
	private static final String DATE_FORMAT = "yyyyMMdd_HHmmss";
	private static final String EXCEL_FORMAT = ".xlsx";

	public static final String SHEET_ACTORS = "Actors Lists";

	public static final String COLUMN_ID = "ID";
	public static final String COLUMN_FIRST_NAME = "First Name";
	public static final String COLUMN_LAST_NAME = "Last Name";
	public static final String COLUMN_DATE_UPDATE = "Date Update";

	public static String returnNameExcel() {
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat(DATE_FORMAT);
		return EXCEL_NAME.concat("_").concat(sdf.format(date).concat(EXCEL_FORMAT));
	}

}
