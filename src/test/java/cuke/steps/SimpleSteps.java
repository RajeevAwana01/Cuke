package cuke.steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class SimpleSteps {
	
	
	
	@Before()
	public void startScenario() {
		System.out.println("Starting Scenario...");
	}
	
	@After()
	public void finishScenario() {
		System.out.println("Finishing Scenario...");
	}

}
