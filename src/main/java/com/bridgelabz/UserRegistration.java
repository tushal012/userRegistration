package com.bridgelabz;

import java.util.regex.Pattern;

public class UserRegistration {
    private static final String pattern_name="^[A-z]{1}[a-z]{2,}$";
    private static final String pattern_Email="^[a-z]{3}\\.[a-zA-Z]{3}\\@[a-zA-Z]{3,10}\\.[co]{2}\\.[a-z]{2}$";
    private static final String pattern_Phone="^[0-9]{2}\\s[0-9]{10}$";
    private static final String pattern_Password="^(?=.*?[A-Z])(?=.*?[0-9])(?=.*[@$!%*#?&]).{8,}";

    public boolean toValidateFirstName(String firstName) {
        boolean matches= Pattern.matches(pattern_name,firstName);
        return matches;
    }

    public boolean toValidateLastName(String lastName) {
        boolean matches = Pattern.matches(pattern_name, lastName);
        return matches;
    }
    public boolean toValidateEmails(String Email) {
        boolean matches=Pattern.matches(pattern_Email,Email);
        return matches;
    }
}
