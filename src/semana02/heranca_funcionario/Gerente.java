package semana02.heranca_funcionario;


public class Gerente extends Funcionario{

    private static final double VALOR_POR_SUBORDINADO = 500.0;


    private double bonusGerencia;
    private int numeroSubordinados;

    public Gerente(String nome, int matricula, double salario, double bonusGerencia, int numeroSubordinados) {
        super(nome, matricula, salario);
        setBonusGerencia(bonusGerencia);
        setNumeroSubordinados(numeroSubordinados);

    }

    @Override
    public double calcularSalario() {
        return super.calcularSalario()
                + bonusGerencia
                + numeroSubordinados * VALOR_POR_SUBORDINADO;
    }


    public double getBonusGerencia() {
        return bonusGerencia;
    }

    public void setBonusGerencia(double bonusGerencia) {
        if (bonusGerencia >= 0) {
            this.bonusGerencia = bonusGerencia;
        } else {
            System.out.println("Valor invalido!");
        }

    }

    public int getNumeroSubordinados() {
        return numeroSubordinados;
    }

    public void setNumeroSubordinados(int numeroSubordinados) {
        if(numeroSubordinados >= 0) {
            this.numeroSubordinados = numeroSubordinados;
        } else {
            System.out.println("Valor invalido!");
        }
    }
}
