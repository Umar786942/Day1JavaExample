package com.day6;

import java.util.LinkedList;
import java.util.List;

public class Example3 {

    public static void main(String[] args) {
        LinkedList<Integer> l=new LinkedList<>();
        System.out.println(l.size());
        l.add(10);
        l.add(4);
        l.add(2, 8);
        l.add(10);
        l.addFirst(7);
        l.addLast(20);
        l.add(3,15);
        System.out.println(l.size());
        System.out.println(l);



        System.out.println(l.get(5));
        System.out.println(l.getFirst());
        System.out.println(l.getLast());
        l.remove(2);
        l.removeFirst();
        l.removeLast();
        System.out.println(l);

    }

}


