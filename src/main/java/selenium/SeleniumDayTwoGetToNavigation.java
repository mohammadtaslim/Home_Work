package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumDayTwoGetToNavigation {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		
		driver.get("https://www.mozilla.org/en-US/firefox/new/?redirect_source=firefox-com");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(5001, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(2001, TimeUnit.SECONDS);
		Thread.sleep(3000);
		driver.navigate().to("https://www.linkedin.com/home");
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().forward();
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(3000);
		
		
		driver.quit();
		System.out.println("get vs navigate ");
	

	}

}
