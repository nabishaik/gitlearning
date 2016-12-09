package com.saiprasanna;

/**
 * Created by saipr on 6/2/2016.
 */
public class Test {
    Test(){
        this(10);
        System.out.println("0 arg-constructor");
    }
    Test(int a){
        this(10,20);
        System.out.println("1-arg constructor: "+a);

    }
    Test(int a,int b){
        System.out.println("2-arg constructors, "+ "first: "+a+", Second: "+b);

    }

}
