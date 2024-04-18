package exc11;

import java.util.Scanner;

public class ExecutarDinossauro {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Dinossauro skeep = new Dinossauro();

        System.out.println("Estado inicial: " + skeep);

        System.out.println("\nDigite a letra entre o parenteses para escolher a opção.");
        System.out.println("Digite a letra [Z] para sair!");

        char escolha;
        do {
            System.out.println("\n+=====================+");
            System.out.println("(P)ular");
            System.out.println("(C)orrer");
            System.out.println("Co(M)er");
            System.out.println("C(A)ntar");
            System.out.println("Tomar (S)ol");
            System.out.println("Ficar na S(O)mbra");
            System.out.println("+=====================+");

            System.out.print("Escolha: ");
            String textoMaiusculo = scan.nextLine().toUpperCase();
            escolha = textoMaiusculo.charAt(0);

            switch (escolha) {
                case 'P':
                    skeep.pular();
                    break;
                case 'C':
                    skeep.correr();
                    break;
                case 'M':
                    skeep.comer();
                    break;
                case 'A':
                    skeep.cantar();
                    break;
                case 'S':
                    skeep.tomarSol();
                    break;
                case 'O':
                    skeep.ficarNaSombra();
                    break;
                case 'Z':
                    System.out.println("Saindo do laço");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }

            System.out.println("Estado atual: " + skeep);
        } while (escolha != 'Z');
    }
}
