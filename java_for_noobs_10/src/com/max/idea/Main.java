/*
Задача №10_Циклы

Напишите программу, где пользователь вводит данные с клавиатуры в матрицу,
а после этого произведите вывод первой строки матрицы на экран,
где каждый элемент умножается на 3.
Размерность матрицы задается пользователем.
 */


package com.max.idea;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n, m;
        int x = 3;

        Scanner in = new Scanner(System.in);
        System.out.print("Введите количество строк матрицы: ");
        n = in.nextInt();

        System.out.print("Введите количество столбцов матрицы: ");
        m = in.nextInt();


        int[][] array = new int[n][m];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print("Введите элемент матрицы[" + i + "][" + j + "]:");
                array[i][j] = in.nextInt();
            }
            System.out.print(array[0][j]);
        }


        for (int i = 0; i < array.length; i++) {
            //System.out.print(array[0][j]);

        }
                //System.out.print(Arrays.deepToString(array[][0]));

            System.out.println();
        }
        }



