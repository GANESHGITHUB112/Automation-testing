package TestScripts;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import ObjectRepository.RegisterPage;
import ObjectRepository.WelcomePage;
import fileutility.Excelutilitty;

public class RegisterTest {
	@DataProvider(name = "regdata")
	public String[][] registerData() throws EncryptedDocumentException, IOException{
		return Excelutilitty.readExcelData("register");
	}
	
	
	@Test(dataProvider = "regdata")
	public void register_001(String firstName, String lastName, String email, String password, String confirmPassword) throws InterruptedException{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WelcomePage welcome=new WelcomePage(driver);
		RegisterPage register=new RegisterPage(driver);
		
		welcome.getRegisterLink().click();
		
		register.getMaleRadioButton().click();
		
		register.getFirstname().sendKeys(firstName); 
		
		register.getLastname().sendKeys(lastName);
		
		register.getEmail().sendKeys(email);
		
		register.getPassword().sendKeys(password);
		
		register.getConfirmpassword().sendKeys(confirmPassword);
		
		register.getRegisterbutton().click();
		
		driver.quit();
		
	}
	

}
