package sba.sms.dao;

import sba.sms.models.Course;

import java.sql.SQLException;
import java.util.List;

/**
 * The CourseI interface declares abstract methods and
 * is implemented by other classes to provide services for a course.
 */
public interface CourseI {
    void createCourse(Course course);
    List<Course> getAllCourses();
    Course getCourseById(int courseId);
}