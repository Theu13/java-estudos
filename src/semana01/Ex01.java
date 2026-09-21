package semana01;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        //Apresentação. Leia nome (String) e idade (int). Imprima Olá, X! Você tem N anos. com printf.

        //criar scanner
        Scanner reader = new Scanner(System.in);

        //ler nome e idade
        var nome = reader.nextLine();
        int idade = reader.nextInt();

        System.out.printf("Olá " + nome + "! Você tem " + idade + " anos." );
    }
}
