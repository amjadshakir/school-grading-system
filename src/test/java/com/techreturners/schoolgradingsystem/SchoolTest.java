package com.techreturners.schoolgradingsystem;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SchoolTest {
    School myschool;

    @BeforeEach
    public void setUp() {
        myschool = new School();
    }

    @Test
    public void verifyCreateStudent(){
       Student student =  myschool.createStudent("Sam",Grade.C,Group.FOUR);
       assertEquals("Sam", student.getName());
       assertEquals(Grade.C, student.getGrade());
       assertEquals(Group.FOUR, student.getGroup());
    }
    @Test
    public void verifyStudentGrade(){
        Student student =  myschool.createStudent("Sam",Grade.C,Group.FOUR);
        assertEquals(Grade.C, myschool.getStudentGrade(student) );
    }
    @Test
    public void verifyStudentName(){
        Student student =  myschool.createStudent("Sam",Grade.C,Group.FOUR);
        assertEquals("Sam", myschool.getStudentName(student) );
    }
    @Test
    public void verifyUpGradeStudentGradeForA(){
        Student student =  myschool.createStudent("Sam",Grade.A,Group.FOUR);
        myschool.upgradeStudentGrade(student);
        assertEquals(Grade.A, myschool.getStudentGrade(student));
    }
    @Test
    public void verifyUpGradeStudentGradeForF(){
        Student student =  myschool.createStudent("Sam",Grade.F,Group.FOUR);
        myschool.upgradeStudentGrade(student);
        assertEquals(Grade.E, myschool.getStudentGrade(student));
    }
    @Test
    public void verifyUpGradeStudentGradeForC(){
        Student student =  myschool.createStudent("Sam",Grade.C,Group.FOUR);
        myschool.upgradeStudentGrade(student);
        assertEquals(Grade.B, myschool.getStudentGrade(student));
    }
    @Test
    public void verifyDownGradeStudentGradeForA(){
        Student student =  myschool.createStudent("Sam",Grade.A,Group.FOUR);
        myschool.downgradeStudentGrade(student);
        assertEquals(Grade.B, myschool.getStudentGrade(student));
    }
    @Test
    public void verifyDownGradeStudentGradeForF(){
        Student student =  myschool.createStudent("Sam",Grade.F,Group.FOUR);
        myschool.downgradeStudentGrade(student);
        assertEquals(Grade.F, myschool.getStudentGrade(student));
    }
    @Test
    public void verifyDownGradeStudentGradeForC(){
        Student student =  myschool.createStudent("Sam",Grade.C,Group.FOUR);
        myschool.downgradeStudentGrade(student);
        assertEquals(Grade.D, myschool.getStudentGrade(student));
    }
}
