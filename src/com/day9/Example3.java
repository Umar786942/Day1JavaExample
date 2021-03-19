package com.day9;

import java.io.FileInputStream;
import java.io.IOException;

public class Example3 {

    public static void main(String[] args) {
        try {
            FileInputStream f=new FileInputStream("D:\\java programs\\src\\com\\day9\\Example3.java");
            int i=f.read();
            System.out.println((char)i);

            f.skip(3);
            int size=f.available();
            System.out.println(size);
            int n=size/2;
            System.out.println(n);
            byte[] buf=new byte[n];
            for(int j=0;j<buf.length;j++) {
                System.out.println((char)f.read());
            }

        }
        catch(IOException e) {
            System.out.println(e);
        }

    }

}


