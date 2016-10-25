package jenkins;

import org.openqa.selenium.*;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
//import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import java.io.File;
import java.io.IOException;
import java.net.*;
import org.junit.*;
import org.junit.runners.BlockJUnit4ClassRunner;

public class TestNewint {
	//WebDriver driver = new ChromeDriver();
	
	@Test
	public void setUp() throws MalformedURLException {
	
	new DesiredCapabilities();
       // URL serverurl = new URL("http://localhost:9515");
        DesiredCapabilities capabilities = DesiredCapabilities.chrome();
        WebDriver driver = new RemoteWebDriver(System.setProperty("webdriver.chrome.driver","\\home\\vandana\\ChromeDriver\\chromedriver"),capabilities);
        driver.get("http://www.google.com");
        WebElement searchEdit = driver.findElement(By.name("q"));
        searchEdit.sendKeys("Selftechy on google");
        searchEdit.submit();	
	}
		
		/*
       new DesiredCapabilities();	
	System.setProperty("webdriver.chrome.driver","\\home\\vandana\\Jenkins\\NewJenkinTest\\chromedriver");
	DesiredCapabilities Capability=DesiredCapabilities.chrome();
	Capability.setPlatform(org.openqa.selenium.Platform.ANY);
	WebDriver driver=new WebDriver(Capability); 
	
	@Test(priority=0)
	public void testPageTitleSampleA() {
	  
		driver.manage().window().maximize();
		driver.get("http://www.google.com");
		String strPageTitle = driver.getTitle();
		System.out.println("Page title: - "+strPageTitle);
		Assert.assertTrue(strPageTitle.equalsIgnoreCase("Google"), "Page title doesn't match");
	}
	
	@Test(priority=1)
	public void testSampleTwo() {
		System.out.println("Im in test sample two");
	}
	
	@Test(priority=2)
	public void testSampleThree() {
		System.out.println("Im in test sample three");
	}

	@AfterClass
	public void tearDown() {
	
		if(driver!=null) {
			System.out.println("Closing chrome browser");
			driver.quit();
		}
	}*/
	
}
