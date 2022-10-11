package task1;

public class Task1 {

// 1. Написать иерархию классов «Фигуры». Фигура -> Треугольник -> Прямоугольник -> Круг.
// Реализовать ф-ю подсчета площади для каждого типа фигуры и подсчет периметра.
// Создать массив из 5 фигур. Вывести на экран сумму периметров всех фигур в массиве.
    public static void task1() {
        Shape[] shapes = {new Triangle(2, 4, 5), new Rectangle(3, 4), new Rectangle(2, 3),
                          new Circle(2), new Circle(3)};

        System.out.println("\nThe sum of the perimeters of all shapes is " + calcSumOfPerimeters(shapes) + " cm");
    }

    public static double calcSumOfPerimeters(Shape[] array) {
        double sumOfPerimeters = 0;
        for (Shape shape : array) {
            System.out.print(shape.calculatePerimeter() + "  ");
            sumOfPerimeters += shape.calculatePerimeter();
        }
        return sumOfPerimeters;
    }
}
