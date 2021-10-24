//package first;
//
//import java.util.concurrent.TimeUnit;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//public class XpathFile {
//
//	public static void main(String[] args) throws InterruptedException {
//		// TODO Auto-generated method stub
//		System.setProperty("webdriver.chrome.driver","D:\\Automation\\Driver\\chromedriver.exe" );
//		WebDriver driver= new ChromeDriver();
//		
//	driver.get("https://www.reptimeqa.com/login");
//	//Login Flow
//			driver.findElement(By.xpath("//*[@id='username']")).sendKeys("SehbasRepgroup");		
//			driver.findElement(By.xpath("//*[@id='password']")).sendKeys("Reptime1!");
//			//Thread.sleep(500);
//			driver.findElement(By.xpath("//span[@class='ui-button-text ui-clickable']")).click();
//	//Thread.sleep(5000);
//	//PageLoadout		
//		//	driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
//	//Order Booking 
//	/*
//	 * driver.findElement(By.
//	 * xpath("//*[contains(@class='ui-button-text ui-clickable')][normalize-space()='New Order']"
//	 * )).click(); System.out.println("Button found");
//	 */
//		//driver.close();
//	}
//
//}
