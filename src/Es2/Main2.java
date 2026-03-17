package Es2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Main2 {

    public static void main(String[] args) {

        // test Primo Metodo

        ArrayList<Integer> orderedListTest = toOrderList(10);
        System.out.println(orderedListTest);

        
    }

    // Primo metodo

    public static ArrayList<Integer> toOrderList(int totNumToCreate) {
        ArrayList<Integer> orderedList = new ArrayList<>();
        for (int i = 0; i < totNumToCreate; i++) {
            Random random = new Random();
            int number = random.nextInt(101); // 0 → 100
            orderedList.add(number);

        }
        Collections.sort(orderedList);
        return orderedList;
    }


}
