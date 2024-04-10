package Exercice2;

import java.util.Comparator;

public class ComparateurDensite implements Comparator<Region> {

    public int compare(Region region1, Region region2) {
        double densite1 = (double) region1.getNombreHabitants() / region1.getSuperficieEnKm2();
        double densite2 = (double) region2.getNombreHabitants() / region2.getSuperficieEnKm2();

        if (densite1 < densite2) {
            return -1;
        } else if (densite1 > densite2) {
            return 1;
        } else {
            return 0;
        }
    }
}
