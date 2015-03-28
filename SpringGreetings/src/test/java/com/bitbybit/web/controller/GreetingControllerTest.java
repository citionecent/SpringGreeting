package com.bitbybit.web.controller;

import org.junit.Test;
import static org.junit.Assert.assertNotNull;

public class GreetingControllerTest {
		
	@Test
	public void showAllGreetingsMethodShouldReturnAResult() {	
	    GreetingController controller = new GreetingController();
	    String result = controller.showAllGreetings();
	    assertNotNull(result);
	}
	
}
