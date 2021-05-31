import com.bridgelabz.UserRegistration;
import junit.framework.TestCase;
import org.junit.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.junit.Assert.assertEquals;

public class UserRegistrationTest {
    UserRegistration userRegistration = new UserRegistration();
    private TestCase Assertions;

    @Test
    public void givenFirstName_WhenFirstLatterUpperCase_ShouldReturnTrue() {
        boolean result = userRegistration.toValidateFirstName("tushal");
        Assertions.assertTrue(result);
    }

    @Test
    public void givenFirstName_WhenLessThanThreeChars_ShouldReturnFalse() {
        boolean result = userRegistration.toValidateFirstName("tus");
        Assertions.assertFalse(result);
    }

    @Test
    public void givenFirstName_WhenHasNumber_ShouldReturnFalse() {
        boolean result = userRegistration.toValidateFirstName("tushal1");
        Assertions.assertFalse(result);
    }

    @Test
    public void givenFirstName_WhenHasSpecialChar_ShouldReturnFalse() {
        boolean result = userRegistration.toValidateFirstName("tushal@012");
        Assertions.assertFalse(result);
    }
    @Test
    public void givenLastName_WhenFirstLetterUpperCase_ShouldReturnTrue(){
        boolean result = userRegistration.toValidateLastName("kashyap");
        Assertions.assertTrue(result);
    }
    @Test
    public void givenLastName_WhenLessThanThreeChars_ShouldReturnFalse() {
        boolean result = userRegistration.toValidateLastName("kas");
        Assertions.assertFalse(result);
    }

    @Test
    public void givenLastName_WhenHasNumber_ShouldReturnFalse() {
        boolean result = userRegistration.toValidateFirstName("kashyap");
        Assertions.assertFalse(result);
    }


    @Test
    public void givenEmailId_WhenProper_ShouldReturnTrue(){
        boolean result = userRegistration.toValidateEmails("abc.syz@bl.co.in");
        Assertions.assertTrue(result);
    }
    @Test
    public void givenMobileNum_WhenSpaceIsMentioned_ShouldReturnTrue(){
        boolean result = userRegistration.toValidatePhone("91 9852527734");
        Assertions.assertTrue(result);
    }
    @Test
    public void givenMobileNum_WhenSpaceNotMentioned_ShouldReturnFalse() {
        boolean result = userRegistration.toValidatePhone("91 9852527734");
        Assertions.assertFalse(result);
    }

    @Test
    public void givenMobileNum_WhenLessDigits_ShouldReturnFalse() {
        boolean result = userRegistration.toValidatePhone("982527734");
        Assertions.assertFalse(result);
    }

    @Test
    public void givenMobileNum_WhenNotStartWith91_ShouldReturnFalse() {
        boolean result = userRegistration.toValidatePhone("123456789");
        Assertions.assertFalse(result);
    }
    @Test
    public void givenPassword_WhenMin8Chars_ShouldReturnTrue() {
        boolean result = userRegistration.toValidatePassword("aBcD1$LK");
        Assertions.assertTrue(result);
    }
    @Test
    public void givenPassword_WhenHasLessChars_ShouldReturnFalse() {
        boolean result = userRegistration.toValidatePassword("AK8*PL");
        Assertions.assertFalse(result);
    }
    @Test
    public void givenPassword_WhenAtleast1UpperCase_ShouldReturnTrue() {
        boolean result = userRegistration.toValidatePassword("4Knk#PLk");
        Assertions.assertTrue(result);
    }
    @Test
    public void givenPassword_WhenAtleast1Number_ShouldReturnTrue() {
        boolean result = userRegistration.toValidatePassword("Mas1bt&Bx");
        Assertions.assertTrue(result);
    }
    @Test
    public void givenPassword_WhenNoNumeric_ShouldReturnFalse() {
        boolean result = userRegistration.toValidatePassword("nPll*1pk");
        Assertions.assertFalse(result);
    }
    @Test
    public void givenPassword_WhenHasExact1SpecialChar_ShouldReturnTrue() {
        boolean result = userRegistration.toValidatePassword("nPll*1pk");
        Assertions.assertTrue(result);
    }
    @Test
    public void givenPassword_WhenNoSpecialChar_ShouldReturnFlase() {
        boolean result = userRegistration.toValidatePassword("nPll*1pk");
        Assertions.assertFalse(result);
    }
    @Test
    public void givenPassword_WhenHasMoreThan1SpecialChar_ShouldReturnFalse() {
        boolean result = userRegistration.toValidatePassword("nPll*1pk");
        Assertions.assertFalse(result);
    }

}
