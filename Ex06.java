import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        //Faça um Programa que peça o raio de um círculo, calcule e mostre sua área.

        System.out.println("\nInforme o raio do circulo que deseja calcular a área: ");
        double raio = scanner.nextDouble();

        double area = 3.14159265358979323846 * (Math.pow(raio, 2));

        System.out.printf("\nÁrea: %.2f", area);
        scanner.close();
    }
}
