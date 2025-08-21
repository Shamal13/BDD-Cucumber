package StepDefinationFile;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class hooks_cases {
	WebDriver driver;

	@Before
	public void before() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://thinking-tester-contact-list.herokuapp.com/login");

		Thread.sleep(3000);

		System.out.println("BEFORE METHOD");
	}

	@After
	public void after() {

		System.out.println("AFTER METHOD");
		driver.close();

	}

	@BeforeStep
	public void beforeStep() {
		System.out.println("BEFORE-STEP METHOD");
	}

	@AfterStep
	public void afterStep() {
		System.out.println("AFTER-STEP METHOD");
	}

	@Given("user is on lpage")
	public void user_is_on_lpage() {

		System.out.println("User in on Login Page");
	}

	@When("user enters email")
	public void user_enters_email() throws InterruptedException {
		driver.findElement(By.id("email")).sendKeys("Shamalpawar1324@gmail.com");
		System.out.println("User has entered Email");
		Thread.sleep(3000);

	}

	@When("user enter password")
	public void user_enter_password() throws InterruptedException {
		driver.findElement(By.id("password")).sendKeys("Nikson.007");
		System.out.println("User has entered Password");
		Thread.sleep(3000);

	}

	@Then("click on the submit button")
	public void click_on_the_submit_button() throws InterruptedException {

		driver.findElement(By.id("submit")).click();
		System.out.println("User has clicked in Submit button");
		Thread.sleep(3000);
	}

}


