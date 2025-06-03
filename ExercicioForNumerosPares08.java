//8) Calcule a soma dos dígitos de todos os números pares dentro de um intervalo fornecido pelo usuário.

package lista12;

import java.util.Scanner;

public class ExercicioForNumerosPares08 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o início do intervalo: ");
        int inicio = scanner.nextInt();

        System.out.print("Digite o fim do intervalo: ");
        int fim = scanner.nextInt();

        int somaTotalDigitos = 0;

        // Ajusta para garantir que inicio <= fim
        if (inicio > fim) {
            int temp = inicio;
            inicio = fim;
            fim = temp;
        }

        for (int num = inicio; num <= fim; num++) {
            if (num % 2 == 0) { // verifica se é par
                somaTotalDigitos += somaDigitos(num);
            }
        }

        System.out.println("A soma dos dígitos de todos os números pares no intervalo é: " + somaTotalDigitos);

        scanner.close();
    }

    // Método para calcular a soma dos dígitos de um número
    private static int somaDigitos(int numero) {
        int soma = 0;
        int num = Math.abs(numero); // para lidar com números negativos, se houver

        while (num > 0) {
            soma += num % 10;
            num /= 10;
        }

        return soma;
    }
}

