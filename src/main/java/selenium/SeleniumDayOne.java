package selenium;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumDayOne {

	public static void main(String[] args) throws InterruptedException, IOException {
	
		//WebDriverManager.firefoxdriver().setup();
		//WebDriver driver = new FirefoxDriver();
		//WebDriverManager.edgedriver().setup();
		//WebDriver driver = new EdgeDriver();
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.manage().deleteAllCookies();
		   //driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		   driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		   //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		   
		   //PAGE TITLE TEST
		   
		   String actualTitle = driver.getTitle();//practice page
		   String expectedTitle = "practice page";
		   //verify if both of the are equal
		   if(actualTitle.equalsIgnoreCase(expectedTitle))
			   System.out.println("Title matched");
		   else
			   System.out.println("Title didn't match");
		   
		   //Alternately,
		  // Assert.assertEquals(actualTitle, expectedTitle);
		   
		   //SELECTING RADIO BUTTON
		  // driver.findElement(By.xpath()"input[value='radio1']")).click();
		   //boolean nes = driver.findElement(By.cssSelector("input[value='radio1']")).isSelected();
		   //Assert.assertTrue(nes);
		   
		   // Capture screenShot and store the image
		   
		   File sourceFile = (File) (( TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		   FileUtils.copyFile(sourceFile, new File("practice.png"));
		   
		//Alert
		   
		   driver.findElement(By.xpath("//input[@value='Alert']")).click();
		   Thread.sleep(4000);
		   
		  String text = driver.switchTo().alert().getText();
		  
		  // driver.switchTo().alert().accept();
		   
		   if(text.equalsIgnoreCase("Hello, share this practice page and share your knowledge")) {
			   driver.switchTo().alert().accept();
			   }
		   else{
			   System.out.println("Fake Alert");
			    }
		  
		   // scrolling in Selenium using javascript Executor
		  // driver.findElement(By.xpath("//[text()'Mouse Hover']"));
		   //syntax:executeScript("window.scrollBy(x-pixels,y-pixels)");
		  JavascriptExecutor js = (JavascriptExecutor)driver;
		 js.executeScript("window.scrollBy(0,600)");
		   
		   //Mouse Hover in selenium using actions class
		   Actions action = new Actions(driver);
		           action.moveToElement(driver.findElement(By.xpath("//*contains(text(),'Top')"))).perform();
		           
		   
		   
		  Thread.sleep(2000);
		   driver.quit();
		
		}

}
