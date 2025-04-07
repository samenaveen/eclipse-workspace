package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class openBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
WebDriver driver=new ChromeDriver();
driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
driver.getTitle();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
driver.findElement( By.xpath("//input[@name='username']")).sendKeys("Admin");
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
driver.findElement( By.xpath("//input[@name='password']")).sendKeys("admin123");
driver.findElement( By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")).click();
String title=driver.getTitle();
System.out.println(title);
driver.quit();
	}

}
