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
        Double[] examScores = { 100.0, 90.0, 95.0, 60.0 };
        Double[] examScores1 = { 100.0, 85.0, 50.0, 0.0 };
        Double[] examScores2 = { 100.0, 90.0, 95.0, 60.0 };
//        Student student = new Student("Leon", "Hunter", examScores);
//        Student student1 = new Student("John", "Hunter", examScores1);
//        Student student2 = new Student("Leon", "Hunter", examScores2);
//        Student[] students = new Student[]{student, student1, student2};
//        Classroom classroom = new Classroom(students);
//
//        // When
////        classroom.addStudent(student);
////        classroom.addStudent(student1);
////        classroom.addStudent(student2);
//        Student[] preEnrollment = classroom.getPupils();
////        classroom.getAverageExamScore();
//        String studentScores = classroom.getStudentByScore().toString();
//
////        classroom.removeStudent("John", "Hunter");
//        Student[] postEnrollment = classroom.getPupils();
//
//        // Then
//        String preEnrollmentAsString = Arrays.toString(preEnrollment);
//        String postEnrollmentAsString = Arrays.toString(postEnrollment);
//
////        System.out.println("===========================");
////        System.out.println(preEnrollmentAsString);
////        System.out.println("===========================");
////        System.out.println(postEnrollmentAsString);
//        System.out.println(studentScores);


            // Create some Student objects
//            Student student1 = new Student("John", "Doe", examScores );
            Student student2 = new Student("Alice","Johnson", examScores);
            Student student3 = new Student("Bob","Smith", examScores1);
//            Student student4 = new Student("Alice Adams", 90);
            Student student5 = new Student("Jane","Smith", examScores2);

            // Create a Classroom and add the students
            Classroom classroom = new Classroom();
//            classroom.addStudent(student1);
            classroom.addStudent(student2);
            classroom.addStudent(student3);
//            classroom.addStudent(student4);
            classroom.addStudent(student5);

            // Get the sorted students
            Student[] sortedStudents = classroom.getStudentsByScore();
    }
}
