package second;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class iFrame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","D:\\Automation\\Driver\\chromedriver.exe" );
		WebDriver driver= new ChromeDriver();
		driver.get("https://seleniumautomationpractice.blogspot.com/2019/07/example-of-html-iframe-alternative.html");

		// Insert data into First frame 
		driver.switchTo().frame("ID_Frame1");
		driver.findElement(By.xpath("//*[@id='ts_first_name']")).sendKeys("User first name");
		
		//Back to main frame
		
		driver.switchTo().parentFrame();
		
		// Select Second frame and insert data in text field.
		driver.switchTo().frame("ID_Frame2");
		driver.findElement(By.name("firstname")).sendKeys("Hello Tester");
		
	}

}
