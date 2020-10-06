package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        //---------TASK 3-----------------

        Random rand = new Random();
        Scanner sc = new Scanner(System.in);

        int a,b,even=0,odd=0, sumEven=0, sumOdd=0;

        int[] D = new int[40];

        System.out.println("a: ");
        a=sc.nextInt();
        System.out.println("b: ");
        b=sc.nextInt();

        if(b>=a){
            for(int i=0; i<40; i++){
                D[i]=rand.nextInt(b-a+1)+a;
            }
        }
        else {
            for(int i=0; i<40; i++){
                D[i]=rand.nextInt(a-b+1)+b;
            }
        }


        for(int i=0; i<40; i++){
            System.out.println(D[i]);
            if(D[i]%2==0){
                even++;
                sumEven+= D[i];
            }
            else{
                odd++;
                sumOdd+= D[i];
            }
        }


        System.out.println("there are " + even + " even numbers and " + odd + " odd numbers");
        System.out.println("sum of even numbers: " + sumEven + "\nsum of odd numbers: " + sumOdd);


        if(sumEven>=sumOdd){
            for(int i=0; i<5; i++){
                System.out.println(rand.nextInt(sumEven-sumOdd+1)+sumOdd);
            }
        }
        else {
            for(int i=0; i<5; i++){
                System.out.println(rand.nextInt(sumOdd-sumEven+1)+sumEven);
            }
        }

    }
}
