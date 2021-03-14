package com.Test.KumarGauravJain.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.Test.KumarGauravJain.stepdefinition.stepDefinition;

public class updateProfile {
	static WebDriver driver;

	public static void UserID() throws InterruptedException {
		driver = stepDefinition.driver;
		WebDriverWait wait = new WebDriverWait(driver, 30);
		/* Click on Signin */
		wait.until(ExpectedConditions
				.presenceOfElementLocated(By.xpath(".//*[@id='header']/div[2]/div/div/nav/div[1]/a")));
		driver.findElement(By.xpath(".//*[@id='header']/div[2]/div/div/nav/div[1]/a")).click();
		System.out.println("Click on UserID");
	}

	public static void updateProfile() throws InterruptedException {
		driver = stepDefinition.driver;

		/* Click on My Personal Information */
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions
				.presenceOfElementLocated(By.xpath(".//*[@id='center_column']/div/div[1]/ul/li[4]/a/span")));
		driver.findElement(By.xpath(".//*[@id='center_column']/div/div[1]/ul/li[4]/a/span")).click();
		System.out.println("Click on My Personal Information ");

		/* Edit First Name */
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("firstname")));
		driver.findElement(By.id("firstname")).clear();
		driver.findElement(By.id("firstname")).sendKeys("Kumar");
		System.out.println("Edit First Name");

		/* Enter current Password */
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(".//*[@id='old_passwd']")));
		driver.findElement(By.xpath(".//*[@id='old_passwd']")).sendKeys("assum_cod@2021");
		System.out.println(" Enter Old Password ");

		/* CLick on Save button */
		Actions action = new Actions(driver);
		action.moveToElement(
				driver.findElement(By.xpath(".//*[@id='center_column']/div/form/fieldset/div[11]/button/span")))
				.perform();
		WebElement element = driver
				.findElement(By.xpath(".//*[@id='center_column']/div/form/fieldset/div[11]/button/span"));
		JavascriptExecutor executor1 = (JavascriptExecutor) driver;
		executor1.executeScript("arguments[0].click();", element);
		System.out.println("Click on Save button");
	}

	public static void validateProfile() throws InterruptedException {
		driver = stepDefinition.driver;
		WebDriverWait wait = new WebDriverWait(driver, 30);
		/* Click on My Personal Information */
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(".//*[@id='center_column']/div/p")));
		String a = driver.findElement(By.xpath(".//*[@id='center_column']/div/p")).getText();
		System.out.println("Confimration message=" + a);

		assert a.equals("Your personal information has been successfully updated.");

		driver.close();
	}

}
