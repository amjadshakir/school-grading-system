package com.techreturners.schoolgradingsystem;

class School {

   Student createStudent(String name,Grade grade, Group group){
       return new Student(name,grade,group);
   }
    Grade getStudentGrade(Student student){
       return student.getGrade();
    }
   String getStudentName(Student student){
       return student.getName();
    }
   void upgradeStudentGrade(Student student){
//       if (student.getGrade() != Grade.A){
//           Grade[] grades = Grade.values();
//           int i = student.getGrade().getGradeValue();
//           int currentIndex = i-1;
//           int newIndex = currentIndex - 1;
//           student.setGrade(grades[newIndex]);
//       }
          if (student.getGrade() != Grade.A){
          student.setGrade(Grade.values()[student.getGrade().getGradeValue()-2]);
          }
   }
    void downgradeStudentGrade(Student student){
        if (student.getGrade() != Grade.F){
            student.setGrade(Grade.values()[student.getGrade().getGradeValue()]);
        }
    }
}
