package assignments.selenium.week2.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {

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

		driver.findElement(By.xpath("(//input[@name= 'firstName'])[3]")).sendKeys("Gnana");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(3000);
		
	    driver.findElement(By.xpath("//div[@class = 'x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		String pageTitle = driver.getTitle();
		
	    if(pageTitle.equals("View Lead | opentaps CRM")) {
	    	System.out.println("In View Leads page");	    	
	    }
		
	    else {
	    	System.out.println("In wrong page");
	    }
	    
	    driver.findElement(By.xpath("//a[text()= 'Edit']")).click();
	    
	    WebElement companyName = driver.findElement(By.id("updateLeadForm_companyName"));
	    companyName.clear();
	    companyName.sendKeys("Microsoft");
	    
	    driver.findElement(By.name("submitButton")).click();
	    
	    String companyName1= driver.findElement(By.id("viewLead_companyName_sp")).getText();

	    
	    if(companyName1.contains("Microsoft")) {
	    	System.out.println("The changed name appears");
	    }
	    else {
	    	
	    System.out.println("The changed name didn't appear");
	    }
	    
		driver.close();
	          
	}

}
