package com.day3;

interface arithmetic{
    void operation(int a,int b);
    int c=14;
}
class Test1 implements arithmetic{
    @Override
    public void operation(int a,int b) {
        System.out.println(a+b);
        System.out.println(arithmetic.c);

    }
}
class Test2 implements arithmetic{
    @Override
    public void operation(int a,int b) {
        System.out.println(a-b);
    }
}
    public class Example14 {

        public static void main(String[] args) {
        arithmetic a=new Test1();
        a.operation(6, 4);
        a=new Test2();
        a.operation(6, 4);

        }

        }

