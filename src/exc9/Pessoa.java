package exc9;

public class Pessoa {
    private String nome;
    public Carro carro;     //Agregação = public

    public Pessoa() {
    }

    public Pessoa(String nome, Carro carro) {
        this.nome = nome;
        this.carro = carro;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Carro getCarro() {
        return carro;
    }

    public void setCarro(Carro carro) {
        this.carro = carro;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", carro=" + carro +
                '}';
    }
}
