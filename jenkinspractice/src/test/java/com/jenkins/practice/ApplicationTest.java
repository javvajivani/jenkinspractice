package com.jenkins.practice;

import org.junit.Assert;
import org.junit.Test;

public class ApplicationTest {

	@Test
	public void test1() {
		System.out.println("before throwing exception.");
		Assert.assertEquals("one", "one");
	}

}
