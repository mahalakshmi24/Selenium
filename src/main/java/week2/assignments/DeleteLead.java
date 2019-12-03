package week2.assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class DeleteLead {

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
				driver.findElementById("ext-gen240__ext-gen254").click();
				WebElement countrycode = driver.findElementByXPath("//*[@id=\"ext-gen262\"]");
				countrycode.clear();
				countrycode.sendKeys("91");
				WebElement areacode = driver.findElementByXPath("//*[@id=\'ext-gen266']");
				areacode.sendKeys("022");
				WebElement phnumber = driver.findElementByXPath("//*[@id=\'ext-gen270\']");
				phnumber.sendKeys("8736461");
				
				driver.findElementByLinkText("Find Leads").click();
				WebElement table = driver.findElementByXPath("//table[@class='x-grid3-row-table']");
				List<WebElement> row = table.findElements(By.tagName("tr"));
				List<WebElement> col = row.get(0).findElements(By.tagName("td"));
				String capturedtext= col.get(0).getText();
				
				
				//WebElement text1 = driver.findElementByXPath("//a[@href='/crmsfa/control/viewLead?partyId=11063\']");
				//String capturedtext= text1.getText();
				System.out.println(capturedtext);
				
				driver.findElementByXPath("//table[@class='x-grid3-row-table']/tbody/tr/td/div/a").click();
				driver.findElementByLinkText("Delete").click();
//				System.out.println(driver.getTitle());
//				driver.findElementByClassName("smallSubmit").click();
//				
//				WebElement text2= driver.findElementById("viewLead_firstName_sp");
//				String leadname= text2.getText();
//				System.out.println(leadname);
//				if(capturedtext.equals(leadname))
//				{
//					System.out.println("same");
//				}
				driver.findElementByLinkText("Find Leads").click();
				WebElement inputid = driver.findElementByXPath("//input[@name='id']");
				inputid.sendKeys(capturedtext);
				//driver.findElementByLinkText("Find Leads").click();
				driver.findElementByXPath("//*[@id=\"ext-gen893\"]").click();
				WebElement norecords = driver.findElementByClassName("x-paging-info");
				String verify=norecords.getText();
				if(verify.equals("No records to display"))
				{
					System.out.println(verify);
				}
				else
				{
					System.out.println("record present");
				}
				//driver.close();					
	}
}
