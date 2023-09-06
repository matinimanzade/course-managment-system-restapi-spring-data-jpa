package az.cosmi.coursemanagmentsystem.repository;

import az.cosmi.coursemanagmentsystem.entity.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeacherRepoInter extends JpaRepository<Teacher, String> {
}
