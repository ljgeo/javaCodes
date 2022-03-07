package SeleniumWork1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LaunchChr1 {

	public static void main(String[] args) {
		// to add the path of chrome driver
		
System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
// it should have key and value
// key would be webdriver and chrome driver
//value would be the path where we have downloaded the chromedriver exe file
ChromeDriver driver=new ChromeDriver();
driver.get("https://www.facebook.com");
//implicitwaits
//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//explicit waits
//WebDriverWait wait=new WebDriverWait(driver, 50);
//WebElement e1=wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Create New Account")));
//fluent waits
Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)							
.withTimeout(30, TimeUnit.SECONDS) 			
.pollingEvery(500, TimeUnit.MILLISECONDS);
wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.linkText("Create New Account")));
driver.findElement(By.linkText("Create New Account")).click();

//scenario to be automate"
//go to facebook.com
//enter email whitebox@gmail.com


	}
}
