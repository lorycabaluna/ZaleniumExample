package ZaleniumDemo;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class ON_OFF_Zalenium {
	
	
	@BeforeTest
	public void start_Zalenium() throws IOException, InterruptedException {
		
		//Runtime.getRuntime().exec("open /Users/macbookpro152014retina/Desktop/Zalenium_start.command");
		//Runtime.getRuntime().exec("open /Users/macbookpro152014retina/eclipse-workspace/ZaleniumTest/ZaleniumStart_Stop/Zalenium_start.command");
		Runtime.getRuntime().exec("open /ZaleniumExample/ZaleniumStart_Stop/Zalenium_start.command");
		
		Thread.sleep(15000);
	}
	
	@AfterTest
	public void stop_Zalenium() throws IOException, InterruptedException {
		
		//Runtime.getRuntime().exec("open /Users/macbookpro152014retina/Desktop/Zalenium_stop.command");
		//Runtime.getRuntime().exec("open /Users/macbookpro152014retina/eclipse-workspace/ZaleniumTest/ZaleniumStart_Stop/Zalenium_stop.command");
		Runtime.getRuntime().exec("open /ZaleniumExample/ZaleniumStart_Stop/Zalenium_stop.command");
		
		Thread.sleep(10000);
	}

}
