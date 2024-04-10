package Exercice2;

import java.util.ArrayList;
import java.util.Collections;

public class TestRegion {
    public static void main(String[] args) {
        ArrayList<Region> regions = new ArrayList<>();

        regions.add(new Region("Centre-Val de Loire", 2566759, 70, 39151));
        regions.add(new Region("Bretagne", 3329395, 92, 27208));
        regions.add(new Region("Ile-de-France", 12213364, 669, 12011));
        regions.add(new Region("Auvergne-Rhône-Alpes", 8026685, 250, 69711));

        System.out.println("Régions avant le tri :");
        for (Region region : regions) {
            System.out.println(region);
        }

        Collections.sort(regions);

        System.out.println("\nRégions après le tri par ordre alphabétique des noms :");
        for (Region region : regions) {
            System.out.println(region);
        }

        // Tri de la liste des régions par ordre croissant de PIB
        System.out.println("\nTri par PIB :");
        Collections.sort(regions, new ComparateurPIB());
        afficherListeRegions(regions);

        // Tri de la liste des régions par ordre croissant de densité
        System.out.println("\nTri par densité :");
        Collections.sort(regions, new ComparateurDensite());
        afficherListeRegions(regions);
    }

    // Méthode utilitaire pour afficher la liste des régions
    private static void afficherListeRegions(ArrayList<Region> regions) {
        for (Region region : regions) {
            System.out.println(region);
        }
    }
}
