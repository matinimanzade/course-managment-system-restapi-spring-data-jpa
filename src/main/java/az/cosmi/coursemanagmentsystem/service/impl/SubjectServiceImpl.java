package az.cosmi.coursemanagmentsystem.service.impl;

import az.cosmi.coursemanagmentsystem.entity.Subject;
import az.cosmi.coursemanagmentsystem.model.base.BaseResponse;
import az.cosmi.coursemanagmentsystem.service.inter.SubjectServiceInter;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class SubjectServiceImpl implements SubjectServiceInter {
    @Override
    public void create(Subject entity) {

    }

    @Override
    public void update(String id) {

    }

    @Override
    public void delete(String id) {

    }

    @Override
    public BaseResponse<Subject> getById(String id) {
        return null;
    }

    @Override
    public Set<Subject> getAll() {
        return null;
    }
}
