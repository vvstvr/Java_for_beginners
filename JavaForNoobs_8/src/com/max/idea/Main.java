package com.max.idea;

/*
Задача №8_ Циклы
Напишите программу, где пользователь вводит любое целое положительное число n.
А программа суммирует все нечетные числа от 1 до введенного пользователем числа n.
 */


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int x = 0;
        int sum = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Введите любое положительное число: ");
        int n = input.nextInt();

        // Создадим массив с длинной n
        int array[] = new int[n];

        // Заполним массив числами от 1 до n
        int value = 1;
        for (int i = 0; i < array.length; i++) {
            array[i] = value;
            value += 1;
        }
        // считаем сумму нечётных элеметов
        for (int j = 0; j < array.length; j++) {
            if (array[j] % 2 != 0) {
                ++x;
                sum += array[j];

            }
        }
        System.out.println("Сумма нечётных элементов от 1 до " + n + ": " + sum);
    }
}
