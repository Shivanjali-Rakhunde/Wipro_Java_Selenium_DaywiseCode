package stepDefinitions;

import io.cucumber.java.en.*;
import io.cucumber.datatable.DataTable;
import model.User;

import java.util.*;
import java.util.stream.Collectors;

import static org.junit.Assert.*;

public class UserSteps1 {

    private List<User> users;

    @Given("the following user data:")
    public void the_following_user_data(DataTable table) {
        List<Map<String, String>> rows = table.asMaps(String.class, String.class);

//Java Streams ===sequence of characters
        users = rows.stream()
                .map(row -> new User(
                        row.get("name"),
                        Integer.parseInt(row.get("age")),
                        row.get("email")))
                .collect(Collectors.toList()); // again converts the stream to a List
    }

    @When("I process the user data")
    public void i_process_the_user_data() {
        users.forEach(user -> System.out.println("User: " + user));
    }


    @Then("I should have {int} users")
    public void i_should_have_users(Integer expectedCount) {
        assertEquals(expectedCount.intValue(), users.size());
    }

    @Then("all emails should contain \"@\"")
    public void all_emails_should_contain_at() {
        for (User user : users) {
            assertTrue("Email missing '@': " + user.getEmail(), user.getEmail().contains("@"));
        }
    }

    @Then("all emails should contain \".\"")
    public void all_emails_should_contain_at1(){
        for (User user : users){
            assertTrue("Email missing '.': "+ user.getEmail(), user.getEmail().contains("."));
        }
    }
}

