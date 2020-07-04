package java6lcredits.application.controller;

import java6lcredits.application.module.User;
import java6lcredits.application.service.LoanFormService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private LoanFormService loanFormService;

    @PostMapping("/User")
    public String saveUser(User user) {
        System.out.println("User: " + user);
        loanFormService.save(user);
    }

}
