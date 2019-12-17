package leaftap.programs;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditLead {
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\264916\\Eclipse_projects\\Testing\\drivers\\chromedriver.exe");

				
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
				
				WebElement nameInput = driver.findElementByXPath("(//input[@name='firstName'])[3]");
				
				nameInput.sendKeys("Anitha");
				
				driver.findElementByXPath("(//button[@class='x-btn-text'])[7]").click();
				
				Thread.sleep(2000);
				
				driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a").click();
				
				System.out.println(driver.getTitle());
				
				driver.findElementByXPath("//a[text()='Edit']").click();
				
				WebElement companyName = driver.findElementByXPath("(//input[@name='companyName'])[2]");
				companyName.clear();
				
				companyName.sendKeys("CTS");
				
				
				driver.findElementByXPath("//input[@value='Update']").click();
				
				Thread.sleep(2000);

				String newcomp= "CTS";
				
				String editedComp = driver.findElementById("viewLead_companyName_sp").getText();
				
				if(editedComp.contains(newcomp)) {
					System.out.println("Company name edited successfully "+editedComp);
				}
				
//				driver.close();
 
}
}
