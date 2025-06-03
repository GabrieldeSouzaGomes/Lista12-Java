//9) Imprima os elementos de uma lista fornecida pelo usuário em ordem inversa.

package lista12;

import java.util.Scanner;

public class ExercicioForQntsDigitosZeroPeloUsuario10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos números deseja informar? ");
        int quantidade = scanner.nextInt();

        int[] lista = new int[quantidade];

        for (int i = 0; i < quantidade; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            lista[i] = scanner.nextInt();
        }

        System.out.println("Elementos na ordem inversa:");

        for (int i = quantidade - 1; i >= 0; i--) {
            System.out.println(lista[i]);
        }

        scanner.close();
    }
}
