package bruch;

/**
 * Diese Klasse beschreibt einen mathematischen Bruch
 * @author Justin Glowa 573904
 */

public class Bruch implements Comparable<Bruch>{

    /**
     * der Zaehler
     */
    private int zaehler;
    /**
     * der Nenner
     */
    private int nenner;


    /**
     * Konstruktor für einen Bruch mit zwei Parameter
     * @param zaehler Zaehler des Bruchs
     * @param nenner Nenner des Bruchs
     * @exception IllegalArgumentException  wenn Nenner 0 ist.
     */
    public Bruch(int zaehler, int nenner){
        this.nenner = nenner;
        this.zaehler = zaehler;
        if(nenner == 0){
            throw new IllegalArgumentException("nenner darf nicht 0 sein");
        }
    }

    /**
     * Konstruktor für die Darstellung einer Ganzen zahl als Bruch
     * @param ganzeZahl ganze Zahl als Wert des Bruchs
     */
    public Bruch(int ganzeZahl){
        this.zaehler = ganzeZahl;
        this.nenner = 1;
    }

    /**
     * multipliziert einen Bruch mit einen anderen Bruch
     * @param b zu multiplizierender Bruch
     * @return das Ergebnis als Bruch Objekt
     */
    public Bruch multiplizieren(Bruch b){
        int newNenner = this.nenner * b.nenner;
        int newZaehler = this.zaehler * b.zaehler;
        return new Bruch(newZaehler, newNenner);
    }

    /**
     * übersetzt den Bruch in eine Kommazahl
     * @return die Kommazahl
     */
    public double ausrechnen(){
        double tempNenner = nenner;
        return zaehler/tempNenner;
    }

    /**
     * kuerzt den Bruch unter der Verwendung des groeßten gemeinsamen Teilers
     */
    public void kuerzen(){
        int ggt = ggt();
        zaehler = zaehler / ggt;
        nenner = nenner / ggt;
    }

    /**
     * liefert den Kehrwert zurück
     * @return einen neuen Bruch unter der verwendung des Kehrwerts
     */
    public Bruch kehrwert(){
        return new Bruch(nenner, zaehler);
    }

    /**
     * dividiert diesen bruch durch einen anderen Bruch
     * @param b der zu dividierende Bruch
     * @return neues Bruch Objekt
     */
    public Bruch dividieren(Bruch b){
        return multiplizieren(b.kehrwert());
    }

    /**
     * toString bildet einen Bruch dar
     * @return einen String der den Bruch wiederspiegelt
     */
    public String toString(){
        return zaehler + "/" + nenner;
    }

    /**
     * berechnen des kleinsten gemeinsamen Teilers unter der Verwendung des euklidischen Algorithmus
     * @return int den groessten gemeinsamen Teiler als Ganzzahl
     */
    public int ggt(){
        int tempZaehler = this.zaehler;
        int tempNenner = this.nenner;

        if(tempZaehler == 0){
            return tempNenner;
        }else {
            while (tempNenner != 0) {
                if (tempZaehler > tempNenner) {
                    tempZaehler = tempZaehler - tempNenner;
                }else {
                    tempNenner = tempNenner - tempZaehler;
                }
            }
            return tempZaehler;
        }
    }

    /**
     * Get-Methode für das Attribut nenner
     * @return int Wert des nenners
     */
    public int getNenner(){
        return nenner;
    }

    /**
     * liefert den Zaehler zurueck
     * @return int Wert des Zaehlers
     */
    public int getZaehler(){
        return zaehler;
    }

    /**
     * vergleicht zwei Brueche anhand ihres Werts unter der verwendung der ausgerechneten Kommazahlen
     * @param o zu vergleichender Bruch
     * @return -1 wenn der bruch kleiner ist, 1 wenn der bruch groeßer ist und 0 wenn die Brueche gleich sind
     */
    @Override
    public int compareTo(Bruch o) {
        if(this.ausrechnen() < o.ausrechnen()){
            return -1;
        }else if(this.ausrechnen() > o.ausrechnen()){
            return 1;
        }else return 0;
    }
}
