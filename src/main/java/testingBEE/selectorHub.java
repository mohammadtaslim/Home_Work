 package testingBEE;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class selectorHub {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriverManager.chromedriver().setup();
		WebDriver driver = (WebDriver) new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//driver.manage().timeouts().pageLoadTimeout(2000, TimeUnit.SECONDS);
		//driver.manage().timeouts().implicitlyWait(6000,TimeUnit.SECONDS);
		driver.get("https://selectorshub.com/xpath-practice-page/");
		
		/*driver.findElement(By.xpath("//input[@id='userId']")).click();
		driver.findElement(By.xpath("//input[@title='Password']")).sendKeys("really");
		driver.findElement(By.xpath("//input[@placeholder='Enter your company']")).sendKeys("My World");*/
				
		Thread.sleep(4000);
		driver.quit();

	}


		// TODO Auto-generated method stub
		
	}


