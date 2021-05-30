import com.bridgelabz.UserRegistration;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UserRegistrationTest {
    @Test
    public void ValidateFirstName() {
        UserRegistration registration = new UserRegistration();
        assertEquals(true, registration.toValidateFirstName("Tushal"));
    }


    @Test
    public void validateLastName() {
        UserRegistration registration = new UserRegistration();
        assertEquals(true, registration.toValidateLastName("kumar"));

    }

    @Test
    public void validateEmail() {
        UserRegistration registration = new UserRegistration();
        assertEquals(true, registration.toValidateEmails("abc.xyz@yahoo.co.in"));
    }
}
