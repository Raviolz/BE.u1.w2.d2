package Es1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci il numero di elementi che vuoi inserire nel set, i duplicati non verranno aggiunti");
        int n = Integer.parseInt(scanner.nextLine());
        HashSet<String> wordsSet = new HashSet<>();
        int i = 1;
        int duplication = 0;
        ArrayList<String> duplicationArr = new ArrayList<>();
        while (i <= n) {
            System.out.println("Inserisci la parola da inserire");
            String word = scanner.nextLine();

            if (wordsSet.add(word) == false) {
                duplication++;
                duplicationArr.add(word);
            } else {
                wordsSet.add(word);
            }
            ;
            i++;


        }

        System.out.println("Il tuo set e' cosi composto : " + wordsSet + " e contiene " + wordsSet.size() + " parola/e");
        System.out.println("Hai provato ad aggiungere " + duplication + " parola/e gia' esistenti e sono " + duplicationArr);
    }
}
