package com.max.idea;
import java.util.Scanner;
import java.lang.Math;

public class Main {
    // Меню для вызова заданий
    public static void main(String[] args) {
        Scanner menu = new Scanner(System.in);
        int a;
        String workNumber = null;
        System.out.print("Введите номер задания (№4 - 1; N5 - 2; #6 - 3): ");
        a = menu.nextInt();
        switch (a) {
            case 1: workNumber = "Задание № 4";
            System.out.println(workNumber);
                work4();
                break;
            case 2: workNumber = "Задание № 5";
                System.out.println(workNumber);
                work5();
                break;
            case 3: workNumber = "Задание № 6";
                System.out.println(workNumber);
                work6();
                break;
            default:
                System.out.println("Такого задания нет.");
        }
    }

/*
========================================================================================================================
Задание № 4 "Операторы"
Написать программу, которая будет выполнять следующие действия:

    1. Ввести три числа с клавиатуры x, y, z
    2. Найти и вывести в консоль среднее арифметическое этих чисел.
    3. Разделить среднее арифметическое на 2 и округлить в меньшую сторону
    4. Если полученное число больше 3, то вывести на экран сообщение "Программа выполнена корректно"
========================================================================================================================
 */

    // private сделал для дого, что бы использовать переменные с одинаковыми именами в разных методах
    private static void work4() {
        Scanner num = new Scanner(System.in);
        double a, b, c, result1, result2;
        double summa;
        String answer = null;
        System.out.print("Введите первое число: ");
        a = num.nextFloat();
        System.out.print("Введите второе число: ");
        b = num.nextFloat();
        System.out.print("Введите третье число: ");
        c = num.nextFloat();

        // Находим среднее арифмитическое
        result1 = ((a+b+c)/3);
        System.out.println("Среднее арифмитическое введённых чисел: " + result1);

        // Делим среднее арифмитическое на "2"
        result2 = result1 / 2;

        // Округляем в меньшую сторону
        int result3 = (int) Math.floor(result2);

        if (result3 > 3)
            answer = "Программа выполнена корректно";
        System.out.print(answer);
    }


    /*
    ====================================================================================================================
    Задание № 5
    Напишите простой калькулятор:
            1. Ввести 2 числа с клавиатуры, затем один из символов ‘+’, ‘-’, ‘*’ или ‘/’.
            2. В зависимости от символа вывести в консоль результат выполнения соответствующей арифметической операции.
    ====================================================================================================================
    */
    private static void work5 () {
        Scanner num = new Scanner(System.in);
        double a, b, c;
        double result = 0;
        char operation;
        String answer = null;
        System.out.print("Введите первое число: ");
        a = num.nextFloat();
        System.out.print("Введите второе число: ");
        b = num.nextFloat();
        System.out.println("Введите операцию ('+', '-', '*', '/' : ");
        operation = num.next().charAt(0);
        switch (operation) {
            case '+':
                result = a + b;
                break;
            case '-':
                result = a - b;
                break;
            case '*':
                result = a * b;
                break;
            case '/':
                result = a / b;
                break;
            default:
                System.out.print("Операция не распознана!");
        }
        System.out.println(result);
    }

/*
========================================================================================================================
Напишите программу конвертер физических величин:

1. Пользователю предлагается на выбор ввести массу или расстояние. Пример:
> Выберите что переводить: 1 - масса, 2 - расстояние
> 2

2. Пользователю предлагается выбрать единицу измерения. Пример:
> Выберите единицу измерения: 1 - метр, 2 - миля, 3 - ярд, 4 - фут
> 1

3. Пользователю предлагается ввести количество выбранных единиц:
> Введите число
> 10
> Результат:
> Метры: 10
> Мили: 0.006
> Ярды: 10.94
> Футы: 32.81
========================================================================================================================
 */

    private static void work6 () {
        Scanner zMenu = new Scanner(System.in);
        int a, b, zMass;
        double mass = 0, dis = 0;
        System.out.print("Выберите переводимую велечину: \n 1 - Масса \n 2 - Расстояние \n");
        a = zMenu.nextInt();
        switch (a) {
            case 1:
                Scanner massMenuIn = new Scanner(System.in);
                System.out.print("Выберите еденицу измерения: \n 1 - Граммы \n 2 - Килограммы \n 3 - Тонны \n");
                zMass = massMenuIn.nextInt();
                switch (zMass) {
                    case 1:
                        double massGr = 0, massT = 0, massKg = 0;
                        Scanner massInG = new Scanner(System.in);
                        System.out.print("Введите число: ");
                        mass = massInG.nextDouble();
                        massKg = mass / 1000;
                        massT = massKg / 1000;
                        System.out.print(" Граммы: " + mass + "\n Килограммы: " + massKg + "\n Тонны: " + massT );
                        break;
                    case 2:
                        Scanner massInKg = new Scanner(System.in);
                        System.out.print("Введите число: ");
                        massKg = massInKg.nextDouble();
                        massGr = massKg * 1000;
                        massT = massKg / 1000;
                        System.out.print(" Граммы: " + massGr + "\n Килограммы: " + massKg + "\n Тонны: " + massT );
                        break;
                    case 3:
                        Scanner massInT = new Scanner(System.in);
                        System.out.print("Введите число: ");
                        massT = massInT.nextDouble();
                        massKg  = massT * 1000;
                        massGr = massKg * 1000;
                        System.out.print(" Граммы: " + massGr + "\n Килограммы: " + massKg + "\n Тонны: " + massT );
                        break;
                    default:
                        System.out.print("Не выбрана еденица измерения !");
                }

                break;
            case 2:
                Scanner distMenuIn = new Scanner(System.in);
                System.out.print("Выберите еденицу измерения: \n 1 - Миллиметры \n 2 - Сантиметры \n 3 - Метры \n");
                zMass = distMenuIn.nextInt();
                switch (zMass) {
                    case 1:
                        double distMm, distSm, distM;
                        Scanner distInMm = new Scanner(System.in);
                        System.out.print("Введите число: ");
                        distMm = distInMm.nextDouble();
                        distSm = distMm / 10;
                        distM = distSm / 100;
                        System.out.print("Миллиметры: " + distMm + "\n Сантиметры: " + distSm + "\n Метры: " + distM );
                        break;
                    case 2:
                        Scanner distInSm = new Scanner(System.in);
                        System.out.print("Введите число: ");
                        distSm = distInSm.nextDouble();
                        distMm = distSm * 10;
                        distM = distSm / 100;
                        System.out.print("Миллиметры: " + distMm + "\n Сантиметры: " + distSm + "\n Метры: " + distM );
                        break;
                    case 3:
                        Scanner distInM = new Scanner(System.in);
                        System.out.print("Введите число: ");
                        distM = distInM.nextDouble();
                        distSm = distM * 100;
                        distMm = distSm * 10;
                        System.out.print("Миллиметры: " + distMm + "\n Сантиметры: " + distSm + "\n Метры: " + distM );
                        break;
                    default:
                        System.out.print("Не выбрана еденица измерения !");
                }
                break;
            default:
                System.out.print("Не выбрана переводимая велечина!");
        }
    }
}
