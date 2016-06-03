package com.sample;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class TestDateTimeServlet {

	@Test
	public void testWriteText(){
		DateTimeServlet dateTimeServlet = new DateTimeServlet();
		String text = dateTimeServlet.writeText();
		assertNotNull(text);
	}
}
