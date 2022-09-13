package com.cydeo;

import com.cydeo.entity.School;
import com.cydeo.service.CRUDService;
import com.cydeo.service.SchoolService;

import static com.cydeo.database.Database.courseList;
import static com.cydeo.database.Database.studentList;

public class SchoolMainRunner {

    public static CRUDService<School> schoolService;


    static {
        SchoolMainRunner.schoolService = new SchoolService();

    }
    public static void main(String[] args) {
      School s11 = new School(3,"ABC_School", studentList,courseList);
      School s111 = new School(1,"blah blah School", studentList,courseList);
      SchoolService s1 = new SchoolService();
        System.out.println("Hello world!");
        System.out.println("1-------------");
        System.out.println(s1.findById(1));
        System.out.println("2---------------");
        System.out.println(s1.findAll());
        System.out.println("3-------------------");
        s1.save(s11);
        System.out.println("4-----------------");
        s1.update(s111);
        s1.deleteById(1L);



//        todo Create your objects under this SchoolMainRunner and test if they meet accaptence criteria
    }
}