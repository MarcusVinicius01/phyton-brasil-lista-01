import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        //Faça um Programa que calcule a área de um quadrado, em seguida mostre o dobro desta área para o usuário.

        System.out.println("\nInforme a base e depois a altura de um quadrado: ");
        double base = scanner.nextDouble();
        double altura = scanner.nextDouble();

        double area = base * altura;

        System.out.println("\nO dobro da área do quadrado é de: " + area * 2);
        scanner.close();
    }
}
