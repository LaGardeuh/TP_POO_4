package Exercice1;

import java.util.List;

public class App {
    public static void main(String[] args) {
        Point point = new Point(3, 4);
        System.out.println("Coordonnées du point : (" + point.x + ", " + point.y + ")");

        Rectangle rectangle = new Rectangle(
                List.of(new Point(0, 0), new Point(0, 3), new Point(4, 3), new Point(4, 0)));
        System.out.println(rectangle.toString());

        Triangle triangle = new Triangle(List.of(new Point(0, 0), new Point(3, 0),
                new Point(0, 4)));
        System.out.println(triangle.toString());
    }
}
