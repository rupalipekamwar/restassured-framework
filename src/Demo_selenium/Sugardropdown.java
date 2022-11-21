package Demo_selenium;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Sugardropdown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty
		("webdriver.chrome.driver","D:\\rupali_testing\\selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		
		//launch chrome browser
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
		//create a variable of web element type of static dropdown
		WebElement staticdropdown=driver.findElement(By.xpath("//select[@id='first']"));
		
		//Create object of select class
		
		Select dropdown=new Select(staticdropdown);
		//dropdown.selectByIndex(2);
		//dropdown.selectByValue("Microsoft");
		//dropdown.selectByVisibleText("Yahoo");
		
		dropdown.selectByIndex(3);
		WebElement selected =dropdown.getFirstSelectedOption();
		System.out.println("first option:"+selected.getText());
		
		//getoptions method
		List<WebElement> options=dropdown.getOptions();
		Iterator<WebElement> iterator=options.iterator();
		System.out.println("All options from dropdown");
		
		while(iterator.hasNext())
		{
			System.out.println(iterator.next().getText());
		}
				//getwrapped element method
		WebElement wrappedText=dropdown.getWrappedElement();
		System.out.println("All wrapped element");
		System.out.println(wrappedText.getText());
		
		Thread.sleep(5000);
		}
}
