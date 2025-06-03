//1) Imprima os caracteres de uma string fornecida pelo usuário em ordem reversa.

package lista12;

import java.util.Scanner;

public class ExercicioForOrdemReversa01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma string: ");
        String texto = scanner.nextLine();

        System.out.println("String em ordem reversa:");

        for (int i = texto.length() - 1; i >= 0; i--) {
            System.out.print(texto.charAt(i));
        }
        System.out.println();

        scanner.close();
    }
}
