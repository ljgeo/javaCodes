package SeleniumWork1;

import org.openqa.selenium.chrome.ChromeDriver;

public class GetCommands1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
ChromeDriver driver=new ChromeDriver();
driver.get("https://www.facebook.com");
//syntax for maximizing the chrome window
driver.manage().window().maximize();
//driver will wait for 3 seconds
Thread.sleep(3000);
//on the output console of ide we will get the title of the page
//System.out.println(driver.getPageSource());

//this will quit the execution of chromeDriver browser
driver.quit();
	}

}
