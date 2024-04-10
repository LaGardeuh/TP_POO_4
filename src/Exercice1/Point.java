package Exercice1;

public class Point {
    double x, y;

    Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public String toString() {
        return "(" + x + ", " + y + ")";
    }

    public void translation(double vx, double vy) {
        x += vx;
        y += vy;
    }
}
