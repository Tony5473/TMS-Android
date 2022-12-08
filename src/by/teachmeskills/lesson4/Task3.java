package by.teachmeskills.lesson4;

import java.util.Scanner;

public class Task3 {

    public static void main(String[] args)

        // 3. Написать программу для вывода названия поры года по номеру
        // месяца. (При решении используйте оператор if-else-if.)

    {
        Scanner Scanner = new Scanner(System.in);

        int a = Scanner.nextInt();

        if  ( a >= 1 && a <= 2 || a == 12 )
        {
            System.out.println("Зима");
        }

        if ( a >= 3 && a <= 5)
        {
            System.out.println("Весна");
        }

        if ( a >= 6 && a <= 8)
        {
            System.out.println("Лето");
        }

        if ( a >= 9 && a <= 11)
        {
            System.out.println("Осень");
        }

    }

}
