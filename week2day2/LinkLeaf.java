package week2day2;



import java.time.Duration;
import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LinkLeaf {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.leafground.com/link.xhtml");
		
		//Take me to dashboard
		WebElement result1 = driver.findElement(By.xpath("//div[@class='col-12']/a"));
		result1.click();
		Thread.sleep(1000);
		driver.get("https://www.leafground.com/link.xhtml");

		//Find my destination
		WebElement url = driver.findElement(By.xpath("//a[text()='Find the URL without clicking me.']"));
		System.out.println(url.getAttribute("href"));	
		
		//Am I broken link?
		WebElement broken = driver.findElement(By.xpath("//a[text()='Broken?']"));
	    broken.click();
	    if((driver.getTitle()).contains("404"));
	    {
	    	System.out.println("Broken URL");
	    }
	    
	    //Duplicate Link
	    driver.get("https://www.leafground.com/link.xhtml");
         WebElement result2 = driver.findElement(By.xpath("(//a[text()='Go to Dashboard'])[2]"));
         result2.click();
         if((driver.getTitle()).contains("Dashboard")) {
        	System.out.println("Duplicate link"); 
         }

         driver.get("https://www.leafground.com/link.xhtml");
		//Count Links
	    List<WebElement> allURLs = driver.findElements(By.tagName("a"));
	    int allurl=allURLs.size();
	    System.out.println("Total links on the Wb Page: " + allurl);
		
	    //Count Layout Links
	    List<WebElement> value = driver.findElements(By.xpath("//div[@class='card']//h5[text()='Count Layout Links']"));
	    int size = value.size();
	    System.out.println("Total links layout links: " +size );
	}

}
