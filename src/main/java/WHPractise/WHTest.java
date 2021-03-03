package WHPractise;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WHTest {
	
	


		
		WebDriver driver;

		@Before
		public void launchBrowser() {

			// Setting up the property
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\PC31\\eclipse-workspace\\WindowHandle\\Driver\\chromedriver.exe");

			// Creating web driver instance
			driver = new ChromeDriver();

			// Maximizing Browser
			driver.manage().window().maximize();

			// Get to the site
			driver.get("https://www.yahoo.com/");

			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		}

		@Test
		public void loginTest() throws InterruptedException {
			
			//System.out.println(driver.getTitle());
			//System.out.println(driver.getWindowHandle());
			
			// Identifying the username field pass username
			driver.findElement(By.xpath("//*[@id=\"ybar-sbq\"]")).sendKeys("xpath");
			driver.findElement(By.xpath("//*[@id=\"ybar-search\"]")).click();
			
			
			Thread.sleep(2000);
			driver.findElement(By.linkText("XPath Tutorial - W3Schools")).click();
			
			
			for(String i : driver.getWindowHandles()) {
				//System.out.println(i);
				driver.switchTo().window(i);
			}
			
			//System.out.println(driver.getTitle());
			driver.findElement(By.linkText("CSS")).click();


}

}