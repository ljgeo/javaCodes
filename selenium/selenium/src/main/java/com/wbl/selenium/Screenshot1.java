package com.wbl.selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Screenshot1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		// System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");

		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		// FileUtils.copyFile(src, new File("C://New folder//screenshot.png"));
		
		
		// current path of the project
		System.out.println(System.getProperty("user.dir"));
		
		FileUtils.copyFile(src, new File(System.getProperty("user.dir") + "//Resources//screenshot.png"));
		System.out.println("Screen Shot Taken");
	}

}