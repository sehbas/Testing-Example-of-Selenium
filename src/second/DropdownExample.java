package second;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Automation\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		 driver.get("https://seleniumautomationpractice.blogspot.com/2017/10/automation-testing-sample_28.html");

		 //select the dropdown
		 Select obj= new Select(driver.findElement(By.xpath("//*[@id='ts_country']")));
		
		 //select the value using visible text
		 obj.selectByVisibleText("India");
		 Thread.sleep(5000);
		 
	//	 select the value using index of the value
		 obj.selectByIndex(0);
		 Thread.sleep(5000);
				 
		 // select using value
		 
		obj.selectByValue("3"); 
		Thread.sleep(5000);
		
		driver.quit();
		 
	}

}
