import java.util.Scanner;

public class nota {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float nota;
        System.out.print("Insira a nota do aluno de 0 a 100: ");
        nota = sc.nextFloat();
        if (nota > 60) {
            System.out.println("O aluno está aprovado.");
        } else if (nota > 100 || nota < 0) {
            System.out.println("Valor inválido.");
        } else {
            System.out.println("O aluno Foi reprovado.");
        }
        sc.close();
    }
}
