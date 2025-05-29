package implementacoes;

public class Pix implements MetodoDePagamento{

    @Override
    public void processarPagamento(int amount) {
        System.out.println("Pagamento processado com sucesso no valor de: " + amount);
    }
}
