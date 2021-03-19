package com.day5;

public class Example9 {
        static double withdraw(int balance,int amount) {
        assert balance>amount;
        return balance-amount;
        }

        public static void main(String[] args) {
        System.out.println(withdraw(10000,500));
        System.out.println(withdraw(1000,2000));
        }

        }

