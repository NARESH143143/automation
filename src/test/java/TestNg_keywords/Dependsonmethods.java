package TestNg_keywords;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Dependsonmethods {
	@Test
	public void m1() {
		Reporter.log("hello",true);
		Assert.fail();
	}
	@Test
	public void Tc2() {
		Reporter.log("hello",true);
	}
	@Test
	public void login() {
		Reporter.log("in",true);
		Assert.fail();
	}
	@Test(dependsOnMethods= {"login"})
	public void logout() {
		Reporter.log("out",true);

}
}
