package com.example.testtest;

import org.apache.commons.logging.Log;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController("/operation")
public class UserController {

    @GetMapping("/add")
    public String addOperation() {

        return ("Operation Added");
    }

    @PostMapping("/testMethod")
    public String validateOperationTest(@RequestParam float money) {

        return User.validateOperation(money);
    }
}
