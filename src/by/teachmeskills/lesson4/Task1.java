package by.teachmeskills.lesson4;

import java.lang.invoke.SwitchPoint;
import java.util.Scanner;

public class Task1 {

    public static void main(String[] args)

    // 1. На вход программе даётся два целых числа (a и b). Нужно вывести результат деление первого на второе
    // и остаток от деления первого на второе.

    {


        Scanner Scanner = new Scanner(System.in);


        int a = Scanner.nextInt();

        int b = Scanner.nextInt();

        int div = a / b;

        int per = a % b;

        System.out.println("div = " + div + "\n" + "per = " + per);


    }

}
