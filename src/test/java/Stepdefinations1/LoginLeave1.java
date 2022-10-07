package Stepdefinations1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class LoginLeave1 {
 private static WebDriver driver = null;
	 
	 //Login user
	@Given("User should be able to navigate to HRM website")
	public void User_should_be_able_to_navigate_to_HRM_website() {
		System.setProperty("webdriver.chrome.driver", "C:\\lahari\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	
	@And("Enter Username and password and click Login button")
	public void Enter_Username_and_password_and_click_Login_button(io.cucumber.datatable.DataTable dataTable) {
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
		java.util.List<java.util.List<String>> data = dataTable.asLists();
	    System.out.println(data.get(1).get(1)); 
	      
	      driver.findElement(By.xpath("//div/input[@name = 'username'] ")).sendKeys(data.get(1).get(0));
	      driver.findElement(By.xpath("//input[@type= 'password'] ")).sendKeys(data.get(1).get(1));
	      driver.findElement(By.xpath("//button")).click();
	}
	
	//Search function using method overload
	@Given("Now click on Admin element")
	public void Now_click_on_admin_element(){
		driver.findElement(By.xpath("//a/span")).click();
	}
	
	@Then("Enter Username as {string}")
	public void search(String string) {
		driver.findElement(By.xpath("//form//div[2]//input")).sendKeys(string);
		driver.findElement(By.xpath("//form//div//button[2]")).click();
	}
	
	
	@Then("Enter Username as {string} and employeeName as {string}")
	public void search(String string, String string2) {
		driver.findElement(By.xpath("//form//div[2]//input")).sendKeys(string);
		driver.findElement(By.xpath("//div/div[2]/div/div/input")).sendKeys(string2);
		driver.findElement(By.xpath("//form//div//button[2]")).click();	
	
	 }
	//Apply leave
	@Given("Click Leave button")
	public void click_leave_element() {
		driver.findElement(By.linkText("Leave")).click();
	}

	@Then("Select Apply option")
	public void click_on_apply_option() {
		driver.findElement(By.linkText("Apply")).click();
	}

	@Then("Select leave type")
	public void select_leave_type() {
		 driver.findElement(By.xpath("//div[@class='oxd-select-text oxd-select-text--active']/div[2]/i")).click();
		 driver.findElement(By.xpath("//*[contains(text(),'CAN')]")).click();
	}

	@Then("Choose the dates")
	public void choose_the_dates() {
		driver.findElement(By.xpath("//div[@class='oxd-date-input']/input")).sendKeys("2022-02-09");
	}

	@Then("give the reason")
	public void give_the_reason() {
		driver.findElement(By.xpath("//textarea")).sendKeys("Personal leave");
	}

	@Then("click Apply button")
	public void click_apply_button() {
		driver.findElement(By.xpath("//button[@type='submit']")).click();	
	}	

}