package assignments.selenium.week2.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeaftapsCreateLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();

		driver.get("http://leaftaps.com/opentaps");

		String title = driver.getTitle();

		String pageTitle = "Leaftaps - TestLeaf Automation Platform";

		if (title.equals(pageTitle)) {

			System.out.println("Title of the page is " + title);
		}

		else {
			System.out.println("You are not in " + title);
		}

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();

		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Cognizant");

		WebElement name = driver.findElement(By.id("createLeadForm_firstName"));
		name.sendKeys("Gnana");
		String firstName = name.getAttribute("value");

		System.out.println("The first Name is " + firstName);

		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Prasuna");

		WebElement countryCode = driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode"));
		countryCode.clear();
		countryCode.sendKeys("5");

		WebElement sourceId = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select sourceId1 = new Select(sourceId);
		sourceId1.selectByIndex(1);

		WebElement marketingCamp = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select marketingCamp1 = new Select(marketingCamp);
		marketingCamp1.selectByValue("CATRQ_CARNDRIVER");

		WebElement industry = driver.findElement(By.id("createLeadForm_industryEnumId"));
		Select industry1 = new Select(industry);
		industry1.selectByVisibleText("Finance");

		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Gnana");
		driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("Prasuna");
		driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys("Miss");
		driver.findElement(By.id("createLeadForm_birthDate")).sendKeys("08/08/1995");
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Sr Associate");
		driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("1000");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Finance");

		WebElement preCurrency = driver.findElement(By.id("createLeadForm_currencyUomId"));
		Select preCurrency1 = new Select(preCurrency);
		preCurrency1.selectByValue("USD");

		WebElement ownership = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select ownership1 = new Select(ownership);
		ownership1.selectByVisibleText("S-Corporation");

		driver.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("17892");
		driver.findElement(By.id("createLeadForm_sicCode")).sendKeys("898");
		driver.findElement(By.id("createLeadForm_tickerSymbol")).sendKeys("Ticker");

		driver.findElement(By.id("createLeadForm_description")).sendKeys("LeaftapsCreateLead");
		driver.findElement(By.id("createLeadForm_importantNote")).sendKeys("LeaftapsCreateLead");
		driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("AB BSY");
		driver.findElement(By.id("createLeadForm_primaryPhoneExtension")).sendKeys("+ 11 982");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("Test@gmail.com");
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("82737373839");
		driver.findElement(By.id("createLeadForm_primaryPhoneAskForName")).sendKeys("Gnana");
		driver.findElement(By.id("createLeadForm_primaryWebUrl")).sendKeys("https://www.Google.com");
		driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("Gnana Prasuna");
		driver.findElement(By.id("createLeadForm_generalAttnName")).sendKeys("Nadam");
		driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("Rurkmarks");
		driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("Makense");
		driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("LA");
		driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("12394");
		driver.findElement(By.id("createLeadForm_generalPostalCodeExt")).sendKeys("343");
		WebElement stateProvince = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select stateProvince1 = new Select(stateProvince);
		stateProvince1.selectByIndex(4);

		driver.findElement(By.className("smallSubmit")).click();

		String finalPage = driver.getTitle();

		String resultingPage = "View Lead | opentaps CRM";

		if (finalPage.equals(resultingPage)) {

			System.out.println(finalPage);
		}

		else {
			System.out.println("Script run unsuccesful");

		}
		
		driver.close();
	}

}
