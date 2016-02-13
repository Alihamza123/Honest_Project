package framework.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import framework.config.TestCore;
import framework.properties.Elements;

public class Cleaning extends TestCore {

	// MAIN CONSTRUCTOR
	public Cleaning(WebDriver driver) {
		TestCore.driver = driver;
	}

	// METHOD FOR USER (CLICKS CLEANING ON HEADER, THEN SELECTS DISH SOAP)
	public void selectDishSoap() throws Exception {

		// wait for dish soap to be visible
		explicitWait(dishSoap, 20, driver);

		// click on dish soap item
		dishSoap.click();

	}

	// METHOD FOR SELECTING LEMON VERBANA FROM DROP DOWN
	public void selectLemonVerbena() throws Exception {

		// wait for scent list to be visible
		explicitWait(scentList, 20, driver);

		// select scent list
		Select scent = new Select(scentList);
		
		// click on lemon verbana
		scent.selectByIndex(1);

	}

	// METHOD FOR INCREASING QUANTITY TO 5
	public void increaseQuantity() throws Exception {

		// wait for increase element to be visible
		explicitWait(increase, 20, driver);

		// loop to increase quantity to + 5
		int a = 1;
		while (a < 5) {
			increase.click();
			a++;
		}
		
	}

	// METHOD FOR VERIFYING PAGE ON IMAGE HAS LOADED
	public void verifyImage() throws Exception {

		// wait for item image to be visible
		explicitWait(itemImage, 20, driver);

		// verify item image is displayed
		Assert.assertEquals(itemImage.isDisplayed(), true);

	}
	
	@CacheLookup@FindBy(xpath = Elements.dishSoap)WebElement dishSoap;
	@CacheLookup@FindBy(xpath = Elements.scentList)WebElement scentList;
	@CacheLookup@FindBy(xpath = Elements.increase)WebElement increase;
	@CacheLookup@FindBy(xpath = Elements.cleaning)WebElement itemImage;


}
