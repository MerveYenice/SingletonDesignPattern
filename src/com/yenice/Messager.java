package com.yenice;

public class Messager {

    private static Messager instance = new Messager();

    private Messager(){}

    public static Messager getInstance(){
        return instance;
    }

    public void displayMessage(){
        System.out.println("Hello World!");
    }
}
