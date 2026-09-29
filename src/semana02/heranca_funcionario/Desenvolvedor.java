package semana02.heranca_funcionario;

public class Desenvolvedor extends Funcionario {

    private static final double VALOR_HORA_EXTRA = 50.0;

    private String linguagemPrincipal;
    private int horasExtras;

    public Desenvolvedor(String nome, int matricula, double salario,
                         String linguagemPrincipal, int horasExtras) {
        super(nome, matricula, salario);
        this.linguagemPrincipal = linguagemPrincipal;
        setHorasExtras(horasExtras);
    }

    @Override
    public double calcularSalario() {
        return super.calcularSalario() + horasExtras * VALOR_HORA_EXTRA;
    }

    public String getLinguagemPrincipal() {
        return linguagemPrincipal;
    }

    public void setLinguagemPrincipal(String linguagemPrincipal) {
        this.linguagemPrincipal = linguagemPrincipal;
    }

    public int getHorasExtras() {
        return horasExtras;
    }

    public void setHorasExtras(int horasExtras) {
        if (horasExtras >= 0) {
            this.horasExtras = horasExtras;
        } else {
            System.out.println("Valor invalido!");
        }
    }


}