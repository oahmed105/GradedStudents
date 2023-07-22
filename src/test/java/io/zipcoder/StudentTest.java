package io.zipcoder;

import org.junit.Test;

public class StudentTest {
    @Test
    public void getExamScoresTest() {
        // : Given
        String firstName = "Leon";
        String lastName = "Hunter";
        Double[] examScores = { 100.0, 95.0, 123.0, 96.0 };
        Student student = new Student(firstName, lastName, examScores);
        student.addExamScores(45);
        student.setExamScore(1, 150.0);


        // When
        String output = student.toString();
        Double output2 = student.getAverageExamScore();


        // Then
        System.out.println(output);


    }

}