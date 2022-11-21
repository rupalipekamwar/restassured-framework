package com_testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class googletest {
	
	WebDriver driver;
	@BeforeMethod
	public void setup() {
		System.setProperty
		("webdriver.chrome.driver","D:\\rupali_testing\\selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://www.google.com");
		//driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		//driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
	}
	
	@Test(priority=1,groups="Google  title")
	public void googleTitleTest() {
		String title=driver.getTitle();
		System.out.println(title);
		
	}
	@Test(priority=2,groups="test")
	public void googlelogotest() {
	boolean b=driver.findElement(By.xpath("//img[@alt='Google']")).isDisplayed();	
	}
	
	@Test(priority=3,groups="linktext")
	public void linktest() {
	boolean b=driver.findElement(By.linkText("GMail")).isDisplayed();
	}
	
	@Test(priority=4,groups="test")
	public void test1() {
		System.out.println("test1");
	}
	@Test(priority=5,groups="test")
	public void test2() {
		System.out.println("test1");
	}
	@Test(priority=6,groups="test")
	public void test3() {
		System.out.println("test1");
	}
	
	
	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}
	

}
