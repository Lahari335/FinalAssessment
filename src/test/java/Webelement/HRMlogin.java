package Webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HRMlogin {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver", "C:\\lahari\\chromedriver.exe");
	        WebDriver driver = new ChromeDriver();
	        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"); //navigates to the site
	        driver.manage().window().maximize(); //maximizes the window
	        Thread.sleep(1000);
	        driver.findElement(By.name("username")).sendKeys("Admin"); //username field
	        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123"); //password field
	        driver.findElement(By.xpath("//button[@type='submit']")).click(); //navigates to submit button
	 

	}

}
