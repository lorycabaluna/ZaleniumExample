package ZaleniumDemo;




import org.testng.annotations.Test;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

@SuppressWarnings("deprecation")
@Test
public class ZaleniumTestChrome extends ON_OFF_Zalenium{
	
	@Test
	@SuppressWarnings("deprecation")
	public void test1() throws MalformedURLException {
		
		
		System.out.println("Thread running: "+ Thread.currentThread().getId());
		
		DesiredCapabilities cap = new DesiredCapabilities();
		//cap.setCapability(CapabilityType.BROWSER_NAME, BrowserType.CHROME);
		cap.setBrowserName(BrowserType.CHROME);
		WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),cap);
		driver.get("http://www.gmail.com");
		System.out.println(driver.getTitle());
		driver.quit();	
		
	}

}
