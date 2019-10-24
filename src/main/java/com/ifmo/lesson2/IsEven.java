package com.ifmo.lesson2;

public class IsEven {
    /*
    Создать программу, проверяющую и сообщающую на экран, является ли целое число
    записанное в переменную n, чётным либо нечётным.
     */
    public static void main(String[] args) {
        int n = 25;

        System.out.println(isEven(n));
    }

    public static String isEven(int n) {
        // Допустимые строки: "Четное" или "Нечетное"

        return (n & 1) == 0 ? "Четное" : "Нечетное";
    }
}
