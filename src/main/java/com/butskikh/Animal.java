package com.butskikh;

// Родительский класс
public class Animal {

    // Свойства
    private String name;
    private int age;
    private int weight;
    private String color;

    // Геттеры и Сеттеры

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // Методы
    public void Say(){
        System.out.println("Я говорю");
    }

    public void Go(){
        System.out.println("Я иду");
    }

    public void Eat(){
        System.out.println("Я ем");
    }

    public Animal(String name, int age, int weight, String color) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.color = color;
    }


    // override toString


    @Override
    public String toString() {
        return "Привет! Меня зовут " + getName() + ",мне " + getAge() + " " + getAgeName(getAge()) + ", я вешу - " + getWeight() + " кг,мой цвет - " + getColor();
    }

    // определяем лет/год/года
    public String getAgeName(int age){
        String year = "";

            if (age % 10 == 1){
                year = "год";
            } else if (age % 10 >= 2 && age % 10 <= 4){
                year = "года";
            }  else if (age >= 11 && age <= 15 ){
                year = "лет";
            } else if (age % 10 == 0 || age % 10 >= 5 ){
                year = "лет";
            }

        return year;
    }
}
