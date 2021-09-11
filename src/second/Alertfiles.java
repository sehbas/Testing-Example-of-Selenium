package second;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertfiles {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\Automation\\Driver\\chromedriver.exe" );
		WebDriver driver= new ChromeDriver();
		driver.get("https://seleniumautomationpractice.blogspot.com/2018/01/blog-post.html");
		driver.findElement(By.xpath("//*[@id=\"alert\"]")).click();
		Alert simplealert= driver.switchTo().alert();
//		Thread.sleep(3000);
		
		System.out.println(simplealert.getText());
		//Thread.sleep(3000);
		simplealert.accept();
		/*
		 * Thread.sleep(3000); driver.quit();
		 */
	
	}

}
