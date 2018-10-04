package com.company;

public class Student extends Person{
    private double GPA;
    private String color;
    private String subject;

    public Student(double GPA, String color, String subject){
        super("studentFirst", "studentLast");
        this.GPA = GPA;
        this.color = color;
    }

    public double getGPA(){
        return GPA;
    }
    public double getColor;
    public String toString(){

    }
}
