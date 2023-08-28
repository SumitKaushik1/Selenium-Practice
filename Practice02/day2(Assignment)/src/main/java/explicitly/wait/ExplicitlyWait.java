package explicitly.wait;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebElement;


public class ExplicitlyWait {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","J:\\cdac pune\\10.software methodolgy\\13.SDM TEST\\day2\\day2..(Asssignment)\\chromedriver.exe");
          //driver location which connects the java application to the browser
		WebDriver webDriver= new ChromeDriver();
		webDriver.get("https://chercher.tech/practice/explicit-wait");
		
		WebElement webElement1=webDriver.findElement(By.id("alert"));
		 webElement1.click();
		
		WebDriverWait wait=new WebDriverWait(webDriver,Duration.ofSeconds(50));
         //here i am saying driver will have to  wait ( DriverName,maximaum time driver can wait)
		wait.until(ExpectedConditions.alertIsPresent());//here i am saying driver has to wait till alert box will be present 
	  
		System.out.println(webDriver.switchTo().alert().getText());
		webDriver.switchTo().alert().accept();
		
	     webElement1=webDriver.findElement(By.id("populate-text"));//select the button by id 
		webElement1.click(); //click on the button
		
		wait.until(ExpectedConditions.textToBe(By.id("h2"),"Selenium Webdriver"));//wait till the this sentecne appear id= h2 is teh id of selenium sytax
		 
		 webElement1=webDriver.findElement(By.id("display-other-button"));//select the button by id 
		 webElement1.click(); //click on it 
		 
		 wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("hidden")));// waitin fr the eanble button to appear 
		 
		 webDriver.findElement(By.id("enable-button")).click();// then clcikon the next button
		 
		 
		 wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("disable")));// waitin fr the disable button to appear 
	
		 webDriver.findElement(By.id("checkbox")).click(); // next button will be clicked 
	     
	}

}
