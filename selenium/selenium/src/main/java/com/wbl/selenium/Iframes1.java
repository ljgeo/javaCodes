package com.wbl.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Iframes1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
//		WebDriverManager.chromedriver().setup();		
//		WebDriver driver=new ChromeDriver();
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();

		driver.get("https://www.rediff.com/");
		// with the help of id and name
		// driver.switchTo().frame("moneyiframe");
		// driver.switchTo().frame(driver.findElement(By.name("moneyiframe")));
		// using index
		driver.switchTo().frame(0);
		String nse = driver.findElement(By.id("nseindex")).getText();
		System.out.println(nse);
		driver.switchTo().defaultContent();
		driver.findElement(By.linkText("SPORTS")).click();
	}

}