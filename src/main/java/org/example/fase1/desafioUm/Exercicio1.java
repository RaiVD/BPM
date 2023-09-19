package org.example.fase1.desafioUm;

import java.util.Scanner;

// 1.Faça um algoritmo que dados 2 números inteiros seja informado na saída do console qual número é o maior
public class Exercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número inteiro: ");
        int numero1 = scanner.nextInt();

        System.out.print("Digite o segundo número inteiro: ");
        int numero2 = scanner.nextInt();

        validValue(numero1, numero2);
    }
    public static void validValue(int numero1, int numero2){
        if (numero1 > numero2) {
            System.out.println(numero1 + " é o maior número.");
        } else if (numero2 > numero1) {
            System.out.println(numero2 + " é o maior número.");
        } else {
            System.out.println("Os números são iguais.");
        }
    }
}