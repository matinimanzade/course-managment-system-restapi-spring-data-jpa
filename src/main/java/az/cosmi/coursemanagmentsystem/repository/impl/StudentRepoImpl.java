package az.cosmi.coursemanagmentsystem.repository.impl;

import az.micos.coursemanagmentsystemspringandjpa.entity.Student;
import az.micos.coursemanagmentsystemspringandjpa.repository.inter.StudentRepoInter;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Set;

@Repository
@Getter
@Setter
@ToString
@RequiredArgsConstructor
public class StudentRepoImpl implements StudentRepoInter {
    private final EntityManagerFactory entityManagerFactory;
    private final EntityManager entityManager;
    private final EntityTransaction entityTransaction;

    @Override
    public void create(Student student) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction = entityManager.getTransaction();
        try {
            entityTransaction.begin();
            entityManager.persist(student);
            entityTransaction.commit();
        } catch (Exception exception) {
            entityTransaction.rollback();
            exception.printStackTrace();
        } finally {
            entityManager.close();
            entityManagerFactory.close();
        }
    }

    @Override
    public void update(Student entity) {

    }

    @Override
    public void delete(Student entity) {

    }

    @Override
    public Student getById(String id) {
        return null;
    }

    @Override
    public Set<Student> getAll() {
        return null;
    }
}
