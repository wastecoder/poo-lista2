package exc8;

public class ExecutarCaixaVarArgs {
    public static void main(String[] args) {
        CaixaVarArgs caixa = new CaixaVarArgs();

        caixa.venda(30, 10.99, 44.99);
        System.out.println("Saldo do caixa: " + caixa.getSaldo());
    }
}
