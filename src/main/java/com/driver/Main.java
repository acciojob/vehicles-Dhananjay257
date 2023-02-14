package com.driver;

public class Main {
    public static void main(String[] args) {

        F1 f1 = new F1("BMW", false);
        f1.accelerate(0);
        f1.accelerate(50);

        f1.accelerate(26);



        f1.accelerate(99);


        f1.accelerate(1);


        //        F1 mercedes = new F1("mercedes", false);
//        mercedes.move(40, 0);
//        mercedes.accelerate(20);
//        mercedes.accelerate(-60);
    }
}