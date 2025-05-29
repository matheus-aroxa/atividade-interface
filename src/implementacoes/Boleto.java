package implementacoes;

public class Boleto implements MetodoDePagamento{

    @Override
    public void processarPagamento(int amount) {
        System.out.println("Pagamento processado com sucesso no boleto com valor de: " + amount);
    }
}
