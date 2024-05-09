package TestNg_keywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TimeOut {
	@Test (timeOut=10 )//10sec
	public void TC(){
		Reporter.log("hi",true);
	}

}
