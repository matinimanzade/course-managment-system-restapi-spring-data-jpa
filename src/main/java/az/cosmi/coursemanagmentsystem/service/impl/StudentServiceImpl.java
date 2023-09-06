package az.cosmi.coursemanagmentsystem.service.impl;

import az.cosmi.coursemanagmentsystem.entity.Student;
import az.cosmi.coursemanagmentsystem.model.ResponseModel;
import az.cosmi.coursemanagmentsystem.service.inter.StudentServiceInter;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class StudentServiceImpl implements StudentServiceInter {
    @Override
    public void create(Student entity) {

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
