/*
Итоговая задача № 3
Напишите программу, где пользователь вводит сначала количество строк n, затем сами строки.
Среди данных строк найти строку с максимальным количеством различных символов.
Если таких строк будет много, то вывести первую.

Пример для теста работы программы:
    Количество строк: 3
    Строка 1: привет
    Строка 2: анализ
    Строка 3: 111111111111
    Ответ: привет
 */


package com.max.idea;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество строк: ");
        int num = scanner.nextInt();
        String[] lines = new String[num];
        int different = 0;
        int index = 0;

        for (int i = 0; i < num; i++) {
            System.out.println("Введите строку: " + (i + 1));
            lines[i] = scanner.next();

            int count = countDifferent(lines[i]);
            if (different < count) {
                different = count;
                index = i;
            }
        }

        System.out.println("Ответ: " + lines[index]);
    }

    public static int countDifferent(String line) {
        line = line.toLowerCase();
        char[] symbols = line.toCharArray();
        int count = line.length();
        for (int i = 0; i < symbols.length; i++) {
            if (i != line.indexOf(symbols[i])) {
                count--;
            }
        }
        return count;
    }
}

