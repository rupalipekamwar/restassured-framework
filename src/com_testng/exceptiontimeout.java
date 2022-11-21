package com_testng;

import org.testng.annotations.Test;

public class exceptiontimeout {
	
	/*@Test(invocationTimeOut=2,expectedExceptions=NumberFormatException.class)
	public void infiniteloop() {
		int i=1;
		while(i==1)
		{
			System.out.println(i);
		}
	}*/
	
	//we want try catch
	@Test(expectedExceptions=NumberFormatException.class)
	public void test1() {
		
		String x="100A";
		Integer.parseInt(x);
		}

}
