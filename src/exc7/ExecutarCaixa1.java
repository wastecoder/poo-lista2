package exc7;

public class ExecutarCaixa1 {
    public static void main(String[] args) {
        Caixa1 caixa = new Caixa1();

        caixa.venda(349.99);
        caixa.venda(139.90);
        caixa.venda(399.90);
        System.out.println("Saldo do caixa: " + caixa.getSaldo());
    }
}
