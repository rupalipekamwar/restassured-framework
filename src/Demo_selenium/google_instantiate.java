package Demo_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class google_instantiate {

	public static void main(String[] args) {
		
		//set the property to 
		//System.setProperty("webdriver.chrome.driver", "D:\\rupali_testing\\selenium\\chromedriver_win32 (1)\\chromedriver_win32.exe");
		System.setProperty("webdriver.chrome.driver","D:\\rupali_testing\\selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		//create instance of chrome browser
		
		WebDriver driver =new ChromeDriver();
		
		//Launch the amazon browser
		driver.get("https://www.amazon.com/");
		driver.findElement(By.id("nav-link-accountList-nav-line-1")).click();
		driver.findElement(By.id("ap_email")).sendKeys("9960836199");
		driver.findElement(By.id("continue")).click();
		driver.findElement(By.id("ap_password")).sendKeys("123456");
		driver.findElement(By.id("signInSubmit")).click();
		String title=driver.getTitle();
		System.out.println(title);
		
		
	}

}
