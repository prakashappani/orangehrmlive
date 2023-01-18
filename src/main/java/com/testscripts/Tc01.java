package com.testscripts;

import com.lib.General;

public class Tc01 {

	public static void main(String[] args) throws Exception 
	{
		General G=new General();
		G.openBrowser();
		G.loginintoapp();
		G.logout();
		G.closeBrowser();
		
		
		
	}

}
