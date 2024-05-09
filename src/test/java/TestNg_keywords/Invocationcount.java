package TestNg_keywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Invocationcount {


	@Test(invocationCount = 10)
	public void m1() {

	Reporter.log("hi",true);
		
	}

}


