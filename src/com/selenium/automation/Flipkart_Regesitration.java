package com.selenium.automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Flipkart_Regesitration
{
	public static void main(String[] args)
	{ 
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sravani\\eclipse-workspace\\AutomationPrograms\\Drivers\\chromedriver.exe");

		RemoteWebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.navigate().to("https://www.flipkart.com");
		WebElement singup =driver.findElementByXPath("//a[text()='New to Flipkart? Create an account']");
		singup.click();
		WebElement mobile= driver.findElementByXPath("//input[@class='_2zrpKA _1dBPDZ']");
		mobile.clear();
		mobile.sendKeys("9701882276");
	    WebElement contin= driver.findElementByXPath("//span[text()='CONTINUE']");
		contin.click();
		
	    WebElement password= driver.findElementByXPath("//input[@type='password']");
	    password.clear();
	    password.sendKeys("ammananna");
		  
		WebElement login = driver.findElementByXPath("//div[@class='_2VTdOs _1_qmw3']");
		login.click();
		
		
		// This code is not forget password
		  driver.findElementByXPath(("//span[text()='CONTINUE']")).click(); WebElement
		 forget =driver.findElementByXPath("//span[text()='Forgot?']");
		  forget.click(); WebElement
		  otp=driver.findElementByXPath("//input[@type='text']");
		 otp.sendKeys("757339"); WebElement
		  pw=driver.findElementByXPath("//input[@type='password']");
		  pw.sendKeys("ammananna"); WebElement forgetlogin=driver.
		  findElementByXPath("//button[@class='_2AkmmA _1LctnI _7UHT_c']");
		  forgetlogin.click();
		 
		
		
		
	}

}
