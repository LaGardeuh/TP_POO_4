package Exercice2;

public class Region implements Comparable<Region> {
    private String nom;
    private int nombreHabitants;
    private int pibEnMilliards;
    private int superficieEnKm2;

    public Region(String nom, int nombreHabitants, int pibEnMilliards, int superficieEnKm2) {
        this.nom = nom;
        this.nombreHabitants = nombreHabitants;
        this.pibEnMilliards = pibEnMilliards;
        this.superficieEnKm2 = superficieEnKm2;
    }

    public String getNom() {
        return nom;
    }

    public int getNombreHabitants() {
        return nombreHabitants;
    }

    public int getPibEnMilliards() {
        return pibEnMilliards;
    }

    public int getSuperficieEnKm2() {
        return superficieEnKm2;
    }

    public String toString() {
        return "Region{" + "nom='" + nom + '\'' + ", nombreHabitants=" + nombreHabitants + ", pibEnMilliards="
                + pibEnMilliards + ", superficieEnKm2=" + superficieEnKm2 + '}';
    }

    public int compareTo(Region autreRegion) {
        return this.nom.compareTo(autreRegion.getNom());
    }

}
