package leaftap.programs;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class CreateLead {

	public static void main(String[] args) throws InterruptedException {
		
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
		driver.findElementById("createLeadForm_companyName").sendKeys("Cognizant");

		// Enter First Name
		
		driver.findElementById("createLeadForm_firstName").sendKeys("MahaLakshmi");
		// Enter Last Name
		driver.findElementById("createLeadForm_lastName").sendKeys("Jagadeesan");
		//enter optional firsstname
		driver.findElementById("createLeadForm_firstNameLocal").sendKeys("Maha");
		//enter optional lastname
		driver.findElementById("createLeadForm_lastNameLocal").sendKeys("lakshmi");
		//enter salutation
		
		driver.findElementById("createLeadForm_personalTitle").sendKeys("Mrs");
			

		// Select 'Source' as 'Other' (Handling DropDown)
		WebElement source = driver.findElementById("createLeadForm_dataSourceId");
		Select sourcedd = new Select(source);
		sourcedd.selectByVisibleText("Other");
		
		// enter title
		driver.findElementById("createLeadForm_generalProfTitle").sendKeys("title");
		
		//enter annual revenue
		driver.findElementById("createLeadForm_annualRevenue").sendKeys("1.75$");
		
		
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
		
		//enter SIC code		
		driver.findElementById("createLeadForm_sicCode").sendKeys("620008");
		
		//enter description
		driver.findElementById("createLeadForm_description").sendKeys("asjkdhisahdoajs");
		
		//important note
		driver.findElementById("createLeadForm_importantNote").sendKeys("important note");
		
		//number of employyes
		driver.findElementById("createLeadForm_numberEmployees").sendKeys("500");
		
		//enter department
		driver.findElementById("createLeadForm_departmentName").sendKeys("health care");
		
		//ticker symbol
		driver.findElementById("createLeadForm_tickerSymbol").sendKeys("keys");
		
		//enter country code
		driver.findElementById("createLeadForm_primaryPhoneCountryCode").clear();
		driver.findElementById("createLeadForm_primaryPhoneCountryCode").sendKeys("10");	
		
		//enter area code
		driver.findElementById("createLeadForm_primaryPhoneAreaCode").sendKeys("001");
		
		//enter extension
		driver.findElementById("createLeadForm_primaryPhoneExtension").sendKeys("123123123");
		
		
		//enter eemail id
		driver.findElementById("createLeadForm_primaryEmail").sendKeys("mahalakshmi.2424@gmail.com");
		
		//enter phonenumber
		driver.findElementById("createLeadForm_primaryPhoneNumber").sendKeys("123456789");
		
		//enter person to ask
		driver.findElementById("createLeadForm_primaryPhoneAskForName").sendKeys("Aathavan");
		
		//enter web url
		driver.findElementById("createLeadForm_primaryWebUrl").sendKeys("www.google.com");
		
		//enter to name		
		driver.findElementById("createLeadForm_generalToName").sendKeys("MahalakshmiJagadeesan");
		
		//addressline1
		driver.findElementById("createLeadForm_generalAddress1").sendKeys("JaffershaStreet");
		
		//addresssline2
		driver.findElementById("createLeadForm_generalAddress2").sendKeys("Diamondbazaar");
		
		//to select country
				WebElement country = driver.findElementById("createLeadForm_generalCountryGeoId");
				Select countrydd = new Select(country);
				Thread.sleep(2000);
				countrydd.selectByValue("IND");
				Thread.sleep(2000);

				
		//to select state
				Thread.sleep(2000);

				WebElement state = driver.findElementById("createLeadForm_generalStateProvinceGeoId");
				Select statedd = new Select(state);
				statedd.selectByVisibleText("TAMILNADU");
		
		//city
		driver.findElementById("createLeadForm_generalCity").sendKeys("Trichy");
		
		
		
		//postal code
		driver.findElementById("createLeadForm_generalPostalCode").sendKeys("620008");
		
		//postal code extenstion
		driver.findElementById("createLeadForm_generalPostalCodeExt").sendKeys("0431");
		
		//create lead button click
		
		driver.findElementByXPath("//input[@value='Create Lead']").click();
		
		//verify the firstname
		
		String leadname = driver.findElementById("viewLead_firstName_sp").getText();
		
		if(leadname.equals("MahaLakshmi"))
		{
			System.out.println("Lead created successfully");
		}
		
		Thread.sleep(1000);
		
		driver.close();
	}

}
