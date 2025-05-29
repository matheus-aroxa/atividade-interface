package implementacoes;

public class CartaoDeCredito implements MetodoDePagamento{


    @Override
    public void processarPagamento(int amount) {
        System.out.println("Pagamento processado com sucesso no valor de: " + amount*1.01);
    }
}
