package com.selenium.automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Amazon
{

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sravani\\eclipse-workspace\\AutomationPrograms\\Drivers\\chromedriver.exe");
		RemoteWebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.Amazon.com");
		
		System.out.println("Updated by Rk");
		driver.manage().timeouts().implicitlyWait(4000,	TimeUnit.SECONDS );
	WebElement	us=driver.findElementByXPath("//input[@type='email']");
	us.clear();
	us.click();
	us.sendKeys("9701882276");

                                                                                                                                                                                              
                                         }

}
