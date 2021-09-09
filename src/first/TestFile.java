package first;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.SendKeys;

public class TestFile {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\Automation\\Driver\\chromedriver.exe" );
		WebDriver driver1= new ChromeDriver();
		//Thread.sleep(500);
		//driver1.quit();
		//System.setProperty("webdriver.geckodriver.driver", "D:\\Automation\\Driver\\geckodriver.exe");
		driver1.get("https://www.reptimeqa.com/login");
		Thread.sleep(500);

		
		driver1.quit();
	}

}
