import com.bridgelabz.UserRegistration;
import com.bridgelabz.UserRegistrationException;


import org.junit.Assert;
import org.junit.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.junit.Assert.assertEquals;

public class UserRegistrationTest {

    UserRegistration userRegistration = new UserRegistration();



    //for firstName testcase
    @Test
    public void givenFirstName_WhenFirstLetterUpperCase_ShouldReturnTrue() {
<<<<<<< HEAD
        UserRegistration userRegistration = new UserRegistration();
        try {
            Assertions.assertTrue(userRegistration.toValidateFirstName("Tushal"));
        } catch (UserRegistrationException exception) {
            exception.printStackTrace();
        }
=======


        Assert.assertEquals(true, userRegistration.toValidateFirstName.validate("Tushal"));

        

>>>>>>> uc13-lambdaFunctionValidate

    }

    @Test
<<<<<<< HEAD
    public void givenFirstName_WhenEntryFieldEmpty_shouldReturnFalse(){
        UserRegistration userRegistration = new UserRegistration();
        try {
            Assertions.assertFalse(userRegistration.toValidateFirstName(""));
        } catch (UserRegistrationException  exception) {
            NullPointerException.class.getClass();
            System.out.println("Entry Field Should not null");
        }
=======
    public void givenFirstName_WhenEntryFieldEmpty_shouldReturnFalse() {

        Assert.assertEquals(false, userRegistration.toValidateFirstName.validate(""));



>>>>>>> uc13-lambdaFunctionValidate
    }

    @Test
    public void givenFirstName_WhenLessThanThreeChars_ShouldReturnFalse() {
        Assert.assertEquals(false, userRegistration.toValidateFirstName.validate("tu"));

    }

    @Test
    public void givenFirstName_WhenHasNumber_ShouldReturnFalse() {

        Assert.assertEquals(false,userRegistration.toValidateFirstName.validate("tushal1"));

    }

    @Test
    public void givenFirstName_WhenHasSpecialChar_ShouldReturnFalse() {

        Assert.assertEquals(false,userRegistration.toValidateFirstName.validate("tushal#"));

    }

    // for lastName testcases
    @Test
    public void givenLastName_WhenFirstLetterUpperCase_ShouldReturnTrue() {

        Assert.assertEquals(true,userRegistration.toValidateLastName.validate("Kashyap"));

        ;
    }


    @Test
    public void givenLastName_WhenHasNumber_ShouldReturnFalse() {

        Assert.assertEquals(false,userRegistration.toValidateLastName.validate("Kashyap1"));

    }

    //for Email testCases
    @Test
    public void givenEmail_WhenProper_ShouldReturnTrue() {

        Assert.assertEquals(true,userRegistration.toValidateEmail.validate("abc.xyz@bl.co.in"));

    }

    //for phone number testcases
    @Test
<<<<<<< HEAD
    public void givenPhoneNum_WhenSpaceIsMentioned_ShouldReturnTrue(){
        boolean result = false;
        try {
            result = userRegistration.toValidatePhone("91 9852527734");
        } catch (UserRegistrationException exception) {
            exception.printStackTrace();
        }
        Assertions.assertTrue(result);
=======
    public void givenPhoneNum_WhenSpaceIsMentioned_ShouldReturnTrue() {

        Assert.assertEquals(true,userRegistration.toValidatePhone.validate("91 9852527734"));

>>>>>>> uc13-lambdaFunctionValidate
    }


    @Test
    public void givenPhoneNum_WhenLessDigits_ShouldReturnFalse() {
<<<<<<< HEAD
        boolean result = false;
        try {
            result = userRegistration.toValidatePhone("9852527734");
        } catch (UserRegistrationException exception) {
            exception.printStackTrace();
        }
        Assertions.assertFalse(result);
=======

        Assert.assertEquals(false,userRegistration.toValidatePhone.validate("985252773"));

>>>>>>> uc13-lambdaFunctionValidate
    }

    @Test
    public void givenPhoneNum_WhenNotStartWith91_ShouldReturnFalse() {
        Assert.assertEquals(false,userRegistration.toValidatePhone.validate("1245637898"));

    }

    //for password testcases
    @Test
    public void givenPassword_WhenMin8Chars_ShouldReturnTrue() {
        Assert.assertEquals(true,userRegistration.toValidatePassword.validate("ndKL1#6p"));

    }

    @Test
    public void givenPassword_WhenHasLessChars_ShouldReturnFalse() {
        Assert.assertEquals(false,userRegistration.toValidatePassword.validate("lp7O%"));

    }

    @Test
    public void givenPassword_WhenAtleast1UpperCase_ShouldReturnTrue() {
        Assert.assertEquals(false,userRegistration.toValidatePassword.validate("lpk7^mn8"));

    }

    @Test
    public void givenPassword_WhenAtleast1Number_ShouldReturnTrue() {
        Assert.assertEquals(false,userRegistration.toValidatePassword.validate("lpK8pl*"));

    }

    @Test
    public void givenPassword_WhenNoNumeric_ShouldReturnFalse() {
        Assert.assertEquals(false,userRegistration.toValidatePassword.validate("pDlkopu&"));

    }

    @Test
    public void givenPassword_WhenHasExact1SpecialChar_ShouldReturnTrue() {
        Assert.assertEquals(true,userRegistration.toValidatePassword.validate("Po78lu^l"));
        ;
    }

    @Test
    public void givenPassword_WhenNoSpecialChar_ShouldReturnFlase() {
        Assert.assertEquals(false,userRegistration.toValidatePassword.validate("78lyphj"));

    }

    @Test
    public void givenPassword_WhenHasMoreThan1SpecialChar_ShouldReturnFalse() {
        Assert.assertEquals(false,userRegistration.toValidatePassword.validate("%&7pD88"));


    }
}
