package com.sgAutomation.Assignment2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateProjectWithnoFindElement {
	public static WebDriver oBrowser =null;
	public static ActiTimePage oPage = null;

	public static void main(String[] args) {

		launchBrowser();
		navigate();
		login();
		createCustomer();
		CreateProject();
		DeleteProject();
		DeleteCustomer();
		logout();
		closeBrowser();
	}
	public static void launchBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\ExampleAutomation\\Automation\\Web-Automation\\Library\\Drivers\\chromedriver.exe");
		oBrowser =new ChromeDriver();
		oPage= new ActiTimePage(oBrowser);
		oBrowser.manage().window().maximize();
	}
	public static void navigate()
	{
		oBrowser.navigate().to("http://localhost/login.do");

	}
	public static void login()
	{
		try
		{
			oPage.getUsername().sendKeys("admin");
			oPage.getpwd().sendKeys("manager");
			oPage.getologin().click();
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void createCustomer()
	{
		try 
		{
			oPage.getTasksClick().click();
			Thread.sleep(3000);
			oPage.getclickonAddnewinTasks().click();
			Thread.sleep(3000);
			oPage.getClickOnNewCustomerBtn().click();
			Thread.sleep(2000);
			oPage.getcustmernametextField().sendKeys("LOBRO Comapany");
			oPage.getCstmrdescriFie().sendKeys("LBRO IS SUBPARTNER OF THE BOSCH COMPANY WITH MANUFACTURES QUALITY PRODUCT AND PROVIDES GOOD BUSINESS");
			Thread.sleep(2000);
			oPage.getclickOnCreateCustomer().click();
			Thread.sleep(2000);
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	private static void CreateProject()
	{
		try {
			oPage.getclickonAddnewinTasks().click();
			Thread.sleep(2000);
			oPage.getclickonNewProject().click();
			Thread.sleep(2000);
			oPage.getcreateProjectName().sendKeys("Project IT");
			oPage.getprojectDesc().sendKeys("At AnyCost Get into IT");
			Thread.sleep(2000);
			oPage.getclickonCretprjctbtn().click();
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void DeleteProject()
	{
		try
		{
			oPage.getprojetcSetingicon().click();
			Thread.sleep(3000);
			oPage.getprojectActionsclickbtn().click();
			Thread.sleep(2000);
			oPage.getprojectdeleteicon().click();
			Thread.sleep(2000);
			oPage.getprojectpermanentdeleteicon().click();
			Thread.sleep(4000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void DeleteCustomer()
	{
		try {
			oPage.getcustomersettingicon().click();
			Thread.sleep(2000);
			oPage.getcustomerActionicon().click();
			Thread.sleep(2000);
			oPage.getcustomerDeletebtn().click();
			Thread.sleep(2000);
			oPage.getdeleteCustomerpermanently().click();
			Thread.sleep(3000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void logout()
	{
		try {
			oPage.getologout().click();
			Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void closeBrowser()
	{
		try 
		{
			oBrowser.quit();

		} catch (Exception e) 
		{
			e.printStackTrace();		
		}
	}

}


