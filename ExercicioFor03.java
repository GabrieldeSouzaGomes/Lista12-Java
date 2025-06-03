//3) Imprima os primeiros N termos da série de números triangulares.

package lista12;

import java.util.Scanner;

public class ExercicioFor03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite quantos termos N da série triangular você quer imprimir: ");
        int N = scanner.nextInt();

        System.out.println("Primeiros " + N + " números triangulares:");

        for (int i = 1; i <= N; i++) {
            int termo = i * (i + 1) / 2;
            System.out.println("Termo " + i + ": " + termo);
        }

        scanner.close();
    }
}
