package bruch;

import java.util.Arrays;

public class bruchTest {
    public static void main(String args[]){
        Bruch b = new Bruch(1,5);
        double komma = b.ausrechnen();
        System.out.println(komma);
        Bruch b1 = new Bruch(1);
        //Array von bruchobjekten zu testzwecke mit Testwerten
        Bruch bArray[] = new Bruch[10];
        bArray[0] = new Bruch(1,5);
        bArray[1] = new Bruch(2, 6);
        bArray[2] = new Bruch(3,7);
        bArray[3] = new Bruch(6, 8);
        bArray[4] = new Bruch(13,25);
        bArray[5] = new Bruch(3, 4);
        bArray[6] = new Bruch(4,6);
        bArray[7] = new Bruch(8, 12);
        bArray[8] = new Bruch(1,8);
        bArray[9] = new Bruch(2, 9);

        //test für Konstruktor mit ganzer Zahl als Parameter
        System.out.println("ganze Zahl test" + b1.ausrechnen());

        //multiplizieren Test
        Bruch testB = b.multiplizieren(new Bruch(3,6));
        System.out.println("multiplizieren: " + testB);

        //ausrechnenn() Test
        System.out.println("ausgerechnet: " + b.ausrechnen());

        //kuerzen testen
        testB.kuerzen();
        System.out.println("Kürzen test expected: 1/10 actual: " + testB);

        //Kehrwert Test
        System.out.println("Kehrwert: " + b.kehrwert());

        //dividieren Test
        System.out.println("dividieren: " + b.dividieren(new Bruch(1,5)));

        //ggt() Methode Test
        System.out.println("Groesster gemeinsame Teiler: " + new Bruch(3,6).ggt());

        //testet Arrays.sort Methode aufsteigend nach Wert
        System.out.println("unsorted: " + Arrays.toString(bArray));
        Arrays.sort(bArray);
        System.out.println("sorted by value: " + Arrays.toString(bArray));

        //testet Arrays.sort Methode absteigend nach Differenz Zaehler-Nenner
        Arrays.sort(bArray, new BruchComparator());
        System.out.println("sorted by difference: " + Arrays.toString(bArray));


    }
}
