package TestNG_Annotatations;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Annotation_Flow {
	@BeforeSuite
	public void bs() {
		System.out.println("********DB CONNECTION*****");
	}
    @BeforeClass
    public void bc() {
    	System.out.println("*******LUNCH THE BROSWER******");
    	
    }
@BeforeMethod
public void bm() {
	System.out.println("*******LOGIN APP*******");
}
@Test
public void tc() {
	System.out.println("******MAIN TC******");
}
@AfterMethod 
public void AM() {
	System.out.println("*******LOGOUT APP*******");
}
@AfterClass
public void AC() {
	System.out.println("********CLOSE THE BROSWER******");
}
@AfterSuite
public void AS() {
	System.out.println("*****DB DISCONCTION******");
		System.out.println("*****naresh******");

}

}
