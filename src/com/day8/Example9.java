package com.day8;

class Sample extends Thread {
    public void run() {
        System.out.println("child thread called ");
    }

}

public class Example9 {

    public static void main(String[] args) {
        Sample s=new Sample();
        try {
            s.start();
            s.start();

        }
        catch(IllegalThreadStateException e)
        {
            System.out.println("IllegalThreadStateException");
        }

    }}


