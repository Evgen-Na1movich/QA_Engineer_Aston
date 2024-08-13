package org.aston.lesson2;

import java.util.Arrays;
import java.util.Random;



public class Tasks {
    public static void printThreeWords() {
        System.out.println("*****task1*****");
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void checkSumSign() {
        System.out.println("*****task2*****");
        Random random = new Random();
        int a = random.nextInt(201) - 100;
        int b = random.nextInt(201) - 100;
        int result = a + b;
        if (result >= 0) {
            System.out.println("Сумма положительная");
        } else System.out.println("Сумма отрицательная");
    }

    public static void printColor() {
        System.out.println("*****task3*****");
        Random random = new Random();
        int value = random.nextInt(401) - 200;
        if (value <= 0) {
            System.out.println("Красный");
        } else if ( value <= 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }

    public static void compareNumbers() {
        System.out.println("*****task4*****");
        Random random = new Random();
        int a = random.nextInt(201) - 100;
        int b = random.nextInt(201) - 100;
        if (a >= b) {
            System.out.println("a >= b");
        }
        else System.out.println("a < b");
    }

    public static boolean isSumInRange(int a, int b) {
        System.out.println("*****task5*****");
        int sum = a + b;
        return sum >= 10 && sum <= 20;
    }

    public static void printPositiveOrNegative(int number) {
        System.out.println("*****task6*****");
        if (number >= 0) {
            System.out.println("Положительное число");
        } else {
            System.out.println("Отрицательное число");
        }
    }

    public static boolean isPositiveOrNegative(int number){
        System.out.println("*****task7*****");
        return number < 0;
    }

    public static void printString(String msg, int count){
        System.out.println("*****task8*****");
        for (int i = 0; i < count; i++) {
            System.out.println(msg);
        }
    }

    public static boolean isLeapYear(int year) {
        System.out.println("*****task9*****");
        return (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0));
    }

    public static void  arrayChange(){
        System.out.println("*****task10*****");
        int[] array = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.println("Исходный массив:");
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            if(array[i]==0){
                array[i] = 1;
            }
            else array[i] = 0;
        }
        System.out.println("Измененный массив");
        System.out.println(Arrays.toString(array));
    }

    public static void arrayLengthNumber(){
        System.out.println("*****task11*****");
        int[] array = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }
        System.out.println(Arrays.toString(array));
    }

    public static void arrayChangeIfNumberLess6(){
        System.out.println("*****task12*****");
        int[] array = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        System.out.println("Исходный массив:");
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6){
                array[i] = array[i] * 2;
            }
        }
        System.out.println("Измененный массив");
        System.out.println(Arrays.toString(array));
    }

    public static void matrix(){
        System.out.println("*****task13*****");
        Random random = new Random();
        int n = random.nextInt(10);
        int[][] matrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            matrix[i][i] = 1;
            matrix[i][n - i - 1] = 1;
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[] createArray(int len, int initialValue){
        System.out.println("*****task14*****");
        int[] array = new int[len];
        Arrays.fill(array, initialValue);
        return array;
    }
}
