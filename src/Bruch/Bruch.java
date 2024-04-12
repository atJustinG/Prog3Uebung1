package Bruch;

import java.sql.SQLOutput;

/**
 * Diese Klasse beschreibt einen mathematischen Bruch
 * @author Justin Glowa 573904
 */
public abstract class Bruch implements Comparable<Bruch>{

    private int nenner;
    private int zaehler;
    private int ganzeZahl;
    public Bruch(int zaehler, int nenner){
        this.nenner = nenner;
        this.zaehler = zaehler;
    }

    public Bruch(int ganzeZahl){
        this.ganzeZahl = ganzeZahl;
    }

    public Bruch multiplication(Bruch b){
       this.nenner = this.nenner * b.nenner;
       this.zaehler = this.zaehler * b.zaehler;
       return this;
    }

    public String toString(){
        return zaehler + "\n" + "-" + "\n" + nenner;
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
}
