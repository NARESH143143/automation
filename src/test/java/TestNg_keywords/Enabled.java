package TestNg_keywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Enabled {
	@Test
	public void m1() {
		Reporter.log("hi",true);
	}
	@Test(enabled= false )
	public void m2() {
		Reporter.log("hello",true);
	}

}
