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
        if (n > 0) {
            for (int i = 1; i <= n; i += 2) {
                    sum += i;
            }
            System.out.println(sum);
        }
        else {
            System.out.println("Некорректный ввод!");
        }


    }
}
