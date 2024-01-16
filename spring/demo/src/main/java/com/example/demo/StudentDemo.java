package com.example.demo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class StudentDemo {

    public static void main(String[] args) {
        Student s1 =  new Student("Adi",1);
        Student s2 = new Student("Nayana",2);
        Student s3 = new Student("Vineetha",5);
        Student s4 = new Student("Harish",3);

        ArrayList<Student> students = new ArrayList<>();
        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);

;      //  Collections.sort(students);
        Collections.sort(students,new NameComaparator());
        System.out.println(students);
    }
}
