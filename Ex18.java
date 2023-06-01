import java.util.Scanner;

public class Ex18 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        /*Faça um programa que peça o tamanho de um arquivo para download (em MB) e a velocidade de um link de Internet
        (em Mbps), calcule e informe o tempo aproximado de download do arquivo usando este link (em minutos).*/

        System.out.println("\nInforme o tamanho do arquivo em megabytes: ");
        double quantidadeMegabytes = scanner.nextDouble();

        System.out.println("\nInforme a velocidade do link de Internet em Mbps: ");
        double velocidadeLink = scanner.nextDouble();

        double tempoDeDownload = (velocidadeLink / 8) / quantidadeMegabytes ;

        System.out.printf("\nSeu arquivo será baixado em %.0f segundos.", Math.ceil(tempoDeDownload));
        scanner.close();
    }
}
