package com.day3;

class A1{
    void CallMe() {
        System.out.println("Inside A1's CallMe method");
    }
}
class B1 extends A1{
    void CallMe() {
        System.out.println("Inside B1's CallMe method");
    }
}
class C1 extends A1{
    void CallMe() {
        System.out.println("Inside C1's CallMe method");
    }
}
    public class Example4 {

        public static void main(String[] args) {
        A1 a=new B1();
        a.CallMe();
        a=new C1();
        a.CallMe();
        a=new A1();
        a.CallMe();

        }

        }

