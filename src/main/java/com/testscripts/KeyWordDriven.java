package com.testscripts;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import com.lib.General;

import jxl.Sheet;
import jxl.Workbook;

public class KeyWordDriven {

	public static void main(String[] args) throws Exception 
	{
		General G=new General();
		FileInputStream f1=new FileInputStream("C:\\Selenium\\c1.xls");
		Workbook w1=Workbook.getWorkbook(f1);
		Sheet s1= w1.getSheet("Sheet1");
		try
		{
			int rows=s1.getRows();
			for(int i=1;i<rows;i++)
			{
				String x=s1.getCell(0,i).getContents();
				switch(x)
				{
					case "Open":
								G.openBrowser();
								System.out.println("Open Browser");
								break;
					case "Login":
								G.loginintoapp();
								System.out.println("Login Browser");
								break;
				
					case "Logout": 
								G.logout();
								System.out.println("Logout Executed");
								break; 
			
					case "Close": 
								G.closeBrowser();
								System.out.println("Browser Closed");
								break; 
			
					default: System.out.println(x + " Invalid Key Word");
				} 
		
		}
	}
	
catch (Exception e)
				{
				System.out.println(e);
				}
		}
	}
	
							
							
				
				
		
		
	


