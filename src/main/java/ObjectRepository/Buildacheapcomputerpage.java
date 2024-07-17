package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Buildacheapcomputerpage {
	
	public Buildacheapcomputerpage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="add-to-cart-button-72")
	private WebElement addtocart;
	
	@FindBy(xpath = "//span[.='Shopping cart']")
	private WebElement shoppingcart;

	public WebElement getShoppingcart() {
		return shoppingcart;
	}

	public WebElement getAddtocart() {
		return addtocart;
	}

}
