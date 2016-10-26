package jenkins;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class TestNewint {
	WebDriver driver = Sing.test();

	@BeforeMethod
	public void setUp() {

		System.setProperty("webdriver.chrome.driver","/home/vandana/Jenkins/NewJenkinTest/chromedriver");

		}
	
	@Test(priority=0)
	public void testPageTitleSampleA() {
		driver.manage().window().maximize();
		driver.get("http://www.google.com");
		String strPageTitle = driver.getTitle();
		System.out.println("Page title: - "+strPageTitle);
		
	}
	
	@Test(priority=1)
	public void testSampleTwo() {
		System.out.println("Im in test sample two");
	}
	
	@Test(priority=2)
	public void testSampleThree() {
		System.out.println("Im in test sample three");
	}

	@AfterMethod
	public void tearDown() {
		if(driver!=null) {
			System.out.println("Closing chrome browser");
			driver.quit();
		}

	}
	
	
}
