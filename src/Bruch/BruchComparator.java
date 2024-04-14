package Bruch;

import java.util.Comparator;

public class BruchComparator implements Comparator<Bruch> {

    @Override
    public int compare(Bruch o1, Bruch o2) {
        return (o2.getZaehler()-o2.getNenner()) - (o1.getZaehler() - o1.getNenner());
    }
}
