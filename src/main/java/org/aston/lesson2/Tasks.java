package org.aston.lesson2;

import java.util.Arrays;
import java.util.Random;


public class Tasks {
    /**
     * Метод printThreeWords() выводит в столбец три слова:
     * "Orange", "Banana" и "Apple".
     * При вызове метода на экран будут напечатаны эти слова,
     * каждое на новой строке.
     */
    public static void printThreeWords() {
        System.out.println("*****task1*****");
        String[] fruits = {"Orange", "Banana", "Apple"};

        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }

    /**
     * Метод checkSumSign() проверяет сумму двух целых чисел.
     * В теле метода объявляются две переменные типа int: a и b,
     * которые инициализируются произвольными значениями.
     * Затем сумма этих переменных вычисляется, и в зависимости
     * от результата выводится сообщение:
     * - "Сумма положительная", если сумма больше или равна 0,
     * - "Сумма отрицательная", если сумма меньше 0.
     */
    public static void checkSumSign() {
        System.out.println("*****task2*****");
        Random random = new Random();
        int a = random.nextInt(201) - 100;
        int b = random.nextInt(201) - 100;
        int result = a + b;
        System.out.println(result + " -> " + (result >= 0 ? "Сумма положительная" : "Сумма отрицательная"));
    }

    /**
     * Метод printColor() определяет цвет на основе значения переменной value.
     * В теле метода задается переменная типа int: value, которая инициализируется произвольным значением.
     * Затем метод проверяет значение переменной:
     * - Если value меньше или равно 0, выводится сообщение "Красный".
     * - Если value больше 0 и меньше или равно 100, выводится сообщение "Желтый".
     * - Если value больше 100, выводится сообщение "Зеленый".
     */
    public static void printColor() {
        System.out.println("*****task3*****");
        Random random = new Random();
        int value = random.nextInt(401) - 200;
        System.out.println(value <= 0 ? "Красный" : (value <= 100 ? "Желтый" : "Зеленый"));
    }

    /**
     * Метод compareNumbers() генерирует два случайных целых числа a и b в диапазоне от -100 до 100.
     * Затем метод сравнивает эти числа и выводит в консоль:
     * - "a >= b", если a больше или равно b;
     * - "a < b", если a меньше b.
     */
    public static void compareNumbers() {
        System.out.println("*****task4*****");
        Random random = new Random();
        int a = random.nextInt(201) - 100;
        int b = random.nextInt(201) - 100;
        System.out.println(a >= b ? "a >= b" : "a < b");
    }

    /**
     * Метод isSumInRange проверяет, находится ли сумма двух целых чисел a и b в диапазоне от 10 до 20 включительно.
     *
     * @param a первое целое число
     * @param b второе целое число
     * @return true, если сумма a и b находится в диапазоне от 10 до 20 (включительно), иначе false
     */
    public static boolean isSumInRange(int a, int b) {
        System.out.println("*****task5*****");
        int sum = a + b;
        return sum >= 10 && sum <= 20;
    }

    /**
     * Метод printPositiveOrNegative проверяет, является ли переданное целое число положительным или отрицательным.
     * Ноль считается положительным числом.
     *
     * @param number целое число, которое нужно проверить
     */
    public static void printPositiveOrNegative(int number) {
        System.out.println("*****task6*****");
        System.out.println(number >= 0 ? "Положительное число" : "Отрицательное число");
    }

    /**
     * Метод isPositiveOrNegative проверяет, является ли переданное целое число отрицательным.
     * Метод возвращает true, если число отрицательное, и false, если число положительное или равно нулю.
     *
     * @param number целое число, которое нужно проверить
     * @return true, если число отрицательное; false, если число положительное или равно нулю
     */
    public static boolean isPositiveOrNegative(int number) {
        System.out.println("*****task7*****");
        return number < 0;
    }

    /**
     * Метод printString выводит переданную строку указанное количество раз в консоль.
     *
     * @param msg   строка, которую нужно напечатать
     * @param count количество раз, которое строка будет напечатана
     */
    public static void printString(String msg, int count) {
        System.out.println("*****task8*****");

        for (int i = 0; i < count; i++) {
            System.out.println(msg);
        }
    }

    /**
     * Метод isLeapYear определяет, является ли переданный год високосным.
     * Високосный год - это год, который делится на 4, но не делится на 100,
     * за исключением годов, которые делятся на 400.
     *
     * @param year год, который нужно проверить
     * @return true, если год високосный; false, если год не високосный
     */
    public static boolean isLeapYear(int year) {
        System.out.println("*****task9*****");
        return (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0));
    }

    /**
     * Метод для печати массива на экран.
     *
     * @param array массив целых чисел, который нужно вывести.
     */
    public static void printArray(int[] array) {
        System.out.println(Arrays.toString(array));
    }

    /**
     * Метод arrayChange создает массив целых чисел, состоящий из элементов 0 и 1,
     * и заменяет каждый элемент массива на противоположный: 0 на 1 и 1 на 0.
     * Исходный и измененный массивы выводятся в консоль.
     */
    public static void arrayChange() {
        System.out.println("*****task10*****");
        int[] array = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.println("Исходный массив:");
        printArray(array);

        for (int i = 0; i < array.length; i++) {
            array[i] = (array[i] == 0) ? 1 : 0;
        }

        System.out.println("Измененный массив:");
        printArray(array);
    }

    /**
     * Метод arrayLengthNumber создает пустой целочисленный массив длиной 100
     * и заполняет его значениями от 1 до 100 с помощью цикла.
     * Затем массив выводится в консоль.
     */
    public static void arrayLengthNumber() {
        System.out.println("*****task11*****");
        int[] array = new int[100];

        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }

        printArray(array);
    }

    /**
     * Метод arrayChangeIfNumberLess6() проходит по массиву и умножает все элементы, которые меньше 6, на 2.
     * Заданный массив: [1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1].
     * Выводит исходный и измененный массивы на экран.
     */
    public static void arrayChangeIfNumberLess6() {
        System.out.println("*****task12*****");
        int[] array = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println("Исходный массив:");
        printArray(array);

        for (int i = 0; i < array.length; i++) {
            array[i] = (array[i] < 6) ? array[i] * 2 : array[i];
        }

        System.out.println("Измененный массив");
        printArray(array);
    }

    /**
     * Метод, который создает квадратный двумерный целочисленный массив
     * и заполняет его диагональные элементы единицами.
     * Размер массива определяется случайным образом (от 0 до 9).
     * В методе заполняются элементы главной диагонали (где индексы равны),
     * т.е. [0][0], [1][1], [2][2], ..., [n][n].
     * После заполнения массива, он выводится на экран.
     */
    public static void matrix() {
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

    /**
     * метод createArray() создает одномерный массив типа int заданной длины и инициализирует
     * каждую ячейку массива значением initialValue.
     *
     * @param len длина создаваемого массива
     * @param initialValue значение, которым будут инициализированы все ячейки массива
     * @return массив типа int длиной len, заполненный значением initialValue
     */
    public static int[] createArray(int len, int initialValue) {
        System.out.println("*****task14*****");
        int[] array = new int[len];
        Arrays.fill(array, initialValue);
        return array;
    }
}
