package Demo_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class action_classdemo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty
		("webdriver.chrome.driver","D:\\rupali_testing\\selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://jqueryui.com/droppable/");
		
		WebElement source=driver.findElement(By.id("draggable"));
		WebElement target=driver.findElement(By.id("droppable"));
		
		//Create object of action class
		Actions Act=new Actions(driver);
		
		Act.
		clickAndHold(source).
		moveToElement(target).
		release().
		build().perform();
		
		Thread.sleep(5000);
		driver.quit();
	}

}
