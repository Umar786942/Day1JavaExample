package com.day5;

public class Example6 {
        static void demoA() {
        try {
        System.out.println("Inside demoA try");
        throw new RuntimeException();
        }
        finally {
        System.out.println("Inside demoA finally");
        }
        }
        static void demoB() {
        try {
        System.out.println("Inside demoB try");
        return;
        }
        finally {
        System.out.println("Inside demoB finally");
        }
        }
        static void demoC() {
        try {
        System.out.println("Inside demoC try");
        }
        finally {
        System.out.println("Inside demoC finally");
        }
        }

        public static void main(String[] args) {
        try {
        demoA();
        }
        catch(RuntimeException e) {
        System.out.println("Exception caught");
        }
        demoB();
        demoC();

        }

        }

