package by.teachmeskills.lesson4;

import java.util.Scanner;

public class Task4 {

    public static void main(String[] args)

    // 4. Напишите программу, которая будет принимать на вход число и на
    // выход будет выводить сообщение четное число или нет. (Для определения четности числа используйте операцию
    // получения остатка от деления - операция выглядит так: '% 2').

    {


        Scanner Scanner = new Scanner(System.in);

        int a = Scanner.nextInt();

        int b = a % 2;


        if ( b == 0 )
        {
            System.out.println("b = " + "четное число");
        }
        else if ( b == 1 )
        {
            System.out.println("b = " + "нечетное число");
        }


    }

}
