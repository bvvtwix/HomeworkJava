package com.butskikh;

public class Cat extends Animal{

    // переопределяем метод Say для Котов
    @Override
    public void Say(){
        System.out.println("Мяу");
    }
}
