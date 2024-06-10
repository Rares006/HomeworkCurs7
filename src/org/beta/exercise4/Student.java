package org.beta.exercise4;

public class Student {
    private String name;
    private Integer grade;

    private static int sumOfTheGrades;
    private static int numberOfStudents;

    public Student(String name, Integer grade) {
        this.name = name;
        this.grade = grade;
        sumOfTheGrades += grade;
        numberOfStudents++;
    }

    public String getName() {
        return name;
    }

    public Integer getGrade() {
        return grade;
    }

    public static double calculateAverageGrade() {
        if (numberOfStudents == 0) {
            return 0;
        }
        return sumOfTheGrades / numberOfStudents;
    }
}
