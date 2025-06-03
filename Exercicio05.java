//5) Verifique se um número fornecido pelo usuário é um número perfeito.

package lista12;

import java.util.Scanner;

public class Exercicio05 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro positivo: ");
        int numero = scanner.nextInt();

        if (numero <= 0) {
            System.out.println("Por favor, digite um número inteiro positivo.");
        } else {
            int somaDivisores = 0;
            for (int i = 1; i <= numero / 2; i++) {
                if (numero % i == 0) {
                    somaDivisores += i;
                }
            }

            if (somaDivisores == numero) {
                System.out.println(numero + " é um número perfeito.");
            } else {
                System.out.println(numero + " não é um número perfeito.");
            }
        }

        scanner.close();
    }
}
