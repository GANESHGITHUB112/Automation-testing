package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class desktoppage {
	
	public desktoppage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath  = "//a[.='Build your own cheap computer']")
	private WebElement cheapcomputer;

	public WebElement getCheapcomputer() {
		return cheapcomputer;
	}
	
	
	

}
