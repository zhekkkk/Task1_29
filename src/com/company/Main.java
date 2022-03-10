package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Тест всех методов класса Vector");
        System.out.println();
        Vector a = new Vector(7, 8, 9);
        Vector b = new Vector(12, 19, 28);
        double num = 45;
        execute(a, b, num);
        /*Scanner console = new Scanner(System.in);
        System.out.println("Введите координаты первого вектора: ");
        Vector a = enter();
        System.out.println("Введите координаты второго вектора: ");
        Vector b = enter();
        System.out.println("Введите число: ");
        double num = console.nextDouble();*/
    }

    public static void execute(Vector a, Vector b, double num) {
        System.out.print("Сумма векторов: ");
        printVector(Vector.sum(a, b));
        System.out.print("Разность векторов: ");
        printVector(Vector.difference(a, b));
        System.out.print("Скалярное поизведение векторов: ");
        System.out.println(Vector.scalarMultiplication(a, b));
        System.out.print("Умножение первого вектора на число: ");
        printVector(Vector.multiplicationByNumber(a, num));
        System.out.print("Умножение второго вектора на число: ");
        printVector(Vector.multiplicationByNumber(b, num));
        System.out.print("Длина первого вектора: ");
        System.out.println(Vector.length(a));
        System.out.print("Длина второго вектора: ");
        System.out.println(Vector.length(b));
        System.out.print("Косинус угла между векторами: ");
        System.out.println(Vector.cosine(a, b));
    }

    public static void printVector(Vector a) {
        String result = "(" + Double.toString(a.x) + "; " + Double.toString(a.y) + "; " + Double.toString(a.z) + ")";
        System.out.println(result);
    }

    public static Vector enter() {
        Scanner console = new Scanner(System.in);
        System.out.print("x = ");
        double x = console.nextDouble();
        System.out.print("y = ");
        double y = console.nextDouble();
        System.out.print("z = ");
        double z = console.nextDouble();
        return new Vector(x, y, z);
    }
}
