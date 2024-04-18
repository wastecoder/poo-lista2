package exc10;

public class Passageiro extends Pessoa {
    private String passaporte;

    public Passageiro(String nome, int idade, String cpf, String passaporte) {
        super(nome, idade, cpf);
        this.passaporte = passaporte;
    }

    public void comprarPassagem(Aeroporto aeroporto) {
        System.out.println("Passageiro [" + this.getNome() + "] comprou passagem no aeroporto [" + aeroporto.getNome() + "]");
    }


    public String getPassaporte() {
        return passaporte;
    }

    public void setPassaporte(String passaporte) {
        this.passaporte = passaporte;
    }

    @Override
    public String toString() {
        return "Passageiro{" +
                "passaporte='" + passaporte + '\'' +
                '}';
    }
}
