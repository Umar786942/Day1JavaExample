package com.day5;


import java.util.Scanner;

class Student{
    String name;
    int age;
    public Student(String name, int age) {
        super();
        this.name = name;
        this.age = age;
    }
    void display() {
        System.out.println(name+" "+age);
    }
}

    public class Example2 {

        public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter name:");
        String name=s.nextLine();
        System.out.println("Enter age:");
        int age=s.nextInt();
        Student st=new Student(name,age);
        st.display();
        }

        }

