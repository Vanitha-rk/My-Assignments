package week4day1;

import java.time.Duration;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SalesForce {

	public static void main(String[] args) throws InterruptedException {

		////1.Launch the browser
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		
		//2.Load the url as " https://login.salesforce.com/ "
		driver.get("https://login.salesforce.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		//3.Enter the username
		driver.findElement(By.id("username")).sendKeys("ramkumar.ramaiah@testleaf.com");
		
		//4. Enter the password
		driver.findElement(By.id("password")).sendKeys("Password#123");
		
		//5.click on the login button
		driver.findElement(By.id("Login")).click();
		
		//6.click on the learn more option in the Mobile publisher
		driver.findElement(By.xpath("//span[text()='Learn More']")).click();
		
	    //7.Switch to the next window using Windowhandles.
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> lurl=new LinkedList<String>(windowHandles);
		driver.switchTo().window(lurl.get(1));
		Thread.sleep(3000);
		
		//8.click on the confirm button in the redirecting page
		driver.findElement(By.xpath("//button[text()='Confirm']")).click();
		
		//9.Get the title
		System.out.println(driver.getTitle());
		
		//10.Get back to the parent window
		driver.switchTo().window(lurl.get(0));
		Thread.sleep(3000);
		
		//11.close the browser
		driver.quit();
		
		
	}

}
