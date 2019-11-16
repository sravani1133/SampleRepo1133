  package com.selenium.automation;

import java.io.ObjectInputStream.GetField;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GmailTest_With_ByClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sravani\\eclipse-workspace\\AutomationPrograms\\Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		
	driver.get("https://www.gmail.com");
	
	WebElement userName =driver.findElement(By.id("identifierId"));
	
	userName.clear();
	
	userName.sendKeys("shravanimandhadi1996@gmail.com");
		
	WebElement next = driver.findElement(By.id("identifierNext"));
	
	next.click();
	
	Thread.sleep(4000);
	
	WebElement password =driver.findElement(By.name("password"));
	
	password.clear();
	
	
	password.sendKeys("gyugd");
	
	WebElement nextPassword =driver.findElement(By.id("passwordNext"));
	
	nextPassword.click();
	
	Thread.sleep(4000);
	
	
	driver.close();
		

	}

}
