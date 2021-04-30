package PruebaDeAutomatizacion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AutomationPracticeRegistration {
	
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http:\\automationpractice.com");
	//	By locator = By.className("login");
	//	WebElement element = driver.findElement(locator);
	//	element.click();
		
		driver.findElement(By.className("login")).click();
		driver.findElement(By.id("email_create")).sendKeys("Jorgeyanquen127@gmail.com");
		driver.findElement(By.id("SubmitCreate")).click();
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String pageHeading = driver.findElement(By.className("page-heading")).getText();
		System.out.println("Page Heading: "+pageHeading);
	
		driver.findElement(By.id("id_gender1")).click();
		driver.findElement(By.id("customer_firstname")).sendKeys("Jorge Armando");
		driver.findElement(By.id("customer_lastname")).sendKeys("Yanquen yanquen");
		driver.findElement(By.id("passwd")).sendKeys("12345");
		WebElement elestate = driver.findElement(By.name("days"));
		Select selectState = new Select(elestate);
		selectState.selectByValue("5");
		WebElement elestate1 = driver.findElement(By.name("months"));
		Select selectState1 = new Select(elestate1);
		selectState1.selectByValue("1");
		WebElement elestate2 = driver.findElement(By.name("years"));
		Select selectState2 = new Select(elestate2);
		selectState2.selectByValue("1992");
		driver.findElement(By.id("uniform-newsletter")).click();
		driver.findElement(By.id("uniform-optin")).click();
		driver.findElement(By.id("company")).sendKeys("choucair");
		driver.findElement(By.id("address1")).sendKeys("choucair");
		driver.findElement(By.id("city")).sendKeys("Bogota");
		WebElement elestate3 = driver.findElement(By.name("id_state"));
		Select selectState3 = new Select(elestate3);
		selectState3.selectByVisibleText("Georgia");
		driver.findElement(By.id("postcode")).sendKeys("00000");
		WebElement elestate4 = driver.findElement(By.name("id_country"));
		Select selectState4 = new Select(elestate4);
		selectState4.selectByVisibleText("United States");
		driver.findElement(By.id("other")).sendKeys("Esta es una prueba de Automatizacion 123456789");
		driver.findElement(By.id("phone")).sendKeys("0387471487");
		driver.findElement(By.id("phone_mobile")).sendKeys("3214869745");
		driver.findElement(By.id("alias")).sendKeys("El Ingeniero");
		driver.findElement(By.id("submitAccount")).click();
	}

}
