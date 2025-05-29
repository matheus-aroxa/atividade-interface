import implementacoes.Boleto;
import implementacoes.CartaoDeCredito;
import implementacoes.MetodoDePagamento;
import implementacoes.Pix;

public class Main {
    public static void main(String[] args) {

        MetodoDePagamento metodoDePagamento1 = new Boleto();
        MetodoDePagamento metodoDePagamento2 = new Pix();
        MetodoDePagamento metodoDePagamento3 = new CartaoDeCredito();
        int amount = 200;

        metodoDePagamento1.processarPagamento(200);
        metodoDePagamento2.processarPagamento(200);
        metodoDePagamento3.processarPagamento(200);

    }
}
