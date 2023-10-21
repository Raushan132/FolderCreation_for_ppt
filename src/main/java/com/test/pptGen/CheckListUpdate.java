package com.test.pptGen;

import java.awt.Color;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;
import org.apache.poi.xwpf.usermodel.XWPFTable;
import org.apache.poi.xwpf.usermodel.XWPFTableCell;
import org.apache.poi.xwpf.usermodel.XWPFTableRow;

public class CheckListUpdate {
	
	public void createCheckList() {
		  String path="F:\\public\\checkList.docx";
		  
		  XWPFDocument doc = new XWPFDocument();
		  try(FileOutputStream fos = new FileOutputStream(new File(path))){
			  
			XWPFTable table=  doc.createTable();
			
			XWPFTableRow row= table.getRow(0);
			
			XWPFTableCell cell1 = row.getCell(0);
			cell1.setText("School");
			cell1.setWidth("2500");
	
			
			row.createCell().setText("Before");
		   
			table.createRow().getCell(0).setText("testing");
			
			
			
			doc.write(fos);
			fos.flush();
		
			  
		  } catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
