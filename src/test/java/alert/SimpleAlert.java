package alert;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

public class SimpleAlert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\lahari\\chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		  driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		driver.get("https://netbanking.hdfcbank.com/netbanking/");//navigate to the page
		driver.manage().window().maximize();//maximize the window
		driver.switchTo().frame("login_page");//Switch to the login frame
		driver.findElement(By.linkText("CONTINUE")).click();//click on the continue button
		Thread.sleep(5000);
		Alert hdfc =driver.switchTo().alert();//instantiate alert class
		hdfc.accept();//to click on OK in alert box

	}

}
