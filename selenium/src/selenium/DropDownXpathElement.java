package selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DropDownXpathElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ljoseph\\Downloads\\QA\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/select-menu");
		//driver.manage().window().setSize(new Dimension(450,630));
       // WebElement dp= (WebElement) driver.findElements(By.id("cars"));
        WebElement dp1=(WebElement) driver.findElements(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[1]/div[8]/div/select"));
        //alert(dp1.toString());
        //WebDriverWait wait = new WebDriverWait(driver, 10);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
       // wait.until(ExpectedConditions.visibilityOfElementLocated((By) dp1));
        Select s1=new Select(dp1);
        //s1.selectByVisibleText("Audi");<option value="audi">Audi</option>
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
       s1.selectByValue("audi");
      
        //Thread.sleep(2000);
        //driver.quit();
	}

}
