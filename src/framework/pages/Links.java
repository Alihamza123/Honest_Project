package framework.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import framework.config.TestCore;

public class Links extends TestCore {
	
	// MAIN CONSTRUCTOR
	public Links(WebDriver driver) {
		TestCore.driver = driver;
	}

	// METHOD FOR PRINTING ALL LINKS	
	public void print_AllLinks() {
		List<WebElement> links = driver.findElements(By.tagName("a"));

		log.debug(links.size());

		for (int i = 1; i <= links.size(); i++) {
			log.debug(" Name of Link #" + i + links.get(i).getText());
			log.debug(" URL of Link #" + i + links.get(i).getAttribute("href"));
		}
	}
	
	// METHOD FOR PRINTING A SPECIFIC LINK NUMBER
	public void print_SpecificLink(int LinkNumber) {
		List<WebElement> links = driver.findElements(By.tagName("a"));

		String specificLink = links.get(LinkNumber).getAttribute("href");
		log.debug(" THE LINK NUMBER [ " + LinkNumber + " ] : " + specificLink);
	}
}