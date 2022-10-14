package week2day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectDropDown {


	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/select.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		
		//Which is your favorite UI Automation tool?
		WebElement tool = driver.findElement(By.className("ui-selectonemenu"));
		Select obj=new Select(tool);
		obj.selectByIndex(1);
		
		//Choose your preferred country.
		driver.findElement(By.xpath("//label[text()='Select Country']")).click();
		driver.findElement(By.xpath("//li[text()='India']")).click();
		
		Thread.sleep(3000);
		
		////Confirm Cities belongs to Country is loaded
		driver.findElement(By.xpath("(//span[contains(@class,'ui-icon-triangle-1-s')])[2]")).click();
		driver.findElement(By.xpath("//li[text()='Chennai']")).click();
		
		//Choose the Course
		driver.findElement(By.xpath("(//span[contains(@class,'ui-icon-triangle-1-s')])[3]")).click();
		driver.findElement(By.xpath("//span[@id='j_idt87:auto-complete_panel']//li[3]")).click();
		
		//Choose language randomly
		driver.findElement(By.xpath("(//span[contains(@class,'ui-icon-triangle-1-s')])[4]")).click();
		driver.findElement(By.xpath("(//li[text()='Select Language']/following-sibling::li)[2]")).click();
		
		Thread.sleep(3000);
		//Select 'Two' irrespective of the language chosen
		driver.findElement(By.xpath("(//span[contains(@class,'ui-icon-triangle-1-s')])[5]")).click();
		driver.findElement(By.xpath("(//li[text()='Select Values']/following-sibling::li)[1]")).click();
		
		
	}

}
