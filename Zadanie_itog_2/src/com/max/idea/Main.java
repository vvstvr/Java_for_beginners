/*
Итоговая задача №2
Напишите программу, которая позволит решить простое уравнение относительно x :
 1. Программа принимает на вход строку длиной 5 символов.
 2. Второй символ строки является знаком ‘+’ или ‘-’, четвертый символ строки ‘=’.
 3 .Первым, третьим и пятым символом являются две цифры (от 0 до 9) и буква ‘x’ (обозначает неизвестное) в любом порядке.

 => Нужно найти неизвестное.

Пример для теста работы программы:
    Ввод: x+5=7
    Вывод: 2
    Ввод: 3-x=9
    Вывод: -6
    Ввод: 3-3=x
    Вывод: 0
 */


package com.max.idea;
import java.util.Scanner;

public class Main {

    private static String example;
    private static final String numbers = "0123456789";

    public static void main(String[] args) {
            while (true) {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Введите простое уравнение: ");
                example = scanner.next();
                example = example.toLowerCase();

                if (example.length() != 5) {
                    System.out.println("Некорректный ввод. Введите 5 символов!");
                    continue;
                }

                if (example.indexOf('=') != 3) {
                    System.out.println("Некорректный ввод. Введите символ '=' ");
                    continue;
                }

                String sign = example.substring(1, 2);
                if (!(sign.equals("+") || sign.equals("-"))) {
                    System.out.println("Некорректный ввод. Введите символы '+' или '-' ");
                    continue;
                }

                String temp = example.replace("x", "");
                if (temp.length() != 4) {
                    System.out.println("Некорректный ввод. В уравнении должна присутствовать одна переменная 'x' ");
                    continue;
                }

                int position = example.indexOf('x');
                byte y, z;
                switch (position) {
                    case 0:
                        y = GetNumber(2);
                        z = GetNumber(4);
                        if (y == -1 || z == -1) {
                            System.out.println("Некорректный ввод. Введите числа от '0' до '9' ");
                        } else {
                            GetTotal(2, 4, y, z, sign);
                        }
                        break;
                    case 2:
                        y = GetNumber(0);
                        z = GetNumber(4);
                        if (y == -1 || z == -1) {
                            System.out.println("Некорректный ввод. Введите числа от '0' до '9' ");
                        } else {
                            GetTotal(0, 4, y, z, sign);
                        }
                        break;
                    case 4:
                        y = GetNumber(0);
                        z = GetNumber(2);
                        if (y == -1 || z == -1) {
                            System.out.println("Некорректный ввод. Введите числа от '0' до '9' ");
                        } else {
                            GetTotal(0, 2, y, z, sign);
                        }
                        break;
                    default:
                        System.out.println("Некорректный ввод!");
                        break;
                }
            }
        }

        private static void GetTotal(int positionY, int positionZ, byte y, byte z, String sing)
        {
            switch (sing)
            {
                case "+":
                    if(positionY == 0 && positionZ == 2)
                    {
                        System.out.println("x = " + (y + z));
                    } else {
                        System.out.println("x = " + (z - y));
                    }
                    break;
                case  "-":
                    if (positionY == 2 && positionZ == 4)
                    {
                        System.out.println("x = " + (y + z));
                    } else {
                        System.out.println("x = " + (y - z));
                    }
                    break;
                default:
                    System.out.println("Некорректный ввод!");
                    break;
            }

        }

        private static byte GetNumber(int index) {
            String symbol = Character.toString(example.charAt(index));
            if (numbers.contains(symbol)) {
                return Byte.parseByte(symbol);
            }
            return  -1;
        }

    }
