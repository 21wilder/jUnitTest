package jUnitTestPackage;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;

public class testAddStrings {

	@Test
	public void test() {
		jUnitFunctions junit = new jUnitFunctions();
		String result = junit.AddStrings("Hello", " World");
		assertEquals("Hello World",result);
	}
}
