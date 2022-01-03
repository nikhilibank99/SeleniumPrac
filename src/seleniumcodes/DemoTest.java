package seleniumcodes;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoTest {
	@Test
	public void m1() {
		System.out.println("displaying m1 method");
	}
	@Test(dependsOnMethods= {"m1"},alwaysRun=true)
	public void m2() {
		System.out.println("displaying m2 method");
		Assert.assertFalse(true);
	}
	@Test(dependsOnMethods= {"m2"},alwaysRun=true)
	public void m3() {
		System.out.println("displaying m3 method");
	}
	@Test(dependsOnMethods= {"m3"})
	public void m4() {
		System.out.println("displaying m4 method");
	}
}
