package com.day8;

class Callme{
    void call(String msg) {
        System.out.print("["+msg);

        try {
            Thread.sleep(1000);
        }
        catch(InterruptedException e) {
            System.out.println("interrupted");
        }
        System.out.println("]");}


}
class Caller implements Runnable{
    String msg;
    Callme target;
    Thread t;
    Caller(Callme targ,String s){
        target=targ;
        msg=s;
        t=new Thread(this);
        t.start();
    }

    @Override
    public void run() {
        synchronized(target) {
            target.call(msg);}

    }

}

public class Example8 {

    public static void main(String[] args) {

        Callme target= new Callme();
        Caller ob1=new Caller(target,"Hello");
        Caller ob2=new Caller(target,"Synchronized");
        Caller ob3=new Caller(target,"World");

        try {
            ob1.t.join();
            ob2.t.join();
            ob2.t.join();
        }
        catch(InterruptedException e) {
            System.out.println("interrupted");
        }


    }

}


