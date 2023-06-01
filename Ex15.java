import java.util.Scanner;

public class Ex15 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        /*Faça um Programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês. Calcule e mostre
        o total do seu salário no referido mês, sabendo-se que são descontados 11% para o Imposto de Renda, 8% para o INSS
        e 5% para o sindicato, faça um programa que nos dê:

        salário bruto.
        quanto pagou ao INSS.
        quanto pagou ao sindicato.
        o salário líquido.
        calcule os descontos e o salário líquido, conforme a tabela abaixo:
        + Salário Bruto : R$
        - IR (11%) : R$
        - INSS (8%) : R$
        - Sindicato ( 5%) : R$
        = Salário Liquido : R$
        Obs.: Salário Bruto - Descontos = Salário Líquido.*/

        System.out.println("\nInforme quanto você ganha por hora: ");
        double valorPorHora = scanner.nextDouble();

        System.out.println("\nInforme quantas horas voce trabalhou este mês: ");
        double horasTrabalhadas = scanner.nextDouble();

        double ganho = horasTrabalhadas * valorPorHora;
        double inss = ganho * 0.08;
        double ir = ganho * 0.11;
        double sindicato = ganho * 0.05;
        double salarioLiquido = ganho - (inss + ir + sindicato);

        System.out.printf("\nSalário Bruto: R$ %.2f", ganho);
        System.out.println("\nDesconto do INSS: " + inss);
        System.out.println("Desconto do IR: " + ir);
        System.out.println("Desconto do Sindicato: " + sindicato);
        System.out.println("Salário Líquido: " + salarioLiquido);
        scanner.close();
    }
}
