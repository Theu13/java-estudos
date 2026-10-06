package semana02.abstracao_sistema_notificacao;

public class TaxaFixa implements CalculadoraTaxa {

    private final double Taxa;

    public TaxaFixa(double Taxa) {
        this.Taxa = Taxa;
    }

    @Override
    public double calcular(double valor) {
        return Taxa;
    }
}
