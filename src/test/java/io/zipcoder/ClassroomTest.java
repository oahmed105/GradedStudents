package io.zipcoder;

import org.junit.Test;

import java.util.Arrays;

public class ClassroomTest {

    @Test
    public void averagetest() {
        // : Given
        // : Given
//        int maxNumberOfStudents = 3;
//        Classroom classroom = new Classroom(3);
        Double[] examScores = { 100.0, 150.0, 250.0, 0.0 };
        Student student = new Student("Leon", "Hunter", examScores);
        Student student1 = new Student("John", "Hunter", examScores);
        Student student2 = new Student("Leon", "Hunter", examScores);
        Student[] students = new Student[]{student, student1, student2};
        Classroom classroom = new Classroom(students);

        // When
//        classroom.addStudent(student);
//        classroom.addStudent(student1);
//        classroom.addStudent(student2);
        Student[] preEnrollment = classroom.getPupils();

        classroom.removeStudent("John", "Hunter");
        Student[] postEnrollment = classroom.getPupils();

        // Then
        String preEnrollmentAsString = Arrays.toString(preEnrollment);
        String postEnrollmentAsString = Arrays.toString(postEnrollment);

        System.out.println("===========================");
        System.out.println(preEnrollmentAsString);
        System.out.println("===========================");
        System.out.println(postEnrollmentAsString);
    }
}
