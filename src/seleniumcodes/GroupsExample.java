package seleniumcodes;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GroupsExample {
	
	@Test(groups= {"sanity"})
	public void m1() {
		System.out.println("displaying m1 method");
	}
	@Test(groups= {"regression"})
	public void m2() {
		System.out.println("displaying m2 method");
	}
	@Test(groups= {"sanity","regression"})
	public void m3() {
		System.out.println("displaying m3 method");
	}
	@Test(groups= {"regression"})
	public void m4() {
		System.out.println("displaying m4 method");
	}
}
