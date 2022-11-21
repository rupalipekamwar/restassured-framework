package com_testng;

import org.testng.annotations.Test;

public class invocationcounttest {

	@Test(invocationCount=5)
	public void sum() {
		
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println("sum="+c);
	}
}
