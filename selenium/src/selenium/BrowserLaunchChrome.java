package selenium;





import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class BrowserLaunchChrome

{

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ljoseph\\Downloads\\QA\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://facebook.com/");
		driver.manage().window().setSize(new Dimension(450,630));
		/*
		 * Wait<WebDriver> wait = new FluentWait<WebDriver>(driver) .withTimeout(30,
		 * TimeUnit.SECONDS) .pollingEvery(500, TimeUnit.MILLISECONDS);
		 */
		Wait wait = new FluentWait(driver).withTimeout(Duration.ofSeconds(30)).pollingEvery(Duration.ofSeconds(30))
                .ignoring(NoSuchElementException.class);
		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.linkText("Create New Account")));
		driver.findElement(By.linkText("Create New Account")).click();
		driver.quit();

	}

}
