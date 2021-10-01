package com.max.idea;
import java.util.Locale;
import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        // Создадим меню для задач 11-14
        Scanner menu = new Scanner(System.in);
        int a;
        String workNumber = null;
        System.out.print("Введите номер задания (№11 - 1; N12 - 2; N13 - 3; N14 - 4): ");
        a = menu.nextInt();
        switch (a) {
            case 1:
                workNumber = "Задание № 11";
                System.out.println(workNumber);
                work11();
                break;
            case 2:
                workNumber = "Задание № 12";
                System.out.println(workNumber);
                work12();
                break;
            case 3:
                workNumber = "Задание № 13";
                System.out.println(workNumber);
                work13();
                break;
            case 4:
                workNumber = "Задание № 14";
                System.out.println(workNumber);
                work14();
                break;
            default:
                System.out.println("Такого задания нет.");
        }
    }



/*
Задача №11_Работа с данными
Напишите программу:
   1. Ввести первое число с клавиатуры и записать его в строковую переменную.
   2. Ввести второе число с клавиатуры и сохранить его в целочисленную переменную типа int.
   3. Сравнить 2 числа и вывести большее на экран .
   4. Выведите также меньшее число на экран, предварительно переконвертировать его в тип double.
 */
    private static void work11() {
        Scanner num = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        Integer a = num.nextInt();
        // Преобразуем Integer в string и сохраняем в переменную str
        String str = a.toString();

        System.out.println("Введите второе число: ");
        Integer b = num.nextInt();
        // Преобразуем Integer в int
        int y = b.intValue();

        int x = Integer.parseInt(str);
        // Ищем наибольшее число и выводим его
        int max = Math.max(x, y);
        System.out.println("Наибольшее число: " + max);

        // Ищем наименьшее число, преобразуем в double и выводим его
        int min = Math.min(x, y);
        double m = (double) min;
        System.out.println("Наименьшее число: " + m);

    }

/*
Задача №12_Работа с данными
Напишите программу, принимающую на вход строку “I like Java!!!”, которая будет выполнять следующие действия:
    1. Проверить, содержит ли строка подстроку “Java” (используйте contains()).
    2. Проверить, начинается ли строка с подстроки “I like” (используйте startsWith()).
    3. Проверить, заканчивается ли строка с подставки “!!!” (используйте endsWith()).
    4. Если 3 предыдущих условия верны, выведите данную строку, преобразованную к верхнему регистру.
    5. Замените все символы ‘a’ на ‘о’ и введите подстроку “Jovo” на экран  (используйте substring()).
*/
    private static void work12() {
        Scanner string = new Scanner(System.in);
        String str = string.nextLine();

        if (str.contains("Java") && str.startsWith("I like") && str.endsWith("!!!")) {
            // Переводим в верхний регистр всю фразу
            System.out.println(str.toUpperCase(Locale.ROOT));
            // Заменяем 'а' на 'o'
            String nStr = str.replace( 'a', 'o');
            // Выводим подстроку
            System.out.println(nStr.substring(7, 11));

        }
    }

/*
Задача №13_ Работа с данными
Напишите программу, где пользователь должен ввести строку из слов, разделенных пробелами.
Например: “I love java 8 Я люблю java 14 core1”. Выполните следующие действия:
    1. Выведите слова, состоящие только из латиницы.
    2. Выведите количество этих слов.
*/

    private static void work13() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку");
        String str = scanner.nextLine();
        String aStr = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        boolean word = false;

        String[] words = str.split(" ");
        int count = 0;
        for (int i = 0; i < words.length; i++) {

            char[] symbols = words[i].toCharArray();
            for (int j = 0; j < symbols.length; j++) {
                int index = aStr.indexOf(Character.toUpperCase(symbols[j]));
                if (index == -1) {
                    word = false;
                    break;
                } else {
                    word = true;
                }
            } if (word) {
                System.out.print(words[i] + "\n");
                count++;
            }
        }
        System.out.println("Количество слов: " + count);
    }


/*
Задача №14_ Работа с данными
Напишите программу, заполняющую массив из 15 элементов рандомными значениями в диапазоне от -20 до 20. Далее:
    1. Выведите максимальный и минимальный элемент массива.
    2. Из максимального и минимального значения выведите наибольшее по модулю.
*/

    private static void work14() {

        double[] array = new double[15];
        double min = Double.MAX_VALUE, max = Double.MIN_VALUE;

        for(int i = 0; i < array.length; i++ ){
            array[i] = (Math.random() * 40) - 20;
            System.out.println(array[i]);
            if (min > array[i]) {
                min = array[i];
            }
            if (max < array[i]) {
                max = array[i];
            }
        }

        System.out.println("Минимальное число: " + min);
        System.out.println("Максимальное число: " + max);

        double result = Math.max(Math.abs(max), Math.abs(min));
        System.out.println("Наибольшее по модулю: " + result);

    }
}
