package StepDefinationFile;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class background {
	
		WebDriver driver;

		@Given("User is on the Loginpage")
		public void user_is_on_the_loginpage() throws InterruptedException {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\Admin\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

			driver = new ChromeDriver();

			driver.manage().window().maximize();

			driver.get("https://thinking-tester-contact-list.herokuapp.com/login");

			Thread.sleep(3000);
		}

		@When("User clicks on the signup button")
		public void user_clicks_on_the_signup_button() throws InterruptedException {

			driver.findElement(By.id("signup")).click();
			Thread.sleep(3000);

		}

		@Then("User enters fname and lname")
		public void user_enters_fname_and_lname() throws InterruptedException {

			driver.findElement(By.id("firstName")).sendKeys("Shamal");
			Thread.sleep(3000);
			driver.findElement(By.id("lastName")).sendKeys("Sonawane");
			Thread.sleep(3000);
		}

		@Then("User clicks on submitButton")
		public void user_clicks_on_submit_button() throws InterruptedException {

			driver.findElement(By.id("submit")).click();
			Thread.sleep(3000);
			driver.close();
		}

		@Then("User enters email and password")
		public void user_enters_email_and_password() throws InterruptedException {
			driver.findElement(By.id("email")).sendKeys("Shamalpawar1324@gmail.com");
			Thread.sleep(3000);
			
			driver.findElement(By.id("password")).sendKeys("Nikson.007");
			Thread.sleep(3000);
		}

		@Then("User clicks on cancel button")
		public void user_clicks_on_cancel_button() throws InterruptedException {

			driver.findElement(By.id("cancel")).click();
			Thread.sleep(3000);
			
			
			
		}

	}
