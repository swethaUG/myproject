package mavens;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class mavenTestNG {
	public class TestMvn {
		@Test
		public void sampleTest() {
			System.setProperty("webdriver.chrome.driver", "C:/Users/admin/Desktop/New folder (3)/chromedriver.exe");
			//System.setProperty("webdriver.chrome.driver", "C:/Users/admin/Desktop/New folder (3)/chromedriver.exe");
			WebDriver driver=new ChromeDriver();		
			driver.get("https://opensource-demo.orangehrmlive.com/");
			driver.manage().window().maximize();
		}
	}

}
