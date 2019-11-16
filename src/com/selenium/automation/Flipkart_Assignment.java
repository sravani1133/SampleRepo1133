package com.selenium.automation;

import java.awt.Desktop.Action;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Flipkart_Assignment
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sravani\\eclipse-workspace\\AutomationPrograms\\Drivers\\chromedriver.exe");

		RemoteWebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
		Options options = driver.manage();
		options.deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.navigate().to("https://www.flipkart.com");
		WebElement usName= driver.findElementByXPath("//input[@class='_2zrpKA _1dBPDZ']");
		usName.clear();
		usName.sendKeys("9701882276");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebElement password= driver.findElementByXPath("//input[@type='password']");
		password.sendKeys("ammananna");		
		driver.findElementByXPath("//button[@class='_2AkmmA _1LctnI _7UHT_c']").click();
		
		// move to element
		Actions action = new Actions(driver);
		
		WebElement elec= driver.findElementByXPath("//span[@class='_1QZ6fC _3Lgyp8']");
		//WebElement elec=driver.findElementByXPath("//li[@class='Wbt_B2 _3mmoXN']");
		action.moveToElement(elec).build().perform();
		
		
		
		
	driver.close();
	
	}

}
