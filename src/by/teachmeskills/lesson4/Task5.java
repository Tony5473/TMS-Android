package by.teachmeskills.lesson4;

import java.util.Scanner;

public class Task5 {

    public static void main(String[] args)

    // 5. Для введенного числа t (температура на улице) вывести
    // Если t>–5, то вывести «Тепло».
    // Если –5>= t > –20, то вывести «Нормально».
    // Если –20>= t, то вывести «Холодно».
    {
        Scanner Scanner = new Scanner(System.in);

        int t = Scanner.nextInt();

        if ( t >= 25 )
        {
            System.out.println("Тополиный пух, жара, июль, ночи такие звёздные");
        }

        if ( t > -5 && t < 25 )
        {
            System.out.println("Тепло");

        }
        if ( t <= -5 && t > -20 )
        {
            System.out.println("Нормально");
        }
        if ( t <= -20 )
        {
            System.out.println("Холодно");
        }

    }

}
