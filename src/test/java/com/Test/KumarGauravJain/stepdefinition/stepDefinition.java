package com.Test.KumarGauravJain.stepdefinition;

import org.openqa.selenium.WebDriver;

import com.Test.KumarGauravJain.utilities.home;
import com.Test.KumarGauravJain.utilities.orderHistory;

import com.Test.KumarGauravJain.utilities.placeOrder;
import com.Test.KumarGauravJain.utilities.signIn;
import com.Test.KumarGauravJain.utilities.updateProfile;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class stepDefinition {
	public static WebDriver driver;

	@Given("^launch automation practise site$")
	public void launch_automation_practise_site() throws Throwable {
		driver = home.initializeDriver();
		home.home();
	}

	@When("^select t-shirt tab and place an order$")
	public void select_t_shirt_tab_and_place_an_order() throws Throwable {
		placeOrder.placeOrder_First();
	}

	@When("^sign-in for successful checkout$")
	public void sign_in_for_successful_checkout() throws Throwable {
		signIn.signIn();
	}

	@When("^accept the agreement & place order$")
	public void accept_the_agreement_place_order() throws Throwable {
		placeOrder.placeOrder_Second();
	}

	@Then("^validate order status & the amount$")
	public void validate_order_status_the_amount() throws Throwable {
		orderHistory.orderHistory();
	}

	@When("^sign-in to access the user account$")
	public void sign_in_to_access_the_user_account() throws Throwable {
		updateProfile.UserID();
		signIn.signIn();
	}

	@When("^update user name$")
	public void update_user_name() throws Throwable {
		updateProfile.updateProfile();
	}

	@Then("^validate profile update status$")
	public void validate_profile_update_status() throws Throwable {
	    updateProfile.validateProfile();
	}

}
