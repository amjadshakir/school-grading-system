package com.techreturners.schoolgradingsystem;

enum Grade {
A(1),B(2),C(3),D(4),E(5),F(6);
    private final int gradeValue;

    Grade(int gradeValue) {
        this.gradeValue = gradeValue;
    }

    int getGradeValue() {
        return gradeValue;
    }



}
