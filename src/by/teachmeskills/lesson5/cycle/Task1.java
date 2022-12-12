package by.teachmeskills.lesson5.cycle;

public class Task1 {

    public static void main(String[] args)

    // 1. При помощи цикла for вывести на экран нечетные числа от 1 до 99. (При решении используйте
    // операцию инкремента (++)).

    {


        for ( int i = 1; i <= 99; ++i )
        {
            if ( i % 2 != 0 )

            {
                System.out.println(i + " нечетное число ");
            }
            else if ( i % 2 == 0 )

            {
                System.out.println( i + " четное число");
            }
        }


        {
           System.out.println( " Четные и Нечетные числа от 1 до 99 " );
        }


    }


}
