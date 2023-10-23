package com.test.pptGen;

import java.awt.Rectangle;
import java.awt.geom.Rectangle2D;
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
		 
//		 FileInputStream fis = new FileInputStream("C:\\Users\\LENOVO\\Pictures\\powerPoint\\test.pptx");
		 XMLSlideShow slideShow = new XMLSlideShow();
	       
		 var slide =  slideShow.createSlide();
		 var slide2 = slideShow.createSlide();
		
		 XSLFTable table = slide.createTable();
		 table.setAnchor(new Rectangle(50,50,500,20));
		 for(int i=0;i<10;i++) {
		 XSLFTableRow  row1 = table.addRow();
		 for(int j=0;j<5;j++) {
		  XSLFTableCell th = row1.addCell();
	        XSLFTextParagraph p = th.addNewTextParagraph();
	        p.setTextAlign(TextAlign.CENTER);
	        XSLFTextRun r = p.addNewTextRun();
	        r.setText("time_"+i+"_"+j);
	        r.setFontSize((double) 20);
	        r.setFontColor(new java.awt.Color(0, 0, 0));
	        th.setFillColor(new java.awt.Color(79, 129, 189));
		 	}
		 }
	        
		 
		   
		 FileOutputStream fos = new FileOutputStream("C:\\Users\\LENOVO\\Pictures\\powerPoint\\test1.pptx");
		 System.out.println("slide created");
		 
         slideShow.write(fos);
         fos.close();
//         slideShow.close();
//         fis.close();
		 
	 }

}
