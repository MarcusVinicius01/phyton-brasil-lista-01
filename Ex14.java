import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        /*João Papo-de-Pescador, homem de bem, comprou um microcomputador para controlar o rendimento diário de seu trabalho.
        Toda vez que ele traz um peso de peixes maior que o estabelecido pelo regulamento de pesca do estado de São Paulo
        (50 quilos) deve pagar uma multa de R$ 4,00 por quilo excedente. João precisa que você faça um programa que leia a
        variável peso (peso de peixes) e calcule o excesso. Gravar na variável excesso a quantidade de quilos além do limite
        e na variável multa o valor da multa que João deverá pagar. Imprima os dados do programa com as mensagens adequadas.*/

        System.out.println("\nInforme quantos quilos de peixe João pescou: ");
        double pesoDePeixes = scanner.nextDouble();

        if (pesoDePeixes > 50){
            double excesso = pesoDePeixes - 50;
            double multa = excesso * 4;
            System.out.println("\nJoão passou do limite de peso estipulado pelo regulamento.");
            System.out.println("Ele pescou " + pesoDePeixes + "kg, tendo um excesso de " + excesso + " kg e uma multa de R$ " + multa);
        }
        else {
            System.out.format("\nJoão pescou " + pesoDePeixes + " Kg de peixes, não passando do limite estipulado pelo regulamento de pesca. Portanto não precisa pagar multa.");
        }
        scanner.close();
    }
}
