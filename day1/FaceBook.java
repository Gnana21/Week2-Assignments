package assignments.selenium.week2.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FaceBook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://en-gb.facebook.com");
		
	    driver.manage().window().maximize();
		
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	                            
	    driver.findElement(By.linkText("Create New Account")).click();
	    driver.findElement(By.name("firstname")).sendKeys("Gnana");
	    driver.findElement(By.name("lastname")).sendKeys("Prasuna");
	    driver.findElement(By.name("reg_email__")).sendKeys("+91 9949961310");
	    driver.findElement(By.id("password_step_input")).sendKeys("newpassword");
        
	    WebElement birthdayDay = driver.findElement(By.name("birthday_day")); 
        Select birthdayDay1 = new Select(birthdayDay);
        birthdayDay1.selectByIndex(7);
        
        WebElement birthdayMonth = driver.findElement(By.name("birthday_month"));
        Select birthdayMonth1 = new Select(birthdayMonth);
        birthdayMonth1.selectByValue("6");
        
        WebElement birthdayYear= driver.findElement(By.name("birthday_year"));
		Select birthdayYear1 = new Select(birthdayYear);
		birthdayYear1.selectByVisibleText("1994");
		
		driver.findElement(By.name("sex")).click();
		
	}

}
