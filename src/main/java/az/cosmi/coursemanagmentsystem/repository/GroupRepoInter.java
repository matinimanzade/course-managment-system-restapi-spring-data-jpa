package az.cosmi.coursemanagmentsystem.repository;

import az.cosmi.coursemanagmentsystem.entity.Group;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GroupRepoInter extends JpaRepository<Group, String> {
}
