package semana01;

import java.util.Scanner;

public class Ex05 {

    public static void main(String[] args) {
        //Idade em segundos
        //Leia a idade em anos (int). Calcule quantos dias, horas, minutos
        // e segundos essa idade representa (aproximando o ano em 365 dias).
        // Use long para os segundos — o valor estoura int.

        //Scanner
        Scanner reader = new Scanner(System.in);

        System.out.println("Digite sua idade: ");
        int idade = reader.nextInt();

        //converter em dias/horas/minutos/segundos:
        double dias = idade * 365;
        double horas = dias * 24;
        double minutos = horas * 60;
        long segundos = Math.round(minutos * 60);

        System.out.println("Convertido: " + dias + "/" + horas + "/" + minutos + "/" + segundos);





    }
}
