package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleElements {
public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://github.com/login");
		Thread.sleep(3000);
		WebElement UsernameTxt=driver.findElement(By.id("login_field"));
		if (UsernameTxt.isDisplayed()){
		if (UsernameTxt.isEnabled()) {
			UsernameTxt.sendKeys("nnaveen");
			String enteredText=UsernameTxt.getDomProperty("value");
			System.out.println(enteredText);
			Thread.sleep(3000);
			UsernameTxt.clear();
		}
		else
		
			System.err.println("username textbx is not enabdled");
		}
		else {
			System.err.println("username Textbox is not displayed");
			driver.close();		}}}

	
			
