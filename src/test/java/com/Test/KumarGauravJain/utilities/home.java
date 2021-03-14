package com.Test.KumarGauravJain.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;

public class home {
	static WebDriver driver;

	public static WebDriver initializeDriver() throws InterruptedException {

		System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

		ChromeOptions options = new ChromeOptions();
		options.addArguments("disable-infobars");
		options.setExperimentalOption("useAutomationExtension", false);
		driver = new ChromeDriver(options);

		return driver;

	}

	public static void home() throws InterruptedException {
		driver.get("http://automationpractice.com/index.php");
		System.out.println("Application is launched");
		driver.manage().window().maximize();
		System.out.println("Maximized the window");

		System.out.println("Successfully launched the application");
	}

}
