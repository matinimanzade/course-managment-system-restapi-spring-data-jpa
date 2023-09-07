package az.cosmi.coursemanagmentsystem.service.impl;

import az.cosmi.coursemanagmentsystem.entity.Student;
import az.cosmi.coursemanagmentsystem.model.ResponseModel;
import az.cosmi.coursemanagmentsystem.repository.StudentRepoInter;
import az.cosmi.coursemanagmentsystem.service.inter.StudentServiceInter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import java.util.Set;

@Service
@EnableTransactionManagement
@Slf4j
public class StudentServiceImpl implements StudentServiceInter {
    private StudentRepoInter studentRepo;

    @Autowired
    public StudentServiceImpl(StudentRepoInter studentRepo) {
        this.studentRepo = studentRepo;
    }

    @Override
    @Transactional
    public void create(Student entity) {
        if ()
        studentRepo.save(entity);
        log.info();
    }

    @Override
    public void update(String id) {

    }

    @Override
    public void delete(String id) {

    }

    @Override
    public ResponseModel<Student> getById(String id) {
        return null;
    }

    @Override
    public Set<Student> getAll() {
        return null;
    }
}
