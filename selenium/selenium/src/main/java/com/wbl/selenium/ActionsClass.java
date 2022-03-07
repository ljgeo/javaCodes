package com.wbl.selenium;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionsClass {
	public static void main(String[] args) {

		// System.setProperty("webdriver.chrome.driver",
		// "C:\\ChromeDriver\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		WebElement webFrame = driver.findElement(By.className("demo-frame"));
		driver.switchTo().frame(webFrame);
		WebElement sourceElement = driver.findElement(By.id("draggable"));
		WebElement destinationElement = driver.findElement(By.id("droppable"));
		Actions action = new Actions(driver);
		action.clickAndHold(sourceElement).moveToElement(destinationElement).release().build().perform();

	}
}