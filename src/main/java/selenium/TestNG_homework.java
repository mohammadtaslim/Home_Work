package selenium;

import org.testng.annotations.Test;

public class TestNG_homework {

	@Test(priority=1)
    public void one() {
		System.out.println("I'm inside 1");
	}
	@Test(priority=2)
	public void two() {
		System.out.println("I'm inside 2");
		}
	@Test(priority=3)
	public void n_three(){
		System.out.println("I'm inside 3");
		
	}
   @Test(priority=-1)
   public void n_one() {
	   System.out.println("I'm inside -1");
   }
	   
	   @Test(priority=0)
	   public void zero() {
		   System.out.println("I'm inside 0");
		    }
	@Test(priority=-2)
	public void nu_two() {
		System.out.println("I'm inside -2");
	}
	@Test(priority=-3)
	public void nm_thre3() {
		System.out.println("I'm inside -3");
	}
		
}


	


