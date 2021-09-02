package assignments.selenium.week2.day2.leafground;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafgroundDropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();
		
		// Learn Dropdown

		driver.get("http://leafground.com/pages/Dropdown.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		WebElement program1 = driver.findElement(By.id("dropdown1"));
		Select trainingProgram1 = new Select(program1);
		trainingProgram1.selectByIndex(2);

		WebElement program2 = driver.findElement(By.name("dropdown2"));
		Select trainingProgram2 = new Select(program2);
		trainingProgram2.selectByVisibleText("Selenium");

		WebElement program3 = driver.findElement(By.id("dropdown3"));
		Select trainingProgram3 = new Select(program3);
		trainingProgram3.selectByValue("1");

		
		List<WebElement> dropdownCount = driver.findElements(By.xpath("(//div[@class = 'example'])[4]//option"));
		int dropdownCount1 = dropdownCount.size();

		System.out.println("Number of options in the drop : " + dropdownCount1);

		driver.findElement(By.xpath("(//div[@class = 'example']/select)[5]")).sendKeys("UFT/QTP");

		//driver.findElement(By.xpath("(//div[@class = 'example']/select)[6]")).sendKeys("UFT/QTP");

		WebElement dropdown = driver.findElement(By.xpath(" (//div[@class = 'example']/select)[6]"));
		Select dropdown1 = new Select(dropdown);
		dropdown1.selectByValue("1");
	
		WebElement dropdownA = driver.findElement(By.xpath(" (//div[@class = 'example']/select)[6]"));
		Select dropdownB = new Select(dropdownA);
		dropdownB.selectByValue("3");
	}

}
