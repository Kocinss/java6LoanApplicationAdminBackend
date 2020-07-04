package java6lcredits.application.controller;

import java6lcredits.application.module.LoneApplication;
import java6lcredits.application.service.LoanFormService;
import java6lcredits.application.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Autowired
private LoanFormService loanFormService;
    @Autowired
    private UserService userService;

    @GetMapping("/generateData")
    public String generateData(){
        LoneApplication loneApplication = new LoneApplication();
    }

    @GetMapping
    public String test(){
        return "Hello World";
    }
}
