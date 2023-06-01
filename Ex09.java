import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        /*Faça um Programa que peça a temperatura em graus Fahrenheit, transforme e mostre a temperatura em graus Celsius.
        C = 5 * ((F-32) / 9).*/

        System.out.println("\nInforme a temperatura atual em graus Fahrenheit, para ser convertida em graus Celsius: ");
        int grausFahrenheit = scanner.nextInt();

        double grausCelsius = 5 * ((grausFahrenheit - 32) / 9);
        System.out.printf("\nGraus Celsius: %.2f", grausCelsius);
        scanner.close();
    }
}
