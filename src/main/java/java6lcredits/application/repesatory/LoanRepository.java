package java6lcredits.application.repesatory;

import java6lcredits.application.module.LoneApplication;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LoanRepository extends JpaRepository <LoneApplication,Long> {
}
