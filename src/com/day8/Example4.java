package com.day8;


//this class just acts like chid thread class
//but thread is not created. inorder to create Thread
//we have to any one of 7 contructor
class NewThread implements Runnable{
    Thread t;

    NewThread(){
        t=new Thread(this,"demo thread");
        System.out.println("child thread"+t);  //Thread[demo thread,5,main]
        t.start(); //it create new child thread put in runnalbe stage
        //and comes to main thread
    }

    @Override
    public void run() {
        //operation of child thread
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


    }}

public class Example4 {

    public static void main(String[] args) {
        NewThread n=new NewThread();
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

