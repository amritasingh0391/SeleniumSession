package testngSessions;

import org.testng.annotations.Test;

public class PriorityTest {
	
	@Test(priority = 0)
	public void a_test() {
		System.out.println("a Test");
	}
	
	@Test(priority = -1)
	public void b_test() {
		System.out.println("b Test");
	}
	
	@Test
	public void c_test() {
		System.out.println("c Test");
	}

	@Test
	public void d_test() {
		System.out.println("d Test");
	}
	
	@Test(priority = 1)
	public void e_test() {
		System.out.println("e Test");
	}
	
	
}
