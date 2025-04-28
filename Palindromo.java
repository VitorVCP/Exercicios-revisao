import java.util.Scanner;

public class Palindromo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String palavra;
        System.out.println("Seja bem vindo(a) ao analizador palíndrico\nDigite uma palavra que desejar.");
        palavra = sc.nextLine();
        int inicio = 0, fim = palavra.length() - 1;
        Boolean palindromo = true;

        while (inicio < fim) {
            if (palavra.charAt(inicio) != palavra.charAt(fim)) {
            palindromo = false;
            }
            inicio ++;
            fim --;
        }
        if (palindromo) {
            System.out.println("Sua palavra (" + palavra + ") pode ser considerada palíndroma.");
        } else {
            System.out.println("Sua palavra (" + palavra + ") não pode ser considerada palíndroma.");
        }
        sc.close();
    }
}