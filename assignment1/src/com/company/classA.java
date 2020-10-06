package com.company;

import java.util.Scanner;

//---------TASK 2-----------------

public class classA {
    int x;

    Scanner sc = new Scanner(System.in);

    public classA(){
        System.out.println("Hello");
    }

    public void setX (){
        System.out.println("x: ");
        x=sc.nextInt();
    }

    public void plus12(){
        System.out.println(x+12);
    }

    public boolean isEven(){
        if(x%2==0){
            return true;
        }
        else {return false;}
    }

}
