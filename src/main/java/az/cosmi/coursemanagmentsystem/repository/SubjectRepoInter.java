package az.cosmi.coursemanagmentsystem.repository;

import az.cosmi.coursemanagmentsystem.entity.Subject;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubjectRepoInter extends JpaRepository<Subject, Long> {
}
