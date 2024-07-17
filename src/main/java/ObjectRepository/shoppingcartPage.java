package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class shoppingcartPage {


		public shoppingcartPage(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}

		@FindBy(id="checkout")
		private WebElement checkoutbutton;
		
		@FindBy(id="termsofservice")
		private WebElement checkbox;

		public WebElement getCheckoutbutton() {
			return checkoutbutton;
		}

		public WebElement getCheckbox() {
			return checkbox;
		}
		
	}


