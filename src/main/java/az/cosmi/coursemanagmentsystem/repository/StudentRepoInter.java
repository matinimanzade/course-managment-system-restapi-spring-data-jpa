package az.cosmi.coursemanagmentsystem.repository;


import az.cosmi.coursemanagmentsystem.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepoInter extends JpaRepository<Student, String> {

}
