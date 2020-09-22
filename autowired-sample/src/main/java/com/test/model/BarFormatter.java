package com.test.model;

import org.springframework.stereotype.Component;

@Component
public class BarFormatter implements Formatter {

	@Override
	public String format() {
		
		return "bar";
		
	}

}
