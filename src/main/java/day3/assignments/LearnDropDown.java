package day3.assignments;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LearnDropDown {
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");

				
				ChromeDriver driver= new ChromeDriver();
				
				driver.manage().window().maximize();
				driver.get("http://leafground.com/pages/Dropdown.html");
				WebElement source = driver.findElementById("createLeadForm_dataSourceId");
				Select sourcedd = new Select(source);
				sourcedd.selectByVisibleText("Other");
				
				
				
	}

}
