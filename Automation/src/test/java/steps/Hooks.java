package steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

	@Before("@RegTest")
	public void beforeValidation() {
		System.out.println("RegTest Called ");
	}
	
	@After("@RegTest")
	public void afterValidation() {
		System.out.println("After validation hook");
	}
	

}
