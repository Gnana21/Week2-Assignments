package assignments.selenium.week2.day2.leafground;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafgroundImage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();

		// Interact with Images

		driver.get("http://leafground.com/pages/Image.html");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//label[contains(text(),'to go home page')]/following-sibling::img")).click();
		String PageTitle = driver.getTitle();
		if (PageTitle.equals("TestLeaf - Selenium Playground")) {

			System.out.println("In home page : " + PageTitle);
		} else {
			System.out.println("Not in home page");
		}

		driver.navigate().back();

		String imageDetails = driver.findElement(By.xpath("//label[(text() = 'Am I Broken Image?')]/following-sibling::img"))
				.getAttribute("src");

		driver.get(imageDetails);
		String title = driver.getTitle();

		if (title.contains("HTTP Status 404")) {

			System.out.println(imageDetails + ": image is broken");
		} else {
			System.out.println(imageDetails + ": image is not broken");
		}
		driver.navigate().back();
		
		WebElement image = driver.findElement(By.xpath("//label[contains(text(),'Keyboard or Mouse')]/following-sibling::img"));

		Actions builder = new Actions(driver);
		builder.moveToElement(image).click().perform();
		
		String pageTitle = driver.getTitle();
		
		if(pageTitle.equals("TestLeaf - Selenium Playground")) {
			System.out.println("In " + pageTitle + "action performed successfuly" );
		}
		else {
			System.out.println("The action is not performed successfuly" );
		}
		
	}

}
