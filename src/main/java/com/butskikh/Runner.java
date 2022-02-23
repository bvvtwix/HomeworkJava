package com.butskikh;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {

        ArrayList<Animal> animals = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        String enter;
//        boolean isNotExit = true;

        while (true){

            System.out.println("Выберете команду add/list/exit");
            enter = scanner.next().trim().toUpperCase(Locale.ROOT); //
            MenuCommands command = MenuCommands.valueOf(enter);
            Animal animal = null;

            switch (command){
                case ADD:
                    System.out.println("Какое животное cat/dog/duck?");
                    String animalType = scanner.next().trim().toLowerCase(Locale.ROOT);
                    if (animalType.equals("cat")){
                        animal = new Cat();
                        askQuestions(animal, scanner);
                        animals.add(animal);
                    } else if (animalType.equals("dog")){
                        animal = new Dog();
                        askQuestions(animal, scanner);
                        animals.add(animal);
                    } else if (animalType.equals("duck")){
                        animal = new Duck();
                        askQuestions(animal, scanner);
                        animals.add(animal);
                    } else {
                        System.out.println("Неведомый зверь");
                    }
                    break;
                case LIST:
                    if (animals.size() > 0) {
                        for (Animal an : animals) {
                            System.out.println(an);
                        }
                    } else {
                        System.out.println("Список пуст");
                    }

                    break;
                case EXIT:
                    System.out.println("exit");
//                    isNotExit = false;
                    System.out.println("Вы вышли из программы!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Ведена не корректная команда");
            }
        }

//        Animal an1 = new Animal("Vasa", 11, 4, "Gray");
    }

    public static void askQuestions(Animal animal, Scanner scanner){
        System.out.println("Какое имя?");
        String name = scanner.next();
        animal.setName(name);

        System.out.println("Какой возраст?");
        int age = Integer.parseInt(scanner.next());
        animal.setAge(age);

        System.out.println("Какой вес?");
        int weight = Integer.parseInt(scanner.next());
        animal.setWeight(weight);

        System.out.println("Какое цвет?");
        String color = scanner.next();
        animal.setColor(color);

        animal.Say();
    }
}
