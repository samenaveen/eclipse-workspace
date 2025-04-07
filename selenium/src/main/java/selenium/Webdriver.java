package selenium;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.google.common.annotations.VisibleForTesting;

import io.github.bonigarcia.wdm.WebDriverManager;

//public class Webdriver {
//	@Test(priority = 0)
//	public static void main(String[] args) {
//		// TODO Auto-generated method 
//		
//		
//			WebDriverManager.chromedriver().setup();
//			WebDriver driver =new ChromeDriver();
//			driver.get("https://www.google.com/");
//			driver.getTitle();
//			driver.getPageSource();
//			driver.close();
		//	package selenium;

			import org.openqa.selenium.WebDriver;
			import org.testng.annotations.AfterClass;
			import org.testng.annotations.BeforeClass;
			import org.testng.annotations.Test;
			import io.github.bonigarcia.wdm.WebDriverManager;
			import org.testng.Assert;

			public class Webdriver {

			    WebDriver driver;

			    @BeforeClass
			    public void setUp() {
			        WebDriverManager.chromedriver().setup();
			        driver = new ChromeDriver();
			    }

			    @Test
			    public void openGoogle() {
			        driver.get("https://www.google.com/");
			        Assert.assertEquals(driver.getTitle(), "Google");
			    }

			    @Test
			    public void navigateToAnotherPage() {
			        driver.get("https://www.example.com/");
			        Assert.assertTrue(driver.getTitle().contains("selenium"));
			    }

			    @AfterClass
			    public void tearDown() {
			        if (driver != null) {
			            driver.quit();
			        }
			    }
			

			
//WebDriverManager.chromedriver().setup();
//WebDriver driver =new ChromeDriver();
//driver.get("https://www.google.com/");
////driver.getTitle();
////driver.getPageSource();
//driver.close();
	}
	

