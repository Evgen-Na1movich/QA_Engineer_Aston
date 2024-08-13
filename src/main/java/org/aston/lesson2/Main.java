package org.aston.lesson2;

import java.util.Arrays;

import static org.aston.lesson2.Tasks.*;


public class Main {
    public static void main(String[] args) {
        printThreeWords();

        checkSumSign();

        printColor();

        compareNumbers();

        System.out.println(isSumInRange(5, 7)); // true
        System.out.println(isSumInRange(-5, 6)); // false

        printPositiveOrNegative(7); // Положительное число
        printPositiveOrNegative(-2); // Отрицательное число
        printPositiveOrNegative(0);

        System.out.println(isPositiveOrNegative(-4));  // true
        System.out.println(isPositiveOrNegative(0));    // false
        System.out.println(isPositiveOrNegative(2));   // false

        printString("Smile", 3);

        System.out.println(isLeapYear(2024)); // true
        System.out.println(isLeapYear(1900)); // false
        System.out.println(isLeapYear(2000)); // true
        System.out.println(isLeapYear(2023)); // false

        arrayChange();

        arrayLengthNumber();

        arrayChangeIfNumberLess6();

        matrix();

        System.out.println(Arrays.toString(createArray(5,3)));
    }
}

