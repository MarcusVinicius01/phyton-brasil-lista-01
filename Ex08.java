import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        /*Faça um Programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês. Calcule e
        mostre o total do seu salário no referido mês.*/
        System.out.println("\nInforme quanto você ganha por hora: ");
        double valorPorHora = scanner.nextDouble();

        System.out.println("\nInforme quantas horas voce trabalhou este mês: ");
        double horasTrabalhadas = scanner.nextDouble();

        double ganho = horasTrabalhadas * valorPorHora;
        System.out.printf("\nEste mês você ganhara: R$ %.2f", ganho);
        
        scanner.close();
    }
}
