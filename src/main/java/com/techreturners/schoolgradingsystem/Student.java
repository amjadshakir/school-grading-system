package com.techreturners.schoolgradingsystem;

class Student {
    private String name;
    private Grade grade;
    private Group group;
    private final String secretNickName = "MySecretNickName";

    Student(String name, Grade grade, Group group) {
        this.name = name;
        this.grade = grade;
        this.group = group;
    }

    String getName() {

        return name;
    }

    Grade getGrade() {

        return grade;
    }

    Group getGroup() {
        return group;
    }

    void setGrade(Grade grade) {

        this.grade = grade;
    }
}
