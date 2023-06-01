import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        //Faça um Programa que peça 2 números inteiros e um número real. Calcule e mostre:
        

        System.out.println("\nInforme o primeiro número inteiro: ");
        int numero1 = scanner.nextInt();

        System.out.println("\nInforme o segundo número inteiro: ");
        int numero2 = scanner.nextInt();

        System.out.println("\nAgora informe um número real: ");
        double numero3 = scanner.nextDouble();

        //o produto do dobro do primeiro com metade do segundo .
        double resultado1 = ((numero1 *2) + (numero2 / 2));
        System.out.printf("\nO produto do dobro do primeiro número com metade do segundo número: %.2f\n", resultado1);
        //a soma do triplo do primeiro com o terceiro.
        double resultado2 = ((numero1 * 3) + numero3);
        System.out.printf("A soma do triplo do primeiro número com o terceiro número: %.2f\n", resultado2);
        //o terceiro elevado ao cubo.
        double resultado3 = Math.pow(numero3, 3);
        System.out.printf("O terceiro número elevado ao cubo: %.2f", resultado3);
        scanner.close();
    }
}
