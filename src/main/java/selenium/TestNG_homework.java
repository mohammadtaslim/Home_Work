package selenium;

import org.testng.annotations.Test;

public class TestNG_homework {

	@Test(priority=1)
	public void one() {
		System.out.println("1");
	}
	@Test(priority=2)
	public void two() {
		System.out.println("2");
		}
	@Test(priority=3)
	public void n_three(){
		System.out.println("3");
		
	}
   @Test(priority=0)
   public void zero() {
	   System.out.println("0");
   }
	   
	   @Test(priority=-1)
	   public void n_one() {
		   System.out.println("-1");
		    }
	@Test(priority=-2)
	public void n_two() {
		System.out.println("-2");
	}
	@Test(priority=-3)
	public void n_thre3() {
		System.out.println("-3");
	}
		

}
	


