package PruebaDeAutomatizacion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Eliminarproducto {

public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http:\\automationpractice.com");
		
		driver.findElement(By.className("login")).click();
		driver.findElement(By.id("email")).sendKeys("Jorgeyanquen12@gmail.com");
		driver.findElement(By.id("passwd")).sendKeys("12345");
		driver.findElement(By.id("SubmitLogin")).click();
	
		driver.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[1]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li[1]/div/div[2]/div[2]/a[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Proceed to checkout")).click();
		Actions actions = new Actions(driver);
		actions.moveToElement(driver.findElement(By.xpath("//*[@id=\"header\"]/div[3]/div/div/div[3]/div/a"))).click().build().perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"1_1_0_493063\"]")).click();
		
	}
}

