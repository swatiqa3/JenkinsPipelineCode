package Code;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class pages {
	public static WebDriver driver;
	
	public void launch() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
	
	@SuppressWarnings("deprecation")
	public void func1() throws InterruptedException {
		
        driver.get("https://www.amazon.in/");

        driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("laptop");
        
        driver.findElement(By.xpath("//input[@value='Go']")).click();

        Thread.sleep(3000);
        
	}
	
	public void clickFirstProduct() {
		 driver.findElement(By.xpath("//h2/a[1]")).click();;
	}
	
	public boolean verifyClickProduct() {
		return driver.findElement(By.xpath("//a[contains(text(),'Back to results')]")).isDisplayed();
	}
	
	public boolean verifySearch() {
		
		return driver.findElement(By.xpath("//div/span[contains(text(),'results for')]")).isDisplayed();
		
		
	}
	
	public void close() {		
		driver.close();		
	}

}
