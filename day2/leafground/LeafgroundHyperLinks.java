package assignments.selenium.week2.day2.leafground;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafgroundHyperLinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();

		// Play with HyperLinks

		driver.get("http://leafground.com/pages/Link.html");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.findElement(By.linkText("Go to Home Page")).click();

		String pagetitle = driver.getTitle();

		if (pagetitle.equals("TestLeaf - Selenium Playground")) {

			System.out.println("In home page");

		} else {
			System.out.println("Not in home page");
		}
		driver.navigate().back();

		String navigationPage = driver.findElement(By.linkText("Find where am supposed to go without clicking me?"))
				.getAttribute("href");

		System.out.println(navigationPage);

		driver.findElement(By.linkText("Verify am I broken?")).click();

		String brokenLink = driver.getTitle();

		if (brokenLink.contains("HTTP Status 404")) {
			System.out.println("The link is broken");
		} else {
			System.out.println("The link is not broken");
		}

		driver.navigate().back();

		driver.findElement(By.xpath("(//a[text()='Go to Home Page'])[2]")).click();

		String pagetitle1 = driver.getTitle();
		
		System.out.println("The url is "+driver.getCurrentUrl());

		if (pagetitle.equals(pagetitle1)) {
			System.out.println("Interact with same link name");
		}
		else {

			System.out.println("Doesn't interact with same link name");
		}

		driver.navigate().back();

		List<WebElement> numLinks = driver.findElements(By.tagName("a"));

		System.out.println("Total links in the page are " + numLinks.size());
	}

}
