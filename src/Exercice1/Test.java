package Exercice1;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        Point point = new Point(1, 1);
        Cercle cercle = new Cercle("ABC", new Point(3, 3), 2);
        Rectangle rectangle = new Rectangle(
                List.of(new Point(0, 0), new Point(0, 3), new Point(4, 3), new Point(4, 0)));
        Triangle triangle = new Triangle(List.of(new Point(0, 0), new Point(3, 0), new Point(0, 4)));

        afficherFormes("Formes avant translation", point, cercle, rectangle, triangle);

        double vx = 2;
        double vy = 3;
        point.translation(vx, vy);
        cercle.translation(vx, vy);
        rectangle.translation(vx, vy);
        triangle.translation(vx, vy);

        afficherFormes("Formes après translation", point, cercle, rectangle, triangle);
    }

    public static void afficherFormes(String titre, Object... formes) {
        System.out.println(titre + ":");
        for (Object forme : formes) {
            System.out.println(forme.toString());
        }
        System.out.println();
    }
}
