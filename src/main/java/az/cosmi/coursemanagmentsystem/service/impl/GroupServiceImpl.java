package az.cosmi.coursemanagmentsystem.service.impl;

import az.cosmi.coursemanagmentsystem.entity.Group;
import az.cosmi.coursemanagmentsystem.model.base.BaseResponse;
import az.cosmi.coursemanagmentsystem.service.inter.GroupServiceInter;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class GroupServiceImpl implements GroupServiceInter {
    @Override
    public void create(Group entity) {

    }

    @Override
    public void update(String id) {

    }

    @Override
    public void delete(String id) {

    }

    @Override
    public BaseResponse<Group> getById(String id) {
        return null;
    }

    @Override
    public Set<Group> getAll() {
        return null;
    }
}
