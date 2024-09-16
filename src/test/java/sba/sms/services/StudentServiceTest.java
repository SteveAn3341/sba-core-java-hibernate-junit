package sba.sms.services;

import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import sba.sms.models.Student;
import sba.sms.utils.CommandLine;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertTrue;
public class StudentServiceTest {

    private StudentService studentService;

    @BeforeEach
    public void setUp() {
        // Initialize your service
        studentService = new StudentService();

        // Check if the student already exists in the database
        if (studentService.getStudentByEmail("student1@example.com") == null) {
            // Add the student only if they don't already exist
            studentService.createStudent(new Student("student1@example.com", "Student One", "password1"));
        }
    }

    @Test
    public void testValidateStudent_ValidCredentials() {
        // This test checks if valid credentials return true
        boolean result = studentService.validateStudent("reema@gmail.com", "password");
        assertTrue(result);
        System.out.println("--------------------------------");
        System.out.println("Test succeeded: Valid student credentials.");
    }
}