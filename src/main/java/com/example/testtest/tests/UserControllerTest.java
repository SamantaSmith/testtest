package com.example.testtest.tests;
import com.example.testtest.User;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserControllerTest {

    private final static String VALID = "valid";
    private final static String INVALID = "invalid";

    @Test
    public void validateOperation() {
        assertEquals(User.validateOperation(123f), VALID);
        assertEquals(User.validateOperation(-123f), INVALID);
    }
}
