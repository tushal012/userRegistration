package com.bridgelabz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    private static final String NAME_PATTERN = "^[A-Z][a-z]{2,}";;
    private static final String EMAIL_PATTERN = "^[a-z]{3}\\.[a-zA-Z]{3}\\@[a-zA-Z]{3,10}\\.[co]{2}\\.[a-z]{2}$";
    private static final String PHONE_PATTERN = "^[0-9]{2}\\s[0-9]{10}$";
    private static final String PASSWORD_PATTERN = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&-+=()]).{8,}$";
    public UserRegistrationIFunction toValidatelastName;
    private String Email;
    private String password;


    public UserRegistrationIFunction toValidateFirstName  = (firstName) -> Pattern.matches(NAME_PATTERN, firstName);
    public UserRegistrationIFunction toValidateLastName = (lastName) -> Pattern.matches(NAME_PATTERN, lastName);
    public UserRegistrationIFunction toValidateEmail = (email) -> Pattern.matches(EMAIL_PATTERN, email);
    public UserRegistrationIFunction toValidatePhone = (PhoneNum) -> Pattern.matches(PHONE_PATTERN, PhoneNum);
    public UserRegistrationIFunction toValidatePassword = (password) -> Pattern.matches(PASSWORD_PATTERN, password);


        // initializing checkException
        public void customException(boolean result) throws UserRegistrationException {
            try {
                if (result == false)
                    throw new UserRegistrationException(UserRegistrationException.ExceptionType.ENTERED_INVALID, "Please give valid Entry");
            }catch (UserRegistrationException exception){
                throw new UserRegistrationException(UserRegistrationException.ExceptionType.ENTERED_NULL, "Entry Should be not null ");
            }
        }


    public boolean EmailValidatorTest(String email) {
            return false;
    }

    public boolean toValidateEmail(String email) {
            return false;
    }
}
