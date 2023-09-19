package org.example.fase1.desafioDois;

import java.util.Scanner;

public class ConsumaMedioCombustivel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Qual a distância total percorrida (em Km): ");
            int distancia = scanner.nextInt();

            System.out.print("Qual o total de combustível consumido (em litro): ");
            double combustivel = scanner.nextDouble();

            if(distancia < 0 || combustivel < 0){
                System.out.println("A distÂncia e o combustivel não pode ser inferior a 0!");
            }else {
                double mediaConsumo = distancia / combustivel;
                System.out.printf("O consumo médio do automóvel é: %.3f km/l%n", mediaConsumo);
            }
        } catch (java.util.InputMismatchException e) {
            System.out.println("Entrada inválida. Certifique-se de digitar um número inteiro.");
        }
    }
}
