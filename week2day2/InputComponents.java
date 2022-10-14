package week2day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class InputComponents {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.leafground.com/input.xhtml;jsessionid=node0tmb2389go0xlxjvuy66xu9p668024.node0");
		
		//Type your name
		WebElement name = driver.findElement(By.xpath("//div[@class='col-12']/input"));
		name.click();
		name.sendKeys("Vanitha");
		
		//Append Country to this City.
		WebElement country = driver.findElement(By.xpath("(//div[@class='col-12']/input)[2]"));
		country.click();
		country.sendKeys("India");
		//Verify if text box is disabled
		WebElement text = driver.findElement(By.xpath("(//div[@class='col-12']/input)[3]"));
		boolean enabled = text.isEnabled();
		if(enabled == true) {
		System.out.println("The text box is enabled");}
		else
			System.out.println("The text box is disabled");
		
		//Clear the typed text.
		WebElement typec = driver.findElement(By.xpath("(//div[@class='col-12']/input)[4]"));
		typec.click();
		typec.clear();
		
		//Retrieve the typed text.
		WebElement Retrieve = driver.findElement(By.xpath("(//div[@class='col-12']/input)[5]"));
		Retrieve.click();
		Retrieve.clear();
		System.out.println("Retrieve the typed text " +Retrieve.getAttribute("Value"));
		
		//Type email and Tab. Confirm control moved to next element.
		WebElement email = driver.findElement(By.xpath("//h5[contains(text(),'Type email and Tab')]/following::div[2]/input"));
		email.sendKeys("vanithark2704@gmail.com");
		email.sendKeys(Keys.TAB);
		
		//Type about yourself
		WebElement yourself = driver.findElement(By.xpath("//div[@class='col-12']/textarea"));
		yourself.click();
		yourself.sendKeys("Hai i am vanitha");
		
		//Text Editor
		driver.findElement(By.xpath("//span[@class='ql-font ql-picker']")).click();
		driver.findElement(By.xpath("//span[@class='ql-picker-options']/span[2]")).click();
		driver.findElement(By.xpath("(//span[@class='ql-picker-label'])[1]")).click();
		driver.findElement(By.xpath("((//span[@class='ql-picker-label'])[2]/following::span[@class='ql-picker-item'])[3]")).click();
		driver.findElement(By.xpath("//span[@class='ql-formats']/button[2]")).click();
		driver.findElement(By.xpath("//span[@class='ql-cursor']")).sendKeys("Vanitha");
		
		//Just Press Enter and confirm error message*
		driver.findElement(By.xpath("//div[@class='col-12 mb-2 lg:col-8']/input")).sendKeys(Keys.ENTER);
		String text2 = driver.findElement(By.xpath("//span[text()='Age is mandatory']")).getText();
		System.out.println("Error message: " +text2);
		
		//Click and Confirm Label Position Changes
		WebElement user = driver.findElement(By.xpath("//span[@class='ui-float-label']/input"));
		user.click();
		WebElement user1 = driver.findElement(By.xpath("//input[contains(@class,'ui-state-focus')]"));
		boolean input1=user1.isDisplayed();
		if(input1) {
		System.out.println("Label position changed");
		}
		
		//Type your name and choose the third option
		driver.findElement(By.xpath("//li[@class='ui-autocomplete-input-token']/input")).sendKeys("Vanitha");
		driver.findElement(By.xpath("//button[contains(@class,'ui-autocomplete-dropdown')]")).click();
		Thread.sleep(3000);
	    driver.findElement(By.xpath("//ul[contains(@class,'ui-autocomplete-items')]//li[3]")).click();
	    
	    //Type your DOB (mm/dd/yyyy) and confirm date chosen
		WebElement dob = driver.findElement(By.xpath("//span[contains(@class,'p-datepicker ui-calendar ui-trigger-calendar')]/input"));
		dob.sendKeys("04/27/1997");
		dob.sendKeys(Keys.TAB);
		if(dob.equals(dob)) {
			System.out.println("Entered Day on Date of Birth is Matching");
			}
		else {
			System.out.println("Entered Day on Date of Birth is not Matching");
			}
		
	
		//Type number and spin to confirm value changed
		driver.findElement(By.xpath("//span[contains(@class,'ui-spinner')]/input")).sendKeys("73");
		driver.findElement(By.xpath("(//a[contains(@class,'ui-spinner-button')])[1]")).click();
		WebElement spin = driver.findElement(By.xpath("//span[contains(@class,'ui-spinner')]/input"));
       System.out.println("Changed spin value : " +spin.getAttribute("aria-valuenow"));
		
		
		//Type random number (1-100) and confirm slider moves correctly
		driver.findElement(By.xpath("//h5[text()='Type random number (1-100) and confirm slider moves correctly']/following-sibling::input")).sendKeys("7");
      WebElement slide = driver.findElement(By.xpath("//span[@style='left: 7%;']"));
      if(slide.isDisplayed()) {
        	System.out.println("slider moved");
        }
		
		
		//Click and Confirm Keyboard appears				
		driver.findElement(By.xpath("(//div[contains(@class,'ui-slider')]/following-sibling::input)[1]")).click();
		WebElement keyboard = driver.findElement(By.xpath("//input[contains(@class,'ui-state-focus')]"));
		if(keyboard.isDisplayed()) {
			System.out.println("Keyboard dispalyed");
		}
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='Close']")).click();
	
		//Custom Toolbar
		driver.findElement(By.xpath("(//button[@class='ql-italic'])[2]")).click();
		driver.findElement(By.xpath("(//span[@class='ql-font ql-picker'])[2]")).click();
		driver.findElement(By.xpath("(//span[@data-value='monospace'])[2]")).click();
		driver.findElement(By.xpath("//span[@aria-controls='ql-picker-options-6']")).click();
		driver.findElement(By.xpath("(//span[@data-value='huge'])[2]")).click();
		driver.findElement(By.xpath("(//div[@class='ql-editor ql-blank'])[2]")).sendKeys("Automation");
	
		
		
	}

}
