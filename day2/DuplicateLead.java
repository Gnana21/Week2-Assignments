package assignments.selenium.week2.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.id("label")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.linkText("Email")).click();
		
		driver.findElement(By.name("emailAddress")).sendKeys("Test@gmail.com");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		
		Thread.sleep(3000);
		
		WebElement firstResultinglead = driver.findElement(By.xpath("//div[@class= 'x-grid3-cell-inner x-grid3-col-firstName']/a"));
		
		String firstname = firstResultinglead.getText();
		firstResultinglead.click();
				
		System.out.println("Name of First Resulting lead is " + firstname);	
		
		driver.findElement(By.linkText("Duplicate Lead")).click();	
		
		String title = driver.getTitle();
		
		if (title.equals("Duplicate Lead | opentaps CRM")) {
			
			System.out.println("The name of the page is " +title);
		}
		else {
			System.out.println("The current page is not " + title);
		}
		
		driver.findElement(By.name("submitButton")).click();
		
		String duplicateLeadName = driver.findElement(By.id("viewLead_firstName_sp")).getText();
	
		if(duplicateLeadName.equals(firstname)) {
			System.out.println("Duplicate Lead created successfully");
		}
		
		else {
			System.out.println("Duplicate Lead is not created successfully");
		}
		
		driver.close();
		
	}

}
