package com.day4;

public class Example7 {

        public static void main(String[] args) {
        String s1="Hello";
        System.out.println(s1.charAt(1));

        String s2="This is a demo of getChars() method";
        int start=10,end=14;
        char buf []=new char[end-start];
        s2.getChars(10, 14, buf, 0);
        System.out.println(buf);

        String s3="hello";
        System.out.println(s3.length());

        String s4="abcd";
        byte[] b=s4.getBytes();
        for(byte b1:b)
        System.out.println(b1);

        String s5="Java";
        char c []=s5.toCharArray();
        for(char c1:c)
        System.out.println(c1);

        String s6="foobar";
        System.out.println(s6.startsWith("foo"));
        System.out.println(s6.endsWith("bar"));

        String s7=new String("hello");
        String s8=new String("HELLO");
        String s9=new String("hello");
        System.out.println(s7.equals(s8));
        System.out.println(s7.equals(s9));
        System.out.println(s7.equalsIgnoreCase(s8));
        System.out.println(s7==s8);
        String s10=s8;
        System.out.println(s10==s8);

        System.out.println(s7.toUpperCase());
        System.out.println(s8.toLowerCase());

        String s11="helloworld";
        System.out.println(s11.substring(6));
        System.out.println(s11.substring(2,5));//start to end-1

        String s12="hello";
        String s13=new String();
        System.out.println(s12.concat("world"));
        System.out.println(s12.length());
        System.out.println(s13.concat("world"));
        System.out.println(s13.length());

        String s14="hello";
        System.out.println(s14.replace('e','i'));

        String s15=" hello world ";
        System.out.println(s15.length());
        System.out.println(s15.trim());
        System.out.println(s15.length());

        String s16=s15.trim();
        System.out.println(s16.length());

        String s17="Now is the time for goodmen to"+
        "come to their country and pay their"+
        "due taxes.";
        System.out.println(s17.indexOf('t'));
        System.out.println(s17.indexOf("the"));
        System.out.println(s17.indexOf('t',9));
        System.out.println(s17.indexOf("the",10));
        System.out.println(s17.indexOf("oooooo",10));

        System.out.println(s17.lastIndexOf('t'));
        System.out.println(s17.lastIndexOf("the"));
        System.out.println(s17.length());

        String s18="one-two-three";
        String temp[]=s18.split("-");
        for(String a1:temp)
        System.out.println(a1);

        String s19="one.two.three.four.five";
        String temp1[]=s19.split("\\.",2);
        for(String a2:temp1)
        System.out.println(a2);

        String s20="A*bunch*of*stars";
        String temp2[]=s20.split("\\*",3);
        for(String a2:temp2)
        System.out.println(a2);

        String s21="10 home world of 20";
        String temp3[]=s21.split("\\d");
        for(String a3:temp3)
        System.out.println(a3);
        String temp4[]=s21.split(" ");//or String temp4[]=s21.split("\\s");
        for(String a4:temp4)
        System.out.println(a4);

        String s22="No concession,noconcillation"+"no confident,"+"and no give and take";
        String delimit="concession|concillation|confident|(give and take)";
        String temp5[]=s22.split(delimit);
        for(String a5:temp5)
        System.out.println(a5);

        String s23="Welcome to JAVA program";
        System.out.println(s23.matches("(.*)JAVA(.*)"));
        System.out.println(s23.matches("JAVA(.*)"));
        System.out.println(s23.matches("Welcome (.*)"));
        String s24="ABC Windows test";
        boolean b1=s24.regionMatches(true,4,"Windows",0,7);
        System.out.println(b1);




        }

        }

