import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nInforme o primeiro número: ");
        int numero1 = scanner.nextInt();

        System.out.println("\nInforme o segundo número: ");
        int numero2 = scanner.nextInt();

        int soma = numero1 + numero2;
        System.out.format("\nA soma dos números %d e %d é %d", numero1, numero2, soma);
        scanner.close();
    }
}
