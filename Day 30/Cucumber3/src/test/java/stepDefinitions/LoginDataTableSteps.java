package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.datatable.DataTable;

import java.util.List;
import java.util.Map;

public class LoginDataTableSteps {

    @Given("the following users attempt to login:")
    public void the_following_users_attempt_to_login(DataTable dataTable) {
        List<Map<String, String>> users = dataTable.asMaps(String.class, String.class);

        for (Map<String, String> user : users) {
            String username = user.get("username");
            String password = user.get("password");

            boolean result = authenticate(username, password);

            System.out.println("Login attempt for user: " + username +
                    " with password: " + password +
                    " => " + (result ? "SUCCESS" : "FAILURE"));
        }
    }

    private boolean authenticate(String username, String password) {
        // ✅ Extend valid credentials to include new users
        return (username.equals("user1") && password.equals("pass1")) ||
                (username.equals("user2") && password.equals("pass2")) ||
                (username.equals("user4") && password.equals("pass4")) ||
                (username.equals("user6") && password.equals("pass6"));
    }
}
