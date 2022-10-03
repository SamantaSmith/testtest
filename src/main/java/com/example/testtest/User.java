package com.example.testtest;

public class User {

    public static String validateOperation(Float money) {

            if (money > 0) {
                return "valid";
            } else {
                return "invalid";
            }

    }
}
