package Demo_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class disney_hotstar {

	public static void main(String[] args) {
		//set the property
		System.setProperty
		("webdriver.chrome.driver", "D:\\rupali_testing\\selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		
		//Create instance of an object chrome browser
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demoqa.com/automation-practice-form");
	driver.findElement(By.id("firstName")).sendKeys("Ajay");
		
		driver.findElement(By.id("lastName")).sendKeys("Shaha");
		
		driver.findElement(By.id("userEmail")).sendKeys("Ajay@gmail.com");
		
		driver.findElement(By.xpath("//input[@value=\"Male\"]")).click();
		
		
		driver.findElement(By.id("userNumber")).sendKeys("9960606060");
		driver.findElement(By.xpath("//input[@value=\"1\"]")).click();
		
	}

}
