package Selenium;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstExample {

	public static void main(String[] args) {
				// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\driver\\October\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.geeksforgeeks.org/");	}

}
