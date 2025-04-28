import java.util.Random;
import java.util.Scanner;

public class Jogo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rm = new Random();
        int escolha;
        System.out.println("Escolha:\n[1] Pedra\n[2] Papel\n[3] Tesoura\n[4] Parar programa");
        escolha = sc.nextInt();

        while (!(escolha == 4)) {

        if (escolha == 1) {
            int bot = rm.nextInt(3) + 1;
            System.out.println("Você escolheu Pedra.");

            if (bot == 2) {
                System.out.println("Seu Adversário escolheu: Papel\nVocê PERDEU.");
            } else if (bot == 1) {
                System.out.println("Seu Adversário escolheu: Pedra\nVocês EMPATARAM.");
            } else if (bot == 3) {
                System.out.println("Seu Adversário escolheu: Tesoura\nVocê VENCEU.");
            }
        } 
        
        else if (escolha == 2) {
            int bot = rm.nextInt(3) + 1;
            System.out.println("Você escolheu Papel.");
            if (bot == 3) {
                System.out.println("Seu Adversário escolheu: Tesoura\nVocê PERDEU.");
            } else if (bot == 2) {
                System.out.println("Seu Adversário escolheu: Papel\nVocês EMPATARAM.");
            } else if (bot == 1) {
                System.out.println("Seu Adversário escolheu: Pedra\nVocê VENCEU.");
            }
        }
        
        else if (escolha == 3) {
            int bot = rm.nextInt(3) + 1;
            System.out.println("Você escolheu Tesoura.");
            if (bot == 1) {
                System.out.println("Seu Adversário escolheu: Pedra\nVocê PERDEU.");
            } else if (bot == 3) {
                System.out.println("Seu Adversário escolheu: Tesoura\nVocês EMPATARAM.");
            } else if (bot == 2) {
                System.out.println("Seu Adversário escolheu: Papel\nVocê VENCEU.");
            }
        } else {
            System.out.println("Erro.");
        }
        System.out.println("\nEscolha:\n[1] Pedra\n[2] Papel\n[3] Tesoura\n[4] Parar programa");
        escolha = sc.nextInt();
    }
        sc.close();
    
    }
}
