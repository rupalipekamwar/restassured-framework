package Demo_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Amazon_dropdown {

	public static void main(String[] args) throws InterruptedException {
		//Set the location 
		System.setProperty
		("webdriver.chrome.driver","D:\\rupali_testing\\selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		
		//launch chrome browser
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		//Create a variable of web element type for static dropdown
		WebElement dropdown =driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
		
		//Create the object of select class
		Select staticdropdown =new Select(dropdown);
		//staticdropdown.selectByVisibleText("Amazon Fresh");
		//staticdropdown.selectByValue("search-alias=alexa-skills");
		//staticdropdown.selectByIndex(11);
		
		//Fetch  the count of all options in the dropdown
		dropdown.click();
		int count=driver.findElements(By.xpath("//select[@id=\"searchDropdownBox\"]//option")).size();
		System.out.println("count of dropdown available are"+count);
		for(int i=0;i<count;i++)
		{
			//staticdropdown.selectByIndex(i);
			driver.findElements(By.xpath("//select[@id=\"searchDropdownBox\"]//option")).get(i).click();
		}
		
		Thread.sleep(2000);
		driver.quit();		
		}

}
