package selenium;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG {
//public static void main(String[] args) {
	
	@BeforeSuite
	public void setup_Before_Suite() {
		System.out.println("Before Suite");
		}
	
	@BeforeTest
	public void setup_Before_Test() {
		System.out.println("Before Test");
		}
		
		@BeforeClass
		public void setup_Before_Class() {
		System.out.println("Before Class");
		}
		
		@BeforeMethod
		public void setup_Before_Method() {
			System.out.println("Before Method");
		}
		
		@Test
		public void dropDownTest() {
			System.out.println("Inside Test Method $");
		}
		
		@Test(groups = "smoke", priority=1)
		public void dropDownTesttwo() {
			System.out.println("$ Inside the method $");
		}
		
		@Test(groups="smoke", dependsOnMethods = "dropDownTestFour")
		public void dropDownTestThree() {
			System.out.println("Inside Test method $$$$$$");
			Assert.assertTrue(false);
		}
		@Test
		public void dropDownTestFour() {
			System.out.println("@@@@ Inside Test Method @@@@");
		
		Assert.assertTrue(true);
		}
		
		@AfterMethod
		public void setup_After_Method() {
			System.out.println("Inside After Method");
		}
		@AfterClass
		public void setup_After_Class() {
			System.out.println("Inside After Class");
			}
		@AfterTest
		public void setup_After_Test() {
			System.out.println("Inside After Test");
		}
		@AfterSuite
		public void setup_After_Suite() {
			System.out.println("Inside After Suite");
			
	
			}
		
		}


