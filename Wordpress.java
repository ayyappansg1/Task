package org.word;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Wordpress {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.wpjobboard.net/wp-admin/admin.php?page=wpjb-application");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("wp-submit")).click();
		//3 stars selected
		driver.findElement(By.xpath(""
				+ "((//a[text()='max']//ancestor::td"
				+ "//following-sibling::td)[5]//following-sibling::span)[5]")).click();
		System.out.println("Star clicked");
		
		String statusprint = driver.findElement(By.xpath(""
				+ "(//a[text()='Content Creator']//ancestor::td//following-sibling::td)[4]"))
				.getText();
		System.out.println("Status of Applicant "+statusprint);
		String applicantName = driver.findElement(By.xpath(""
				+ "(//a[text()='Content Creator']//ancestor::td//preceding-sibling::td)[2]"))
				.getText();
		System.out.println("Applicant Name is "+applicantName);
		
		//List<WebElement> totaltable = driver.findElements(By.xpath(""
		//		+ "(//a[text()='max']//ancestor::td//ancestor::*)[10]"));
		/*
		for (WebElement webElement : totaltable) {
			sysou
		}
		*/
		
		
	}
	
	
	
}
