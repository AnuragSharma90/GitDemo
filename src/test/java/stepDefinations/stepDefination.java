package stepDefinations;


import org.junit.Assert;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Cucumber.Automation.Base;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
public class stepDefination {
	public WebDriver driver;


    @Given("^User on the Greenkart Landing Page$")
    public void user_on_the_greenkart_landing_page() throws Throwable {
    	driver=Base.getDriver();
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
    }

    @When("^User searched for \"([^\"]*)\" Vegetable$")
    public void user_searched_for_something_vegetable(String strArg1) throws Throwable {
        driver.findElement(By.xpath("//input[@type='search']")).sendKeys(strArg1);
       Thread.sleep(3000);
    }

    @Then("^\"([^\"]*)\" results are displayed$")
    public void something_results_are_displayed(String strArg1) throws Throwable {
        Assert.assertTrue(driver.findElement(By.cssSelector("h4.product-name")).getText().contains(strArg1));
    }
   
    @Then("^verify selected \"([^\"]*)\" items are displayed in Checkout page$")
    public void verify_selected_something_items_are_displayed_in_checkout_page(String strArg1) throws Throwable {
    	Assert.assertTrue(driver.findElement(By.cssSelector("p.product-name")).getText().contains(strArg1));
    }

    @And("^User added items to Kart$")
    public void user_added_items_to_kart() throws Throwable {
        driver.findElement(By.cssSelector("a.increment")).click();
        driver.findElement(By.xpath("//button[contains(text(),'ADD TO CART')]")).click();
        driver.findElement(By.xpath("//a[@class='cart-icon']//img[contains(@class,'')]")).click();
        driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
    }

   

    
    



}
