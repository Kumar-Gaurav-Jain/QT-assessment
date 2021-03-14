package com.Test.KumarGauravJain.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.Test.KumarGauravJain.stepdefinition.stepDefinition;

public class orderHistory {

	static WebDriver driver;

	public static void orderHistory() throws InterruptedException {
		driver = stepDefinition.driver;
		WebDriverWait wait = new WebDriverWait(driver, 30);
		/* Check Order History */

		/* Click on UserID */
		wait.until(ExpectedConditions
				.presenceOfElementLocated(By.xpath(".//*[@id='header']/div[2]/div/div/nav/div[1]/a/span")));
		driver.findElement(By.xpath(".//*[@id='header']/div[2]/div/div/nav/div[1]/a/span")).click();
		System.out.println("Click on UserID");

		/* Click on Order History */
		wait.until(ExpectedConditions
				.presenceOfElementLocated(By.xpath(".//*[@id='center_column']/div/div[1]/ul/li[1]/a/span")));
		driver.findElement(By.xpath(".//*[@id='center_column']/div/div[1]/ul/li[1]/a/span")).click();
		System.out.println("Click on Order History");

		/* Capture Order Reference Number */
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(".//*[@id='order-list']/tbody/tr[1]/td[1]/a")));
		String b = driver.findElement(By.xpath(".//*[@id='order-list']/tbody/tr[1]/td[1]/a")).getText();
		System.out.println("Total Price Captured as-" + b);

		/* Validate the price */
		wait.until(
				ExpectedConditions.presenceOfElementLocated(By.xpath(".//*[@id='order-list']/tbody/tr[1]/td[3]/span")));
		String c = driver.findElement(By.xpath(".//*[@id='order-list']/tbody/tr[1]/td[3]/span")).getText();
		System.out.println("Total Proce Captured at final screen-" + c);
		assert c.equals(placeOrder.a);

		/* Click on Logout */
		wait.until(ExpectedConditions
				.presenceOfElementLocated(By.xpath(".//*[@id='header']/div[2]/div/div/nav/div[2]/a")));
		driver.findElement(By.xpath(".//*[@id='header']/div[2]/div/div/nav/div[2]/a")).click();
		System.out.println("Click on Logout");

		driver.close();
	}
}
