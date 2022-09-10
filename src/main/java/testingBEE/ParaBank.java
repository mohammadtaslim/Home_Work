package testingBEE;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ParaBank {


public static void main(String[] args) throws InterruptedException{
	
	WebDriverManager.chromedriver().setup();
	WebDriver driver = (WebDriver) new ChromeDriver();
   driver.manage().window().maximize();
   driver.manage().deleteAllCookies();
	
	driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	
	driver.get("https://parabank.parasoft.com/parabank/register.htm");
	driver.findElement(By.xpath("//a[text()='Register']"));
	
	driver.findElement(By.xpath("//a[text()=Register]")).click();
	
	driver.findElement(By.id("customer.firstName")).click();
	/*driver.findElement(By.id("customer.lastName")).sendKeys("taslim");
	driver.findElement(By.id("customer.address.zipCode")).sendKeys("10458");
	driver.findElement(By.id("customer.username")).sendKeys("Try2gu3s5");
	driver.findElement(By.name("customer.password")).sendKeys("d13try19g");*/

	
	//Thread.sleep(2000);
	
	//driver.close();
    driver.quit();
    // mean quit

}

}
