package Exercice1;

abstract class FormeGeometrique {
    String nom;

    FormeGeometrique(String nom) {
        this.nom = nom;
    }

    abstract double perimetre();
}
