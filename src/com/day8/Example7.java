package com.day8;

class A extends Thread{
    public void run(){

        try {
            for(int i=0;i<5;i++) {
                System.out.println("from thread A "+i);
                if(i==0) {
                    Thread.yield();
                }
            }
        }
        catch(Exception e) {
            System.out.println("thread A exception");
        }

        System.out.println("exit thread A");
    }
}

class B extends Thread{
    public void run(){

        try {
            for(int j=0;j<5;j++) {
                System.out.println("from thread B "+j);
                if(j==3)
                    stop();
            }
        }
        catch(Exception e) {
            System.out.println("thread B exception");
        }
        System.out.println("exit thread B");


    }
}
class C extends Thread{
    public void run(){

        try {
            for(int k=0;k<5;k++) {
                System.out.println("from thread C "+k);
                if(k==0)
                    sleep(1000);

            }

        }
        catch(Exception e) {
            System.out.println("thread C exception");
        }

        System.out.println("exit thread C");
    }

}

public class Example7 {

    public static void main(String[] args) {
        A a=new A();
        B b=new B();
        C c=new C();
        a.start();
        b.start();
        c.start();
        c.setPriority(Thread.MAX_PRIORITY);  //10
        b.setPriority(2);                   //2
        a.setPriority(b.getPriority()+3);   //5

        System.out.println("end of main Thread");


    }

}

