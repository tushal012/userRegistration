package com.bridgelabz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    private static final String NAME_PATTERN = "^[A-Z][a-z]{2,}";;
    private static final String EMAIL_PATTERN = "^[a-z]{3}\\.[a-zA-Z]{3}\\@[a-zA-Z]{3,10}\\.[co]{2}\\.[a-z]{2}$";
    private static final String PHONE_PATTERN = "^[0-9]{2}\\s[0-9]{10}$";
    private static final String PASSWORD_PATTERN = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&-+=()]).{8,}$";
    private String Email;
    private String password;


        public boolean toValidateFirstName(String firstName) throws UserRegistrationException{
        return patternChecker(firstName, NAME_PATTERN);
         }




        public boolean toValidateLastName(String lastName) throws UserRegistrationException{
            return patternChecker(lastName, NAME_PATTERN);
        }

        public boolean toValidateEmail(String Email) throws UserRegistrationException{
        return patternChecker(Email, EMAIL_PATTERN);
        }


        public boolean toValidatePhone (String number) throws UserRegistrationException{
            return patternChecker(number, PHONE_PATTERN);
        }
        public boolean toValidatePassword (String password) throws UserRegistrationException{
            return patternChecker(password, PASSWORD_PATTERN);
        }

        // initializing patternChecker
        private boolean patternChecker(String input,String fieldPattern) throws UserRegistrationException{
        Pattern pattern = Pattern.compile(fieldPattern);
        Matcher matcher = pattern.matcher(input);
        try {
            boolean result = matcher.matches();
            if (!result)
                throw new UserRegistrationException(UserRegistrationException.ExceptionType.ENTERED_INVALID, "Please give valid Entry");
            return result;
        }catch (NullPointerException exception){
            throw new UserRegistrationException(UserRegistrationException.ExceptionType.ENTERED_NULL, "Entry Should be not null ");
        }

    }

    public boolean EmailValidatorTest(String emailId) {
            return false;
    }
}
