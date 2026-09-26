package com.mycompany.lab03;

public class Section {

    String name;
    String[] cources = {"OOP", "Ec"};
    Student student1 = new Student();

    void showStudentInfo() {
        student1.name = "Sami ";
        student1.display();

    }

}
