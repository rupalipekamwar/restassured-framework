package Demo_selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class popup {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty
		("webdriver.chrome.driver","D:\\rupali_testing\\selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.xpath("//input[@name=\"proceed\"]")).click();
		
		Thread.sleep(5000);
		Alert alert=driver.switchTo().alert();
		alert.getText();
		System.out.println(alert.getText());
		String text=alert.getText();
		
		if(text.equals("Please enter a valid user name"))
		{
			System.out.println("Correct msg");
		}
		else
		{
			System.out.println("Incorrect msg");
		}
		//click on ok buttton
		alert.accept();  
		
		
		
		//alert.dismiss();  for cancel    
		

	}

}
