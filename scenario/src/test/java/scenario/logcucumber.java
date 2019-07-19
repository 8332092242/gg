package scenario;

import java.util.List;
import java.util.Map;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class logcucumber {
	@Given("^user registered$")
	public void user_registered() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   
	}
	@When("^user enter username as username  and  password$")
	public void user_enter_username_as_username_and_password(DataTable arg1) throws Throwable {
		List<Map<String,String>>credential= arg1.asMaps(String.class,String.class);
		for(int i=0;i<credential.size();i++)
		{
			System.out.println(credential.get(i).get("username")+"\t"+ credential.get(i).get("password"));
		}
			
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
	    // E,K,V must be a scalar (String, Integer, Date, enum etc)
	   
	}


	/*@When("^user enter username as adcbg(\\d+)  and  (\\d+)$")
	public void user_enter_username_as_adcbg_and(int arg1, int arg2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println(arg1+arg2);
	    
	}

	@When("^user enter username as wrthj(\\d+)  and  (\\d+)$")
	public void user_enter_username_as_wrthj_and(int arg1, int arg2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println(arg1+arg2);
	    
	}




	/*@When("^user enter username as \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enter_username_as_and(String arg1, String arg2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	  System.out.println(arg1+arg2);
	}*/

	@Then("^user is directed to homepage$")
	public void user_is_directed_to_homepage() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}


	/*@Given("^user must be registered$")
	public void user_must_be_registered() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   
	}

	@When("^user enters the credentials and clicks on login$")
	public void user_enters_the_credentials_and_clicks_on_login() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Then("^user must be loged in$")
	public void user_must_be_loged_in() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   
	}
	@Given("^user must be logged in$")
	public void user_must_be_logged_in() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@When("^user enters all mandatory fields$")
	public void user_enters_all_mandatory_fields() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions

	}

	@Then("^user is registered$")
	public void user_is_registered() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions

	}
	@Given("^user should have browser installed$")
	public void user_should_have_browser_installed() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   System.out.println("brwoser installed");
	}

	@When("^user enters AUT URL in browser$")
	public void user_enters_AUT_URL_in_browser() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   System.out.println("entered");
	}

	@Then("^Application must open in browser$")
	public void application_must_open_in_browser() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   System.out.println("opened browser");
	}*/

}
