package com.day6;

import java.util.TreeSet;

public class Example5 {

    public static void main(String[] args) {
		/*HashSet<String> s=new HashSet<>();
		System.out.println(s.size());
		s.add("v");
		s.add("c");
		s.add("f");
		s.add("a");
		s.add("r");
		s.add("y");
		System.out.println(s.size());  //6
		System.out.println(s);*/


		/*LinkedHashSet<String> s=new LinkedHashSet<>();
		System.out.println(s.size());
		s.add("v");
		s.add("c");
		s.add("f");
		s.add("a");
		s.add("r");
		s.add("y");
		System.out.println(s.size());  //6
		System.out.println(s);*/


        TreeSet<String> s=new TreeSet<>();
        System.out.println(s.size());
        s.add("v");
        s.add("c");
        s.add("f");
        s.add("a");
        s.add("r");
        s.add("y");
        System.out.println(s.size());  //6
        System.out.println(s);
        System.out.println(s.first());
        System.out.println(s.last());
        System.out.println(s.headSet("f"));
        System.out.println(s.tailSet("f"));


        TreeSet<Integer> ts=new TreeSet<>();
        ts.add(12);
        ts.add(11);
        ts.add(16);
        ts.add(15);
        System.out.println(ts);  // 11 12 15 16
        System.out.println(ts.ceiling(13));//15
        //return smallest elt less than r equal to given list
        System.out.println(ts.floor(13));//13
        //return the greatest elt less than r equal to given list
        System.out.println(ts.pollFirst());
        //retrieves and remove the first ele
        System.out.println(ts.pollLast());
        //retrieves and remove the last ele
        System.out.println(ts);  // 12 15




    }

}

