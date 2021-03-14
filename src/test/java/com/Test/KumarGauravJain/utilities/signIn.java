package com.Test.KumarGauravJain.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.Test.KumarGauravJain.stepdefinition.stepDefinition;

public class signIn {
	static WebDriver driver;

	public static void signIn() throws InterruptedException {
		driver = stepDefinition.driver;
		/* Click on Sign */

		/* Type Email Address */
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.name("email")));
		driver.findElement(By.name("email")).sendKeys("kumargjain007@gmail.com");
		System.out.println("Type Email Address");

		/* Type Password */
		wait.until(ExpectedConditions.presenceOfElementLocated(By.name("passwd")));
		driver.findElement(By.name("passwd")).sendKeys("assum_cod@2021");
		System.out.println("Type Password");

		/* CLick on Sign-in button */
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath(".// *[@id='SubmitLogin']/span"))).perform();
		WebElement element = driver.findElement(By.xpath(".// *[@id='SubmitLogin']/span"));
		JavascriptExecutor executor1 = (JavascriptExecutor) driver;
		executor1.executeScript("arguments[0].click();", element);
		System.out.println("Click on Sign-in button");

	}
}
