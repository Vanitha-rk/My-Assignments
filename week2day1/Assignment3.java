package week2day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.managers.ChromeDriverManager;

public class Assignment3 {

	public static void main(String[] args) {
	ChromeDriverManager.chromedriver().setup();
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://leaftaps.com/opentaps/control/login");
	driver.findElement(By.id("username")).sendKeys("demosalesManager");
	driver.findElement(By.id("password")).sendKeys("crmsfa");
	driver.findElement(By.className("decorativeSubmit")).click();
	driver.findElement(By.linkText("CRM/SFA")).click();
	driver.findElement(By.linkText("Contacts")).click();
	driver.findElement(By.linkText("Create Contact")).click();
	driver.findElement(By.id("firstNameField")).sendKeys("Vanitha");
	driver.findElement(By.id("lastNameField")).sendKeys("Rk");
	driver.findElement(By.name("submitButton")).click();
	String Firstname = driver.findElement(By.id("viewContact_firstName_sp")).getText();
	System.out.println("First name= " +Firstname);
	String title2 = driver.getTitle();
	System.out.println(title2);
	driver.close();
	}

}
