package com.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class AppSpecific {
	
	public static WebDriver driver ;
	//public static ExtentReports extent;
	public static ExtentTest logger;
	
	
	public void LaunchApp() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Drivers\\chromedriver.exe");		
		driver = new ChromeDriver();
		
		driver.navigate().to("https://intranet.xavient.com/XAP/");
		Thread.sleep(5000);
		driver.manage().window().maximize();
				
	}
	
	public void LoginPageExistance()
	
	{
		WebDriverWait wait = new WebDriverWait (driver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Welcome.']")));
		boolean ExistFlag = driver.findElement(By.xpath("//input[@name='txtLoginName']")).isDisplayed();
		System.out.println(ExistFlag);
	}
	
	
}
