package com.butskikh;

public class Cat extends Animal{

    public Cat(String name, int age, int weight, String color) {
        super(name, age, weight, color);
    }

    // переопределяем метод Say для Котов
    @Override
    public void Say(){
        System.out.println("Мяу");
    }
}
