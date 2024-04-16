import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int i = 0;
        int soma = 0;
        int qtdJogadores = soma + i;



        String nomeJogador;
        String jogar = "Não";

        Scanner scan1 = new Scanner(System.in);
        Scanner scan2 = new Scanner(System.in);

        System.out.println("Vc deseja jogar Tetris? |  SIM : NÃO  | ");
        jogar = scan1.nextLine();

        Jogador[] jogadores = new Jogador[100];

        while (jogar.equals("Sim")  || jogar.equals("sim") ) {
            for ( i = 0; i < 1; i++) {
                System.out.println("Digite o seu nome");
                 nomeJogador = scan2.nextLine();
                Jogador ji = new Jogador(nomeJogador);
                ji.infoJogador();

                break;
            }

        }
        System.out.println("Obrigado por jogar Tetris!");

    }
}
