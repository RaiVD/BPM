package org.example.fase1.desafioUm;

// 2.Faça um algoritmo que receba um número inteiro e retorne se o número é positivo ou negativo

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero1 = scanner.nextInt();

        validValue(numero1);
    }
    public static void validValue(int numero1){
        if (numero1 >= 0) {
            System.out.println(numero1 + " é um numero positivo.");
        } else {
            System.out.println(numero1 + " é um numero negativo.");
        }
    }
}
