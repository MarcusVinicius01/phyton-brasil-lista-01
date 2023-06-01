import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        /*Tendo como dado de entrada a altura (h) de uma pessoa, construa um algoritmo que calcule seu peso ideal,
        utilizando as seguintes fórmulas:
        Para homens: (72.7*h) - 58
        Para mulheres: (62.1*h) - 44.7*/
        double pesoIdeal;
        
        System.out.println("\nInforme seu sexo biológico, sendo masculino ou feminino.");
        String sexo = scanner.nextLine();

        System.out.println("\nInforme sua altura: ");
        double altura = scanner.nextDouble();

        switch(sexo){
            case "masculino":
            pesoIdeal = (72.7 * altura) - 58;
            System.out.printf("\nSeu peso ideal é: Kg %.3f", pesoIdeal);
            break;

            case "feminino":
            pesoIdeal = (62.1 * altura) - 44.7;
            System.out.printf("\nSeu peso ideal é: Kg %.3f", pesoIdeal);
            break;

            default:
            System.out.println("\nSexo Invalido!");
        }
        scanner.close();
    }
}
