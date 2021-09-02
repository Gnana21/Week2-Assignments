package assignments.selenium.week2.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SalesForce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/?d=70130000000Enyk");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.name("UserFirstName")).sendKeys("Gnana");	
		driver.findElement(By.name("UserLastName")).sendKeys("Prasuna");
		driver.findElement(By.name("UserEmail")).sendKeys("test@gamil.com");
		
		WebElement jobTitle = driver.findElement(By.name("UserTitle"));
        Select jobTitle1 = new Select(jobTitle);
        jobTitle1.selectByIndex(4);
        
        driver.findElement(By.name("CompanyName")).sendKeys("Cognizant");
        
        WebElement employees = driver.findElement(By.name("CompanyEmployees"));	
        Select employees1 = new Select(employees);
        employees1.selectByValue("950");
        
        driver.findElement(By.name("UserPhone")).sendKeys("+91 9949834907");
        driver.findElement(By.className("checkbox-ui")).click();
        driver.close();
        
        
        
     
	}

}
