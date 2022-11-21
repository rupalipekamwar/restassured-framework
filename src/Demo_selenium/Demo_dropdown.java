package Demo_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_dropdown {

	public static void main(String[] args) throws InterruptedException {
		//set the path
		System.setProperty
		("webdriver.chrome.driver","D:\\rupali_testing\\selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		
		//launch chrome browser
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/dropdown");
		Thread.sleep(5000);
		WebElement dropdown1=driver.findElement(By.xpath("//option[@value='1']"));
		dropdown1.click();
		
		System.out.println(dropdown1.getText());

	}

}
