package com_testng;

import org.testng.annotations.Test;

public class testngclass {
	@Test
	public void loginTest()
	{
		System.out.println("login text");
		//int i=9/0;
	}
	
	@Test(dependsOnMethods="loginTest")
	public void HomePageTest()
	{
		System.out.println("homepage text");
	}
	@Test(dependsOnMethods="loginTest")
	public void searchTest()
	{
		System.out.println("Search text");
	} 
	
	@Test(dependsOnMethods="loginTest")
	public void registrationTest() {
		System.out.println("Registration test");
	}
	

}
