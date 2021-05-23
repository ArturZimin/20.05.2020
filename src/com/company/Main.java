package com.company;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {




        //task10 Имеется 2 дома и участок,определить вместятся ли дома на участке

        Scanner scanner = new Scanner(System.in);
        System.out.println("размеры дома №1");
        System.out.print("введите width:");
        int widthA = scanner.nextInt();
        System.out.print("ведите length:");
        int lengthA = scanner.nextInt();
        System.out.println("размеры дома №2");
        System.out.print("введите width:");
        int wigthB = scanner.nextInt();
        System.out.print("ведите length");
        int lengthB = scanner.nextInt();
        System.out.println("размер участка: ");
        System.out.print("введите width:");
        int widthC = scanner.nextInt();
        System.out.print("введите length1:");
        int lenthC = scanner.nextInt();
        if (widthC > (widthA + wigthB) && lenthC > (lengthB + lengthA)) {
            System.out.println("дома помещаются на участке");
        } else {
            System.out.println("дома слишком большие и не помещаются на участке");
        }


        //task8 Задать целое число в виде переменной и вывести на экран ,добавив название валюты

        int many = 100;
        System.out.println(many + " " + "dollars");

        //task 9  Задать 3 числа -день,месяц,год.Вывести на экран в виде трех чисел, дату следуещего дня

        int day = 20;
        int month = 05;
        int year = 2021;
        char zero = 48;
        System.out.println(++day + " " + zero + month + " " + year);


        isRectangle(8);

        weekSchedule(3);
    }

    //task7 имеется прямоугольное отверстие разм. а и б. Где а и б целые числа.Определить можно ли его закрыть
    //круглой картонкой радиусом р(тоже целое число)

    public static boolean isRectangle(int number) {
        int height = 4;
        int width = 8;
        double radius = Math.sqrt((height * height) * (width * width) / 2);
        System.out.println(radius);
        double diagonal = Math.sqrt((height * height) + (width * width));
        boolean a = true;
        boolean b = false;
        if (number >= diagonal) {
            System.out.println(b);
            return b;
        } else {
            System.out.println(a);
            return a;
        }


    }


    //Task11 Написать метод, который выводит расписание на неделю

    public static void weekSchedule(int day) {


        switch (day) {
            case 1: {
                System.out.println("Monday lessons schedule:");
            }
            break;
            case 2: {
                System.out.println("Tuesday lessons schedule:");
            }
            break;
            case 3: {
                System.out.println("Wednesday lessons schedule:");
            }
            break;

            case 4: {
                System.out.println("Thursday lessons schedule:");
            }
            break;
            case 5: {
                System.out.println("Friday lessons schedule: ");
            }
            break;
            case 6: {
                System.out.println("Holiday saturday");
            }
            break;
            case 7: {
                System.out.println("Holiday sunday");
            }
            break;
            default: {
                System.out.println("Day of week input error");
            }


        }

        isSeven(237);

    }

    //Task6

    //Создайте метод с одним целочисленным параметром .Метод должен определить ,
    //является ли последняя цифра 7 и вернуть значение boolean
    public static boolean isSeven(int number) {

        boolean a = true;
        boolean b = false;
        if (number % 10 == 7) {
            System.out.println(a);
            return a;
        } else {
            System.out.println(b);
            return b;
        }
    }
}


