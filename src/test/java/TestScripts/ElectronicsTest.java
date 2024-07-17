package TestScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ElectronicsTest {
	@Test(invocationCount = 5,threadPoolSize = 5,enabled = false)//(priority = 0)
	public void register(){
		WebDriver d=new ChromeDriver();
		System.out.println("register");
		//d.navigate().to("www.sadlfjl.com");
		d.quit();
	}
	@Test(dependsOnMethods = "register")//(priority = 1)
	public void login(){
		WebDriver d=new ChromeDriver();
		System.out.println("login");
		d.quit();
	}
	@Test(dependsOnMethods = "login")//(priority = 2)
	public void addtocart(){
		WebDriver d=new ChromeDriver();
		System.out.println("addtocart");
		d.quit();
	}
	@Test(dependsOnMethods = "addtocart")//(priority = 3)
	public void checkout(){
		WebDriver d=new ChromeDriver();
		System.out.println("checkout");
		d.quit();
	}
	@Test(dependsOnMethods = "checkout")//(priority = 4)
	public void payment(){
		WebDriver d=new ChromeDriver();
		System.out.println("payment");
		d.quit();
	}
	@Test(dependsOnMethods = "payment")//(priority = 5)
	public void confirm(){
		WebDriver d=new ChromeDriver();
		System.out.println("confirm");
		d.quit();
	}

}
