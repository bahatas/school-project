package com.cydeo.service;

import java.util.List;
import java.util.stream.Collectors;

import com.cydeo.database.Database;
import com.cydeo.entity.School;

public class SchoolService implements CRUDService{
    @Override
    public Object findById(int id) {
        return Database.schoolList.stream()
                .filter(school -> school.getId()==(id))
                .collect(Collectors.toList());
        //comment
    }

    @Override
    public List findAll() {
        return Database.schoolList.stream().filter(school -> school.getName()!="").collect(Collectors.toList());
        //in progress
    }

    @Override
    public void save(Object o) {
        Database.schoolList.add((School) o);

    }

    @Override
    public void update(Object o) {
        Object replace=Database.schoolList.stream()
                .filter(school -> school.getId()==((School) o).getId())
                        .findFirst().get();

        Database.schoolList.set(Database.schoolList.indexOf(replace), (School) o);

    }

    @Override
    public void deleteById(Long id) {
//Database.schoolList.remove(id);
        Database.schoolList.remove(findById(
                Math.toIntExact(id)));
    }
}
