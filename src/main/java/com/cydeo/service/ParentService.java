package com.cydeo.service;

import java.util.List;

public interface ParentService extends CRUDService {
    @Override
    default Object findById(int id) {
        return null;
    }

    @Override
    default List findAll() {
        return null;
    }

    @Override
    default void save(Object o) {

    }

    @Override
    default void update(Object o) {

    }

    @Override
    default void deleteById(Long id) {

    }
}
