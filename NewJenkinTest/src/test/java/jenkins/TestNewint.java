package jenkins;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestNewint {
	WebDriver driver = new ChromeDriver();
	
	@BeforeClass
	public void setUp() {
		System.setProperty("webdriver.chrome.driver","/var/lib/jenkins/workspace/Demo/NewJenkinTest/chromedriver");
			
	}
	
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
	}
	
}
