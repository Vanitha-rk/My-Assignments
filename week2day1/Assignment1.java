package week2day1;


import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.managers.ChromeDriverManager;

public class Assignment1 {

	public static void main(String[] args) {
		ChromeDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.findElement(By.id("username")).sendKeys("demosalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Vanitha");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Rk");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Vanitha");
		driver.findElement(By.name("departmentName")).sendKeys("Software Testing");
		driver.findElement(By.name("description")).sendKeys("Testing the TestLeaf Automation Platform");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("vanithark2704@gmail.com");
		driver.findElement(By.className("smallSubmit")).click();
		String title = driver.getTitle();
		System.out.println(title);
}
}