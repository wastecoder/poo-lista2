package exc8;

public class CaixaVarArgs {
    private double saldo;

    public void venda(double... valores) {
        for (double valor : valores)
            saldo += valor;
    }

    public double getSaldo() {
        return saldo;
    }
}
