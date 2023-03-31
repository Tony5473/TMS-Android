package by.teachmeskills.lesson6;

import java.util.Scanner;

public class CreditCardMain {

    public static void main(String[] args)

        // Создать класс CreditCard c полями: номер счета текущая сумма на счету Добавьте метод, который позволяет начислять сумму на кредитную карточку.
        // Добавьте метод, который позволяет снимать с карточки некоторую сумму.
        // Добавьте метод, который выводит текущую информацию о карточке.
        // Напишите программу, которая создает три объекта класса CreditCard у которых заданы номер счета и начальная сумма
        // Тестовый сценарий для проверки: Положите деньги на первые две карточки и снимите с третьей. Выведите на экран текущее состояние всех трех карточек.

    {

        Scanner Scanner = new Scanner(System.in);

        CreditCard BSBCreditCard = new CreditCard("( 2200 3301 5467 9912 )");

        CreditCard SBERCreditCard = new CreditCard("( 9832 5398 0190 7376 )");

        CreditCard AlfaCreditCard = new CreditCard("( 9801 3743 3772 8814 )");



            System.out.println("Enter the deposit amount to the card №1");

        BSBCreditCard.addSumBSB(Scanner.nextInt());

            System.out.println("Enter the deposit amount to the card №2");

        SBERCreditCard.addSumSBER(Scanner.nextInt());

            System.out.println("Enter the amount to withdraw from the card №3");

        AlfaCreditCard.withdrawSum(Scanner.nextInt());

        Scanner.close();

        System.out.println(BSBCreditCard.getInfo() + " " + BSBCreditCard.getSumBSB());
        System.out.println(SBERCreditCard.getInfo() + " " + SBERCreditCard.getSumSBER());
        System.out.println(AlfaCreditCard.getInfo() + " " + AlfaCreditCard.getSumAlfa());


    }
}
