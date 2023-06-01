import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Faça um Programa que converta metros para centímetros.

        System.out.println("Informe a quantidade de metros que deseja converter: ");
        double metros = scanner.nextDouble();

        double centimetros = metros * 100;

        System.out.println("Número de centimetros: " + centimetros);
        scanner.close();
    }
}
