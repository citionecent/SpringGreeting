package com.bitbybit.web.controller;

import java.util.logging.Logger;

public class GreetingController {

	protected static Logger logger = Logger.getLogger("GreetingController");
	
	public String showAllGreetings() {
		logger.info("entering method showAllGreetings()");
		return "some result";
	}
	
}
