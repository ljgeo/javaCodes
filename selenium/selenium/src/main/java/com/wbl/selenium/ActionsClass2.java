package com.wbl.selenium;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionsClass2 {

	public static void main(String[] args) throws IOException {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://jqueryui.com/accordion/");
		WebElement searchbox = driver.findElement(By.xpath("//input[@class='ds-input']"));
		Actions builder1 = new Actions(driver);
		Action seriesofActions = builder1.moveToElement(searchbox).click().keyDown(searchbox, Keys.SHIFT)
				.sendKeys(searchbox, "laptops").build();
		seriesofActions.perform();
	}
}