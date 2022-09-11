package com.cydeo.service;

import java.util.List;
import java.util.stream.Collectors;

import com.cydeo.database.Database;
public class SchoolService implements CRUDService{
    @Override
    public Object findById(int id) {
        return Database.schoolList.stream()
                .filter(school -> school.getId()==(id));
        //comment
    }

    @Override
    public List findAll() {
        return Database.schoolList.stream().filter(school -> school.getName()!="").collect(Collectors.toList());
        //in progress
    }

    @Override
    public void save(Object o) {

    }

    @Override
    public void update(Object o) {

    }

    @Override
    public void deleteById(Long id) {
Database.schoolList.remove(id);
    }
}
