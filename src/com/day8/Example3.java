package com.day8;

public class Example3 {

    public static void main(String[] args) {
        Thread t=Thread.currentThread();
        System.out.println(t);
        t.setName("demothread");
        System.out.println(t);
        try {
            for(int i=5;i>0;i--) {
                System.out.println(i);
                t.interrupt();
                Thread.sleep(1000);

            }
        }
        catch(InterruptedException e) {
            System.out.println("main thread interrupted");
        }


    }

}

