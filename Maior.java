import java.util.Scanner;

public class Maior {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x, y, z;
        System.out.println("Digite 3 números diferentes.");
        x = sc.nextInt();
        y = sc.nextInt();
        z = sc.nextInt();
        if ((x == y) || (y == z) || (z == y)) {
            System.out.println("Erro: Números repetidos.");
        } else {
            if (x > y && x > z) {
                System.out.println("O maior número entre eles é: " + x);
            } else if (x < y && y > z) {
                System.out.println("O maior número entre eles é: " + y);
            } else if (x < z && y < z) {
                System.out.println("O maior número entre eles é: " + z);
            }
        }
        sc.close();
    }
}
