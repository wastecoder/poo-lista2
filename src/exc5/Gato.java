package exc5;

public class Gato {
    private String nome;
    private String cor;
    private int idade;
    private boolean dormindo;
    private boolean alimentado;

    public Gato(String nome, String cor, int idade) {
        this.nome = nome;
        this.cor = cor;
        this.idade = idade;
        this.dormindo = false;
        this.alimentado = false;
    }

    public void dormir() {
        this.dormindo = true;
        System.out.println("O gato " + this.nome + " está dormindo");
    }

    public void acordar() {
        this.dormindo = false;
        System.out.println("O gato " + this.nome + " está acordado");
    }

    public void fazerAniversario() {
        this.idade++;
        System.out.println("O gato " + this.nome + " fez aniversário e agora tem " + this.idade + " anos");
    }
}
