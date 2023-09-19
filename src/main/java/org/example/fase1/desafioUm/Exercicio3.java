package org.example.fase1.desafioUm;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma letra: ");
        char letra = scanner.next().charAt(0);

        validCharValue(letra);
    }
    public static void validCharValue(char letra) {
        if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u' || letra == 'A' || letra == 'E' || letra == 'I' || letra == 'O' || letra == 'U') {
            System.out.println(letra + " é uma vogal.");
        } else if ((letra >= 'a' && letra <= 'z') || (letra >= 'A' && letra <= 'Z')) {
            System.out.println(letra + " é uma consoante.");
        } else {
            System.out.println("Você não digitou uma letra válida.");
        }
    }
}
