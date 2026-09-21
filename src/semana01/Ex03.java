package semana01;

import java.util.Scanner;

public class Ex03 {

    public static void main(String[] args) {
        //Conversor de unidades. Leia km e converta para milhas (×0,621371).
        // Leia kg e converta para libras (×2,20462). Use 2 casas decimais.

        //Scanner
        Scanner reader = new Scanner(System.in);

        //ler dados - KM
        System.out.println("Conversor de KM: ");
        double km = reader.nextDouble();
        double mi = km * 0.621371;
        System.out.printf(km + " em mi: %.2f\n", mi);

        //ler dados - KG
        System.out.println("===============");
        System.out.println("Conversor de KG: ");
        double kg = reader.nextDouble();
        double li = kg * 2.20462;
        System.out.printf(kg + " em libras é: %.2f", li);


    }
}
