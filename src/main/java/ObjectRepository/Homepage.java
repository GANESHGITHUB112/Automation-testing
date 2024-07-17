package ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
	
	public Homepage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//div[@class='header']//a[@class='account']")
	private WebElement accountlink;
	
	@FindBy(linkText = "COMPUTERS")
	private WebElement headermenucomputer;
	
	 @FindBy(linkText = "Desktops")
	 private WebElement desktopsLink;
	 
	@FindBy(linkText = "BOOKS")
	private WebElement headermenuBooks;

	public WebElement getHeadermenuBooks() {
		return headermenuBooks;
	}

	public WebElement getDesktopsLink() {
		return desktopsLink;
	}

	public WebElement getAccountlink() {
		return accountlink;
	}

	public WebElement getHeadermenucomputer() {
		return headermenucomputer;
	}

}
