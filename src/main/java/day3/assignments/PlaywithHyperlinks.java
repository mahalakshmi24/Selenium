package day3.assignments;

import org.openqa.selenium.chrome.ChromeDriver;

public class PlaywithHyperlinks {
	
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");

				
				ChromeDriver driver= new ChromeDriver();
				
				driver.manage().window().maximize();
				driver.get("http://leafground.com/pages/Link.html#");
	}			
				


}
