package exc10;

public class Piloto extends Pessoa {
    private String breve;

    public Piloto(String nome, int idade, String cpf, String breve) {
        super(nome, idade, cpf);
        this.breve = breve;
    }

    public void pilotar(Aeronave aviao) {
        System.out.println("Piloto [" + this.getNome() + "] pilotando o aviao [" + aviao.getModelo() + "]");
        aviao.voar();
    }


    public String getBreve() {
        return breve;
    }

    public void setBreve(String breve) {
        this.breve = breve;
    }
}
