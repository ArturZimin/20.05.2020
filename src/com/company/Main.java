package com.company;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        //task10

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

///рорордлбтд


        //task8

        int many = 100;
        System.out.println(many + " " + "dollars");

        //task 9

        int day = 20;
        int month = 05;
        int year = 2021;
        char zero = 48;
        System.out.println(++day + " " + zero + month + " " + year);


//task7
        isRectangle(8);
    }

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
}


