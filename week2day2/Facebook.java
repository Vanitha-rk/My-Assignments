package week2day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.xpath("//form/div[5]/a")).click();
		driver.findElement(By.name("firstname")).sendKeys("Vanitha");
		driver.findElement(By.name("lastname")).sendKeys("Rk");
		WebElement Mobileno = driver.findElement(By.xpath("//div[text()='Mobile number or email address']/following-sibling::input"));
		Mobileno.sendKeys("9876543210");
		WebElement Password = driver.findElement(By.xpath("//div[text()='New password']/following-sibling::input"));
		Password.sendKeys("Facebook");
		WebElement day = driver.findElement(By.id("day"));
		Select obj=new Select(day);
		obj.selectByIndex(26);
		WebElement month = driver.findElement(By.id("month"));
		Select object=new Select(month);
		object.selectByValue("4");
		WebElement year = driver.findElement(By.name("birthday_year"));
		Select op=new Select(year);
		op.selectByVisibleText("1997");
		driver.findElement(By.xpath("//label[text()='Female']")).click();
	}

}
