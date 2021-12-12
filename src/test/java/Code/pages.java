package Code;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class pages {
	WebDriver driver;
	
	@SuppressWarnings("deprecation")
	public void func1() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();


        driver.get("https://www.amazon.in/");

        driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("laptop");
        
        driver.findElement(By.xpath("//input[@value='Go']")).click();

        Thread.sleep(3000);
        
	}
	
	public boolean verifySearch() {
		
		return driver.findElement(By.xpath("//div/span[contains(text(),'results for')]")).isDisplayed();
		
		
	}
	
	public void close() {		
		driver.close();		
	}

}
