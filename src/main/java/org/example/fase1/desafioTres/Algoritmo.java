package org.example.fase1.desafioTres;

import java.util.Scanner;

public class Algoritmo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean entrada = false;

        while (!entrada) {
            try {
                System.out.print("Digite um valor inteiro entre 0 e 13: ");
                int n = scanner.nextInt();

                if (n >= 0 && n < 13) {
                    calculeFatorial(n);
                    entrada = true;
                } else {
                    System.out.println("O valor de informado está fora do intervalo permitido.");
                }
            } catch (java.util.InputMismatchException e) {
                System.out.println("Entrada inválida. Certifique-se de digitar um número inteiro.");
            }
        }
    }

    public static void calculeFatorial(int n) {
        int fatorial = 1;

        for (int i = 1; i <= n; i++) {
            fatorial *= i;
        }
        System.out.println("O fatorial de " + n + " é: " + fatorial);
    }
}

