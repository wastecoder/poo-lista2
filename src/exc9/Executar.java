package exc9;

public class Executar {
    public static void main(String[] args) {
//        Motor motor = new Motor(2000);
        Carro carro = new Carro("Ford", "Fiesta", new Motor(2000));
        Pessoa pessoa = new Pessoa("Pedro", carro);

        System.out.println("Composi��o >>> dados do carro: " + carro);
        System.out.println("Agrega��o >>> dados da pessoa: " + pessoa);
    }
}
