package Demo_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo_radio {

	public static void main(String[] args) {
		System.setProperty
		("webdriver.chrome.driver", "D:\\rupali_testing\\selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		
		//Create instance of an object chrome browser
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://mcciapune.com/events/events-registration-free/1209/");
		
		WebElement radio1= driver.findElement(By.xpath("//input[@value='Member']"));
		radio1.click();
	}

}
