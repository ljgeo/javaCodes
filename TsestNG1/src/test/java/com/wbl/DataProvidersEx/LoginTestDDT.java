package com.wbl.DataProvidersEx;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.wbl.ExcelDataProvider.XLUtils;

import io.github.bonigarcia.wdm.WebDriverManager;

public interface LoginTestDDT {
	WebDriver driver;
    //2//4
	@Test(dataProvider = "LoginData")
	public void loginTest(String user, String pwd) throws InterruptedException {
		driver.findElement(By.id("username")).sendKeys(user);
		driver.findElement(By.id("password")).sendKeys(pwd);
		driver.findElement(By.name("submit")).click();
		Thread.sleep(3000);

	}

	// DataProvider Method which reads Excel data.//3
	@DataProvider(name = "LoginData")
	String[][] getData() throws IOException {
		String Path = System.getProperty("user.dir") + "\\TestData\\TestData.xlsx";
		System.out.println(" the sheet is Credentials ");

		int rowNum = XLUtils.getRowCount(Path, "Credentials");
		System.out.println(" The No of rows are  " + rowNum);

		int colCount = XLUtils.getCellCount(Path, "Credentials", 1);
		System.out.println(" The No of Columns are  " + colCount);

		String logindata[][] = new String[rowNum][colCount];

		for (int i = 1; i <= rowNum; i++) {
			for (int j = 0; j < colCount; j++) {
				logindata[i - 1][j] = XLUtils.getCellData(Path, "Credentials", i, j);// 1, 0
				System.out.println(" The cell data is   " + logindata[i - 1][j]);
			    
			}
			
		}
		return logindata;
	}

	@BeforeClass
	//1
	public void setUp() {
		// System.setProperty("webdriver.chrome.driver",
		// "C:/user/madhu/chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		//driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.whiteboxqa.com/login.php");
	}

	@AfterClass
	public void tearDown() {
		driver.quit();
	}

}



