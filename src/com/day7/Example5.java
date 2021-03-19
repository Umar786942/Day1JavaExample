package com.day7;

import java.util.Arrays;

public class Example5 {

    public static void main(String[] args) {
        int a[]= {0,-3,-6,-9,-12,-15,-18,-21,-24,-27};

        Arrays.sort(a);  //-27 -24 -21 -18 -15 -12 -9 -6 -3 0

        for(int a1:a) {
            System.out.println(a1);
        }




        int i=Arrays.binarySearch(a,-9);
        System.out.println(i);   //6
        int j=Arrays.binarySearch(a, -11);//-(index)-1=-(6)-1 =-7 -->11 is b/w 9 to 12
        System.out.println(j);
        System.out.println(Arrays.binarySearch(a, -1));//-9-1=-10

        Arrays.sort(a,4,8);
        for(int a2:a) {
            System.out.println(a2);
        }

        System.out.println();
        Arrays.fill(a, 2);
        for(int a3:a) {
            System.out.println(a3);}

        System.out.println();
        Arrays.fill(a, 2,6,3);
        for(int a4:a) {
            System.out.println(a4);
        }



    }

}




