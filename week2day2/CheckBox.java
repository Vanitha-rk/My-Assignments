package week2day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckBox {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/checkbox.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		
		//Basic Checkbox
		driver.findElement(By.xpath("(//div[contains(@class,'ui-selectbooleancheckbox')]/div)[2]")).click();
		
		//Notification
		driver.findElement(By.xpath("(//span[@class='ui-chkbox-label']/preceding-sibling::div)[4]")).click();
		
		//Choose your favorite language(s)
		driver.findElement(By.xpath("//div[@class='ui-chkbox ui-widget']/div[2]")).click();
		driver.findElement(By.xpath("(//div[@class='ui-chkbox ui-widget']/div[2])[5]")).click();
		
		//Tri State Checkbox
		Actions actions = new Actions(driver);
		WebElement elementLocator = driver.findElement(By.xpath("//div[@id='j_idt87:ajaxTriState']//div[2]"));
		actions.doubleClick(elementLocator).perform();
		WebElement pstate2 = driver.findElement(By.xpath("//div[@class='ui-growl-message']//p[text()='State = 2']"));
		String state2 = pstate2.getText();
		if(state2.contains("2")) {
		System.out.println("Tristate checkbox value :" +state2);}
		
		Thread.sleep(3000);
		//Toggle Switch
		WebElement toggle = driver.findElement(By.xpath("//div[@class='ui-toggleswitch-slider']"));
		toggle.click();
		WebElement toggle1 = driver.findElement(By.xpath("//span[text()='Checked']"));
		if((toggle1.getText()).contains("Checked")) {
			System.out.println("Toggle switch ON");
		}
		else
			System.out.println("Toggle switch OFF");
		
		//Verify if check box is disabled
		WebElement enabled = driver.findElement(By.xpath("//div[@id='j_idt87:j_idt102']"));
		boolean enabled2 = enabled.isEnabled();
		if(enabled2==false) {
			System.out.println("The check box is Enabled");
		}
		else
			System.out.println("The check box is Disabled");
		
		//Select Multiple
		driver.findElement(By.xpath("//div[contains(@class,'ui-selectcheckboxmenu-trigger')]")).click();
		driver.findElement(By.xpath("(//label[text()='Paris'])[2]")).click();
		driver.findElement(By.xpath("(//label[text()='Rome'])[2]")).click();
		driver.findElement(By.xpath("//span[contains(@class,'ui-icon-circle-close')]")).click();
		
	}

}
