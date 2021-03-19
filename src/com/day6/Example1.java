package com.day6;
import java.util.ArrayList;
import java.util.List;

public class Example1 {

    public static void main(String[] args) {
        ArrayList l1=new ArrayList();
        System.out.println(l1.size());  //0
        l1.add("a");
        l1.add("b");
        l1.add(11);   //autoboxing  //int is automatically convert to wrapper class
        //l1.add(new Integer(l1);
        l1.add(3.14);
        l1.add(11);
        System.out.println(l1.size());   //5
        System.out.println(l1);    //always print on []box show its collection

        ArrayList l3=new ArrayList();

        List l2=new ArrayList();  //dynamic method dispatch
        l2.addAll(l1);
        System.out.println(l2.size());
        System.out.println(l2);


        List l4=new ArrayList();
        l4.add(4);
        l4.add(6);
        System.out.println(l4.contains(4));
        System.out.println(l2.containsAll(l1));





        List l5=new ArrayList();
        l5.add("a");
        l5.add("a");
        l5.add("1");
        l5.add("2");l5.add("3");
        System.out.println(l5);



        List l6=new ArrayList();
        l6.add("a");
        l6.add("a");
        l6.add("1");
        System.out.println(l6);


        l5.retainAll(l6);
        System.out.println(l5);
        System.out.println(l6);


    }

}

