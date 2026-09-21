package semana01;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        //Calculadora de retângulo
        //Leia base e altura (double). Calcule e imprima área e perímetro, com 2 casas decimais.

        Scanner reader = new Scanner(System.in);

        System.out.println("Base: ");
        double base = reader.nextDouble();
        System.out.println("Altura: ");
        double altura = reader.nextDouble();

        double area = base*altura;
        double perim = 2*base + 2*altura;
        System.out.printf("A área é %.2f e perímetro é %.2f.", area, perim);

    }
}
