package semana04.arraylists;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);


        ArrayList<Double> listDouble = new ArrayList<>();
        listDouble.add(3.45);
        listDouble.add(2.2);

        ArrayList<Boolean> listBool = new ArrayList<>();
        listBool.add(true);
        listBool.add(false);
        listBool.add(true);

        ArrayList<String> listString = new ArrayList<>();
        listString.add("String is a reference-type variable");


        // Pegar um valor específico da Lista;
        ArrayList<String> wordList = new ArrayList<>();
        wordList.add("First"); // index -> 0
        wordList.add("Second"); // index -> 1
        wordList.add("Third"); // index -> 2

        // IO.println(wordList.get(1));


        ArrayList<String> teachers = new ArrayList<>();
        teachers.add("Simon");
        teachers.add("Samuel");
        teachers.add("Ann");
        teachers.add("Anna");

        IO.println("Quantidade de elementos na lista: " + teachers.size());

        for (int i = 0; i < teachers.size(); i++) {
            IO.println("Index " + i + " = " + teachers.get(i));
        }

        IO.println("-----------------------------");

        int index = teachers.size() - 1;
        while (index >= 0 ) {
            IO.println("Index " + index + " = " + teachers.get(index));
            index -= 1;
        }

    }


}
