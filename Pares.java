import java.util.Scanner;

public class Pares {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int numero;
        System.out.println("Informe um número.");
        numero = sc.nextInt();
        if (numero % 2 == 0) {
            System.out.println("Seu número é par.");
        } else {
            System.out.println("Seu número é ímpar.");
        }
        sc.close();
    }
}