package com.day2;

public class Example2 {

        public static void main(String[] args) {
        int a[]= {1,2,3};//declaring and initializing an array
		/*inta1[];//declaring an array
		a1[0]=1;--incorrect declaration and initialization
		a1[1]=2;*/
        // inta2[3]={1,2,3};--incorrect
        int a3[]=new int[3];//declaring in the correct way
        a3[0]=1;
        a3[1]=2;//initializing an array
        a3[2]=3;
        int[] a4=new int[3];//another way of declaring
        //int[] a5=new int[-3];//correct index can be declared in negative but at runtime it will show NegativeArraySizeException.
        int a6[]=new int[] {1,2,3};//correct -Anonymous Array
        //inta7[]=new int[3] {1,2,3};--wrong way
        int a8[]=new int[4];
        a8[0]=10;
        a8[1]=11;
        a8[2]=12;
        a8[3]=13;
        for(int i=0;i<a8.length;i++) {
        System.out.println(a8[i]);

        System.out.println();
        //JDK1.5 we introduce forEach statement
        //1. i variable should be declared only inside for loop and of same datatype of array
        //2. 1D array is stored in a variable,2D array is stored in 1D array and so on.
        for (int j:a8)
        System.out.println(j);
        System.out.println();
        int b[][]= {{1,2},{3,4}};//correct-declaration
//intb1[2][2]= {{1,2},{3,4}}--wrong declaration
        int b1[][]=new int[2][2];//correct way
        int[][] b2=new int[2][2];//correct way
        int b4[][]=new int[2][2];//declaring
        b4[0][0]=1;b4[0][1]=2;
        b4[1][0]=3;b4[1][1]=4;

        for(int k=0;k<b4.length;k++) {
        for(int j=0;j<b4.length;j++) {
        System.out.println(b4[k][j]);
        }
        }

        System.out.println();
        for(int c1[]:b4)
        for(int d1:c1)
        System.out.println(d1);
        int b5[][]=new int[5][5];//5*5=25 and int type so 25*5=100 bytes of memory will be allocated
        b5[0][0]=1;
        b5[1][0]=2;
        b5[1][1]=3;//only 12bytes are going to be used remaining 88 bytes will be wasted and their value will be "0"
        //To avoid such situation we prefer Arrays of Array concept
        //specify the size for only row
        int b6[][]=new int[5][];
        b6[0]=new int[2];
        b6[1]=new int[1];
        b6[0][0]=1;
        b6[0][1]=2;
        b6[1][0]=3;


        }

        }}

