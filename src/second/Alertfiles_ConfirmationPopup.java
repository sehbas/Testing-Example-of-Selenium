package second;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertfiles_ConfirmationPopup {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\Automation\\Driver\\chromedriver.exe" );
		WebDriver driver1= new ChromeDriver();
		driver1.get("https://seleniumautomationpractice.blogspot.com/2018/01/blog-post.html");
		driver1.findElement(By.xpath("//*[@id=\"confirm\"]")).click();
		Alert confirmationalert= driver1.switchTo().alert();
		Thread.sleep(500);
		confirmationalert.dismiss();
		
	}

}
