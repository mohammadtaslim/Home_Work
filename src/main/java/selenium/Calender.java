package selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Calender {
	
	@Test
	public void getCalender () throws InterruptedException {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
		
		driver.findElement(By.id("datepicker")).click();
		Thread.sleep(999);
		 List <WebElement> dates = driver.findElements(By.cssSelector(".ui-state-default"));
		 
	     for (int i=0; i<dates.size();i++){
			 String date = dates.get(i).getText();
			 System.out.println(date);
			 if(date.equals("17")) {
			 dates.get(i).click();
			 break;
			 }
	     }
		//driver.findElement(By.xpath("//a[text()='17']")).click(); //<tagName> [text ()=’text value’]”))
		//Thread.sleep(911);
		//Thread.sleep(911);
	     driver.quit();
	     
	    }
	}


