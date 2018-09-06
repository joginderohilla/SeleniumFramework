package com.Selenium;

public class Driver {

	public static void main(String[] args) throws InterruptedException {
	
		AppSpecific App= new AppSpecific();
		Logging report= new Logging();
		report.ReportInit();
		App.LaunchApp();
		App.LoginPageExistance();
		

	}

}
