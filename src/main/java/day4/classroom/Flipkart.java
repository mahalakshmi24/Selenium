package day4.classroom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Flipkart {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		//Loading a url
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.findElementByXPath("//button[@class='_2AkmmA _29YdH8']").click();
		Actions builder = new Actions(driver);
		WebElement Ele = driver.findElementByXPath("//span[text()='Electronics']");
		WebElement apple = driver.findElementByXPath("//a[text()='Apple']");
		builder.moveToElement(Ele);
		Thread.sleep(2000);
		builder.click(apple).perform();

		
		//

	}

}
