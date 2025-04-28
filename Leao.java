import java.util.Scanner;

public class Leao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //103.85    
        double salario, salarioBruto, salarioIR, INSS; 
        int filhos;
        System.out.print("Digite o valor do salário: ");
        salario = sc.nextDouble();
        salarioBruto = salario;
        salarioIR = salarioBruto;
        System.out.print("Agora informe quantos filhos tem: ");
        filhos = sc.nextInt();

        if (salario <=  1518) {
            salario -= (salario * 7.5 / 100);
            System.out.println("\nINSS:\nSerá retirado: " + (salario - salarioBruto) + " Para o INSS.");
            System.out.println("Com o desconto, ficará: " + salario);


        } else if (salario >=  1518.01 && salario <= 2793.88) {
            INSS = 1518 * 7.5 / 100;
            salario -= (salario - 1518) * 9 / 100 + INSS;
            System.out.println("\nINSS:\nSerá retirado: " + (salario - salarioBruto) + " Para o INSS.");
            System.out.println("Com o desconto, ficará: " + salario);
            
            
        } else if (salario >= 2793.89 && salario <= 4190.83) {
            INSS = (2793.88 - 1518) * 9 / 100;
            INSS += 1518 * 7.5 / 100;
            salario -= (salario - 2793.88) * 12 / 100 + INSS;
            System.out.println("\nINSS:\nSerá retirado: " + (salario - salarioBruto) + " Para o INSS.");
            System.out.println("Com o desconto, ficará: " + salario); 


        } else if (salario >= 4190.84 && salario <= 8157.41) {
            INSS = (4190.83 - 2793.88) * 12 / 100;
            INSS += (2793.88 - 1518) * 9 / 100;
            INSS += 1518 * 7.5 / 100;
            salario -= (salario - 4190.83) * 14 / 100 + INSS;
            System.out.println("\nINSS:\nSerá retirado: " + (salario - salarioBruto) + " Para o INSS.");
            System.out.println("Com o desconto, ficará: " + salario);
        }
        double taxa = salarioBruto - salario;
        salarioIR = (salarioBruto - taxa - (filhos * 189.59));
        if (!(filhos == 0)) {
            if (salarioIR <= 2259.20) {
                System.out.println("Não haverá dedução.");
            }

            else if (salarioIR >= 2259.21 && salarioIR <= 2826.65) {
                System.out.println(salarioIR * 7.5 / 100 - 169.44);
            }
            
        }
        sc.close();
    }
}
