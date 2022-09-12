package com.cydeo.service;

import com.cydeo.entity.Course;

import java.util.ArrayList;
import java.util.List;

public class CourseService implements CRUDService<Course>{

    List<Course>courseList=new ArrayList<>();


    @Override
    public Course findById(int id) {
        return courseList.get(id);
    }

    @Override
    public List<Course> findAll() {

        return new ArrayList<>(courseList);

    }

    @Override
    public void save(Course course) {
        courseList.add(course);



    }

    @Override
    public void update(Course course) {
        courseList.add(findById(course.id));

    }

    @Override
    public void deleteById(Long id) {
        courseList.remove(id);

    }
}
