package java6lcredits.application.service;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java6lcredits.application.module.User;
import java6lcredits.application.repesatory.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.persistence.Id;

@Component
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public User getUserById (Long id){
        return userRepository.findById(id).get();
    }
}
