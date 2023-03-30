package by.teachmeskills.lesson7Figure;

public class Main {
    public static void main(String[] args)

    //1. Написать иерархию классов «Фигуры».
    //Фигура -> Треугольник -> Прямоугольник -> Круг.
    //Реализовать ф-ю подсчета площади для каждого типа фигуры и
    //подсчет периметра. Площадь треугольника по формуле Герона.
    //Создать массив из 5 фигур.
    //Вывести на экран сумму периметров и сумму площадей всех фигур в
    //массиве

    {
        Figure[] figure = {new Rectangle(8, 12),
                new Triangle(5, 8, 5),
                new Circle(10)
        };

        for(Figure fig : figure)
            System.out.println(fig.getName() + ": area = " + fig.getArea());
    }
}
