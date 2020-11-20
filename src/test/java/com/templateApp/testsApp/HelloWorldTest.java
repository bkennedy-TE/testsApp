package com.templateApp.testsApp;

import org.junit.Assert;
import org.junit.Test;

public class HelloWorldTest {

	@Test
	public void shouldReturnHelloWorld() {
		HelloWorld helloWorld = new HelloWorld();
		String returnValue = helloWorld.sayHello();
		Assert.assertEquals("Hello World!", returnValue);
	}
}
