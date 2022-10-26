package week4day1;

import java.time.Duration;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MergeContact {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		
		//* 1. Launch URL "http://leaftaps.com/opentaps/control/login"
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		//* 2. Enter UserName and Password Using Id Locator
		driver.findElement(By.id("username")).sendKeys("demosalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		//* 3. Click on Login Button using Class Locator
		driver.findElement(By.className("decorativeSubmit")).click();
		
		//* 4. Click on CRM/SFA Link
		driver.findElement(By.linkText("CRM/SFA")).click();	
		
		//* 5. Click on contacts Button
		driver.findElement(By.linkText("Contacts")).click();
		
		//* 6. Click on Merge Contacts using Xpath Locator
		driver.findElement(By.xpath("(//ul[@class='shortcuts']//a)[4]")).click();
		
		//* 7. Click on Widget of From Contact
		driver.findElement(By.xpath("//img[@alt='Lookup']")).click();
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> windows=new LinkedList<String>(windowHandles);
		driver.switchTo().window(windows.get(1));
		Thread.sleep(3000);
		
		//* 8. Click on First Resulting Contact
		driver.findElement(By.xpath("(//a[@class='linktext'])[1]")).click();
		
		//* 9. Click on Widget of To Contact
		driver.switchTo().window(windows.get(0));
		driver.findElement(By.xpath("(//img[@alt='Lookup'])[2]")).click();
		Set<String> windowHandles1 = driver.getWindowHandles();
		List<String> windows1=new LinkedList<String>(windowHandles1);
		driver.switchTo().window(windows1.get(1));
		Thread.sleep(3000);
		
		//* 10. Click on Second Resulting Contact
		driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a)[2]")).click();
		driver.switchTo().window(windows1.get(0));
		
		//* 11. Click on Merge button using Xpath Locator
		driver.findElement(By.xpath("(//a[text()='Merge'])")).click();
		
		//* 12. Accept the Alert
		Alert alert=driver.switchTo().alert();
		alert.accept();
		
		//* 13. Verify the title of the page
		String title = driver.getTitle();
		System.out.println(title);
		driver.close();
		
	}

}
