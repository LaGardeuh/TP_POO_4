package Exercice1;

class Cercle extends FormeGeometrique {
    Point centre;
    double rayon;

    Cercle(String nom, Point centre, double rayon) {
        super(nom);
        this.centre = centre;
        this.rayon = rayon;
    }

    double perimetre() {
        return 2 * Math.PI * rayon;
    }

    public String toString() {
        return "\nNom : " + nom + "\nCentre : (" + centre.x + ", " + centre.y +
                ")\nRayon : " + rayon + "\nPérimètre : "
                + perimetre();
    }

    public void translation(double vx, double vy) {
        centre.translation(vx, vy);
    }
}
