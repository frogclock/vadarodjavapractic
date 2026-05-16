package by.lesson.practics.class2;

import java.util.Scanner;

public class Practic2 {
    public static void main(String[] args) {
     /*   /*1. Необходимо, чтобы программа отображала следующую последовательность чисел:
                7 14 21 28 35 42 49 56 63 70 77 84 91 98 (while)*/
        /*int a=7;
        while(a<=98){
            System.out.printf(a+" ");
            a+=7;
        }*/
        /*2. Написать программу, которая посчитает сумму первых 10 чисел (while)*/
        /*int a = 0;
        int i = 0;
        int sum = 0;
        while (i < 10) {
            sum = sum + a++;
            i++;
        }
        System.out.println("Сумма: " + sum);
    }*/

        /*3. Вывести числа от 100 до 1 через запятую. В конце не должно быть запятой*/

        /*int a = 100;
        for (int i = 1; i <= 100; i++) {
            if (a == 1) {
                System.out.print(a);
            } else System.out.printf(a + ", ");
            a--;
        }*/

        /*3.1 Вывести каждый десяток от 1 до 100. (for)*/
        /*int a = 1;
        for (int i = 1; i <= 100; i+=9) {
            System.out.printf(a+" ");
            a = a + 9;
        }*/
        /*4. Вывести только нечётные числа от 1 до 100.*/
        /*
        for (int i = 1; i <= 100; i += 2) {
            System.out.print(i + " ");
        }*/

        /*8. Ввести число с консоли, которое не заканчивается на 0.
             Вывести макс и мин цифру в числе. Использовать оператор %. (while)*/
        /*
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите x");
        int x = sc.nextInt();
        int minN = 100;
        int maxN=0;
        int vr;
        if (x % 10 == 0) {
            System.out.println("Число x не соответствует условию задания");
        } else {
            while (x > 0) {
                vr = x % 10;
                if (minN > vr) {
                    minN = vr;
                }
                if (maxN < vr) {
                    maxN = vr;
                }
                x= x/10;
            }
            System.out.println("Минимальное число: "+minN+" 20"+"Максимальное число: "+maxN);
        }*/

        //Создать массив чисел от 1 до 100. Вывести полученный массив.
        /*
        int[] mass = new int[100];
        for (int i = 0; i < mass.length; i++) {
            mass[i] = i + 1;
        }
        for (int i = 0; i < mass.length; i++) {
            System.out.print(mass[i]+" ");
        }*/
        //Создать массив из чисел. Вывести макс и мин число.
        int[] mass = {2, 4, 56, 8, 0};
        int min = 100;
        int max = 0;
        for (int i = 0; i < mass.length; i++) {
            if (min > mass[i]) {
                min = mass[i];
            }
            if (max < mass[i]) {
                max = mass[i];
            }
        }
        System.out.println("Минимальное число: "+min+" "+"Максимальное число: "+max);
    }
}
