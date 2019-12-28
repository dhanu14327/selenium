package Demo;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Testngexample {

	@Test(priority = 0)
	public void testa()
	{
		Reporter.log("Hi I am Reporter",true);
	}
	@Test(priority = 1,invocationCount = 5)
	public void testb()
	{
		Reporter.log("Hi i came again",true);
	}
	@Test(priority = 2)
	public void test0()
	{
		Reporter.log("not again...", true);
	}
}
