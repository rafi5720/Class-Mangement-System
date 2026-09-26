package com.mycompany.lab03;

import java.util.Scanner;

public class Lab03 {

    public static void main(String[] args) {
        //System.out.println("Hello World!");
        Student student1 = new Student();
        student1.read();
        student1.name = "Abrar";
        student1.id = "252-15-476";
        student1.section = "69_I";
        student1.address = "Gazipur";
        student1.display();
        Student student2= new Student();
        student2.name = "SAKIB";
        student2.id = "252-15-  042";
        student2.section = "69_I";
        student2.address = "SHODORGHAT";
        student2.display();
        Section i_69 = new Section();
        i_69.showStudentInfo();
        
    }
}

class Student {

    String id;
    String name;
    String section;
    String address;

  /*  Student() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }*/

    void read() {
        System.out.println("student is reading ");

    }

    void display() {
        System.out.println("NAme: " + name);
        System.out.println("ID: : " + id);
        System.out.println("Section: " + section);
        System.out.println("Address: " + address);

    }
}
