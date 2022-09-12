package com.cydeo.service;

import com.cydeo.database.Database;
import com.cydeo.entity.Parent;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ParentService implements CRUDService {
    @Override
    public Object findById(int id) {
        return Database.parentList.stream()
                .filter(parent -> parent.getId()==id)
                .findFirst().get();
    }

    @Override
    public List findAll() {
        return new ArrayList<>(Database.parentList);
    }

    @Override
    public void save(Object o) {
        Database.parentList.add((Parent) o); //upcasting

    }

    @Override
    public void update(Object o) {
        Database.parentList.add(new Parent());

    }

    @Override
    public void deleteById(Long id) {
        Database.parentList.removeIf(parent -> parent.getId()==id);

    }
}
