package semana02.abstracao_sistema_notificacao;

public abstract class Pagamento {

    private final int id;
    private final double valor;
    private final CalculadoraTaxa calculadoraTaxa;
    private StatusPagamento status;

    public Pagamento(int id, double valor, CalculadoraTaxa calculadoraTaxa) {
        if (valor <= 0) {
            throw new IllegalArgumentException("O valor deve ser maior que zero");
        }
        this.id = id;
        this.valor = valor;
        this.calculadoraTaxa = calculadoraTaxa;
        this.status = StatusPagamento.PENDENTE;
    }

    public abstract void processar();

    public double valorLiquido() {
        return valor - calculadoraTaxa.calcular(valor);
    }

    protected void alterarStatus(StatusPagamento novoStatus) {
        this.status = novoStatus;
    }

    public int getId() { return id; }

    public double getValor() { return valor; }

    public StatusPagamento getStatus() { return status; }


}
