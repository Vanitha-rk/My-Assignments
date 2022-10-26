package week4day1;

import java.time.Duration;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGround {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/window.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		//Click Open Multiple
		driver.findElement(By.xpath("//span[text()='Open Multiple']")).click();
		
		//Get the size of available Windows
		Set<String> windowHandles = driver.getWindowHandles();
		int size = windowHandles.size();
		System.out.println(size);
		List<String> lurl=new LinkedList<String>(windowHandles);
		
		//switch to last window 
		WebDriver window = driver.switchTo().window(lurl.get(size-1));
		
		//Get the Title of the Window
		String title = driver.getTitle();
		System.out.println(title);
		
		//Close all the windows except last window
		for(int i=0;i<size;i++) {
			String title2 = driver.switchTo().window(lurl.get(i)).getTitle();
			if(title2.equals(title)) {
				System.out.println("Closed all the windows except last window");
			}
			else
				driver.close();
		}
		
		
		
	}

}
