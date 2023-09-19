package org.example.fase1.desafioUm;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();

        System.out.print("Quantos números você deseja inserir na lista? ");
        int quantidadeNumeros = scanner.nextInt();

        for (int i = 0; i < quantidadeNumeros; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            int numero = scanner.nextInt();
            numeros.add(numero);
        }

        numeros.sort(Collections.reverseOrder());

        System.out.println("Lista ordenada de forma decrescente:");
        for (int numero : numeros) {
            System.out.println(numero);
        }
    }
}

