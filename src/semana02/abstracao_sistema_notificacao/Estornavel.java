package semana02.abstracao_sistema_notificacao;

public interface Estornavel {

    //Metodo abstrato
    boolean estornar();

    StatusPagamento getStatus();

    default boolean podeEstornar() {
        return getStatus() == StatusPagamento.APROVADO;
    }


}
