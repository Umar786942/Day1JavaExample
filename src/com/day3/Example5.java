package com.day3;

class Figure{
    void area() {
        System.out.println("Figure Area");
    }
}
class Rectangle extends Figure{
    void area() {
        System.out.println("Rectangle Area");
    }
}
class Triangle extends Figure{
    void area() {
        System.out.println("Triangle Area");
    }
}
    public class Example5 {

        public static void main(String[] args) {
        Figure f=new Rectangle();
        f.area();
        f=new Triangle();
        f.area();
        f=new Figure();
        f.area();

        }

        }

