package az.cosmi.coursemanagmentsystem.service.impl;

import az.cosmi.coursemanagmentsystem.entity.Teacher;
import az.cosmi.coursemanagmentsystem.model.ResponseModel;
import az.cosmi.coursemanagmentsystem.service.inter.TeacherServiceInter;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class TeacherServiceImpl implements TeacherServiceInter {
    @Override
    public void create(Teacher entity) {

    }

    @Override
    public void update(String id) {

    }

    @Override
    public void delete(String id) {

    }

    @Override
    public ResponseModel<Teacher> getById(String id) {
        return null;
    }

    @Override
    public Set<Teacher> getAll() {
        return null;
    }
}
