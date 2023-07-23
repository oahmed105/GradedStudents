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

    public Student[] getStudentsByScore() {
        Student[] sortedStudents = Arrays.copyOf(pupils, pupils.length);
        int n = sortedStudents.length;

        // Bubble sort in descending order of score
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (sortedStudents[j].getAverageExamScore() < sortedStudents[j + 1].getAverageExamScore()) {
                    // Swap the students if the j-th student has a lower score than (j+1)-th student
                    Student temp = sortedStudents[j];
                    sortedStudents[j] = sortedStudents[j + 1];
                    sortedStudents[j + 1] = temp;
                } else if (sortedStudents[j].getAverageExamScore() == sortedStudents[j + 1].getAverageExamScore()) {
                    // If the scores are equal, compare the names lexigraphically
                    if (sortedStudents[j].getLastName().compareTo(sortedStudents[j + 1].getLastName()) > 0) {
                        // Swap the students if the names are in lexicographic order (i.e., the j-th student's name comes after (j+1)-th student's name)
                        Student temp = sortedStudents[j];
                        sortedStudents[j] = sortedStudents[j + 1];
                        sortedStudents[j + 1] = temp;
                    }
                }
            }
        }

        return sortedStudents;
    }

}
