import com.bridgelabz.UserRegistration;
import org.junit.Test;

public class UserRegistrationTest {
    @Test
    public void ValidateFirstName()
    {
        UserRegistration registration=new UserRegistration();
        assertEquals(true,registration.toValidateFirstName("Tushal"));
    }

    private void assertEquals(boolean b, boolean tushal) {
    }

}
