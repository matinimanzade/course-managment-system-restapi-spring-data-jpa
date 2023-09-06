package az.cosmi.coursemanagmentsystem.service.generic;

import az.cosmi.coursemanagmentsystem.model.ResponseModel;

import java.util.Set;

public interface EntityServiceInterGeneric<T> {
    void create(T entity);

    void update(String id);

    void delete(String id);

    ResponseModel<T> getById(String id);

    Set<T> getAll();
}
