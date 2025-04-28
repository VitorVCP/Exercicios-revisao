import java.util.Scanner;

public class Idade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int idade;
        System.out.print("Qual sua idade? ");
        idade = sc.nextInt();

        if (idade >= 18) {
            System.out.println("Você atingiu a maior idade.");
        } else if (idade < 18) {
            System.out.println("Você não atingiu a maioridade.");
        } else if (idade > 116) {
            System.out.println("Parabéns, você pode entrar no guinness book");
        }
        sc.close();
    }
}
