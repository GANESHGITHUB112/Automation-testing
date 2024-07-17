package GenricLibrary;

import java.lang.reflect.Method;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import ObjectRepository.WelcomePage;

public class Baseclass{
	
	
	public WebDriver d;
	public static ExtentReports reports;
	public static ExtentTest test;
	
	@BeforeSuite
	public void bs() {
		 reports=new ExtentReports("./Reports/report.html");
		System.out.println("beforesuit");
		
	}
	
	@BeforeTest
	public void bt() {
		System.out.println("beforetest");
		
	}
	
	@BeforeClass
	public void bc() {
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.navigate().to("https://demowebshop.tricentis.com/");
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}
	
	@BeforeMethod 
	public void bm(Method method){
		String methodname=method.getName();
		test=reports.startTest(methodname);
		WelcomePage welcomepage=new WelcomePage(d);
		welcomepage.getLoginlink().click();
		welcomepage.getEmailfield().sendKeys("ganeshvelmurugan112@gmail.com");
		welcomepage.getPasswordfield().sendKeys("ganesh123");
		welcomepage.getLoginbutton().click();
	}
	
	
	@AfterMethod 
	public void am(){
		System.out.println("aftermethod");
		
	}
	
	@AfterClass 
	public void ac() {
		reports.endTest(test);
		System.out.println("afterclass");
		
	}
	
	@AfterTest
	public void at() {
		System.out.println("aftertest");
		
	}
	
	@AfterSuite 
	public void as(){
		reports.flush();
		System.out.println("aftersuite");
	
	}
}
