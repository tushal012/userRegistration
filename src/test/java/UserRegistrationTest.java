import com.bridgelabz.UserRegistration;
import com.bridgelabz.UserRegistrationException;
import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.junit.Assert.assertEquals;

public class UserRegistrationTest {

    UserRegistration userRegistration = new UserRegistration();
    private TestCase Assertions;

    //for firstName testcase
    @Test
    public void givenFirstName_WhenFirstLetterUpperCase_ShouldReturnTrue() {

        boolean result = userRegistration.toValidateFirstName.validate("Tushal");
        Assertions.assertTrue(result);


    }

    @Test
    public void givenFirstName_WhenEntryFieldEmpty_shouldReturnFalse() {

        boolean result = userRegistration.toValidateFirstName.validate("");
        Assertions.assertTrue(result);


    }

    @Test
    public void givenFirstName_WhenLessThanThreeChars_ShouldReturnFalse() {

        boolean result = userRegistration.toValidateFirstName.validate("tus");
        Assertions.assertTrue(result);

    }

    @Test
    public void givenFirstName_WhenHasNumber_ShouldReturnFalse() {
        boolean result = userRegistration.toValidateFirstName.validate("tushal012");
        Assertions.assertTrue(result);

    }

    @Test
    public void givenFirstName_WhenHasSpecialChar_ShouldReturnFalse() {
        boolean result = userRegistration.toValidateFirstName.validate("tushal*12");
        Assertions.assertTrue(result);

    }

    // for lastName testcases
    @Test
    public void givenLastName_WhenFirstLetterUpperCase_ShouldReturnTrue() {
        boolean result = userRegistration.toValidateFirstName.validate("Tushal012");
        Assertions.assertTrue(result);

        ;
    }


    @Test
    public void givenLastName_WhenHasNumber_ShouldReturnFalse() {
        boolean result = userRegistration.toValidatelastName.validate("kashyap");
        Assertions.assertTrue(result);

    }

    //for Email testCases
    @Test
    public void givenEmail_WhenProper_ShouldReturnTrue() {
        boolean result = userRegistration.toValidateEmail.validate("abc.syz@bl.co.in");
        Assertions.assertTrue(result);

    }

    //for phone number testcases
    @Test
    public void givenPhoneNum_WhenSpaceIsMentioned_ShouldReturnTrue() {
        boolean result = userRegistration.toValidatePhone.validate("91 9852527734");
        Assertions.assertTrue(result);

    }


    @Test
    public void givenPhoneNum_WhenLessDigits_ShouldReturnFalse() {
        boolean result = userRegistration.toValidatePhone.validate("9852527734");
        Assertions.assertTrue(result);

    }

    @Test
    public void givenPhoneNum_WhenNotStartWith91_ShouldReturnFalse() {
        boolean result = userRegistration.toValidatePhone.validate("124565398");
        Assertions.assertTrue(result);

    }

    //for password testcases
    @Test
    public void givenPassword_WhenMin8Chars_ShouldReturnTrue() {
        boolean result = userRegistration.toValidatePassword.validate("ndKl1#6*");
        Assertions.assertTrue(result);

    }

    @Test
    public void givenPassword_WhenHasLessChars_ShouldReturnFalse() {
        boolean result = userRegistration.toValidatePassword.validate("lp7*0");
        Assertions.assertTrue(result);

    }

    @Test
    public void givenPassword_WhenAtleast1UpperCase_ShouldReturnTrue() {
        boolean result = userRegistration.toValidatePassword.validate("lpk7*0");
        Assertions.assertTrue(result);

    }

    @Test
    public void givenPassword_WhenAtleast1Number_ShouldReturnTrue() {
        boolean result = userRegistration.toValidatePassword.validate("KasO8p68");
        Assertions.assertTrue(result);

    }

    @Test
    public void givenPassword_WhenNoNumeric_ShouldReturnFalse() {
        boolean result = userRegistration.toValidatePassword.validate("OPurs9pp");
        Assertions.assertTrue(result);

    }

    @Test
    public void givenPassword_WhenHasExact1SpecialChar_ShouldReturnTrue() {
        boolean result = userRegistration.toValidatePassword.validate("Po78lu^p");
        Assertions.assertTrue(result);
        ;
    }

    @Test
    public void givenPassword_WhenNoSpecialChar_ShouldReturnFlase() {
        boolean result = userRegistration.toValidatePassword.validate("78klyphj");
        Assertions.assertTrue(result);

    }

    @Test
    public void givenPassword_WhenHasMoreThan1SpecialChar_ShouldReturnFalse() {
        boolean result = userRegistration.toValidatePassword.validate("topY@t&p");
        Assertions.assertTrue(result);


    }
}
