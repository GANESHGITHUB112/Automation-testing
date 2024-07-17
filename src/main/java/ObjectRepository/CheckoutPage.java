package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutPage {

	public CheckoutPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="BillingNewAddress_CountryId")
	private WebElement billingCountry;
	
	
	@FindBy(id="BillingNewAddress_City")
	private WebElement billingcity;
	
	@FindBy(id="BillingNewAddress_Address1")
	private WebElement billingAddress;
	
	@FindBy(id="BillingNewAddress_ZipPostalCode")
	private WebElement billingPostelCode;
	
	@FindBy(id="BillingNewAddress_PhoneNumber")
	private WebElement billingPhonenumber;
	
	@FindBy(xpath = "//p[@class='back-link']/following-sibling::input[@class='button-1 new-address-next-step-button']")
	private WebElement billingaddresscontinueButton;
	
	@FindBy(xpath = "//p[@class='back-link']/following-sibling::input[@class='button-1 shipping-method-next-step-button']")
	private WebElement shippingaddresscontinueButton;
	
	
	
	

	public WebElement getBillingaddresscontinueButton() {
		return billingaddresscontinueButton;
	}

	public WebElement getShippingaddresscontinueButton() {
		return shippingaddresscontinueButton;
	}

	public WebElement getBillingcity() {
		return billingcity;
	}

	public WebElement getBillingAddress() {
		return billingAddress;
	}

	public WebElement getBillingPostelCode() {
		return billingPostelCode;
	}

	public WebElement getBillingPhonenumber() {
		return billingPhonenumber;
	}

	public WebElement getBilling() {
		return billingcity;
	}

	public WebElement getBillingCountry() {
		return billingCountry;
	}
	
}
