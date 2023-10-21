package com.test.pptGen;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.sl.usermodel.TextParagraph.TextAlign;
import org.apache.poi.ss.usermodel.Color;
import org.apache.poi.xslf.usermodel.XMLSlideShow;
import org.apache.poi.xslf.usermodel.XSLFTable;
import org.apache.poi.xslf.usermodel.XSLFTableCell;
import org.apache.poi.xslf.usermodel.XSLFTableRow;
import org.apache.poi.xslf.usermodel.XSLFTextParagraph;
import org.apache.poi.xslf.usermodel.XSLFTextRun;

public class CreatePPt {
	
	 public void getPpt() throws Exception {
		 
		 FileInputStream fis = new FileInputStream("C:\\Users\\LENOVO\\Pictures\\powerPoint\\test1.pptx");
		 XMLSlideShow slideShow = new XMLSlideShow(fis);
	       
		 var slide =  slideShow.createSlide();
		 var slide2 = slideShow.createSlide();
		 slide.getSlideLayout();
		 XSLFTable table = slide.createTable();
		 XSLFTableRow  row1 = table.addRow();
		  XSLFTableCell th = row1.addCell();
	        XSLFTextParagraph p = th.addNewTextParagraph();
	        p.setTextAlign(TextAlign.CENTER);
	        XSLFTextRun r = p.addNewTextRun();
	        r.setText("time ");
	        r.setFontSize((double) 20);
	        r.setFontColor(new java.awt.Color(0, 0, 0));
	        th.setFillColor(new java.awt.Color(79, 129, 189));
	        table.setColumnWidth(0, 150);
		 
		
		 
		 FileOutputStream fos = new FileOutputStream("C:\\Users\\LENOVO\\Pictures\\powerPoint\\test1.pptx");
		 System.out.println("slide created");
		 
         slideShow.write(fos);
         fos.close();
         slideShow.close();
         fis.close();
		 
	 }

}
