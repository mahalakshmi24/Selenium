package day3.classroom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateLeadWithSelect {

	public static void main(String[] args) {

		// Set the property for ChromeDriver
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");

		// Initiate the ChromeBroswer
		ChromeDriver driver= new ChromeDriver();
		// Maximize the browser
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		// Enter the UserName
		WebElement username = driver.findElementById("username");
		username.sendKeys("DemoSalesManager");
		// Enter the Password
		driver.findElementById("password").sendKeys("crmsfa");
		// Click on Login Button
		driver.findElementByClassName("decorativeSubmit").click();
		// Click on crm/sfa button
		driver.findElementByLinkText("CRM/SFA").click();
		// Click on Leads
		driver.findElementByLinkText("Leads").click();
		// Click on Create Lead button
		driver.findElementByLinkText("Create Lead").click();
		// Enter Company Name
		driver.findElementById("createLeadForm_companyName").sendKeys("ABCDwithSelect");

		// Enter First Name
		driver.findElementById("createLeadForm_firstName").sendKeys("MahaLakshmi");
		// Enter Last Name
		driver.findElementById("createLeadForm_lastName").sendKeys("Jagadeesan");
		// Click on Create Lead (Submit) button
//		

		// Select 'Source' as 'Other' (Handling DropDown)
		WebElement source = driver.findElementById("createLeadForm_dataSourceId");
		Select sourcedd = new Select(source);
		sourcedd.selectByVisibleText("Other");
		//selecting market campaign
		Select marketdd= new Select(driver.findElementById("createLeadForm_marketingCampaignId"));
		marketdd.selectByValue("CATRQ_ROADNTRACK");
		// Select 'Preferred Currency' as 'INR'
		Select currencydd= new Select(driver.findElementById("createLeadForm_currencyUomId"));
		currencydd.selectByValue("INR");
		//to select industry
		WebElement industry = driver.findElementById("createLeadForm_industryEnumId");
		Select industrydd = new Select(industry);
		industrydd.selectByIndex(7);
		//to select ownership
		WebElement owner = driver.findElementById("createLeadForm_ownershipEnumId");
		Select ownerdd = new Select(owner);
		ownerdd.selectByIndex(4);
		//to select country
		WebElement country = driver.findElementById("createLeadForm_generalCountryGeoId");
		Select countrydd = new Select(country);
		countrydd.selectByValue("USA");
		//to select state
		WebElement state = driver.findElementById("createLeadForm_generalStateProvinceGeoId");
		Select statedd = new Select(state);
		statedd.selectByVisibleText("Florida");
		

		// Click on Create Lead (Submit) button
		//driver.findElementByClassName("smallSubmit").click();
		// Verify the Lead is created by checking the Company or First Name

	}

}
