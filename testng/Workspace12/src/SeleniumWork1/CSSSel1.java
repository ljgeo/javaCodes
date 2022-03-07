package SeleniumWork1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSSel1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		//the syntax for tag and id is tag#id
		//driver.findElement(By.cssSelector("input#email")).sendKeys("whitebox@qa.com");
		//tag and class tag.class
		//driver.findElement(By.cssSelector("input.inputtext")).sendKeys("whitebox@qa.com");
		//tag attribute and value
		//driver.findElement(By.cssSelector("input[id='email']")).sendKeys("whitebox@qa.com");
		//tag class attribute tag.class[attribute='attribute_value']
		//driver.findElement(By.cssSelector("input.inputtext[id='email']")).sendKeys("whitebox@qa.com");
		//css substring starts with ^ tag[attribute^='attribute_value']
		//driver.findElement(By.cssSelector("input[id^='em']")).sendKeys("whitebox@qa.com");
		//css substring ends with ^ tag[attribute$='attribute_value']
		//driver.findElement(By.cssSelector("input[id$='il']")).sendKeys("whitebox@qa.com");
		//css substring for contains tag[attribute*='attribute_value']
		//driver.findElement(By.cssSelector("input[id*='ma']")).sendKeys("whitebox@qa.com");
		driver.findElement(By.xpath("//input[@type='password'and @id='pass']")).sendKeys("abcder");
		Thread.sleep(2000);
		driver.quit();
	}

}
