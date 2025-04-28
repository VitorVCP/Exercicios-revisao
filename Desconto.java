import java.util.Scanner;

public class Desconto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float valor;
        System.out.print("Digite o valor do produto: ");
        valor = sc.nextFloat();
        float taxa = valor / 10;
        System.out.println("O valor a ser pago será de: " + (valor - taxa));
        sc.close();
    }
}
