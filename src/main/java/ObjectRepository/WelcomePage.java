package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WelcomePage {

	public WelcomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		}
	@FindBy(linkText = "BOOKS")
	private WebElement bookslink;
	
	@FindBy(linkText = "Register")
	private WebElement registerLink;
	
	public WebElement getLoginlink() {
		return loginlink;
	}
	@FindBy(linkText = "Log in")
	private WebElement loginlink;
	
	@FindBy(id = "Email")
	private WebElement emailfield;
	
	@FindBy(id = "Password")
	private WebElement passwordfield;
	
	@FindBy(className = "login-button")
	private WebElement loginbutton;

	public WebElement getEmailfield() {
		return emailfield;
	}



	public WebElement getPasswordfield() {
		return passwordfield;
	}



	public WebElement getLoginbutton() {
		return loginbutton;
	}



	public WebElement getRegisterLink() {
		return registerLink;
	}
	
	
	
	public WebElement getBookslink() {
		return bookslink;
	}
 
	
	
}
