package Bruch;

import java.util.Arrays;

public class bruchTest {
    public static void main(String args[]){
        Bruch b = new Bruch(1,5);
        double komma = b.ausrechnen();
        System.out.println(komma);
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
        System.out.println("unsorted: " + Arrays.toString(bArray));
        Arrays.sort(bArray);
        System.out.println("sorted by value: " + Arrays.toString(bArray));
        Arrays.sort(bArray);
        Arrays.sort(bArray, new BruchComparator());
        System.out.println("sorted by difference: " + Arrays.toString(bArray));
    }
}
