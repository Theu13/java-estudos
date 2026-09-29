package semana02.heranca_funcionario;

public class Funcionario {

    private String nome;
    private int matricula;
    private double salarioBase;


    public Funcionario(String nome, int matricula, double salario) {
        this.nome = nome;
        this.matricula = matricula;
        setSalario(salario);

    }

    @Override
    public String toString() {
        return nome + " | matricula: " + matricula
                + " | salario: " + String.format("%.2f", calcularSalario());
    }

    public double calcularSalario() {
        return salarioBase;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public double getSalario() {
        return salarioBase;
    }

    public void setSalario(double salario) {
        if(salario >= 0) {
            this.salarioBase = salario;
        } else {
            System.out.println("Valor invalido!");
        }

    }
}
