package com.selenium.automation;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;


public class GmailTest_Without_Byclass
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sravani\\eclipse-workspace\\AutomationPrograms\\Drivers\\chromedriver.exe");

RemoteWebDriver driver=new ChromeDriver();

driver.manage().window().maximize();

driver.get("http:www.gmail.com");

 WebElement un1=driver.findElementById("identifierId");
 
 un1.clear();
 
 un1.sendKeys("shravanimandhadi1996@gmail.com");
 
WebElement next = driver.findElementById("identifierNext");

next.click();


WebElement pswd = driver.findElementByName("password");
pswd.clear();
pswd.sendKeys("shravani");
WebElement nextpswd = driver.findElementById("passwordNext");
nextpswd.click();
driver.close();


//driver.quit();
	}
}