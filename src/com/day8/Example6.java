package com.day8;

class NewThread2 implements Runnable  {
    Thread t;
    String tname;
    NewThread2(String name){
        tname=name;
        t=new Thread(this,name);
        System.out.println("chid thread"+t);//Thread[one,5,main] Thread[two,5,main] Thread[three,5,main]
        t.start();//starts one thread and put in runnable stage come to main method
    }

    @Override
    public void run() {
        try {
            for(int i=5;i>0;i--) {
                System.out.println(tname+" "+i);
                Thread.sleep(1000);
            }
        }
        catch(InterruptedException e) {
            System.out.println("chid threa interrupt");
        }
        System.out.println(tname+"exiting");

    }




}

public class Example6 {

    public static void main(String[] args) {
        NewThread2 n=new NewThread2("one");
        NewThread2 n2=new NewThread2("two");
        NewThread2 n3=new NewThread2("three");
        System.out.println(n.t.isAlive());//true
        System.out.println(n2.t.isAlive());//true
        System.out.println(n3.t.isAlive());//true


        try {
            n.t.join();
            n2.t.join();
            n3.t.join();

        }
        catch(InterruptedException e) {
            System.out.println("main thread interrupt");
        }

        System.out.println(n.t.isAlive());//false
        System.out.println(n2.t.isAlive());//false
        System.out.println(n3.t.isAlive());//false

        System.out.println("main thread exiting");



    }

}


