package com.day8;

class SampleThread extends Thread{
    public void run() {
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().isDaemon());
    }

}
public class Example10 {

    public static void main(String[] args) {
        SampleThread s1=new SampleThread();
        SampleThread s2=new SampleThread();
        s1.setDaemon(true);
        s1.start();
        s2.start();
    }

}



