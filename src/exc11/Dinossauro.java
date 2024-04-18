package exc11;

public class Dinossauro {
    private int energia;
    private int velocidade;
    private int temperatura;
    private String humor;

    public Dinossauro() {
        this(50, 30, 30, "Feliz");
    }

    public Dinossauro(int energia, int velocidade, int temperatura, String humor) {
        this.energia = energia;
        this.velocidade = velocidade;
        this.temperatura = temperatura;
        this.humor = humor;
    }

    public void pular() {
        this.energia -= 10;
        this.humor = "Feliz";
        System.out.println("Skeep pulou");
    }

    public void correr() {
        this.energia -= 10;
        this.humor = "Feliz";
        System.out.println("Skeep correu");
    }

    public void comer() {
        this.energia += 10;
        this.velocidade -= 5;
        this.humor = "Feliz";
        System.out.println("Skeep comeu");
    }

    public void cantar() {
        this.energia -= 10;
        this.humor = "Feliz";
        System.out.println("Skeep cantou");
    }

    public void tomarSol() {
        this.velocidade += 10;
        this.temperatura += 5;
        this.humor = "Feliz";
        System.out.println("Skeep tomou Sol");
    }

    public void ficarNaSombra() {
        this.energia += 10;
        this.temperatura -= 5;
        this.humor = "Triste";
        System.out.println("Skeep ficou na sombra");
    }

    @Override
    public String toString() {
        return "Dinossauro{" +
                "energia=" + energia +
                ", velocidade=" + velocidade +
                ", temperatura=" + temperatura +
                ", humor='" + humor + '\'' +
                '}';
    }
}
