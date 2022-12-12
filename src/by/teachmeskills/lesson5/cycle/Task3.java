package by.teachmeskills.lesson5.cycle;

import java.util.Scanner;

public class Task3 {

    public static void main(String[] args)

    // 3. Напишите программу, где пользователь вводит любое целое
    //   положительное число. А программа суммирует все числа от 1 до введенного пользователем числа.
    //   (Для ввода числа воспользуйтесь классом Scanner.)

    {


        Scanner Scanner = new Scanner(System.in);

        int a = Scanner.nextInt();

        int b = 0;


        for (int i = 1; i <= a; ++i)

        {
            b = b + i;

            System.out.println(i);
        }

            System.out.print(" Суммы всех чисел равна = " + b );


    }


}




