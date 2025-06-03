//4) Conte e imprima quantos números são pares e quantos são ímpares em uma lista fornecida pelo usuário.

package lista12;

import java.util.Scanner;

public class ExercicioFor04 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos números deseja informar? ");
        int quantidade = scanner.nextInt();

        int contadorPares = 0;
        int contadorImpares = 0;

        for (int i = 1; i <= quantidade; i++) {
            System.out.print("Digite o número " + i + ": ");
            int numero = scanner.nextInt();

            if (numero % 2 == 0) {
                contadorPares++;
            } else {
                contadorImpares++;
            }
        }

        System.out.println("Total de números pares: " + contadorPares);
        System.out.println("Total de números ímpares: " + contadorImpares);

        scanner.close();
    }
}
