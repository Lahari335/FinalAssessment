package Webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HRMdashboard {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\lahari\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"); //navigates to this website
        driver.manage().window().maximize(); //maximizes the screen
        Thread.sleep(1000); //time units
        driver.findElement(By.name("username")).sendKeys("Admin"); 
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        //To select the info
        driver.findElement(By.linkText("My Info")).click();
        //To select the Leave
        driver.findElement(By.linkText("Leave")).click();
        //To select the PIM
        driver.findElement(By.linkText("PIM")).click();

	}

}
