package assignments.selenium.week2.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/login");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
	    driver.findElement(By.id("username")).sendKeys("demosalesmanager");
	    driver.findElement(By.id("password")).sendKeys("crmsfa");
	    driver.findElement(By.className("decorativeSubmit")).click();
	    
	    driver.findElement(By.id("label")).click();
	    driver.findElement(By.linkText("Contacts")).click();
	    driver.findElement(By.linkText("Create Contact")).click();
	    //Create Contact
	    driver.findElement(By.id("firstNameField")).sendKeys("Gnana");
	    driver.findElement(By.id("lastNameField")).sendKeys("Prasuna");
	    driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("Gnana");
	    driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("Prasuna");
	    
	    driver.findElement(By.name("departmentName")).sendKeys("Finance");
	    driver.findElement(By.id("createContactForm_description")).sendKeys("Create Contact");
	    driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("gnanaprasuna@gmail.com");
	   
	    WebElement state = driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
	    Select state1 = new Select(state);
	    state1.selectByVisibleText("New York");
	    
	    driver.findElement(By.name("submitButton")).click();
	    
	    driver.findElement(By.linkText("Edit")).click();
	   
	    driver.findElement(By.id("updateContactForm_description")).clear();
	    driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("Important Note");
	    
	    driver.findElement(By.xpath("//textarea[@id = 'updateContactForm_importantNote']/following::Input")).click();
	    
	    System.out.println("Title of Resulting Page is " + driver.getTitle());
	    	
		driver.close();
	}

}
