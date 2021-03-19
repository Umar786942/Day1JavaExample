package com.day8;

class NewThread1 extends Thread{


    NewThread1(){
        super("demo thread");
        System.out.println("child thread "+this);//Thread[demo thread,5,main]
        start();
    }

    public void run() {
        try {
            for(int i=5;i>0;i--) {
                System.out.println("child thread "+i);
                Thread.sleep(500);
            }
        }

        catch(InterruptedException e) {
            System.out.println("child tread interrupt");
        }
        System.out.println("exiting child thread");

    }
}

public class Example5 {

    public static void main(String[] args) {
        NewThread1 n=new NewThread1();
        try {

            for(int i=5;i>0;i--) {
                System.out.println("main thread "+i);
                Thread.sleep(1000);
            }

        }
        catch(InterruptedException e) {

            System.out.println("main thread interrupt");


        }
        System.out.println("main thread Exiting");


    }

}

