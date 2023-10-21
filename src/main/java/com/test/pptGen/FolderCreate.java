package com.test.pptGen;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FolderCreate {
		
	
	 public void CreateFolder(String csvPath, String url) throws Exception {
		 
		  File loc =new File(url);
		  if(!loc.exists()) {
			  System.out.println("Url of where folder will be created not found");
			  
		  }else {
			  
			  
			  BufferedReader br = new BufferedReader(new FileReader(csvPath));
			 String line;
			  while((line= br.readLine())!=null) {
				  
				  String[] vals = line.split(",");
				  String newFolder = url+ "\\"+ vals[1].toUpperCase();
				  File f = new File(newFolder);
				  if(f.mkdir()) System.out.println(vals[1]+" is created");
				  
				  
				  
				  
			  }
			  
			  
		  }
	 }
	
}
