package io.zipcoder;

import java.util.ArrayList;
import java.util.Arrays;

public class Classroom {

    private Student[] pupils;

    public Classroom(Student[] pupils) {
        this.pupils = pupils;
    }

    public Classroom(int maxNumberOfStudents) {
        this.pupils = new Student[maxNumberOfStudents];
    }

    public Classroom() {
        this.pupils = new Student[30];
    }

    public Student[] getPupils() {
        return pupils;
    }

    public Double getAverageExamScore() {
        Double sum = 0.0;
        for (Student student: pupils) {
            sum += student.getAverageExamScore();
        }
        return sum / pupils.length;
    }

    public void addStudent(Student student) {
        ArrayList<Student> temp = new ArrayList<>(Arrays.asList(pupils));
        temp.add(student);
        Student [] updatedArr = temp.toArray(new Student[0]);
        this.pupils = updatedArr;
    }

    public void removeStudent(String firstName, String lastName) {
        ArrayList<Student> temp = new ArrayList<>(Arrays.asList(pupils));
        for (Student student: temp) {
            if (student.getFirstName().equals(firstName) && student.getLastName().equals(lastName)) {
                temp.remove(student);
            }
        }
        temp.add(null);
        Student [] updatedArr = temp.toArray(new Student[0]);
        this.pupils = updatedArr;
    }

//    public Student[] getStudentByScore() {
//        ArrayList<Student> temp = new ArrayList<>(Arrays.asList(pupils));
//        for (Student student: pupils) {
//            student.getAverageExamScore();
//            do {
//
//            } while (student.getAverageExamScore())
//        }
//    }

}
