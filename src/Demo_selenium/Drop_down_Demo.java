package Demo_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Drop_down_Demo {

	public static void main(String[] args) {
		
		//Set the property
		System.setProperty
		("webdriver.chrome.driver", "D:\\rupali_testing\\selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		
		//launch chrome browser by using chrome browser interface
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://login.yahoo.com/");
		
		driver.findElement(By.xpath("//a[@id='createacc']")).click();
		driver.findElement(By.xpath("//input[@id='usernamereg-firstName']")).sendKeys("John");
		driver.findElement(By.xpath("//input[@id='usernamereg-lastName']")).sendKeys("Dheere");
		driver.findElement(By.xpath("//input[@name='userId']")).sendKeys("John@yahoo");
		driver.findElement(By.xpath("//input[@id='usernamereg-password']")).sendKeys("123456");
		driver.findElement(By.xpath("//input[@id='usernamereg-birthYear']")).sendKeys("1990");
		driver.findElement(By.xpath("//button[@id='reg-submit-button']")).click();
		
		
		
		/*WebElement day=driver.findElement(By.id("day"));
		WebElement month=driver.findElement(By.id("month"));
		WebElement year=driver.findElement(By.id("Year"));
		
		Select select=new Select(day);
		select.selectByVisibleText("25");*/
		
	}

}
