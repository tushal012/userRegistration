package com.bridgelabz;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    private static final String pattern_name = "^[A-z]{1}[a-z]{2,}$";
    private static final String pattern_Email = "^[a-z]{3}\\.[a-zA-Z]{3}\\@[a-zA-Z]{3,10}\\.[co]{2}\\.[a-z]{2}$";
    private static final String pattern_Phone = "^[0-9]{2}\\s[0-9]{10}$";
    private static final String pattern_Password = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&-+=()]).{8,}$";

    public boolean toValidateFirstName(String firstName) {
        boolean matches = Pattern.matches(pattern_name, firstName);
        return matches;
    }

    public boolean toValidateLastName(String lastName) {
        boolean matches = Pattern.matches(pattern_name, lastName);
        return matches;
    }

    public boolean toValidateEmails(String Email) {
        ArrayList<String> emails = new ArrayList<String>();
        emails.add("abc@yahoo.com");
        emails.add("abc-100@yahoo.com");
        emails.add("abc.100@yahoo.com");
        emails.add("abc111@abc.com");
        emails.add("abc-100@abc.net");
        emails.add("abc.100@abc.com.au");
        emails.add("abc@1.com");
        emails.add("abc@gmail.com");
        emails.add("abc@gmail.com.com");
        emails.add("abc+100@gmail.com");

        emails.add("abc");
        emails.add("abc@.com.my");
        emails.add("abc123@gmail.a");
        emails.add("abc123@.com");
        emails.add("abc123@.com.com");
        emails.add(".abc@abc.com");
        emails.add("abc()*@gmail.com");
        emails.add("abc@%*.com");
        emails.add("abc..2002@gmail.com");
        emails.add("abc.@gmail.com");
        emails.add("abc@abc@gmail.com");
        emails.add("abc@gmail.com.1a");
        emails.add("abc@gmail.com.aa.au");


        String regexEmail = null;
        Pattern p = Pattern.compile(regexEmail);
        for (String email : emails) {
            //Create instance of matcher
            Matcher matcher = p.matcher(email);
            System.out.println(email + " : " + matcher.matches() + "\n");
        }

        return false;
    }


        public boolean toValidatePhone (String number){
            boolean matches = Pattern.matches(pattern_Phone, number);
            return matches;
        }
        public boolean toValidatePassword (String password){
            boolean matches = Pattern.matches(pattern_Password, password);
            return matches;
        }
    private boolean patternChecker(String input,String fieldPattern) {
        Pattern pattern = Pattern.compile(fieldPattern);
        Matcher matcher = pattern.matcher(input);
        boolean result = matcher.matches();
        return result;
    }

    public boolean EmailValidatorTest(String emailId) {
        return false;
    }
}
