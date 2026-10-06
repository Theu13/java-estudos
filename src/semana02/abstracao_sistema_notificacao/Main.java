package semana02.abstracao_sistema_notificacao;

public class Main {
    public static void main(String[] args) {

        // 1. Enum
        System.out.println("== Enum ==");
        for (StatusPagamento s : StatusPagamento.values()) {
            System.out.println(s + " -> " + s.getDescricao());
        }

        // 2. Taxas
        System.out.println("== Taxas ==");
        System.out.println(new TaxaFixa(2.0).calcular(100));          // 2.0
        System.out.println(new TaxaFixa(5.0).calcular(100));          // 5.0
        System.out.println(new TaxaPercentual(3).calcular(100));      // 3.0
        System.out.println(new TaxaPercentual(10).calcular(250));     // 25.0

        // 3. Default de Estornavel, testado com os 4 status
        System.out.println("== podeEstornar ==");
        for (StatusPagamento s : StatusPagamento.values()) {
            Estornavel e = new Estornavel() {
                @Override
                public boolean estornar() { return true; }

                @Override
                public StatusPagamento getStatus() { return s; }
            };
            System.out.println(s + " -> " + e.podeEstornar());
        }

        // 4. Pagamento
        System.out.println("== Pagamento ==");
        Pagamento p1 = new Pagamento(1, 100, new TaxaFixa(2.0)) {
            @Override
            public void processar() { alterarStatus(StatusPagamento.APROVADO); }
        };
        System.out.println(p1.getStatus());        // PENDENTE
        p1.processar();
        System.out.println(p1.getStatus());        // APROVADO
        System.out.println(p1.valorLiquido());     // 98.0

        // 5. Mesma classe, taxa diferente (composição)
        Pagamento p2 = new Pagamento(2, 100, new TaxaPercentual(3)) {
            @Override
            public void processar() { }
        };
        System.out.println(p2.valorLiquido());     // 97.0

        // 6. Validação
        System.out.println("== Validação ==");
        try {
            new Pagamento(3, -50, new TaxaFixa(2.0)) {
                @Override
                public void processar() { }
            };
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }













    }

}
