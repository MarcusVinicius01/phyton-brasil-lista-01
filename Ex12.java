import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        /*Tendo como dados de entrada a altura de uma pessoa, construa um algoritmo que calcule seu peso ideal, usando a
        seguinte fórmula: (72.7*altura) - 58*/

        System.out.println("\nInfome sua altura para descobrir seu peso ideal. ");
        double altura = scanner.nextDouble();

        double pesoIdeal = (72.7 * altura) - 58;
        System.out.printf("\nSeu peso ideal é: Kg %.3f", pesoIdeal);
        scanner.close();
    }
}
