package com.day2;

class OverloadDemo{
        void test() {
        System.out.println("No Parameters");
        }
        void test(int a) {
        System.out.println("a=="+a);
        }
        void test(int a,int b) {
        System.out.println("a=="+a+" "+"b=="+b);
        }
        double test(double a) {
        return a*a;
        }
        }
        public class Example7 {

        public static void main(String[] args) {
        OverloadDemo ob=new OverloadDemo();
        ob.test();
        ob.test(10);
        ob.test(10,20);
        double result=ob.test(123.4);
        System.out.println(result);


        }

        }

