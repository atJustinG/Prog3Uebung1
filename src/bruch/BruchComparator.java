package bruch;

import java.util.Comparator;

/**
 * BruchComparator implementiert Comparator interface um die Differenz zwischen zaehler und Nenner zu vergleichen
 * wird bei Arrays.sort verwendet um den Array absteigend anhand der Differenzen zu sortieren
 */
public class BruchComparator implements Comparator<Bruch> {

    /**
     * Methode um die Differenz zwischen zaehler und Nenner zu vergleichen
     * @param o1 Bruch Objekt
     * @param o2 Bruch Objekt
     * @return die Differenz als Ganzzahl
     */
    @Override
    public int compare(Bruch o1, Bruch o2) {
        return (o2.getZaehler()-o2.getNenner()) - (o1.getZaehler() - o1.getNenner());
    }
}
