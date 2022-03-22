package com.example.spring.boot.apachepoi.utils;

import java.io.IOException;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.example.spring.boot.apachepoi.entity.Actor;
import com.example.spring.boot.apachepoi.rest.helper.ActorHelper;

public class ActorExcelExporter {

	private XSSFWorkbook workbook;
	private XSSFSheet sheet;

	Iterable<Actor> actors;

	public ActorExcelExporter(Iterable<Actor> actors) {
		this.actors = actors;
		workbook = new XSSFWorkbook();
		sheet = workbook.createSheet(ActorHelper.SHEET_ACTORS);
	}

	private void writerHeaderRow() {
		
		Row row = sheet.createRow(0);
		
		Cell cell = row.createCell(0);
		cell.setCellValue(ActorHelper.COLUMN_ID);
		
		cell = row.createCell(1);
		cell.setCellValue(ActorHelper.COLUMN_FIRST_NAME);
		
		cell = row.createCell(2);
		cell.setCellValue(ActorHelper.COLUMN_LAST_NAME);
		
		cell = row.createCell(3);
		cell.setCellValue(ActorHelper.COLUMN_DATE_UPDATE);
	}

	private void writerDataRow() {
		
		int rowCount = 1;
		
		for (Actor actor : actors) {
			
			Row row = sheet.createRow(rowCount++);
			
			Cell cell = row.createCell(0);
			cell.setCellValue(actor.getActorId());
			
			cell = row.createCell(1);
			cell.setCellValue(actor.getFirstName());
			
			cell = row.createCell(2);
			cell.setCellValue(actor.getLastName());
			
			cell = row.createCell(3);
			cell.setCellValue(actor.getLastUpdate());
		}

	}

	public void export(HttpServletResponse response) throws IOException {
		
		writerHeaderRow();
		writerDataRow();
		
		ServletOutputStream outputStream = response.getOutputStream();
		workbook.write(outputStream);
		workbook.close();
		outputStream.close();
	}
}
