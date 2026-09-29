package semana02.heranca_funcionario;

public class Main {

    public static void main(String[] args) {
        Funcionario[] equipe = {
                new Funcionario("Beto", 2, 3000),
                new Gerente("Ana", 1, 5000, 1000, 4),
                new Desenvolvedor("Caio", 3, 4000, "Java", 10),
                new Desenvolvedor("Duda", 4, 4500, "Kotlin", 20)
        };

        double folha = 0;
        for (Funcionario f : equipe) {
            System.out.println(f);
            folha += f.calcularSalario();
        }
        System.out.println("Folha total: " + String.format("%.2f", folha));
    }

}
