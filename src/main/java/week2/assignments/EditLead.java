package week2.assignments;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditLead {
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");

				
				ChromeDriver driver= new ChromeDriver();
				
				driver.manage().window().maximize();
				driver.get("http://leaftaps.com/opentaps/control/main");
				
				WebElement username = driver.findElementById("username");
				username.sendKeys("DemoSalesManager");
				
				driver.findElementById("password").sendKeys("crmsfa");
				
				driver.findElementByClassName("decorativeSubmit").click();
				
				driver.findElementByLinkText("CRM/SFA").click();
				
				driver.findElementByLinkText("Leads").click();
				driver.findElementByLinkText("Find Leads").click();
	}

}
