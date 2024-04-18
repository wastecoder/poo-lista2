package exc5;

public class Televisao {
    private String marca;
    private int tamanhoTela;
    private boolean ligada;
    private int volume;
    private int canalAtual;

    public Televisao(String marca, int tamanhoTela) {
        this.marca = marca;
        this.tamanhoTela = tamanhoTela;
        this.ligada = false;
        this.volume = 0;
        this.canalAtual = 1;
    }

    public void ligarOuDesligar() {
        this.ligada = !this.ligada;
        String estadoAtual = (ligada) ? "ligada" : "desligada";
        System.out.println("A TV " + this.marca + " está " + estadoAtual);
    }

    public void aumentarVolume() {
        if (this.ligada && this.volume < 100) {
            this.volume += 5;
            System.out.println("Volume aumentado em 5 para " + this.volume);
        }
    }

    public void alterarCanal() {
        this.canalAtual++;
        if (this.canalAtual == 4)
            this.canalAtual = 1;
        System.out.println("Alterado para o canal " + this.canalAtual);
    }
}
