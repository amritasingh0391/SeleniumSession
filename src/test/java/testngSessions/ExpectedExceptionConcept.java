package testngSessions;

import org.testng.annotations.Test;

public class ExpectedExceptionConcept {
	
	@Test(expectedExceptions = Throwable.class) 
	public void loginTest() {
		System.out.println("Login Test");
		int i = 9/0;
		System.out.println(i);
		
	}

}
