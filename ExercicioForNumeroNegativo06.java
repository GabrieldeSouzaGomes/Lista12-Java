//6) Calcule e imprima a média aritmética de vários números fornecidos pelo usuário até que seja fornecido um número negativo.

package lista12;

import java.util.Scanner;

public class ExercicioForNumeroNegativo06 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int soma = 0;
        int contador = 0;
        int numero;

        do {
            System.out.print("Digite um número (negativo para parar): ");
            numero = scanner.nextInt();

            if (numero >= 0) {
                soma += numero;
                contador++;
            }
        } while (numero >= 0);

        if (contador > 0) {
            double media = (double) soma / contador;
            System.out.printf("Média aritmética dos números digitados: %.2f%n", media);
        } else {
            System.out.println("Nenhum número positivo foi digitado.");
        }

        scanner.close();
    }
}
