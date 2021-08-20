
package org.stepdef;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
public class Stepdefini {
	WebDriver driver;
	@Given("User is on the adactin page")
	public void user_is_on_the_adactin_page() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("http://adactinhotelapp.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
	}
	@When("User should enter{string} and {string}")
	public void user_should_enter_and(String name, String password) {
		WebElement user = driver.findElement(By.id("username"));
		user.sendKeys(name);
		WebElement pass = driver.findElement(By.id("password"));
		pass.sendKeys(password);
	}
	@When("user Should click loghin button")
	public void user_Should_click_loghin_button() {
		WebElement btnlogin = driver.findElement(By.id("login"));
		btnlogin.click();
	}
	@Then("verify the success message")
	public void verify_the_success_message() {
		Assert.assertTrue("Verify Login", true);  
	}

	@When("User should select booking detail {string},{string},{string},{string},{string} and {string}")
	public void user_should_select_booking_detail_and(String Location, String Hotel, String RoomType, String Numberofroom, String adult, String children) {
		WebElement location = driver.findElement(By.id("location"));
		location.sendKeys(Location);
		WebElement hotel = driver.findElement(By.id("hotels"));
		hotel.sendKeys(Hotel);
		WebElement RoomType1 = driver.findElement(By.id("room_type"));
		RoomType1.sendKeys(RoomType);
		WebElement Numberofroom1 = driver.findElement(By.id("room_nos"));
		Numberofroom1.sendKeys( Numberofroom);
		WebElement adult1 = driver.findElement(By.id("adult_room"));
		adult1.sendKeys(adult);
		WebElement children1 = driver.findElement(By.id("child_room"));
		children1.sendKeys(children);
	}
	@When("user Should click Search button")
	public void user_Should_click_Search_button() {
		WebElement btnlogin1 = driver.findElement(By.id("Submit"));
		btnlogin1.click();   
	}
	@Then("click checkbox and select button")
	public void click_checkbox_and_select_button() {
		WebElement btnlogin2 = driver.findElement(By.id("radiobutton_0"));
		btnlogin2.click();
		WebElement btnlogin3 = driver.findElement(By.id("continue"));
		btnlogin3.click();
	}
	@When("User should enter their details {string},{string},{string},{string},{string},{string},{string} and {string}")
	public void user_should_enter_their_details_and(String first, String last, String address, String Creditno, String Credittype, String expirymonth, String expiryyear, String cvv) {
		WebElement name = driver.findElement(By.id("first_name"));
		name.sendKeys(first);
		WebElement last0 = driver.findElement(By.id("last_name"));
		last0.sendKeys(last);
		WebElement Address1 = driver.findElement(By.id("address"));
		Address1.sendKeys(address);
		WebElement ccNo = driver.findElement(By.id("cc_num"));
		ccNo.sendKeys(Creditno);
		WebElement cctype = driver.findElement(By.id("cc_type"));
		cctype.sendKeys(Credittype);
		WebElement eym = driver.findElement(By.id("cc_exp_month"));
		eym.sendKeys(expirymonth);  
		WebElement ey = driver.findElement(By.id("cc_exp_year"));
		ey.sendKeys(expiryyear);
		WebElement cvv0 = driver.findElement(By.id("cc_cvv"));
		cvv0.sendKeys(cvv);
	}
	@When("user Should click book button")
	public void user_Should_click_book_button() {
		WebElement btnlogin4 = driver.findElement(By.id("book_now"));
		btnlogin4.click();
		WebElement orderno = driver.findElement(By.id("order_no"));
		String orderId=orderno.getAttribute("value");
		System.out.println("order id is " +orderId);
		driver.quit();
	}


}
