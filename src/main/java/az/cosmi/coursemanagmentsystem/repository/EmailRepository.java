package az.cosmi.coursemanagmentsystem.repository;

import az.cosmi.coursemanagmentsystem.entity.Email;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmailRepository extends JpaRepository<Email, Long> {
}
