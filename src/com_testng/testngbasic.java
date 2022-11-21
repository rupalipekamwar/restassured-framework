package com_testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testngbasic {
	//prerequisite conditions
	@BeforeSuite
	
	public void setup() {
		System.out.println("Set up system property");
	}
	
	@BeforeTest
	public void launchBrowser() {
		System.out.println("launch chrome browser");
		
	}
	
	@BeforeClass
	public void login() {
		System.out.println("log in methood");
	}
	@BeforeMethod
	public void enterurl() {
		
		System.out.println("enter url");
	}
	
	
	/*@Beforemethod
	 * @test case 1
	 * @aftermethod
	 * 
	 * @beforemethod
	 * @test 2
	 * @Aftermethod
	 * 
	 * @beforemethod
	 * @test case3
	 * @after method
	 */
	
	//testcase annotations
	@Test
	public void googletitleTest() {
		
		System.out.println("Google title test case");
	}
	@Test
	public void searchtest() {
		System.out.println("Search test ");
	}
	
	@Test
	public void googlelogo() {
		System.out.println("google logo");
	}
	
	//post conditions use after
	@AfterMethod
	public void logout() {
		
		System.out.println("log out from app");
	}
	
	
	@AfterClass
	public void closebrowesr() {
		System.out.println("close browser");
	}

	@AfterTest
	public void deleteallcookies() {
		System.out.println("delete all cookies");
	} 
	
	
}
