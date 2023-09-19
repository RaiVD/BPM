package org.example.fase1.desafioDois;

import java.util.Scanner;

public class ConsumaMedioCombustivel {
    public static void main(String[] args) {
        boolean entrada = false;

        while (!entrada) {
            try {
                int distancia = ValidInput.readIntFromUser("Qual a distância total percorrida (em Km): ");
                double combustivel = ValidInput.readDoubleFromUser("Qual o total de combustível consumido (um digito após o ponto): ");

                ConsumoMedioService service = new ConsumoMedioService();
                double mediaConsumo = service.calcularConsumoMedio(distancia, combustivel);

                System.out.printf("O consumo médio do automóvel é: %.3f km/l%n", mediaConsumo);
                entrada = true;
            } catch (java.util.InputMismatchException e) {
                System.out.println("Entrada inválida. Certifique-se de digitar um número inteiro ou real válido.");
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}

class ConsumoMedioService {
    public double calcularConsumoMedio(int distancia, double combustivel) {
        if (distancia < 0 || combustivel <= 0) {
            throw new IllegalArgumentException("A distância e o combustível não podem ser menores ou iguais a zero.");
        }
        return distancia / combustivel;
    }
}

