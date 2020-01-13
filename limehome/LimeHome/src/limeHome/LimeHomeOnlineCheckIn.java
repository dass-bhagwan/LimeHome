package limeHome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LimeHomeOnlineCheckIn {

	public static void main(String[] args) throws InterruptedException {

		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\veer\\Desktop\\Automation testing\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://limehome-qa-task.herokuapp.com/");
		
		driver.manage().window().maximize();
		
		System.out.print(driver.getTitle());
 
		
		
		driver.findElement(By.xpath("//*[@id=\"mat-input-0\"]")).sendKeys("john");
		
		driver.findElement(By.xpath("//*[@id=\"mat-input-1\"]")).sendKeys("jo12345hn");
		
		driver.findElement(By.xpath("//html//body//app-root//div/div//div//app-booking-reference//div//div[1]//mat-card//mat-card-content//form//div[1]//div[3]//button//span")).click();
		Thread.sleep(2000);
		
		
	}

}
