package maxofthreenumbers.max;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;

public class MaxOfThreeNumbers {

	public static void main(String[] args) {
		//to set the driver means driver function to connect this java application to  the  on the google c h r o o m e application
	  System.setProperty("webdriver.chrome.driver","J:\\cdac pune\\10.software methodolgy\\13.SDM TEST\\day2\\day2..(Asssignment)\\chromedriver.exe");
	  WebDriver webDriver=new ChromeDriver();//chrome driver is the class derived from the web driver interface;
	  webDriver.get("J:\\cdac pune\\10.software methodolgy\\13.SDM TEST\\day2\\day2..(Asssignment)\\maxof3numbers.html");
	//webDriver.get() to open any page 
	
	  WebElement webElement1=webDriver.findElement(By.id("num1"));
	  webElement1.sendKeys("1");

	  WebElement webElement2=webDriver.findElement(By.id("num2"));
	  webElement2.sendKeys("2");
	  WebElement webElement3=webDriver.findElement(By.id("num3"));
	  webElement3.sendKeys("3");
	  
	  WebElement webElement4=webDriver.findElement(By.cssSelector("button.btn"));//<tagname>.<class part ie if class= numbers_no so you can write only num also >
	  webElement4.click();
	
	}

}
