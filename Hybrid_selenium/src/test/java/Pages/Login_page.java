package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Base_class.Library_class;

public class Login_page {

	
	WebDriver driver;
	By username=By.xpath("//*[@id=\"txtUsername\"]");
	By password=By.id("txtPassword");
	By loginbutton=By.xpath("//*[@id=\"btnLogin\"]");

	public Login_page(WebDriver driver) {
	this.driver=driver;

	}
	public void loginorangehrm(String userid,String pass) {
	driver.findElement(username).sendKeys(userid);
	driver.findElement(password).sendKeys(pass);
	}
	public void button() {
	driver.findElement(loginbutton).click();
	}
	}


