package by.lesson.practics.class1;

import java.util.Scanner;

public class Lesson1_2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите a");
        int a = sc.nextInt();
        /*System.out.println("Введите b");
        int b = sc.nextInt();
        System.out.println("Введите c");
        int c = sc.nextInt();*/

        /*if (a > b) {
            c = a - b;
            System.out.println(c);
        } else if (a == b) {
            c = a + b;
            System.out.println(c);
        } else {
            c = b - a;
            System.out.println(c);
        }*/
        /*if (a%3==0) {
            System.out.println("Число a делится на 3");
        } else System.out.println("Число a не делится на 3");*/

        if (a % 3 == 0 && a % 7 == 0) {
            System.out.println("Число a делится на 3 и на 7");
        } else if (a % 3 == 0) {
            System.out.println("Число a делится на 3");
        } else if (a % 7 == 0) {
            System.out.println("Число a делится на 7");
        }
    }
}
