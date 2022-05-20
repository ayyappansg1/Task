package org.word;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Flipkart {
	public static WebDriver driver;
	
		@BeforeTest
		public void launch() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		}
		@Test(priority=0)
		public void flipkartAbove50000() {
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		driver.findElement(By.name("q")).sendKeys("i phone 13\n");}
		/*driver.findElement(By.xpath(""
				+ "((//select[@class='_2YxCDZ']//following-sibling::option))[10]")).click();
		}*/
		@Test(priority=1)
		public void amazon() {
			driver.get("https://www.amazon.in/");
			
			driver.findElement(By.id("twotabsearchtextbox")).sendKeys("i phone 13\n");
			driver.findElement(By.id("low-price")).sendKeys("50000\n");}
			/*driver.findElement(By.xpath(""
					+ "((//select[@class='_2YxCDZ']//following-sibling::option))[10]")).click();
			*/
		
	
	
	
}
