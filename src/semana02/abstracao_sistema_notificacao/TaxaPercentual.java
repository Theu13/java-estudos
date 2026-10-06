package semana02.abstracao_sistema_notificacao;

public class TaxaPercentual implements CalculadoraTaxa{

    private final double Taxa;


    public TaxaPercentual(double taxa) {
        this.Taxa = taxa;
    }

    @Override
    public double calcular(double valor) {
        return (Taxa / 100) * valor;
    }
}
