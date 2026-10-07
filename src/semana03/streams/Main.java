package semana03.streams;

import java.util.List;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {

        record Produto(String nome, String categoria, double preco, int estoque) {}

        List<Produto> produtos = List.of(
                new Produto("Notebook", "Eletronicos", 3500.0, 5),
                new Produto("Mouse", "Eletronicos", 45.90, 30),
                new Produto("Teclado", "Eletronicos", 120.0, 0),
                new Produto("Fone Bluetooth", "Eletronicos", 199.90, 12),
                new Produto("Caderno", "Papelaria", 18.50, 100),
                new Produto("Caneta", "Papelaria", 3.20, 0),
                new Produto("Mochila", "Acessórios", 159.90, 8),
                new Produto("Garrafa Térmica", "Acessórios", 42.00, 20)
        );

        //Mostrar Lista em ordem alfabetica com estoque > 0.
        List<String> Nomes = produtos.stream().filter(produto -> produto.estoque() > 0).map(produto -> produto.nome() ).sorted().toList();
        IO.println(Nomes);



    }
}
