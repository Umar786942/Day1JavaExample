package com.day4;

public class Example8 {

        public static void main(String[] args) {
        StringBuffer sb=new StringBuffer("hello");
        System.out.println(sb);//hello
        System.out.println(sb.length());//5
        System.out.println(sb.capacity());

        sb.ensureCapacity(25);
        System.out.println(sb.capacity());//if character length is less than ensure capacity then result will be length+length+2 here length is 21 so,21+21+2=44,if it is greater it will just print length

        StringBuffer sb1=new StringBuffer();
        System.out.println(sb1.capacity());//default value-16
        sb1.ensureCapacity(18);
        System.out.println(sb1.capacity());

        StringBuffer sb2=new StringBuffer("hello");
        System.out.println(sb2);
        System.out.println(sb2.length());
        sb2.setLength(2);
        System.out.println(sb2);//he
        System.out.println(sb2.charAt(1));
        sb2.setCharAt(1,'i');
        System.out.println(sb2);

        StringBuffer sb3=new StringBuffer("I java");
        sb3.insert(2,"like ");
        System.out.println(sb3);

        StringBuffer sb4=new StringBuffer();
        sb4.append("hello");
        System.out.println(sb4);
        sb4.append("world");
        System.out.println(sb4);

        StringBuffer sb5=new StringBuffer("abcd");
        System.out.println(sb5.reverse());

        StringBuffer sb6=new StringBuffer("This is a test");
        System.out.println(sb6);
        sb6.delete(5,8);
        System.out.println(sb6);
        sb6.deleteCharAt(0);
        System.out.println(sb6);

        StringBuffer sb7=new StringBuffer("This is a test");
        sb7.replace(5, 8, "was ");
        System.out.println(sb7);

        }

        }

