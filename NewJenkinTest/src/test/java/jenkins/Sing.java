package jenkins;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Sing {
	
	public void singing(){
		System.out.println("I'm singing");
	}
	public static WebDriver test(){
		new DesiredCapabilities();
		DesiredCapabilities Capability=DesiredCapabilities.chrome();
		Capability.setPlatform(org.openqa.selenium.Platform.ANY);
		WebDriver driver=new ChromeDriver(Capability);
		return driver;
	}
}
