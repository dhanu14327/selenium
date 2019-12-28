package Demo;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestGroupsexample {

	@Test(groups="smk")
	public void testA()
	{
		Reporter.log("Smoke testing",true);
	}
	@Test(groups= {"smk","fun"})
	public void testB()
	{
		Reporter.log("functional testing",true);
	}
	@Test(groups= {"reg"})
	public void testC()
	{
		Reporter.log("regression testing",true);
	}
}
