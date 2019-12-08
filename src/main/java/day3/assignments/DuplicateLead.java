package day3.assignments;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DuplicateLead {
	public static void main(String[] args) throws InterruptedException
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
				mailid.sendKeys("DemoLeadB@DemoLeadB.com");
				driver.findElementByXPath("//button[text()='Find Leads']").click();
				Thread.sleep(2000);
//				System.out.println();
				WebElement text1 = driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a");
				String capturedtext= text1.getText();
				System.out.println(capturedtext);
				Thread.sleep(2000);
				text1.click();
				driver.findElementByLinkText("Duplicate Lead").click();
				System.out.println(driver.getTitle());
				driver.findElementById("createLeadForm_companyName").sendKeys("Abdc");
						driver.findElementByClassName("smallSubmit").click();
				Thread.sleep(2000);
				WebElement text2= driver.findElementById("viewLead_firstName_sp");
				String leadname= text2.getText();
				System.out.println(leadname);
				if(capturedtext.equals(leadname))
				{
					System.out.println("same");
				}
				else
					System.out.println("not same");
				driver.close();					
	}

}
