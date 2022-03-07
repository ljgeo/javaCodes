package SeleniumWork1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagName1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://omayo.blogspot.com");
	List<WebElement> e1=driver.findElements(By.tagName("button"));
	for (WebElement i:e1) {
		System.out.println(i.getText());
	}
	Thread.sleep(6000);
	driver.quit();
	}
	

}
