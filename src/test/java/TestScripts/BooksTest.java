package TestScripts;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import GenricLibrary.Baseclass;
import ObjectRepository.BooksPage;
import ObjectRepository.WelcomePage;


public class BooksTest extends Baseclass {

	@Test
	public void books001() {
			WelcomePage WelcomePage=new WelcomePage(d);
			BooksPage BooksPage=new BooksPage(d);
			WelcomePage.getBookslink().click();
			test.log(LogStatus.INFO, "Clicked on Apparels link");
			//Verify Apparel page is displayed
			Assert.assertEquals(BooksPage.getPagetitle().getText(), "Apparel & Shoes");
			test.log(LogStatus.PASS, "Apparels page is displayed");
			

		}

		
	}

