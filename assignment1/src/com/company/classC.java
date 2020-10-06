package com.company;

import java.util.Scanner;


//---------TASK 1-----------------

public class classC {
    private int a,b,c;

    private Scanner sc = new Scanner(System.in);


    public void setVariables(){
        System.out.println("a: ");
        a=sc.nextInt();
        System.out.println("b: ");
        b=sc.nextInt();
        System.out.println("c: ");
        c=sc.nextInt();
    }

    public int ALastDigit(){

        return a%10;
    }

    public int BFirstDigit(){
        return Integer.toString(b).charAt(0)-'0';

    }

    public int CSumOfDigits(){
        int sum =0;
        while(c>0){
            sum+= c%10;
            c/=10;
        }
        return sum;
    }

    public void print1(){
        System.out.println(BFirstDigit()*ALastDigit());

    }

    private int print1_2(){
        return BFirstDigit()*ALastDigit();
    }

    public void print2(){
        System.out.println(BFirstDigit()+print1_2());
    }


}
