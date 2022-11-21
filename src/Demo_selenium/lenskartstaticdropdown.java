package Demo_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class lenskartstaticdropdown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty
		("webdriver.chrome.driver","D:\\rupali_testing\\selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		
		//launch chrome browser
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.lenskart.com/eyeglasses/collections/all-computer-glasses.html");
		//Create a variable of webElemnet type for static dropdown
		WebElement dropdown =driver.findElement(By.xpath("//select[@class='select-lk']"));
		
		//create select class object
		Select staticdropdown =new Select(dropdown);
		//staticdropdown.selectByIndex(2);
		//staticdropdown.selectByValue("popular");
		staticdropdown.selectByVisibleText("Biggest Saving");
		Thread.sleep(4000);
		//driver.quit();
	}

}
