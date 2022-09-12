package com.cydeo;

import com.cydeo.database.Database;
import com.cydeo.entity.BaseEntity;
import com.cydeo.entity.Parent;
import com.cydeo.service.ParentService;

public class Main {


    //    public static CRUDService<School> schoolService;
//    public static CRUDService<Course> courseService;
//    public static CRUDService<Parent> parentService;
//    public static CRUDService<Student> studentService;
//
//    static {
//        SchoolMainRunner.schoolService = new SchoolService();
//        SchoolMainRunner.courseService = new CourseService();
//        SchoolMainRunner.parentService = new ParentService();
//        SchoolMainRunner.studentService = new StudentService();
//    }
    public static void main(String[] args) {
        System.out.println("Hello world!");

        ParentService parentService = new ParentService();
        System.out.println(parentService.findById(1));

        System.out.println(parentService.findAll());

        BaseEntity parent = new Parent(3,"Anna", "Brown");
        parentService.save(parent);
        System.out.println(Database.parentList);
        System.out.println(parentService.findById(2));
        parentService.deleteById(1L);
        System.out.println(Database.parentList);
    }
}