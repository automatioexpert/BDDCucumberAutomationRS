package steps;

import java.util.List;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStep {

	@Given("^User is on NetBanking landing page$")
	public void user_is_on_net_banking_landing_page() {

		System.out.println("user_is_on_net_banking_landing_page");
	}

	@When("User log into the application with {string} and {string}")
	public void user_log_into_the_application_with_and(String string, String string2) {
		System.out.println(string + " : " + string2);
	}

	@When("User sign up with following details")
	public void user_sign_up_with_following_details(io.cucumber.datatable.DataTable dataTable) {
		// Write code here that turns the phrase above into concrete actions
		// For automatic transformation, change DataTable to one of
		// E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
		// Map<K, List<V>>. E,K,V must be a String, Integer, Float,
		// Double, Byte, Short, Long, BigInteger or BigDecimal.
		//
		// For other transformations you can register a DataTableType.
		// throw new io.cucumber.java.PendingException();

		// List<String> obj=dataTable.asList();
		List<List<String>> obj2 = dataTable.asLists();
		System.out.println(obj2.get(0).get(0));
		System.out.println(obj2.get(0).get(1));
		System.out.println(obj2.get(0).get(2));
		System.out.println(obj2.get(0).get(3));
		System.out.println("===================");
		System.out.println(obj2.get(1).get(0));
		System.out.println(obj2.get(1).get(1));
		System.out.println(obj2.get(1).get(2));
		System.out.println(obj2.get(1).get(3));

	}

	@When("^User sign up with (.+) and (.+)$")
	public void user_sign_up_with_user1_and_password1(String user1, String user2) {
		System.out.println(user1 + " : " + user2);
	}

	@Then("Home page is populated")
	public void home_page_is_populated() {
		System.out.println("home_page_is_populated");
	}

	@Then("Cards are displayed are {string}")
	public void cards_are_displayed_are(String string) {
		System.out.println("cards_are_displayed_are: " + string);
	}

	/*
	 * @Then("Cards are displayed") public void cards_are_displayed() {
	 * System.out.println("cards_are_displayed"); }
	 */

	@Given("validate the browser")
	public void validate_the_browser() {
		System.out.println("Background: validate the browser");
	}

	@When("browser is triggered")
	public void browser_is_triggered() {
		System.out.println("Background: browser_is_triggered");
	}

	@Then("check if browser is launched")
	public void check_if_browser_is_launched() {
		System.out.println("Background: check if browser is launched");

	}
}
