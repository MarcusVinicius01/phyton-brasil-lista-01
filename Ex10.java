import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        //Faça um Programa que peça a temperatura em graus Celsius, transforme e mostre em graus Fahrenheit.
        System.out.println("\nInforme a temperatura atual em graus Celsius, para ser convertida em graus Fahrenheit: ");
        int grausCelsius = scanner.nextInt();

        double  grausFahrenheit = ((grausCelsius * 1.8) + 32);
        System.out.printf("\nGraus Celsius: %.2f", grausFahrenheit);
        scanner.close();
    }
}