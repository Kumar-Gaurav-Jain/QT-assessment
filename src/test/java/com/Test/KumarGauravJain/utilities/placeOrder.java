package com.Test.KumarGauravJain.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.Test.KumarGauravJain.stepdefinition.stepDefinition;

public class placeOrder {

	static WebDriver driver;
	static String a;

	public static void placeOrder_First() throws InterruptedException {
		driver = stepDefinition.driver;
		/* Order a tshirt */
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(".//*[@id='block_top_menu']/ul/li[3]/a")));
		driver.findElement(By.xpath(".//*[@id='block_top_menu']/ul/li[3]/a")).click();
		System.out.println("Click on Tshirt");

		/* Click on first Item */
		wait.until(ExpectedConditions
				.presenceOfElementLocated(By.xpath(".//*[@id='center_column']/ul/li/div/div[1]/div/a[1]/img")));
		driver.findElement(By.xpath(".//*[@id='center_column']/ul/li/div/div[1]/div/a[1]/img")).click();
		System.out.println("Click on First Item");

		/* Click on Add to Cart */
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(".//*[@id='add_to_cart']/button/span")));
		driver.findElement(By.xpath(".//*[@id='add_to_cart']/button/span")).click();
		System.out.println("Click on Add to Cart");

		Thread.sleep(4000);

		/* Click on First Checkout */
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath(".//*[@id='layer_cart']/div[1]/div[2]/div[4]/a/span")))
				.perform();
		WebElement element = driver.findElement(By.xpath(".//*[@id='layer_cart']/div[1]/div[2]/div[4]/a/span"));
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", element);
		System.out.println("Click on First Checkout");

		/* Click on Second Checkout */
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(".//*[@id='center_column']/p[2]/a[1]/span")));
		driver.findElement(By.xpath(".//*[@id='center_column']/p[2]/a[1]/span")).click();
		System.out.println("Click on Second Checkout");
	}

	public static void placeOrder_Second() throws InterruptedException {
		driver = stepDefinition.driver;
		/* Click on Third Checkout */
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(
				ExpectedConditions.presenceOfElementLocated(By.xpath(".//*[@id='center_column']/form/p/button/span")));
		driver.findElement(By.xpath(".//*[@id='center_column']/form/p/button/span")).click();
		System.out.println("Click on Third Checkout");

		/* Select checkbox to agree agreements */
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(".//*[@id='cgv']")));
		driver.findElement(By.xpath(".//*[@id='cgv']")).click();
		System.out.println("Select checkbox to agree agreements");

		/* Click on Fourth Checkout */
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(".//*[@id='form']/p/button/span")));
		driver.findElement(By.xpath(".//*[@id='form']/p/button/span")).click();
		System.out.println("Click on Fourth Checkout");

		/* Capture Total Price */
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(".//*[@id='total_price']")));
		a = driver.findElement(By.xpath(".//*[@id='total_price']")).getText();
		System.out.println("Total Price Captured as-" + a);

		Thread.sleep(2000);
		/* Click on Pay by bank wire */
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(".//*[@id='HOOK_PAYMENT']/div[1]/div/p/a")));
		driver.findElement(By.xpath(".//*[@id='HOOK_PAYMENT']/div[1]/div/p/a")).click();
		System.out.println("Click on Pay by bank wire");

		/* Click on Confirm the order */
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(".//*[@id='cart_navigation']/button/span")));
		driver.findElement(By.xpath(".//*[@id='cart_navigation']/button/span")).click();
		System.out.println("Click on Confirm the order");

	}

}
