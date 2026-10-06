package semana03.Collections_Generics;

import java.util.HashMap;
import java.util.TreeMap;


public class Main {
    public static void main(String[] args) {

        //1. Frequência de palavras em uma frase.
        String frase = "Hoje estamos estudando Collection e também estamos estudando Generics";
        IO.println("Frase: " + frase);

        HashMap<String, Integer> words = new HashMap<>();

        String[] wordsArray = frase.split(" ");
        IO.println("Quantidade de plavras: " + wordsArray.length);

        for (String w : wordsArray) {
            words.put(w, words.getOrDefault(w, 0) + 1);
        }

        IO.println(words);

        IO.println("Quantidade de palavras únicas: " + words.size());

        TreeMap<String, Integer> words2 = new TreeMap<>();
        for (String w : wordsArray) {
            words2.put(w, words2.getOrDefault(w, 0) + 1);
        }
        IO.println(words2);



    }
}
