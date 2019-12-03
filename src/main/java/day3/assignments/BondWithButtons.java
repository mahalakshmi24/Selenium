package day3.assignments;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BondWithButtons {
	
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");

				
				ChromeDriver driver= new ChromeDriver();
				
				driver.manage().window().maximize();
				driver.get("http://leafground.com/pages/Button.html");
				
				driver.findElementById("home").click();
				driver.findElementByXPath("//*[@id=\'post-153\']/div[2]/div/ul/li[2]/a/img").click();
				System.out.println(driver.findElementById("position").getLocation());
				System.out.println(driver.findElementById("color").getCssValue("background-color"));
				System.out.println(driver.findElementById("size").getSize());
				
				


}
}
