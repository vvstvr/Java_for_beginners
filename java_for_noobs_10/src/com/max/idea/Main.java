/*
Задача №10_Циклы

Напишите программу, где пользователь вводит данные с клавиатуры в матрицу,
а после этого произведите вывод первой строки матрицы на экран,
где каждый элемент умножается на 3.
Размерность матрицы задается пользователем.
 */


package com.max.idea;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите колличество строк: ");
        int n = scanner.nextInt();

        System.out.print("Введите колличество столбцов: ");
        int m = scanner.nextInt();

        String result = "";
        int[][] massive = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("Введите значение элемента [" + i + "][" + j + "]: ");
                massive[i][j] = scanner.nextInt();
                if (i == 0) {
                    result += massive[i][j] * 3 + " ";
                }
            }
        }
        System.out.println("Результат: " + result);
    }
}




