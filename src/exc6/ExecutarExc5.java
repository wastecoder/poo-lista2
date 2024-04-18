package exc6;

import exc5.Carro;
import exc5.Gato;
import exc5.Televisao;

public class ExecutarExc5 {
    public static void main(String[] args) {
        Carro carro1 = new Carro("Toyota", "Corolla", "Prata", 2022);
        carro1.ligar();
        carro1.acelerar(60);

        Carro carro2 = new Carro("Audi", "Q3", "Preto", 2018);
        carro2.acelerar(90);
        carro2.frear();

        System.out.println();
        Televisao tv1 = new Televisao("Samsung", 43);
        tv1.ligarOuDesligar();
        tv1.aumentarVolume();
        tv1.aumentarVolume();
        tv1.ligarOuDesligar();

        Televisao tv2 = new Televisao("LG", 50);
        tv2.ligarOuDesligar();
        tv2.alterarCanal();
        tv2.alterarCanal();
        tv2.alterarCanal();

        System.out.println();
        Gato gato1 = new Gato("Cristal", "Preta", 3);
        gato1.acordar();
        gato1.fazerAniversario();

        Gato gato2 = new Gato("Nina", "Laranja", 1);
        gato2.acordar();
        gato2.dormir();
    }
}
