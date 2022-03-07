package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XpathElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		WebElement s1 = driver.findElement(By.linkText("Gmail"));
		Actions action = new Actions(driver);
		int offsetx = s1.getRect().getX();
		int offsety = s1.getRect().getY();
		action.moveByOffset(offsetx, offsety).build().perform();

	}

}
