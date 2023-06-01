import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Faça um Programa que peça as 4 notas bimestrais e mostre a média.
        double[] numeros = new double[4];
        int soma = 0;

        for(int posicao = 0; posicao < 4; posicao++) {
            System.out.print("Digite a " + (posicao+1) + "º nota: ");
            numeros[posicao] = scanner.nextDouble();
            soma += numeros[posicao];
        }
        int media = soma / 4;

        System.out.println("Média: " + media);
        scanner.close();
    }
}
