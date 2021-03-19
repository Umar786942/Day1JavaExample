package com.day6;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;


public class Example6 {

    public static void main(String[] args) {
        List<Integer> l = new ArrayList<>();
        l.add(10);
        l.add(5);
        l.add(15);
        l.add(10);
        l.add(20);
        System.out.println(l);

        //forloop
        for (int i = 0; i < l.size(); i++) {
            System.out.println(l.get(i));
        }
        System.out.println();

        //for each
        for (int a : l) {
            System.out.println(a);


            System.out.println("using Iterator interface");
            Iterator<Integer> itr = l.iterator();
            while (itr.hasNext()) {
                // Integer i=(Integer) itr.next();
                //System.out.println(i);
                System.out.println(itr.next());

            }


            System.out.println("using ListItreator interface");
            ListIterator<Integer> ltr = l.listIterator();
            while (ltr.hasNext()) {
                Integer i = ltr.next();
                ltr.set(i + 2);
            }
            while (ltr.hasPrevious()) {
                System.out.println(ltr.previous());
            }


        }


    }
}
