package store.movie;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class OpeningStoreMovie {

	public static void main(String[] args) {
	  
	    List<String> m1=new ArrayList<>();
	    List<String> m2=new ArrayList<>();
	    List<String> m3=new ArrayList<>();
	    List<String> m4=new ArrayList<>();
	   
	    List<Movie> m5=new ArrayList<>();
	    System.setProperty("webdriver.chrome.driver","J:\\cdac pune\\10.software methodolgy\\13.SDM TEST\\day2\\day2..(Asssignment)\\chromedriver.exe");
        //first you have to start the driver application of chrome then driver starts at background which connects this java application to the chrome browser
	   WebDriver chr=new ChromeDriver();   
       chr.get("https://www.imdb.com/search/title/?release_date=2021&sort=num_votes,desc&page=1");		
	   List<WebElement> webElements1=chr.findElements(By.cssSelector("h3.lister-item-header a"));
		   webElements1.forEach( (n) -> { System.out.println( n.getText());m1.add(n.getText()); } );
	   // webElements1.forEach( (n) -> { a.add(n.getText()); } );
	   List<WebElement>webElements2=chr.findElements(By.cssSelector("h3.lister-item-header span.lister-item-year"));
	   webElements2.forEach( (n) -> { System.out.println( n.getText()); m2.add(n.getText());} );
       
	   List<WebElement>webElements3=chr.findElements(By.cssSelector("div.lister-item-content div.ratings-bar div.inline-block.ratings-imdb-rating strong"));
	   webElements3.forEach( (n) -> { System.out.println( n.getText());m3.add(n.getText()); } );
	   
	   List<WebElement>webElements4=chr.findElements(By.name("nv"));
	   webElements4.forEach( (n) -> { String s=n.getText(); if(s.charAt(0)!='$') { System.out.println( n.getText());m4.add(n.getText());} } );
	    
	   for(int i=0; i<m1.size();i++) {
			/*
			 * // Movie m=new Movie(); m.setMovieName(m1.get(i)); m.setDate(m2.get(i));
			 * m.setRatings(m3.get(i)); m.setVotes(m4.get(i));
			 */
	       m5.add(new Movie(m1.get(i),m2.get(i),m3.get(i),m4.get(i)));
	   }
      
	   //m5.forEach((n)->{System.out.println(n);});
	   m5.forEach((n)->{System.out.println(n.getMovieName()+","+n.getDate()+","+n.getRatings()+","+n.getVotes());});
	   System.out.println();
         
		
		
	}

}
