package baseTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {

	static WebDriver driver;

	public static void launchBrowser(String BrowserType) {
		if (BrowserType.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\hrsid\\OneDrive\\Desktop\\drivers\\chrome\\chromedriver.exe");

			driver = new ChromeDriver();
			// Maximize the browser
			driver.manage().window().maximize();

		}

	}

	public static void closeBrowser() {
		driver.close();
	}
}
