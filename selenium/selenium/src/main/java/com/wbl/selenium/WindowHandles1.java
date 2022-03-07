package com.wbl.selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandles1 {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.guru99.com/popup.php");
		                            //tagname[text()='Click Here']
		driver.findElement(By.xpath("//a[text()='Click Here']")).click();
		
		// to get main window	

		String mainwindow = driver.getWindowHandle();
		
		System.out.println(mainwindow);
		
		Set<String> s1 = driver.getWindowHandles();
		System.out.println("the number of windows are" + s1.size());
		
		for (String i : s1) {
			if (mainwindow.equals(i)) {
				System.out.println(
						"the Parentwindow is " + i + "and its title is" + driver.switchTo().window(i).getTitle());
			} else {
				System.out.println("the child window is" + i);
				System.out.println(driver.switchTo().window(i).getTitle());
			}

		}
		//driver.quit();
	}

}