package com.careerit.sjl.repo;

import com.careerit.sjl.domain.Course;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import java.util.List;
import java.util.Optional;

@SpringBootTest
public class CourseRepoTest {

  @Autowired
  private CourseRepo courseRepo;

  @BeforeEach
  public void init(){
    courseRepo.deleteAll();
  }
  @Test
  void addCourse() {
    Course course = getCourse();
    Course savedCourse = courseRepo.save(course);
    Assertions.assertTrue(savedCourse.getId() > 0, "Course is not saved");
  }
  @Test
  void addCourses(){
    List<Course> courses = getCourses();
    List<Course> savedCourses = courseRepo.saveAll(courses);
    Assertions.assertEquals(4,savedCourses.size(),"Courses are not saved");
  }

  @Test
  void updateCourse() {
    Course course = getCourse();
    Course savedCourse = courseRepo.save(course);
    savedCourse.setDescription("Java Full Stack with Spring Boot and Angular 12");
    Course updatedCourse = courseRepo.save(savedCourse);
    Assertions.assertEquals("Java Full Stack with Spring Boot and Angular 12",updatedCourse.getDescription(),"Course is not updated");
  }
  @Test
  void deleteCourse() {
    Course course = getCourse();
    Course savedCourse = courseRepo.save(course);
    courseRepo.deleteById(savedCourse.getId());
    Optional<Course> optCourse = courseRepo.findById(savedCourse.getId());
    Assertions.assertTrue(optCourse.isEmpty(),"Course is not deleted");
  }
  @Test
  void selectCourses(){
    List<Course> courses = getCourses();
    List<Course> savedCourses = courseRepo.saveAll(courses);
    List<Course> dbCourses = courseRepo.findAll();
    Assertions.assertEquals(4,dbCourses.size(),"Courses are not saved");
  }
  @Test
  void selectPageData(){
    List<Course> courses = getCourses();
    List<Course> savedCourses = courseRepo.saveAll(courses);
    PageRequest pageRequest = PageRequest.of(1,3);
    Page<Course> page = courseRepo.findAll(pageRequest);
    Assertions.assertEquals(1,page.getContent().size(),"Page content is not 1");
  }
  @Test
  void selectCourseWithFeeLessThanEq20K(){
    List<Course> courses = getCourses();
    List<Course> savedCourses = courseRepo.saveAll(courses);
    List<Course> dbCourses = courseRepo.findByFeeGreaterThanEqual(20000);
    Assertions.assertEquals(3,dbCourses.size(),"Courses are not saved");
  }
  @Test
  void selectCourseWithFeeBetween(){
    List<Course> courses = getCourses();
    List<Course> savedCourses = courseRepo.saveAll(courses);

    List<Course> dbCourses = courseRepo.feeBetween(20000,25000);
    Assertions.assertEquals(2,dbCourses.size(),"Courses are not saved");

    dbCourses = courseRepo.findByFeeBetween(20000,25000);
    Assertions.assertEquals(2,dbCourses.size(),"Courses are not saved");

  }

  private List<Course> getCourses(){
    Course course1 = new Course();
    course1.setCourseTitle("Java Full Stack");
    course1.setDescription("Java Full Stack with Spring Boot and Angular");
    course1.setFee(25000);
    Course course2 = new Course();
    course2.setCourseTitle("Python Full Stack");
    course2.setDescription("Python Full Stack with Django and React");
    course2.setFee(20000);
    Course course3 = new Course();
    course3.setCourseTitle("Data Science");
    course3.setDescription("Data Science with Python");
    course3.setFee(30000);
    Course course4 = new Course();
    course4.setCourseTitle("DevOps");
    course4.setDescription("DevOps with Docker and Kubernetes");
    course4.setFee(15000);
    return List.of(course1,course2,course3,course4);
  }
  private  Course getCourse() {
    Course course = new Course();
    course.setCourseTitle("Java Full Stack");
    course.setDescription("Java Full Stack with Spring Boot and Angular");
    course.setFee(25000);
    return course;
  }
}
