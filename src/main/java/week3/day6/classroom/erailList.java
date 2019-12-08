package week3.day6.classroom;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class erailList {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	  ChromeDriver driver = new ChromeDriver();
	  driver.manage().window().
	    //Loading a url
	    driver.get("https://erail.in/");
	    driver.manage().window().maximize();
	    WebElement elesource = driver.findElementById("txtStationFrom");
	    elesource.clear();
	    elesource.sendKeys("MAS",Keys.TAB);
	    WebElement eledestiny = driver.findElementById("txtStationTo");
	    eledestiny.clear();
	    eledestiny.sendKeys("SBC",Keys.TAB);
	    Thread.sleep(3000);
	    
	    driver.findElementById("chkSelectDateOnly").click();
	    
	    //WebElement eletable = driver.findElementByXPath("//table[@class='DataTable TrainList TrainListHeader']");
	    
	    List<WebElement> eleRows = driver.findElementsByXPath("//table[@class='DataTable TrainList TrainListHeader']//td[2]");
	   	   
	    
	    List<String> trainname =new ArrayList<>();
	    int size= eleRows.size();
	    System.out.println("count from list " +size);
	    for(int i=0; i<size; i++)
	    {
	    	//System.out.println(eleRows.get(i).getText());
	    	trainname.add(eleRows.get(i).getText());
	    	
	    }
	    
	System.out.println(trainname);
	
	//create a set for train name to check duplicates
	//check of the count of list and set are same or not to check duplicates
	
	Set<String> uniqueTrainName= new HashSet<String>();
	
	//add each element in list to set
	
	for (WebElement eachTrainElement : eleRows)
	{
		String eachTrainName= eachTrainElement.getText();
		uniqueTrainName.add(eachTrainName);
	}

	System.out.println("count from set " + uniqueTrainName.size());
	 
	List<WebElement> elerow1 = driver.findElementsByXPath("//table[@class='DataTable TrainList TrainListHeader']//td[1]");
	
	List<String> trainnumber = new ArrayList<>();
	int size1= elerow1.size();
	for(int j=0; j<size1; j++)
    {
    	//System.out.println(elerow1.get(j).getText());
    	trainnumber.add(elerow1.get(j).getText());
    	
    }
	System.out.println(trainnumber);
	
	//
	
	
}
}
