package com.cydeo.service;

import com.cydeo.entity.Course;

import java.util.ArrayList;
import java.util.List;

import static com.cydeo.database.Database.courseList;

public class CourseService implements CRUDService<Course>{

    @Override
    public Course findById(int id) {
        return courseList.stream()
                .filter(p-> p.getId() == id)
                .findAny().orElseThrow( () -> new RuntimeException("No such course"));

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
    public void deleteById(Long id) {
        courseList.removeIf(p -> p.getId() == id);

    }
    @Override
    public void update(Course course) {
        Course replace = courseList.stream()
                .filter(p -> p.getId() == course.getId())
                .findFirst().get();

        courseList.set(courseList.indexOf(replace), course);

    }
    }


