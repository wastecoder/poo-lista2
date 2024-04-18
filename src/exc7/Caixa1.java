package exc7;

public class Caixa1 {
    private double saldo;

    public void venda(double valorProduto) {
        saldo += valorProduto;
    }

    public double getSaldo() {
        return saldo;
    }
}
