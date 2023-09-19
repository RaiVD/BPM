package org.example.fase1.desafioUm;

import java.util.Scanner;

public class Exercico4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Qual a nota do aluno: ");
        double note = scanner.nextDouble();

        String resultado = validNote(note);
        System.out.println("Resultado: " + resultado);
    }

    public static String validNote(double note) {
        if (note >= 8) {
            return "Aprovado";
        } else if (note >= 6) {
            return "Em recuperação";
        } else if (note < 6) {
            return "Reprovado";
        } else {
            return "Valor inválido";
        }
    }

}
