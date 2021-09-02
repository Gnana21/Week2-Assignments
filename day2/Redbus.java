package assignments.selenium.week2.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Redbus {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.redbus.in/");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		WebElement find = driver.findElement(By.id("src"));

		find.sendKeys("Chennai");
		Thread.sleep(1000);
		find.sendKeys(Keys.TAB);

		WebElement destination = driver.findElement(By.id("dest"));

		destination.sendKeys("Bangalore");
		Thread.sleep(1000);
		destination.sendKeys(Keys.TAB);

		driver.findElement(By.xpath("//td[text()='28']")).click();
		driver.findElement(By.id("search_btn")).click();

		Thread.sleep(5000);

		boolean safetyPopUp = driver.findElement(By.xpath("//div[text()= 'Your safety is our utmost priority']"))
				.isDisplayed();

		if (safetyPopUp) {
			driver.findElement(By.xpath("//i[@class= 'icon icon-close c-fs']")).click();
		}
		Thread.sleep(2000);

		boolean popup = driver.findElement(By.xpath("//div[@class='tripleFive-block']")).isDisplayed();

		if (popup) {
			driver.findElement(By.xpath("//i[@class='icon icon-close']")).click();
		}
		Thread.sleep(2000);

		String SearchResults = driver.findElement(By.xpath("//span[@class='f-bold busFound']")).getText();
		System.out.println(SearchResults + " are avaliable");

		Thread.sleep(2000);

		// Choose only Sleeper Bus
		WebElement sleeper = driver.findElement(By.xpath("//label[text() = 'SLEEPER']"));
		sleeper.click();

		Thread.sleep(2000);
		String searchResultsSleeper = driver.findElement(By.xpath("//span[@class='f-bold busFound']")).getText();
		// Print the number of search results
		System.out.println(searchResultsSleeper + " are avaliable in Sleeper");

		sleeper.click();
		
		//JavascriptExecutor js = (JavascriptExecutor) driver;
		//js.executeScript("window.scrollBy(0,-500)");

		WebElement ac = driver.findElement(By.xpath("//label[text() = 'AC']"));
		ac.click();
		
		Thread.sleep(2000);
		String searchResultsAC = driver.findElement(By.xpath("//span[@class='f-bold busFound']")).getText();
		// Print the number of search results
		System.out.println(searchResultsAC + "are avaliable in AC");

		ac.click();

		// Choose also Non AC buses
		WebElement nonAC = driver.findElement(By.xpath("//label[text() = 'NONAC']"));
		nonAC.click();

		Thread.sleep(2000);
		String searchResultsnonAC = driver.findElement(By.xpath("//span[@class='f-bold busFound']")).getText();
		// Print the number of search results
		System.out.println(searchResultsnonAC + "are avaliablein NONAC");
		Thread.sleep(2000);
		nonAC.click();

	}

}
