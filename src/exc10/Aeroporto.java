package exc10;

public class Aeroporto {
    private String nome;
    private String localizacao;
    private int quantidadePistas;

    public Aeroporto(String nome, String localizacao, int quantidadePistas) {
        this.nome = nome;
        this.localizacao = localizacao;
        this.quantidadePistas = quantidadePistas;
    }

    public void permitirPousa(Aeronave aeronave) {
        System.out.println("Pouso da aeronave [" + aeronave.getModelo() + "] permitido");
        aeronave.pousar();
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public int getQuantidadePistas() {
        return quantidadePistas;
    }

    public void setQuantidadePistas(int quantidadePistas) {
        this.quantidadePistas = quantidadePistas;
    }
}
