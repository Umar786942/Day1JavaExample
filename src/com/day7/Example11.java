package com.day7;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Example11 {

    public static void main(String[] args) {
        String month[]= {"jan","feb","mar","apr","may","jun","jul","aug","sep","oct","nov","dec"};
        // GregorianCalendar g= new GregorianCalendar();
        GregorianCalendar g= new GregorianCalendar(2000,4,20,4,23,20);
        System.out.println("date");
        int year=g.get(Calendar.YEAR);
        System.out.println(year+"-"+month[g.get(Calendar.MONTH)]+"-"+g.get(Calendar.DATE));


        System.out.println("time");
        System.out.println(g.get(Calendar.HOUR)+":"+g.get(Calendar.MINUTE) + ":"+g.get(Calendar.SECOND));
        if(g.isLeapYear(year))
            System.out.println("is leap year");
        else
            System.out.println("not a leap year");


    }

}

