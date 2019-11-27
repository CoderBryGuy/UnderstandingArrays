package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
//
//        int[] one = new int[3];
//        int[] two = new int[]{10, 11,12};
//
//        double [] a = new double[2];
//        double[] b = new double[4*5 / 2];
//        int x = 4;
//        int y =4;
//        double[] c = new double[x*y];
//
//        int[] three = {10,11,12};
//
//        int[] four = {};
//
//        int[] a1;
//        int[] a2;
//        int a3[];
//        int a4[];
//
//        int[] ids, types;
//
//        //int ids2[], types2; // bad practice first is array, second is int
//
//        String[] animals = {"Parrot", "Dog", "Cat"};
//        String[] myAnimals = animals;
//        String[] otherAnimals = {"Parrot", "Dog", "Cat"};
//
//        System.out.println(animals.equals(myAnimals));
//        System.out.println(animals == myAnimals);
//
//        System.out.println(Arrays.equals(animals, myAnimals));
//
//        System.out.println(animals.equals(otherAnimals));
//        System.out.println(animals == otherAnimals);
//        System.out.println(Arrays.equals(animals, otherAnimals));
//
//        System.out.println(Arrays.toString(animals));
//
//        String[] pets = {"parrot", "cat", "dog"};
//
//        System.out.println(pets[0]);
//        System.out.println(pets[1]);
//        System.out.println(pets[2]);
//
//        pets[0] = "bird";
//
//        System.out.println(Arrays.toString(pets));
//
//        for (int i = 0; i < pets.length ; i++) {
//            System.out.println(pets[i]);
//        }
//
//        System.out.println("**********************");
//
//        for (int i = 0; i < pets.length -1 ; i++) {
//            System.out.println(pets[i]);
//        }
//
//        System.out.println(pets);
//
//        int[] numbers = new int[5];
//
//        System.out.println(Arrays.toString(numbers));
//
//        String[] newPets = new String[5];
//        System.out.println(Arrays.toString(newPets));
//
//        for (int i = 0; i < numbers.length; i++) {
//            numbers[i] = i + 10;
//        }
//        System.out.println(Arrays.toString(numbers));
//
//        for (int i = 0; i < numbers.length; i++) {
//            System.out.println("numbers[" + i + "] = " + numbers[i]);
//        }
//
//        Integer[] nums = new Integer[4];
//        System.out.println(Arrays.toString(nums));
//
//        for (int i = 0; i < nums.length ; i++) {
//            nums[i] = i % 3;
//        }
//
//        System.out.println(Arrays.toString(nums));
//
//        int[] numbers = {1,2,3,4,5};
//
//        for (int i = 1; i < numbers.length; i++) {
//            System.out.println(i + " - " + numbers[i]);
//        }
//
//        for (int i = 1; i <= numbers.length ; i++) {
//            System.out.println(i + " - " + numbers[i]);
//        }
//
//       int[] nums = new int[20];
//
//        int size = numbers.length;
//
//       String[] names = {"jimmy", "john", "tom", "anthony"};
//
//        for (int i = 0; i < names.length; i++) {
//            System.out.println("name= " + names[i]);
//        }
//
//        System.out.println("*************************************");
//
//        for (String name: names
//             ) {
//            System.out.println(name);
//        }
//
//        StringBuilder[] builders = {
//                new StringBuilder("For"),
//                new StringBuilder("Loop")
//        };
//
//        for (StringBuilder builder: builders
//             ) {
//            System.out.println(builder);
//
//        }
//
//        for (StringBuilder builder: builders
//             ) {
//            builder.append("123");
//        }
//
//        for (StringBuilder builder:builders
//             ) {
//            System.out.println(builder);
//        }
//
//        String pets = "Parrot";
//
//        for (char c: pets.toCharArray()
//             ) {
//            System.out.println(c);
//        }

//        myLabel:
////        int[] myArray = {1,2,3};
//
//        myLabel:{
//        int[] myArray = {1,2,3};
//        }
//
//        String[] animals = {"Dog", "Cat", "Lizard", "Bird", "Snake"};
//
//        for(String animal : animals){
//            System.out.println(animal);
//        }
//
//
//        String[] animals = {"Dog", "Cat", "Lizard", "Bird", "Snake"};
//        MY_LOOP:
//        for (String animal: animals
//             ) {
//            if(animal.equals("Cat")){
//                break MY_LOOP;
//            }
//
//            System.out.println(animal);
//        }
//
//        animal :
//        for (String animal: animals
//             ) {
//            if(animal.equals("Cat")){
//                break animal;
//            }
//
//            System.out.println(animal);
//        }
//
//        for (String animal : animals
//             ) {
//            if(animal.equals("Lizard")){
//                break;
//            }
//
//            System.out.println(animal);
//        }
//
//        int index = 0;
//        while(index < animals.length){
//            String animal = animals[index];
//
//            if(animal.equals("Lizard")){
//                break;
//            }
//
//            System.out.println(animal);
//            index++;
//        }

        ln();

        String[] animals = {"Dog", "Cat", "Lizard", "Bird", "Snake"};

        for (String animal : animals
                ) {
            if(animal.equals("Lizard")) {
                continue;
            }

            System.out.println(animal);
        }

        ln();

        MY_LOOP:
            for (String animal: animals
                 ) {
                if(animal.equals("Cat")){
                continue MY_LOOP;
                }

                System.out.println(animal);
            }


        ln();

        animal:
        for (String animal: animals
             ) {
            if(animal.equals("Cat")){
                continue animal;
            }

            System.out.println(animal);
        }

        ln();

        for (String animal: animals
             ) {
            if(animal.equals("Lizard") || animal.equals("Cat")){
                continue;
            }

            System.out.println(animal);
        }

        ln();

        int index = 0;

        while(index < animals.length){
            String animal = animals[index];

            index++;

            if(animal.equals("Lizard")){
                System.out.println("infinite loop sucker");
                continue;
            }

            System.out.println(animal);


        }


    }

    public static void ln(){
        System.out.println();

        for (int i = 0; i < 50; i++) {
            System.out.print("*");
        }

        System.out.println();

        for (int i = 0; i < 50; i++) {
            System.out.print("*");
        }

        System.out.println();

    }
}
