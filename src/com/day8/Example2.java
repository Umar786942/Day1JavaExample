package com.day8;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Example2 {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter DOB");
        String dat=s.nextLine();//dd-mm-yyyy

        SimpleDateFormat sdf=new SimpleDateFormat("dd-mm-yyyy");
        Date d=null;
        try {
            d=sdf.parse(dat);
            System.out.println(d);    //wed mar 17 10:16:20 IST 2021
        }
        catch(ParseException e){
            System.out.println(e);

        }



        SimpleDateFormat sdf1=new SimpleDateFormat("MMM,dd yyy");

        System.out.println(sdf1.format(d));


    }

}




