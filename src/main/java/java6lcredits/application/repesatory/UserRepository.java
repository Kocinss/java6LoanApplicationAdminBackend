package java6lcredits.application.repesatory;

import java6lcredits.application.module.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User,Long> {
    //Search user
    ////UpdateApplicationStatus
    User findByPhone(String phone);
}
