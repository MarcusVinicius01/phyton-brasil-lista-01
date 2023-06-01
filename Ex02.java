import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nInforme um número: ");
        int numero = scanner.nextInt();
        System.out.println("\nSeu número: " + numero);
        scanner.close();
    }
}
