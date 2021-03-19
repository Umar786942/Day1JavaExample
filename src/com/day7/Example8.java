package com.day7;

import java.util.Iterator;
import java.util.PriorityQueue;

public class Example8 {

    public static void main(String[] args) {
        PriorityQueue<String> p=new PriorityQueue<>();
        p.add("amit");
        p.add("vinay");
        p.add("kiri");
        p.add("jaya");
        p.add("ravi");
        System.out.println(p.element());
        System.out.println(p.peek());




        Iterator itr=p.iterator();
        while(itr.hasNext()) {
            System.out.println(itr.next());
        }




        p.remove();
        p.poll();
        System.out.println("after removing");
        Iterator itr1=p.iterator();
        while(itr1.hasNext()) {
            System.out.println(itr1.next());
        }



    }

}

