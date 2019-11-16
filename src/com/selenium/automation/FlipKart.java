package com.selenium.automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class FlipKart
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sravani\\eclipse-workspace\\AutomationPrograms\\Drivers\\chromedriver.exe");
RemoteWebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.flipkart.com");
driver.manage().timeouts().implicitlyWait(4000, TimeUnit.SECONDS);

//WebElement us =driver.findElementByXPath("//input[@class='_2zrpKA _1dBPDZ'][@type='text']");
// by miytra
//input[@class='_2zrpKA _1dBPDZ']
//Thread.sleep(4000);
WebElement us=driver.findElementByXPath("//input[@class='_2zrpKA _1dBPDZ']");
driver.findElementByCssSelector("input._2zrpKA _1dBPDZ");
us.clear();
us.click();
us.sendKeys("nmmitrananda");
WebElement pw =driver.findElementByCssSelector("input[type=\"password\"],[class=\"_2zrpKA _1dBPDZ\"]");
pw.sendKeys("ammananna");  
driver.findElementByXPath("//button[@class='_2AkmmA _1LctnI _7UHT_c']").click();
Actions action=new Actions(driver);
Thread.sleep(4000);
WebElement electronics=driver.findElementByCssSelector("[class='1QZ6fC _3Lgyp8']");
electronics.click();
action.moveToElement(electronics).build().perform();

WebElement mobiles=driver.findElementByXPath("//a[@title='Mobiles'][text()='mobiles']");
mobiles.click();
driver.findElementByCssSelector("[class='_1Nyybr_30xef0']").click();
driver.findElementByXPath("//div[@class=\"_1vC4OE _3qQ9m1\"]//option[type()=]").click();



//driver.close();
}
	

}
