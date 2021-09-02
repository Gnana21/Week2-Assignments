package assignments.selenium.week2.day2.leafground;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafgroundRadio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();

		// Play with Radio Buttons

		driver.get("http://leafground.com/pages/radio.html");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//div[@id ='first']//input")).click();

		WebElement radioButton1 = driver.findElement(By.xpath("(//label[contains(text(),'Find default selected radio button')]/following::input)[1]"));
		
		WebElement radioButton2 = driver.findElement(By.xpath("(//label[contains(text(),'Find default selected radio button')]/following::input)[2]"));

	      if(radioButton1.isSelected()) {
	    	 System.out.println("Button1 selected : "+ radioButton1.isSelected());   	 
	      }
	      else if(radioButton2.isSelected())
	      {
	    	  System.out.println("Button2 selected : " +radioButton2.isSelected());
	      }
		WebElement ageGroup = driver.findElement(By.xpath("(//label[contains(text(),'Select your age group')]/following::input)[2]"));

		if (!ageGroup.isSelected()) {

			ageGroup.click();
		} else {
			System.out.println("It is alreday selected");
		}
	}
}
