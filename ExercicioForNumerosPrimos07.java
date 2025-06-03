//7) Imprima os números primos dentro de um intervalo fornecido pelo usuário.

package lista12;

import java.util.Scanner;

public class ExercicioForNumerosPrimos07 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o início do intervalo: ");
        int inicio = scanner.nextInt();

        System.out.print("Digite o fim do intervalo: ");
        int fim = scanner.nextInt();

        // Garante que inicio seja menor ou igual a fim
        if (inicio > fim) {
            int temp = inicio;
            inicio = fim;
            fim = temp;
        }

        System.out.println("Números primos no intervalo de " + inicio + " a " + fim + ":");

        for (int num = inicio; num <= fim; num++) {
            if (num > 1 && ehPrimo(num)) {
                System.out.println(num);
            }
        }

        scanner.close();
    }

    // Método para verificar se um número é primo
    private static boolean ehPrimo(int numero) {
        if (numero <= 1) return false;
        if (numero == 2) return true;
        if (numero % 2 == 0) return false;

        int raiz = (int) Math.sqrt(numero);
        for (int i = 3; i <= raiz; i += 2) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
}

