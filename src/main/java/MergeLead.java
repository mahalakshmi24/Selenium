package leaftap.programs;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MergeLead {

	public static void main(String[] args) throws InterruptedException {
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

		driver.findElementByXPath("//a[text()='Merge Leads']").click();

		driver.findElementByXPath("(//img[@src='/images/fieldlookup.gif'])[1]").click();

		Set<String> windowHandles = driver.getWindowHandles();

		List<String> winlist= new ArrayList<String>(windowHandles);

		String newwindow= winlist.get(1);

		driver.switchTo().window(newwindow);

		driver.manage().window().maximize();

		WebElement inputLead = driver.findElementByXPath("//input[@name='id']");

		inputLead.sendKeys("10020");

		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(2000);
		driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a").click();

		String primaryWindow=winlist.get(0);

		driver.switchTo().window(primaryWindow);
		Thread.sleep(2000);
		driver.findElementByXPath("(//img[@src='/images/fieldlookup.gif'])[2]").click();
		Set<String> windowHandles1 = driver.getWindowHandles();

		List<String> winlist1= new ArrayList<String>(windowHandles1);

		String newwindow1= winlist1.get(1);
		Thread.sleep(2000);

		driver.switchTo().window(newwindow1);
		Thread.sleep(2000);
		driver.manage().window().maximize();

		WebElement toLead = driver.findElementByXPath("//input[@name='id']");

		toLead.sendKeys("10021");

		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(2000);
		driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a").click();

		driver.switchTo().window(primaryWindow);	
		Thread.sleep(2000);

		driver.findElementByXPath("//a[text()='Merge']").click();

		Alert alert = driver.switchTo().alert();

		alert.accept();


		driver.findElementByLinkText("Find Leads").click();

		driver.findElementByXPath("//input[@name='id']").sendKeys("10020");

		driver.findElementByXPath("//button[text()='Find Leads']").click();

		String message ="No records to display";
		Thread.sleep(2000);
		String error = driver.findElementByXPath("//div[@class='x-paging-info']").getText();
		Thread.sleep(2000);

		if(error.contains(message))

		{
			System.out.println("lead merged successfully");
		}

		driver.close();
	}

}
