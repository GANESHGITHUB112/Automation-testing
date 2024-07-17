package TestScripts;

import java.time.Duration;
import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import ObjectRepository.Buildacheapcomputerpage;
import ObjectRepository.CheckoutPage;
import ObjectRepository.Homepage;
import ObjectRepository.RegisterPage;
import ObjectRepository.RegisterPage;
import ObjectRepository.WelcomePage;
import ObjectRepository.WelcomePage;
import ObjectRepository.desktoppage;
import ObjectRepository.shoppingcartPage;

public class purchaseTest {

	@Test
	 public void purchase001() throws InterruptedException{
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.navigate().to("https://demowebshop.tricentis.com/");
		
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WelcomePage welcomepage=new WelcomePage(d);
		RegisterPage registerpage=new RegisterPage(d);
		Homepage homepage=new Homepage(d);
		desktoppage desktopage=new desktoppage(d);
		Buildacheapcomputerpage compage=new Buildacheapcomputerpage(d);
		welcomepage.getRegisterLink().click();
		registerpage.getFirstname().sendKeys("ganesh");
		registerpage.getMaleRadioButton().click();
		registerpage.getLastname().sendKeys("ganesh");
		Random random=new Random();
		int randomNumber = random.nextInt(9000) + 1000;
		registerpage.getEmail().sendKeys("ganesh"+randomNumber+"@gmail.com");
		registerpage.getPassword().sendKeys("ganesh123");
		registerpage.getConfirmpassword().sendKeys("ganesh123");
		registerpage.getRegisterbutton().click();
		registerpage.getContinuebutton().click();
		
		Actions mouse=new Actions(d);
		mouse.moveToElement(homepage.getHeadermenucomputer()).perform();
		
		mouse.click(homepage.getDesktopsLink()).perform();
		
		desktopage.getCheapcomputer().click();
		
		compage.getAddtocart().click();
		
		Thread.sleep(4000);
		compage.getShoppingcart().click();
		
		shoppingcartPage cartpage=new shoppingcartPage(d);
		
		cartpage.getCheckbox().click();
		cartpage.getCheckoutbutton().click();
		
		CheckoutPage checkout=new CheckoutPage(d);
		
		Select selectcountry=new Select(checkout.getBillingCountry());
		selectcountry.selectByVisibleText("India");
		checkout.getBillingAddress().sendKeys("thirunagar, vadapalani");
		int randomNumbers = random.nextInt(900000000) + 1000000000;
		checkout.getBillingPhonenumber().sendKeys(""+randomNumbers+"");
		checkout.getBillingPostelCode().sendKeys("600026");
		checkout.getBillingcity().sendKeys("chennai");
		checkout.getBillingaddresscontinueButton().click();
		checkout.getShippingaddresscontinueButton().click();
		
		

	}

}
