package Exercice1;

import java.util.List;

abstract class Polygone {
    protected List<Point> points;

    public Polygone(List<Point> points) {
        this.points = points;
    }

    public abstract double perimetre();

    public String toString() {
        return "\nType: " + this.getClass().getSimpleName() + "\nPoints: " +
                points.toString() + "\nPerimetre: "
                + perimetre();
    }

    public void translation(double vx, double vy) {
        for (Point point : points) {
            point.translation(vx, vy);
        }
    }
}

class Rectangle extends Polygone {
    public Rectangle(List<Point> points) {
        super(points);
    }

    public double perimetre() {
        double perimeter = 0.0;
        for (int i = 0; i < points.size() - 1; i++) {
            perimeter += distance(points.get(i), points.get(i + 1));
        }
        perimeter += distance(points.get(points.size() - 1), points.get(0)); //
        return perimeter;
    }

    public static double distance(Point p1, Point p2) {
        return Math.sqrt(Math.pow(p2.getX() - p1.getX(), 2) + Math.pow(p2.getY() - p1.getY(), 2));
    }
}

class Triangle extends Polygone {
    public Triangle(List<Point> points) {
        super(points);
    }

    public double perimetre() {
        double perimeter = 0.0;
        for (int i = 0; i < points.size() - 1; i++) {
            perimeter += distance(points.get(i), points.get(i + 1));
        }
        perimeter += distance(points.get(points.size() - 1), points.get(0));
        return perimeter;
    }

    public static double distance(Point p1, Point p2) {
        return Math.sqrt(Math.pow(p2.getX() - p1.getX(), 2) + Math.pow(p2.getY() - p1.getY(), 2));
    }
}