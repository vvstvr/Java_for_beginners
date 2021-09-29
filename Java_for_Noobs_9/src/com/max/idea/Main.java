package com.max.idea;
import java.util.Scanner;

/*
Задача №9_ Циклы
Напишите программу:
1. Пользователь вводит размер массива и данные с клавиатуры в массив типа double.
2. Посчитайте среднее арифметическое элементов массива.
3. После этого произведите вывод массива на экран, где каждый элемент массива умножается на среднее арифметическое
 */

public class Main {
    public static void main(String[] args) {
        double avg = 0;
        double aver = 0;
        Scanner input = new Scanner(System.in);
        // Вводим длинну массива
        System.out.println("Введите длинну массива: ");
        int sizeM = input.nextInt();
        double[] array = new double[sizeM];
        // Вводим элементы массива и считаем среднеарифметическое элементов массива
        System.out.println("Введите элементы массива: ");
        for (int i = 0; i < sizeM; i++) {
            array[i] = input.nextDouble();
            avg += array[i];
            aver = avg / sizeM;
        }
        // Умнодаем каждый элемент массива на среднеарифметическое элементов массива и выводим на экран.
        for (double element : array){
            System.out.println(element * aver);
        }
    }
}