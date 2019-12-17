package leaftap.programs;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class DeleteLead {

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
				driver.findElementById("ext-gen240__ext-gen254").click();
				WebElement countrycode = driver.findElementByXPath("//*[@id=\"ext-gen262\"]");
				countrycode.clear();
				countrycode.sendKeys("2");
				WebElement areacode = driver.findElementByXPath("//*[@id=\'ext-gen266']");
				areacode.sendKeys("10");
				WebElement phnumber = driver.findElementByXPath("//*[@id=\'ext-gen270\']");
				phnumber.sendKeys("9524242092");
				
				driver.findElementByXPath("(//button[@class='x-btn-text'])[7]").click();
				
				Thread.sleep(2000);
				WebElement table = driver.findElementByXPath("//table[@class='x-grid3-row-table']");
				List<WebElement> row = table.findElements(By.tagName("tr"));
				List<WebElement> col = row.get(0).findElements(By.tagName("td"));
				String capturedtext= col.get(0).getText();
				
				
				//WebElement text1 = driver.findElementByXPath("//a[@href='/crmsfa/control/viewLead?partyId=11063\']");
				//String capturedtext= text1.getText();
				System.out.println(capturedtext);
				
				driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a").click();
				driver.findElementByClassName("subMenuButtonDangerous").click();
				driver.findElementByLinkText("Find Leads").click();
				
				WebElement leadid = driver.findElementByXPath("//input[@name='id']");
				leadid.sendKeys(capturedtext);
				
				driver.findElementByXPath("(//button[@class='x-btn-text'])[7]").click();
				
				String message ="No records to display";
				Thread.sleep(2000);
			String error = driver.findElementByXPath("//div[@class='x-paging-info']").getText();
			Thread.sleep(2000);

			if(error.contains(message))
				
			{
				System.out.println("lead deleted successfully");
			}
				
				//driver.close();					
	}
}
