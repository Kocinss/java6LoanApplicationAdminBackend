package java6lcredits.application.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class LoanFormService {
@Autowired
    private LoanFormService loanFormService;
public LoanFormService getLoanFormServiceById(long id){
    return loanFormService.findById(id).or
}
}
