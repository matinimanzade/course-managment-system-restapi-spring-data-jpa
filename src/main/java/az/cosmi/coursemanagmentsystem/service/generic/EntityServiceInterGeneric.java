package az.cosmi.coursemanagmentsystem.service.generic;

import az.cosmi.coursemanagmentsystem.exceptions.alredyexsist.StudentAlredyExsistException;
import az.cosmi.coursemanagmentsystem.model.base.BaseResponse;

import java.util.Set;

public interface EntityServiceInterGeneric<T> {
    void create(T entity) throws StudentAlredyExsistException;

    void update(String id);

    void delete(String id);

    BaseResponse<T> getById(String id);

    Set<T> getAll();
}
