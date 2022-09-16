package com.cydeo;

import com.cydeo.entity.Course;
import com.cydeo.enums.WeekDays;
import com.cydeo.service.CRUDService;
import com.cydeo.service.CourseService;

import java.util.List;

public class SchoolMainRunner {

   // public static CRUDService<School> schoolService;
    public static CRUDService<Course> courseService;
   // public static CRUDService<Parent> parentService;
  //  public static CRUDService<Student> studentService;

    static {
       // SchoolMainRunner.schoolService = new SchoolService();
        SchoolMainRunner.courseService = new CourseService();
       // SchoolMainRunner.parentService = new ParentService();
       // SchoolMainRunner.studentService = new StudentService();
    }
    public static void main(String[] args) {
        System.out.println("Hello world!");

//        todo Create your objects under this SchoolMainRunner and test if they meet accaptence criteria
        //

        System.out.println(courseService.findById(1));
        System.out.println(courseService.findAll());
        courseService.save(new Course("Computer Science" , 65, List.of( WeekDays.FRIDAY)));
        System.out.println(courseService.findAll());
        courseService.update(new Course(1,"Math" , 65, List.of( WeekDays.FRIDAY)));
        System.out.println(courseService.findAll());


    }



}