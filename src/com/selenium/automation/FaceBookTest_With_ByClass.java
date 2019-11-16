package com.selenium.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBookTest_With_ByClass {

	public static void main(String[] args) throws InterruptedException 
	{
System.setProperty("webdriver.chrome.driver","C:\\Users\\Sravani\\eclipse-workspace\\AutomationPrograms\\Drivers\\chromedriver.exe" );
 
WebDriver driver = new ChromeDriver();	
driver.manage().window().maximize();
		driver.get("http:www.facebook.com");
		String title = driver.getTitle();
		System.out.println("facebook title is:"+title);
		String windowName = driver.getWindowHandle();
		System.out.println("facebook window Name is:"+windowName);
		String url = driver.getCurrentUrl();
		System.out.println("URL of d page is:"+url);
	WebElement usn = driver.findElement(By.id("email"));
	usn.clear();
	usn.sendKeys("shravaniReddy.M");
	WebElement next = driver.findElement(By.id("identifiernext"));
	next.clear();
	Thread.sleep(3000);
	WebElement pwd = driver.findElement(By.name("password"));
	pwd.clear();
	pwd.sendKeys("shravani");
	WebElement nextpwd =driver.findElement(By.id("passwordnext"));
	nextpwd.click();
		driver.close();	
		
	
		}

}
