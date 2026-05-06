package by.lesson.practics.class1;

import com.sun.tools.javac.Main;

import java.util.Scanner;

public class Lesson1 {
    public static void main(String[] args){
        /*
        int a;

        a = 88/(10+12);
        System.out.println(a);

        System.out.println("***********************");

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите x");
        int x = sc.nextInt();
        System.out.println("Введите y");
        int y = sc.nextInt();
        System.out.println("Введите z");
        int z = sc.nextInt();
        int result = x*(y*z);
        System.out.println("Результат выполнения второго задания: "+ result);
        System.out.println("***********************");
*/

        /*int b;
        b = (213+258)/(217-60);
        System.out.println("Результат выполнения третьего задания: "+ b);
        System.out.println("***********************");*/

        int i = 5;
        int j = 2;
        int c;
        c = i++ * j--;
        System.out.println("Результат выполнения четвёртого задания: "+ c);
        System.out.println(i);
        System.out.println(j);

    }
}
