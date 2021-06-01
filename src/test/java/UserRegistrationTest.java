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
    public void givenFirstName_WhenFirstLatterUpperCase_ShouldReturnTrue() {

        boolean result = userRegistration.toValidateFirstName.validate("tushal");
        Assertions.assertTrue(result);
        userRegistration.checkException(result);

    }
    @Test
    public void givenFirstName_WhenEntryFieldNull_shouldReturnFalse(){

        boolean result = userRegistration.toValidateFirstName.validate("");
        Assertions.assertTrue(result);
        userRegistration.checkException(result);

    }
    @Test
    public void givenFirstName_WhenLessThanThreeChars_ShouldReturnFalse() {

        boolean result = userRegistration.toValidateFirstName.validate("tus");
        Assertions.assertTrue(result);
        userRegistration.checkException(result);
    }

    @Test
    public void givenFirstName_WhenHasNumber_ShouldReturnFalse() {
        boolean result = userRegistration.toValidateFirstName.validate("tushal012");
        Assertions.assertTrue(result);
        userRegistration.checkException(result);
    }

    @Test
    public void givenFirstName_WhenHasSpecialChar_ShouldReturnFalse() {
        boolean result = userRegistration.toValidateFirstName.validate("tushal012");
        Assertions.assertTrue(result);
        userRegistration.checkException(result);
    }
    // for lastName testcases
    @Test
    public void givenLastName_WhenFirstLetterUpperCase_ShouldReturnTrue(){
        boolean result = userRegistration.toValidateFirstName.validate("tushal012");
        Assertions.assertTrue(result);
        userRegistration.checkException(result);;
    }


    @Test
    public void givenLastName_WhenHasNumber_ShouldReturnFalse() {
        boolean result = userRegistration.toValidatelastName.validate("kashyap");
        Assertions.assertTrue(result);
        userRegistration.checkException(result);
    }

    //for Email testCases
    @Test
    public void givenEmailId_WhenProper_ShouldReturnTrue(){
        boolean result = false;
        try {
            result = userRegistration.toValidateEmail("abc.syz@bl.co.in");
        } catch (UserRegistrationException exception) {
            exception.printStackTrace();
        }
        Assertions.assertTrue(result);
    }
    //for phone number testcases
    @Test
    public void givenPhoneNum_WhenSpaceIsMentioned_ShouldReturnTrue(){
        boolean result = false;
        try {
            result = userRegistration.toValidatePhone("91 9852527734");
        } catch (UserRegistrationException exception) {
            exception.printStackTrace();
        }
        Assertions.assertTrue(result);
    }


    @Test
    public void givenPhoneNum_WhenLessDigits_ShouldReturnFalse() {
        boolean result = false;
        try {
            result = userRegistration.toValidatePhone("9852527734");
        } catch (UserRegistrationException exception) {
            exception.printStackTrace();
        }
        Assertions.assertFalse(result);
    }

    @Test
    public void givenPhoneNum_WhenNotStartWith91_ShouldReturnFalse() {
        boolean result = false;
        try {
            result = userRegistration.toValidatePhone("123789456");
        } catch (UserRegistrationException exception) {
            exception.printStackTrace();
        }
        Assertions.assertFalse(result);
    }
    //for password testcases
    @Test
    public void givenPassword_WhenMin8Chars_ShouldReturnTrue() {
        boolean result = false;
        try {
            result = userRegistration.toValidatePassword("oByp9*ik");
        } catch (UserRegistrationException exception) {
            exception.printStackTrace();
        }
        Assertions.assertTrue(result);
    }
    @Test
    public void givenPassword_WhenHasLessChars_ShouldReturnFalse() {
        boolean result = false;
        try {
            result = userRegistration.toValidatePassword("opiL9");
        } catch (UserRegistrationException exception) {
            exception.printStackTrace();
        }
        Assertions.assertFalse(result);
    }
    @Test
    public void givenPassword_WhenAtleast1UpperCase_ShouldReturnTrue() {
        boolean result = false;
        try {
            result = userRegistration.toValidatePassword("4Lij*pl");
        } catch (UserRegistrationException exception) {
            exception.printStackTrace();
        }
        Assertions.assertTrue(result);
    }
    @Test
    public void givenPassword_WhenAtleast1Number_ShouldReturnTrue() {
        boolean result = false;
        try {
            result = userRegistration.toValidatePassword("Kas8yuop");
        } catch (UserRegistrationException exception) {
            exception.printStackTrace();
        }
        Assertions.assertTrue(result);
    }
    @Test
    public void givenPassword_WhenNoNumeric_ShouldReturnFalse() {
        boolean result = false;
        try {
            result = userRegistration.toValidatePassword("Md^hklop");
        } catch (UserRegistrationException exception) {
            exception.printStackTrace();
        }
        Assertions.assertFalse(result);
    }
    @Test
    public void givenPassword_WhenHasExact1SpecialChar_ShouldReturnTrue() {
        boolean result = false;
        try {
            result = userRegistration.toValidatePassword("Kl96$pol");
        } catch (UserRegistrationException exception) {
            exception.printStackTrace();
        }
        Assertions.assertTrue(result);
    }
    @Test
    public void givenPassword_WhenNoSpecialChar_ShouldReturnFlase() {
        boolean result = false;
        try {
            result = userRegistration.toValidatePassword("NKopPl12");
        } catch (UserRegistrationException exception) {
            exception.printStackTrace();
        }
        Assertions.assertFalse(result);
    }
    @Test
    public void givenPassword_WhenHasMoreThan1SpecialChar_ShouldReturnFalse() {
        boolean result = false;
        try {
            result = userRegistration.toValidatePassword("NK&p%l12");
        } catch (UserRegistrationException exception) {
            exception.printStackTrace();
        }
        Assertions.assertFalse(result);
    }

}
