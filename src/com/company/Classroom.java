package com.company;

public class Classroom {
    private Student[] students;
    private Teacher teacher;
    private static String subject = "Math";
    public Classroom(Student[] students, Teacher teacher){
        super("Classroom");
        this.students = students;
        this.teacher = teacher;
        this.subject = "Math";
    }
    public getSubject(){
        return Classroom.subject;
    }
    public int classAverage(){
        int num = 0;
        int total = 0;
        double avg = 0;
        for(int i = 0; i < students.length; i++){
            total += students[i].getGPA();
            num++;
        }
        avg = total/num;
    }
}
