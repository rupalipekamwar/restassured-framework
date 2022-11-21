package com_testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class googletitletestcase {
	
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
	
	
	@Test
	public void googleTitleTest() {
		String title=driver.getTitle();
		System.out.println(title);
		
		Assert.assertEquals(title, "Google123","title is not match");
		
	}
	
	@Test
	public void googlelogotest() {
	boolean b=driver.findElement(By.xpath("//img[@alt='Google']")).isDisplayed();
	Assert.assertTrue(b);
	}
	
	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}
	

}
