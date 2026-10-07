package semana03.streams;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

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
        List<String> nomes = produtos.stream().filter(produto -> produto.estoque() > 0).map(produto -> produto.nome() ).sorted().toList();
        IO.println(nomes);

        //Media
        double media = produtos.stream().mapToDouble(value -> value.preco()).average().getAsDouble();
        IO.println(media);

        //Separar por categorias
        Map<String, List<Produto>> nomeCat = produtos.stream().collect(Collectors.groupingBy(produto -> produto.categoria()));
        IO.println(nomeCat);

        //Quantidade de produtos por categorias
        Map<String, Long> qtdPorCat = produtos.stream().collect(Collectors.groupingBy(produto -> produto.categoria(), Collectors.counting()));
        IO.println(qtdPorCat);

        //Produto mais caro de cada categoria //Lambda
        Map<String, Optional<Produto>> produtoCaroCat = produtos.stream().collect(Collectors.groupingBy(Produto::categoria, Collectors.maxBy(Comparator.comparingDouble(Produto::preco))));
        IO.println(produtoCaroCat);

    }
}
