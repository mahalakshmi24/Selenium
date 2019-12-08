package week2.assignments.optional;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Redbus {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		//Loading a url
		driver.get("https://www.redbus.in//");
		driver.manage().window().maximize();
		WebElement from = driver.findElementByXPath("//input[@ id='src']");
		from.clear();
		//from.sendKeys("che", Keys.TAB);
		from.sendKeys("Chennai");
		WebElement dest = driver.findElementByXPath("//input[@ id='dest']");
		dest.clear();
//		dest.sendKeys("tri",Keys.TAB);
		dest.sendKeys("Trichy");
		Thread.sleep(2000);
		WebElement onward = driver.findElementByXPath("(//table[@class='rb-monthTable first last']//tr[4]/td)[14]");
		onward.click();
		Thread.sleep(2000);
		WebElement returndate = driver.findElementByXPath("(//table[@class='rb-monthTable first last'])[2]//tr[5]/td");
		returndate.click();
		driver.findElementById("search_btn").click();
		driver.findElementById("dtAfter 6 pm").click();
		driver.findElementById("bt_AC").click();
		WebElement buses = driver.findElementByXPath("//span[@class='f-bold busFound']");
		System.out.println("number of buses " + buses.getText());
		driver.close();
		
		
}
}