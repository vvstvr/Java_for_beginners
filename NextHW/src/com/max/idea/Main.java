package com.max.idea;
import java.util.Scanner;

/*
Задача №7_ Циклы
Напишите программу:
    1. Пользователь вводит размер массива и данные с клавиатуры в массив
    2. Сравнить элементы массива с заранее заданными константами x, y, z.
    3. Если массив содержит хотя бы одну из констант, вывести текст "Данное значение имеется в константах".
 */

public class Main {
    public static void main(String[] args) {
        int x = 15, y = 25, z = 35;
        Scanner input = new Scanner(System.in);
        System.out.println("Введите длинну массива: ");
        int sizeM = input.nextInt();
        int array[] = new int[sizeM];
        System.out.println("Введите элементы массива: ");
        for (int i = 0; i < sizeM; i++) {
            array[i] = input.nextInt();
        }
        for (int j : array) {
            if ((j == x) || (j == y) || (j == z)) {
                System.out.println("Данное значение имеется в константах: " + j);
                break;
            }
            }


    }
}
