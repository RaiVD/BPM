package org.example.fase1.desafioDois;

import java.util.Scanner;
import java.util.regex.Pattern;

public class ValidInput {
    private static Scanner scanner = new Scanner(System.in);
    public static double readDoubleFromUser(String mensagem) {
        while (true) {
            System.out.print(mensagem);
            String input = scanner.nextLine();
            if (Pattern.matches("\\d+(\\.\\d{1})?,\\d{1}", input)) {
                try {
                    input = input.replace(',', '.');
                    return Double.parseDouble(input);
                } catch (NumberFormatException e) {
                    System.out.println("Entrada inválida. Por favor, digite um número real válido com um dígito após o ponto decimal.");
                }
            } else {
                System.out.println("Entrada inválida. Por favor, digite um número real válido com um dígito após o ponto decimal ou use vírgula como separador.");
            }
        }
    }

    public static int readIntFromUser(String mensagem) {
        while (true) {
            System.out.print(mensagem);
            String input = scanner.nextLine();
            try {
                return Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Por favor, digite um número inteiro válido.");
            }
        }
    }

}
