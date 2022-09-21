package com.sgtestingPOM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipcartDemo {
	private static final By By = null;
	public static WebDriver oBrowser=null;
	public static void main(String args[]) {
		LaunchBrowser();
		navigate();
		Mobiles();
		CloseBrowser();
	}

	private static void LaunchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver","D:\\ExampleAutomation\\Automation\\Web-Automation\\Library\\Drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}


	private static void navigate()
	{
		try
		{
			oBrowser.get("https://www.flipkart.com/");
			Thread.sleep(5000);
		}catch(Exception e)
		{
			e.printStackTrace();

		}
	}
	private static void minimizeLoginWindow()
	{
		try
		{
			oBrowser.findElement(org.openqa.selenium.By.xpath("<button class='_2KpZ6l _2doB4z'>✕</button>")).click();
			Thread.sleep(5000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}

	}

	private static void Mobiles() {
		try
		{
			oBrowser.findElement(By.xpath())).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void CloseBrowser() {
		try
		{
			oBrowser.quit();
			Thread.sleep(5000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}



