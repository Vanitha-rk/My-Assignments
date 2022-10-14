package week2day2;

import java.time.Duration;
import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Button {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/button.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		//Click and Confirm title.
		WebElement title = driver.findElement(By.xpath("//div[@class='card']//span[contains(@class,'ui-button-text')]"));
		title.click();
		String title2 = driver.getTitle();
		if(title2.contains("Dashboard")) {
			System.out.println("It prints the correct title name " +title2);
		}
		driver.get("https://www.leafground.com/button.xhtml");
		
		//Confirm if the button is disabled
		WebElement text = driver.findElement(By.xpath("(//div[@class='card']/button)[2]"));
		boolean enabled = text.isEnabled();
		if(enabled == true) {
		System.out.println("The text box is enabled");}
		else
			System.out.println("The text box is disabled");
		
		//Find the position of the Submit button
		WebElement position = driver.findElement(By.xpath("//span[text()='Submit']"));
		System.out.println("Submit button position " +position.getLocation());
		
		//Find the Save button color
		WebElement color = driver.findElement(By.xpath("//span[text()='Save']//ancestor::button"));
		System.out.println("Save button colour: " +color.getCssValue("background-color"));
		
		//Find the height and width of this button
		WebElement wheight = driver.findElement(By.xpath("(//span[text()='Submit'])[2]"));
		System.out.println("Height and width of this button : " +wheight.getSize());
		
		//Mouse over and confirm the color changed
		WebElement colour = driver.findElement(By.xpath("//button[@id='j_idt88:j_idt100']"));
		String check1 = colour.getCssValue("background-color");
		System.out.println("Before place cursor : " +check1);
		
		Actions a = new Actions(driver);
		a.moveToElement(colour);
		a.perform();
		WebElement colour1 = driver.findElement(By.xpath("(//span[text()='Success'])[1]"));
		String check2 = colour1.getCssValue("background-color");
		System.out.println("After place cursor : "+check2);
		if(check1 == check2) {
			System.out.println("colour not changed in the success button");
		}
		else
			System.out.println("colour changed in the success button");
		
		//Click Image Button and Click on any hidden button
		driver.findElement(By.xpath("//span[text()='Image']")).click();
		driver.findElement(By.xpath("//div[@class='ui-overlaypanel-content']/img")).click();
		
		//How many rounded buttons are there?
		List<WebElement> round = driver.findElements(By.xpath("//h5[text()='How many rounded buttons are there?']/following::span"));
	    System.out.println("Rounded buttons : " +round.size());

}}
