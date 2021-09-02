package assignments.selenium.week2.day2.leafground;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafgroundEdit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();

		// Work with Edit Fields

		driver.get("http://leafground.com/pages/Edit.html");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElement(By.id("email")).sendKeys("Test@gmail.com");

		WebElement appendText = driver.findElement(By.xpath("(//div[@class = 'large-6 small-12 columns'])[2]/input"));

		appendText.sendKeys("TestLeaf", Keys.TAB);

		String defaultValue = driver.findElement(By.name("username")).getAttribute("value");

		System.out.println("Default text entered is " + defaultValue);

		driver.findElement(By.xpath("(//input[@name= 'username'])[2]")).clear();

		WebElement editField = driver.findElement(By.xpath("(//div[@class='row'])[5]//input"));

		if (editField.isEnabled()) {
			System.out.println("Edit field is Enabled "+ editField.isEnabled());
		}

		else {
			System.out.println("Edit field is Disabled "+ editField.isEnabled());

		}

		
	}

}
