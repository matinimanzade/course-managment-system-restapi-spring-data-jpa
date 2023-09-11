package az.cosmi.coursemanagmentsystem.service.impl;

import az.cosmi.coursemanagmentsystem.entity.Student;
import az.cosmi.coursemanagmentsystem.exceptions.alredyexsist.StudentAlredyExsistException;
import az.cosmi.coursemanagmentsystem.exceptions.notfound.StudentNotFoundException;
import az.cosmi.coursemanagmentsystem.model.base.BaseResponse;
import az.cosmi.coursemanagmentsystem.repository.StudentRepoInter;
import az.cosmi.coursemanagmentsystem.service.inter.StudentServiceInter;
import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashSet;
import java.util.Set;

@Service
@EnableTransactionManagement
@Slf4j
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class StudentServiceImpl implements StudentServiceInter {
    StudentRepoInter studentRepo;

    @Autowired
    public StudentServiceImpl(StudentRepoInter studentRepo) {
        this.studentRepo = studentRepo;
    }

    @Override
    @Transactional
    public void create(Student entity) throws StudentAlredyExsistException {
        if (studentRepo.findById(entity.getId()) != null) {
            log.error("Student Alredy Exsist: ,{}", entity);
            throw new StudentAlredyExsistException("Student alredy exsist -> " + entity);
        }
        studentRepo.save(entity);
        log.info("Student was added successfuly: ,{}", entity);
    }

    @Override
    public void update(String id) {

    }

    @Override
    public void delete(String id) {

    }

    @Override
    public BaseResponse<Student> getById(String id) {
        return null;
    }

    @Override
    public Set<Student> getAll() {
        HashSet hashSet = new HashSet<>(studentRepo.findAll());
        return hashSet;
    }
}
