package exc10;

public class Aeronave {
    private String modelo;
    private int Capacidade;
    private int altitude;

    public Aeronave(String modelo, int capacidade, int altitude) {
        this.modelo = modelo;
        Capacidade = capacidade;
        this.altitude = altitude;
    }

    public void voar() {
        this.setAltitude(11500);
        System.out.println("Avião [" + this.modelo + "] voando a " + this.altitude + "km de altitude");
    }

    public void pousar() {
        this.setAltitude(0);
        System.out.println("Avião [" + this.modelo + "] pouso. Altitude atual: " + this.altitude + "km");
    }


    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getCapacidade() {
        return Capacidade;
    }

    public void setCapacidade(int capacidade) {
        Capacidade = capacidade;
    }

    public int getAltitude() {
        return altitude;
    }

    public void setAltitude(int altitude) {
        this.altitude = altitude;
    }
}
