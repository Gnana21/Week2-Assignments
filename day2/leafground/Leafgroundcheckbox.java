package assignments.selenium.week2.day2.leafground;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Leafgroundcheckbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();
		
		// Interact with Checkbox

		driver.get("http://leafground.com/pages/checkbox.html");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//div[text() = 'Java']/input")).click();
		driver.findElement(By.xpath("//div[text() = 'SQL']/input")).click();
		
		// Confirm Selenium is checked
		WebElement confirmChecked = driver.findElement(By.xpath("//div[text()= 'Selenium']/input"));
		
		if(confirmChecked.isSelected()) {
			System.out.println("Confirm Selenium is checked "+ confirmChecked.isSelected());
		}

		else {
			System.out.println("Confirm Selenium is checked "+ confirmChecked.isSelected());
			
		}
		WebElement deSelect = driver.findElement(By.xpath("//div[text()= 'I am Selected']/input"));
		
		if(deSelect.isSelected()) {
			deSelect.click();
		}
		
		List<WebElement> SelectCheckboxs = driver.findElements(By.xpath("//label[text() = 'Select all below checkboxes ']/following::input"));
         //to click at second Last Index value
		//int secondLastIndex = SelectCheckboxs.size()-2;
		//SelectCheckboxs.get(secondLastIndex).click();
		
		for (int i = 0; i < SelectCheckboxs.size(); i++) {
			
		SelectCheckboxs.get(i).click();
		}
		
	}

}
