package semana01;

import java.util.Scanner;

public class Ex02 {

    public static void main(String[] args) {
        //Temperatura. Leia °C (double) e imprima em °F. Fórmula: F = C * 9 / 5 + 32.

        //Scanner e ler temperatura
        Scanner reader = new Scanner(System.in);

        double tempC = reader.nextDouble();

        double tempF = tempC * 9 / 5 + 32;

        System.out.println(tempF);



    }
}
