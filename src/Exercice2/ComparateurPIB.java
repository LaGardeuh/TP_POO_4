package Exercice2;

import java.util.Comparator;

public class ComparateurPIB implements Comparator<Region> {

    public int compare(Region region1, Region region2) {
        return Integer.compare(region1.getPibEnMilliards(), region2.getPibEnMilliards());
    }
}
