package by.teachmeskills.lesson5.cycle;

import java.util.Scanner;

public class Additional1 {

    public static void main (String[] args)

    // Дополнительное задание : 1. За каждый месяц банк начисляет к сумме вклада 7% от суммы.
    // Напишите программу, в которую пользователь вводит сумму вклада и количество месяцев. А банк вычисляет конечную
    // сумму вклада с учетом начисления процентов за каждый месяц.
    // (Для вычисления суммы с учетом процентов используйте цикл for.
    // Пусть сумма вклада будет представлять тип float.)

    {

        Scanner Scanner = new Scanner(System.in);

        float a = Scanner.nextInt();

        int b = Scanner.nextInt();





        for (int i = 1; i <= b; i++)

        {
            a += a * 7 / 100;
        }
           System.out.println( a );


    }

    
}
