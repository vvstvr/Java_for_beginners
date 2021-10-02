/*
Итоговая задача №1
Напишите программу конвертер валют:
 1. Программа должна переводить рубли в доллары по текущему курсу.
 2. Пользователь вводит текущий курс и количество рублей.
 3. Итоговое значение должно быть округлено до двух знаков после запятой.

Пример для теста работы программы:
    Курс доллара: 67,55
    Количество рублей: 1000
    Итого: 14,80 долларов
 */

package com.max.idea;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Введите курс доллара: ");
                double exRate = scanner.nextDouble();
                System.out.println("Введите количество рублей: ");
                double quantity = scanner.nextDouble();
                if (exRate > 0 && quantity >= 0) {
                    double total = Math.round(quantity / exRate * 100.0) / 100.0;
                    System.out.println("Итого: " + total);
                } else {
                    System.out.println("Некорректное значение!!!");
                }
            }
        }



