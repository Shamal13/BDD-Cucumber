package StepDefinationFile;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class datadrivenTesting {

	WebDriver driver;

	@Given("User is on LoginPage")
	public void user_is_on_login_page() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\Admin\\\\Downloads\\\\chromedriver-win64\\\\chromedriver-win64\\\\chromedriver.exe");

		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://thinking-tester-contact-list.herokuapp.com/login");

		Thread.sleep(3000);

	}
	@When("User is providing {string} & {string}")
	public void user_is_providing(String username, String password) throws InterruptedException {

		driver.findElement(By.id("email")).sendKeys(username);
		Thread.sleep(3000);

		driver.findElement(By.id("password")).sendKeys(password);
		Thread.sleep(3000);

	}

	@Then("User is clicking on the SubmitButton")
	public void user_is_clicking_on_the_submit_button() throws InterruptedException {

		driver.findElement(By.id("submit")).click();
		Thread.sleep(3000);
	}

	@Then("Verifying the title of the page")
	public void verifying_the_title_of_the_page() {

		String title = driver.getTitle();
		System.out.println("Title of the page = " + title);

		if (title.equals("My Contact")) {

			System.out.println("Test case Pass");

		}

		else {
			System.out.println("Test Case Failed");
		}

}

}
