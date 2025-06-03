//2) Calcule a soma dos dígitos de um número inteiro fornecido pelo usuário.

package lista12;

import java.util.Scanner;

public class ExercicioForNumeroFornecidoPeloUsuario02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        int somaDigitos = 0;
        int num = Math.abs(numero);  // Para lidar com números negativos

        while (num > 0) {
            somaDigitos += num % 10;  // Pega o último dígito
            num /= 10;                // Remove o último dígito
        }

        System.out.println("A soma dos dígitos do número " + numero + " é: " + somaDigitos);

        scanner.close();
    }
}

