//package second;
//
//import java.util.Iterator;
//import java.util.Set;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//public class WindowHandalingExample {
//
//	public static void main(String[] args) throws InterruptedException {
//		// TODO Auto-generated method stub
//		System.setProperty("webdriver.chrome.driver","D:\\Automation\\Driver\\chromedriver.exe" );
//		WebDriver driver=new ChromeDriver();
//		
//		driver.get("https://seleniumautomationpractice.blogspot.com/2019/04/new-window.html");
//		
//		//Get main window
//		String mainwindow = driver.getWindowHandle();
//		
//		System.out.println("*******************");
//		System.out.println("Main window name is "+ mainwindow);
//		System.out.println("*******************");
//		
//		 
//		
//		//find the button click event
//		driver.findElement(By.xpath("//*[@id='post-body-1254615876552505815']/button")).click();
//
//		//Open another window using button click event
//		Set<String> otherwindow = driver.getWindowHandles();
//		System.out.println("Child window name is "+otherwindow);
//		System.out.println("**********************");
//		Thread.sleep(5000);
//		
//		//Part3
//		//get all the window name and run them in the for loop
//		
//		for (String activewindowobj : driver.getWindowHandles()){
//			//
//			driver.switchTo().window(activewindowobj);
//			Thread.sleep(5000);
//			driver.switchTo().window(activewindowobj);
//			driver.switchTo().window(activewindowobj);
//		} 
//		driver.close();
//		/*
//		 * 
//		 * driver.get("https://www.reptimeqa.com/login");
//		 * 
//		 * driver.findElement(By.xpath("//*[@id='username']")).sendKeys("SehbasRepgroup"
//		 * ); driver.findElement(By.xpath("//*[@id='password']")).sendKeys("Reptime1!");
//		 * driver.findElement(By.xpath("//*[@id='login-btn']/app-async-button/button")).
//		 * click();
//		 */
//	}
//
//}
