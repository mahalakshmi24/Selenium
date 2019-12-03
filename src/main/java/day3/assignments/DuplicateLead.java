package day3.assignments;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DuplicateLead {
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
				driver.findElementByLinkText("Email").click();
				WebElement mailid = driver.findElementByName("emailAddress");
				mailid.sendKeys("sthesiva88@gmail.com");
				driver.findElementByLinkText("Find Leads").click();
				
				WebElement text1 = driver.findElementByLinkText("Sam");
				String capturedtext= text1.getText();
				System.out.println(capturedtext);
				text1.click();
				driver.findElementByLinkText("Duplicate Lead").click();
				System.out.println(driver.getTitle());
				driver.findElementByClassName("smallSubmit").click();
				
				WebElement text2= driver.findElementById("viewLead_firstName_sp");
				String leadname= text2.getText();
				System.out.println(leadname);
				if(capturedtext.equals(leadname))
				{
					System.out.println("same");
				}
				driver.close();					
	}

}
