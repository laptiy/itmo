package com.ifmo.lesson2;

import java.util.Scanner;

public class PrimeNumber {
    /*
    Проверьте, является ли введённое пользователем с клавиатуры натуральное число —
    простым. Постарайтесь не выполнять лишних действий (например, после того, как вы нашли
    хотя бы один нетривиальный делитель уже ясно, что число составное и проверку продолжать
    не нужно). Также учтите, что наименьший делитель натурального числа n, если он вообще
    имеется, обязательно располагается в отрезке [2; √n].

    1 не считается простым числом.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        boolean prime = isPrime(n);

        System.out.println(prime);
    }

    public static boolean isPrime(int n) {
        boolean isPrime = false;
        if (n == 1) return isPrime;

        int countsOfDivision = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0){
                countsOfDivision++;
                if (countsOfDivision > 2) break;
            }
        }

        if (countsOfDivision == 2){
            isPrime = true;
        }

        return isPrime;
    }
}