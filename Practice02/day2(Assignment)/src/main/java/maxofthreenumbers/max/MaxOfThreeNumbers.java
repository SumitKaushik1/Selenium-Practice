package maxofthreenumbers.max;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.WebElement;

public class MaxOfThreeNumbers {

	public static void main(String[] args) {
		//to set the driver means driver function to connect this java application to  the  on the google c h r o o m e application
	 // System.setProperty("webdriver.chrome.driver","J:\\cdac pune\\10.software methodolgy\\13.SDM TEST\\day2\\day2..(Asssignment)\\chromedriver.exe");
	//  WebDriver webDriver=new ChromeDriver();//chrome driver is the class derived from the web driver interface;
	 
	 // System.setProperty("webdriver.gecko.driver","J:\\cdac pune\\10.software methodolgy\\13.SDM TEST\\day2\\day2..(Asssignment)\\geckodriver.exe");
	//  WebDriver webDriver=new FirefoxDriver(); 
	 
		

	  System.setProperty("webdriver.edge.driver","J:\\cdac pune\\10.software methodolgy\\13.SDM TEST\\day2\\day2..(Asssignment)\\msedgedriver.exe");
	  WebDriver webDriver=new EdgeDriver(); 
	  
	  webDriver.get("J:\\cdac pune\\10.software methodolgy\\13.SDM TEST\\day2\\day2..(Asssignment)\\maxof3numbers.html");
	//webDriver.get() to open any page 
	//when the page is opened then
	  
	 
	  WebElement webElement1=webDriver.findElement(By.id("num1"));
	  webElement1.sendKeys("1");//to send value to the box 

	   //it means implicity wait fro the 10 seconds , it means wait for 10 seconds till 32 lien is excuted if 32 will be excuted on 10 or below then move to the next step or 39 line if it is not excuted in 10 secnonds then throw teh exception
			  webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));//here it will wait for the fixed amount of time 
			  //
		  
	
	  WebElement webElement2=webDriver.findElement(By.id("num2"));
	  webElement2.sendKeys("2");
	  
	
	  
	  
	  WebElement webElement3=webDriver.findElement(By.id("num3"));
	  webElement3.sendKeys("3");
	  
	
	  
	  
	  
	  WebElement webElement4=webDriver.findElement(By.cssSelector("button.btn"));//<tagname>.<class part ie if class= numbers_no so you can write only num also >
	  webElement4.click();//to click on the button 
	
	
	  
	}

}
