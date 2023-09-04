package az.cosmi.coursemanagmentsystem.repository.inter.generic;

import java.util.Set;

public interface GenericRepoInter<T> {
    void create(T entity);

    void update(T entity);

    void delete(T entity);

    T getById(String id);

    Set<T> getAll();

}
