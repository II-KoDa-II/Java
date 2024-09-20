package org.example;

import java.text.DecimalFormat;
import java.util.Scanner;

import static java.lang.Double.*;
import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Main {
//Task 1 ====================================================================================================

    static void Task1() {
        String output = "";
        for (int i = 1; i <= 500; i++) {

            output += RoundDivision(i, 5, "fizz");
            output += RoundDivision(i, 7, "buzz");

            if (output.isEmpty()) {
                output += String.valueOf(i);
            }
            System.out.println(output);

            output = "";
        }
    }

    static String RoundDivision(int dividend, int divisor, String output) {
        if (dividend % divisor == 0) return output;
        else return "";
    }

//Task 2 ====================================================================================================

    static void Task2() {
        String startingWord = "make install";

        System.out.println(reversion(startingWord));
    }

    static String reversion(String input) {
        String output = "";

        for (int i = input.length() - 1; i >= 0; i--) {
            output += input.charAt(i);
        }

        return output;
    }

//Task 3 ====================================================================================================

    static void Task3() {
        String variable;
        System.out.println("Дано уравнения вида ax^2 + bx + c = 0");
        Scanner input = new Scanner(System.in);

        System.out.println("Введите переменную a");
        double a;
        do {
            variable = input.nextLine();
        }
        while (!inputFilter(variable));
        a = parseDouble(variable);

        System.out.println("Введите переменную b");
        double b;
        do {
            variable = input.nextLine();
        }
        while (!inputFilter(variable));
        b = parseDouble(variable);

        System.out.println("Введите переменную c");
        double c;
        do {
            variable = input.nextLine();
        }
        while (!inputFilter(variable));
        c = parseDouble(variable);

        double d = discriminant(a, b, c);

        if (d < 0) {
            System.out.println("Нет действительных корней");
        }
        else {
            System.out.println("x1 = " + calculateX1(a, b, d));
            System.out.println("x2 = " + calculateX2(a, b, d));
        }
    }

    static boolean inputFilter(String input) {
        try {
            parseDouble(input);
            return true;
        }
        catch (NumberFormatException e) {
            System.out.println("Введенное значение не воспринимается как числовое, введите другое значение");
            return false;
        }
    }


    static double discriminant(double a, double b, double c) {
        double output = pow(b, 2) - 4 * a * c;
        System.out.println("d = " + output);
        return output;
    }

    static double calculateX1(double a, double b, double d) {
        return (-b + sqrt(d)) / (2 * a);
    }
    static double calculateX2(double a, double b, double d) {
        return (-b - sqrt(d)) / (2 * a);
    }

//Task 4 ====================================================================================================

    static void Task4() {
        double result = 0;
        int n = 2;

        DecimalFormat digits = new DecimalFormat("#.#########");

        do {
            result = sigmaExpression(n);
            n += 2;

            System.out.println("n = " + n + ", Σ = " + digits.format(result));
        }
        while (result >= 0.000001);
    }

    static double sigmaExpression(double n) {
        return 1 / (n*n + n - 2);
    }

//Task 5 ====================================================================================================

    static void Task5() {
        System.out.println("Введите строку");

        Scanner input = new Scanner(System.in);
        String line = input.nextLine();

        if (reversion(line) == line) {
            System.out.println("Строка является палиндромом");
        }
        else {
            System.out.println("Строка не является палиндромом");
        }
    }

// Main body ====================================================================================================

    public static void main(String[] args) {
        String switcher;
        int loop =1;

        while (loop == 1) {

            System.out.println("Выберете номер задания (введите число от 1 до 5) \nДля выхода введите любые другие значения\n");

            Scanner input = new Scanner(System.in);
            switcher = input.nextLine();

            switch (switcher) {
                case "1":
                    Task1();
                    System.out.println("\n");
                    break;
                case "2":
                    Task2();
                    System.out.println("\n");
                    break;
                case "3":
                    Task3();
                    System.out.println("\n");
                    break;
                case "4":
                    Task4();
                    System.out.println("\n");
                    break;
                case "5":
                    Task5();
                    System.out.println("\n");
                    break;
                default:
                    loop = 0;
                    break;
            }
        }
    }
}