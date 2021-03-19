package com.day3;

abstract class A4{
        abstract void callme();
        void show() {
        System.out.println("Normal Method");
        }
        }
class B4 extends A4{
    void callme() {
        System.out.println("Implementation of abstract method");
    }
}
    public class Example12 {

        public static void main(String[] args) {
        B4 b=new B4();
        b.callme();
        b.show();
        }
        }

