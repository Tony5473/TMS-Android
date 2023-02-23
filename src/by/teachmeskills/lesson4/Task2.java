package by.teachmeskills.lesson4;

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args)

    // 2. Написать программу для вывода названия поры года по номеру
    // месяца. (При решении используйте оператор switch-case.)

    {

        Scanner Scanner = new Scanner(System.in);

        int a = Scanner.nextInt();

        switch (a)


        {


            case (1),(2),(12):

                System.out.println("Зима");

                break;

            case (3),(4),(5):

                System.out.println("Весна");

                break;

            case (6),(7),(8):

                System.out.println("Лето");

                break;

            case (9),(10),(11):

                System.out.println("Осень");

                break;

            default:
                System.out.println("Лето, круглый год =)");


        }

    }

}
