package exc10;

public class Executar {
    public static void main(String[] args) {
        Piloto piloto = new Piloto("Michael", 37, "12345678901", "1234");
        Aeronave aviao = new Aeronave("Boeing 747", 410, 0);

        piloto.pilotar(aviao);
    }
}
