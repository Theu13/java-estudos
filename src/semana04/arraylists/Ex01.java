package semana04.arraylists;


import java.util.ArrayList;

public class Ex01 {

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();
        names.add("Alex");
        names.add("Thomas");
        names.add("Maria");
        names.add("Yuri");

        // print third element in the list:
        IO.println(names.get(2));

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(7);
        numbers.add(2);
        numbers.add(64);
        numbers.add(13);
        numbers.add(21);
        numbers.add(5);
        numbers.add(21);
        numbers.add(27);
        numbers.add(64);
        numbers.add(20);

        // print second plus third element / 5
        IO.println(numbers.get(1) + numbers.get(2));
        // print 8
        IO.println(numbers.get(2) + numbers.get(4));
        // print first and last
        IO.println("First and last: " + numbers.get(0) + ", " + numbers.get(numbers.size() - 1));
        IO.println("*First and last: " + numbers.getFirst() + ", " + numbers.getLast());

        for (int i = 0; i < numbers.get(5); i++) {
            // IO.println(numbers.get(i));
        }

        int largest = numbers.get(0);
        for (int i = 0; i <= numbers.size() - 1; i++){
            if (largest < numbers.get(i)) {
                largest = numbers.get(i);
            }
        }
        IO.println("The grater number is: " + largest);

        int smallest = numbers.get(0);
        for (int i = 0; i <= numbers.size() - 1; i++){
            if (smallest > numbers.get(i)) {
                smallest = numbers.get(i);
            }
        }
        IO.println("The smallest number is: " + smallest);


        int largest2 = numbers.get(0);
        for (int i = 0; i <= numbers.size() - 1; i++) {
            if(largest2 < numbers.get(i)) {
                largest2 = numbers.get(i);
            }
        }
        IO.println("The largest number is: " + largest2);

        int index = 0;
        for (int i = 0; i <= numbers.size()-1; i++) {
            if (largest2 == numbers.get(i)) {
                IO.println("Found at index: " + index);
            }
            index++;
        }




    }
}
