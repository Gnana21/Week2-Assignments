package assignments.selenium.week2.day2.leafground;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafgroundButton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();
		
		// Bond with Buttons

				driver.get("http://leafground.com/pages/Button.html");

				driver.manage().window().maximize();

				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

				driver.findElement(By.id("home")).click();

				String pageTitle = driver.getTitle();

				String homePageTitle = "TestLeaf - Selenium Playground";

				if (pageTitle.contentEquals(homePageTitle)) {

					System.out.println("In home page");
				}

				else {
					System.out.println("Not in home page");
				}

				driver.navigate().back();

				WebElement buttonPosition = driver.findElement(By.id("position"));

				//buttonPosition.
				
				
				Point location = buttonPosition.getLocation();

				System.out.println("Position of the button is" + location);

				WebElement buttonColour = driver.findElement(By.xpath("//div[@class = 'example'][3]//button"));

				System.out.println(buttonColour.getCssValue("background-color"));

				Dimension buttonSize = driver.findElement(By.xpath("(//div[@class = 'row'])[4]//button")).getSize();
				
				System.out.println("Size of button " + buttonSize);
		
	}

}
