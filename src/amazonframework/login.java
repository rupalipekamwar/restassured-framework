package amazonframework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class login {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty
		("webdriver.chrome.driver","D:\\rupali_testing\\selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		
		//launch chrome browser
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		WebElement login=driver.findElement(By.xpath("//a[@id='nav-logo-sprites']"));
		login.click();
		
		//driver.findElement(By.xpath("//span[contains(text(),'India')]")).click();
		//implicit wait(2000);
		
		WebElement ind=driver.findElement(By.xpath("//input[@id='GLUXZipUpdateInput']"));
		ind.sendKeys("1234");
		
		//Create a variaable of web element type for the static droodown
		WebElement dropdown =driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
		dropdown.click();
		Select staticdropdown=new Select(dropdown);
		//staticdropdown.selectByVisibleText("Amazon Fresh");
		staticdropdown.selectByIndex(3);
		Thread.sleep(3000);
		driver.quit();
	}

}
