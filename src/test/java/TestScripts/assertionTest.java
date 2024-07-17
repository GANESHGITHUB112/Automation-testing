package TestScripts;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import ObjectRepository.BooksPage;
import ObjectRepository.WelcomePage;


public class assertionTest {
	@Test
	public void assert001() {
	WebDriver d=new ChromeDriver();
	d.manage().window().maximize();
	d.navigate().to("https://demowebshop.tricentis.com/");
	d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	WelcomePage WelcomePage=new WelcomePage(d);
	BooksPage BooksPage=new BooksPage(d);
	WelcomePage.getBookslink().click();
	
	String actualResult=BooksPage.getPagetitle().getText();
//	//hard assert
//	Assert.assertEquals(actualResult, "Computers");
//	
//	//soft assert
	SoftAssert soft=new SoftAssert();
	
//	soft.assertEquals(actualResult, "Computers");
//	d.quit();
//	soft.assertAll(); 
	soft.assertTrue(BooksPage.getPagetitle().isDisplayed());
	soft.assertFalse(BooksPage.getPagetitle().isDisplayed());
	soft.fail(); 

	 
}
}