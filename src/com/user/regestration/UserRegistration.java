package com.user.regestration;

import java.util.regex.Pattern;

public class UserRegistration {

    private static final String NAME_PATTERN = "^[A-Z][a-z]{2,}$";
    private static final String EMAIL_ADDRESS_PATTERN = "^[a-z]+([.$][a-zA-Z0-9]+)*[@][a-zA-Z0-9]+[.][a-zA-Z]{2,3}([.][a-zA-Z]{2})?$";
    private static final String PHONE_NO = "^(91)?\\s{0,2}[0-9]{10}$";
    private static final String PASSWORD = "((?=.*[A-Z])(?=.*\\d)(?=.*\\W).{8,})";
    public boolean validateFirstName(String fname) {
        Pattern pattern = Pattern.compile(NAME_PATTERN);
        return pattern.matcher(fname).matches();
    }

    public boolean validateEmailAdress(String email) {
        Pattern pattern = Pattern.compile(EMAIL_ADDRESS_PATTERN);
        return pattern.matcher(email).matches();
    }

    public boolean validateLastName(String lastName) {
        Pattern pattern = Pattern.compile(NAME_PATTERN);
        return pattern.matcher(lastName).matches();
    }

    public boolean validatePhoneNo(String phoneNo) {
        Pattern pattern = Pattern.compile(PHONE_NO);
        return pattern.matcher(phoneNo).matches();
    }

    public boolean validatePassword(String password) {
        Pattern pattern = Pattern.compile(PASSWORD);
        return pattern.matcher(password).matches();
    }
}
