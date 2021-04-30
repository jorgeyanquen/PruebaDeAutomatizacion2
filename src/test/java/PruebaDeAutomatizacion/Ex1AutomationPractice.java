package PruebaDeAutomatizacion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ByIdOrName;

public class Ex1AutomationPractice {

public static void main(String[] args) {
	

	System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://automationpractice.com");
	By locator = new ByIdOrName("search_query_top");
	WebElement searchBox = driver.findElement(locator);
	searchBox.sendKeys("Dress");
}
}