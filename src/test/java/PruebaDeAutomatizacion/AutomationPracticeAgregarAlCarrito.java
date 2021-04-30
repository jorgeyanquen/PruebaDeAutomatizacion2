package PruebaDeAutomatizacion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomationPracticeAgregarAlCarrito {

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
		driver.findElement(By.xpath("//*[@id=\"center_column\"]/p[2]/a[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"center_column\"]/form/p/button")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("uniform-cgv")).click();
		driver.findElement(By.xpath("//*[@id=\"form\"]/p/button")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"HOOK_PAYMENT\"]/div[1]/div/p/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"cart_navigation\"]/button")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"center_column\"]/p/a")).click();
		
		
}
}

//