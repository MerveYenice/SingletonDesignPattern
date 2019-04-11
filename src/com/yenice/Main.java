package com.yenice;

public class Main {

    public static void main(String[] args) {

        //illegal construct
        //Compile Time Error: The constructor SingleObject() is not visible
        //SingleObject object = new SingleObject();

        Messager object = Messager.getInstance();

        object.displayMessage();
    }
}
