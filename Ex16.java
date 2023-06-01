import java.util.Scanner;

public class Ex16 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        /*Faça um programa para uma loja de tintas. O programa deverá pedir o tamanho em metros quadrados da área a ser
        pintada. Considere que a cobertura da tinta é de 1 litro para cada 3 metros quadrados e que a tinta é vendida em
        latas de 18 litros, que custam R$ 80,00. Informe ao usuário a quantidades de latas de tinta a serem compradas e o
        preço total.*/

        System.out.println("\nInforme em metros quadrados o tamanho da área que deseja pintar: ");
        double metrosQuadrados = scanner.nextDouble();

        double litros = metrosQuadrados / 3;
        double latas = litros / 18;
        double custoTotal = latas * 80;

        System.out.printf("\nLatas de tinta necessarias: %.0f", latas);
        System.out.printf("\nCusto total: R$%.2f", custoTotal);
        scanner.close();
    }
}
