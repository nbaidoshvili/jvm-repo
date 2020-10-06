package com.company;

//---------TASK 2-----------------

public class classB extends classA {
    private int y;

    public void setY(){
        System.out.println("y: ");
        y=sc.nextInt();
    }

//    public int sumxy(classA obj){
//        return obj.x+y;
//    }

    public int sumxy(){
        return x+y;
    }
}
