package Es2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Main2 {

    public static void main(String[] args) {

        // test Primo metodo

        ArrayList<Integer> orderedListTest = toOrderList(10);
        System.out.println(orderedListTest);


        // test Secondo metodo
        ArrayList<String> listToMirror = new ArrayList<>(List.of("Uno", "Due", "Tre"));
//        listToMirror.add(1);
//        listToMirror.add(2);
//        listToMirror.add(3);
//        listToMirror.add(4);
//        listToMirror.add(5);
        ArrayList<String> outputList = joinReversedList(listToMirror);
        System.out.println(outputList);

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

    // Secondo metodo

    public static ArrayList<String> joinReversedList(ArrayList<String> listInput) {
        ArrayList<String> reversed = new ArrayList<>();// copia non riassegnazione semplice
        for (int i = listInput.size() - 1; i >= 0; i--) {
            reversed.add(listInput.get(i)); //

        }
        // Collections.reverse(reversed); // se l avessi fatto su lista input non ne avrebbe creata un altra ma avrebbe modificato quella
        ArrayList<String> outputList = new ArrayList<>();

        outputList.addAll(listInput);
        outputList.addAll(reversed);

        return outputList;

    }


}
