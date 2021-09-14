package com.max.idea;

public class Main {
    public static void main(String[] args) {
        // ДЗ №2
        byte a = 127; // Переменная целочисленного типа с наименьшим диапазоном чисел. Присвоено наибольшее возможное значение.
        double b = 34.56; // Переменная типа с плавающей точкой с наибольшим диапазоном чисел. Присвоено произвольное дробное значение.

        //ДЗ №3
        int [] MyArray = {5, 6, 7, 8, 9};
        int temp = MyArray[0];
        int summa;

        MyArray[0] = MyArray[MyArray.length - 1];
        MyArray[MyArray.length - 1] = temp;

        summa = MyArray[0] + MyArray[MyArray.length - 3];

        System.out.println("Первый элемент массива: " + MyArray[0]);
        System.out.println("Последний элемент массива: " + temp);
        System.out.println("Сумма первого и среднего элементов массива: " + summa);
    }
}
