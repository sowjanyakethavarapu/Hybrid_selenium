package Testcases;

import java.io.IOException;


import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base_class.Library_class;
import Pages.Login_page;

public class Login_testcase extends Library_class{

	WebDriver driver;
	Login_page face;
	
	@BeforeMethod
	public void Launchapp() throws IOException
	{
	LaunchApplication();
	}

	@Test
	public void loginorangehrm1()
	{
	face=new Login_page(driver);
	face.loginorangehrm("Admin", "admin123");
	face.button();
	}

	@AfterMethod
	public void closeapp() {
	teardown();
	}

	}


