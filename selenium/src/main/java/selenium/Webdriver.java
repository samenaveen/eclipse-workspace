package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Webdriver {

	public static void main(String[] args) {
		// TODO Auto-generated method 
WebDriverManager.chromedriver().setup();
WebDriver driver =new ChromeDriver();
driver.get("https://www.google.com/");
//driver.getTitle();
//driver.getPageSource();
driver.close();
	}

}
