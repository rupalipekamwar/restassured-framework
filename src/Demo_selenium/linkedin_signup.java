package Demo_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class linkedin_signup {

	public static void main(String[] args) throws InterruptedException {
		
		//set the property
	System.setProperty("webdriver.chrome.driver", "D:\\rupali_testing\\selenium\\chromedriver_win32 (1)\\chromedriver.exe");
	//System.setProperty("webdriver.chrome.driver","D:\\rupali_testing\\selenium\\chromedriver_win32 (1)\\chromedriver.exe");
	//create instance of chrome browser
	
			WebDriver driver =new ChromeDriver();
			
			//Launch the linked browser
			driver.get("https://www.mca.gov.in/content/mca/global/en/contact-us/roc.html");
			driver.findElement(By.linkText("About MCA")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.linkText("Result Framework Document")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.id("pagination-values")).sendKeys("5");
			Thread.sleep(2000);
			
			
			//driver.close();
			
	}

}
