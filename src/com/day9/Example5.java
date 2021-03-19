package com.day9;

import java.io.ByteArrayInputStream;

public class Example5 {

    public static void main(String[] args) {
        String temp="abc";
        byte b[]=temp.getBytes();
        ByteArrayInputStream in=new ByteArrayInputStream(b);
        for(int i=0;i<2;i++) {
            int c;
            while((c=in.read()) != -1) {
                if(i==0) {
                    System.out.println((char)c);//abc
                }
                else {
                    System.out.println(Character.toUpperCase((char)c));//ABC
                }
            }
            System.out.println();
            in.reset();
        }
    }

}

