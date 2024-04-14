package Bruch;

/**
 * Diese Klasse beschreibt einen mathematischen Bruch
 * @author Justin Glowa 573904
 */
public class Bruch implements Comparable<Bruch>{

    private int nenner;
    private int zaehler;
    private int ganzeZahl;

    public Bruch(int zaehler, int nenner){
        this.nenner = nenner;
        this.zaehler = zaehler;
        if(nenner == 0){
            throw new IllegalArgumentException("nenner darf nicht 0 sein");
        }
    }

    public Bruch(int ganzeZahl){
        this.ganzeZahl = ganzeZahl;
    }

    public Bruch multiplication(Bruch b){
       this.nenner = this.nenner * b.nenner;
       this.zaehler = this.zaehler * b.zaehler;
       return this;
    }

    public double ausrechnen(){
        double tempNenner = nenner;
        return zaehler/tempNenner;
    }

    public void kuerzen(){
        int ggt = ggt(this);
        zaehler = zaehler / ggt;
        nenner = nenner / ggt;
    }

    public Bruch kehrwert(){
        int tempForSwitch;
        tempForSwitch = this.nenner;
        this.nenner = this.zaehler;
        this.zaehler = tempForSwitch;
        return this;
    }

    public Bruch dividieren(Bruch b){
        b = b.kehrwert();
        return multiplication(b);
    }

    public String toString(){
        return zaehler + "/" + nenner;
    }

    /**
     * berechnen des kleinsten gemeinsamen Teilers unter der Verwendung des euklidischen Algorithmus
     * @param b
     * @return int
     */
    public int ggt(Bruch b){
        if(b.zaehler == 0){
            return b.nenner;
        }else {
            while (b.nenner != 0) {
                if (b.zaehler > b.nenner) {
                    b.zaehler = b.zaehler - b.nenner;
                }else {
                    b.nenner = b.nenner - b.zaehler;
                }
            }
            return b.zaehler;
        }
    }

    public int getNenner(){
        return nenner;
    }
    public int getZaehler(){
        return zaehler;
    }
    public int getGanzeZahl() {
        return ganzeZahl;
    }

    @Override
    public int compareTo(Bruch o) {
        if(this.ausrechnen() < o.ausrechnen()){
            return -1;
        }else if(this.ausrechnen() > o.ausrechnen()){
            return 1;
        }else return 0;
    }
}
