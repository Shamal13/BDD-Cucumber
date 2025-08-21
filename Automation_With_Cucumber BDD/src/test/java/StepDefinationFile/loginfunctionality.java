package StepDefinationFile;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class loginfunctionality {
	
	WebDriver driver;
	@Given("user is on login page")
	public void user_is_on_login_page() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://thinking-tester-contact-list.herokuapp.com/login");
		Thread.sleep(3000);
	}
	@When("user enters username")
	public void user_enters_username() throws InterruptedException {
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Shamalpawar1324@gmail.com");
		System.out.println("User has entered Email");
		Thread.sleep(3000);
	}
	@Then("user enters password")
	public void user_enters_password() throws InterruptedException {
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Nikson.007");
		System.out.println("User has entered Password");
		Thread.sleep(3000);
	}
	
	@Then("user click on login button")
	public void user_click_on_login_button() throws InterruptedException {

		driver.findElement(By.id("submit")).click();
		System.out.println("User has clicked in Submit button");
		Thread.sleep(3000);
	}
	@Then("user is verifying the title")
	public void user_is_verifying_the_title() throws InterruptedException {
		String a = driver.getTitle();
		System.out.println("Title of the page = " + a);
		
		Thread.sleep(3000);
		
		
}
}