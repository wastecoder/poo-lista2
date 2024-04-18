package exc5;

public class Carro {
    private String marca;
    private String modelo;
    private String cor;
    private int ano;
    private int velocidadeAtual;

    public Carro(String marca, String modelo, String cor, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.ano = ano;
        this.velocidadeAtual = 0;
    }

    public void acelerar(int velocidade) {
        this.velocidadeAtual += velocidade;
        System.out.println("Carrou " + this.modelo + " acelerou. Velocidade atual: " + velocidadeAtual);
    }

    public void frear() {
        this.velocidadeAtual = 0;
        System.out.println("Carro " + this.modelo + " freou e está a 0km/h");
    }

    public void ligar() {
        System.out.println("Ligando carro da marca " + marca + "; modelo " + modelo + "; cor " + cor + "; ano " + ano);
    }
}
