package week2day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");   
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("(//input[@class='inputLogin'])[1]")).sendKeys("demosalesManager");
		driver.findElement(By.xpath("(//input[@class='inputLogin'])[2]")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		driver.findElement(By.xpath("//div[@id='label']/a")).click();
		driver.findElement(By.xpath("(//div[@class='x-panel-tc']//a)[2]")).click();
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		WebElement Firstname = driver.findElement(By.xpath("(//label[text()='First name:']/following::input[@name='firstName'])[3]"));
		Firstname.sendKeys("Vanitha");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(3000);
        driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]")).click();
		System.out.println("The Title is " +driver.getTitle());
		driver.findElement(By.xpath("//a[text()='Edit']")).click();
		WebElement changeco = driver.findElement(By.id("updateLeadForm_companyName"));
		changeco.clear();
		changeco.sendKeys("CTS");
		driver.findElement(By.name("submitButton")).click();
		String Text = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		if(Text.contains("CTS")) {
		System.out.println("It displayed the changed company name");
		}
		driver.close();
		
	}

}
