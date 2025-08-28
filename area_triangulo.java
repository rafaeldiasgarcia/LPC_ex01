 import java.util.Scanner;

public class AreaTriangulo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double ladoA, ladoB, ladoC, altura, area;

        System.out.println("Digite o valor do lado A do triângulo:");
        ladoA = scanner.nextDouble();

        System.out.println("Digite o valor do lado B do triângulo:");
        ladoB = scanner.nextDouble();

        System.out.println("Digite o valor do lado C do triângulo:");
        ladoC = scanner.nextDouble();

        if (ladoA <= 0 || ladoB <= 0 || ladoC <= 0) {

            System.out.println("Os lados devem ser maiores que zero. Não é possível formar um triângulo.");
            return;

        }

        if (ladoA + ladoB <= ladoC || ladoA + ladoC <= ladoB || ladoB + ladoC <= ladoA) {

            System.out.println("Esses valores NÃO formam um triângulo válido.");
            return;

        }

        if (ladoA == ladoB && ladoA == ladoC) {
            // Equilátero
            area = (ladoA * ladoA * Math.sqrt(3)) / 4;

            System.out.println("O triângulo é Equilátero e sua área é: " + area);

        } else if (ladoA == ladoB || ladoA == ladoC || ladoB == ladoC) {
            // Isósceles
            double ladoIgual, baseIso;

            if (ladoA == ladoB) {

                ladoIgual = ladoA;
                baseIso = ladoC;

            } else if (ladoA == ladoC) {

                ladoIgual = ladoA;
                baseIso = ladoB;

            } else {

                ladoIgual = ladoB;
                baseIso = ladoA;

            }

            altura = Math.sqrt(ladoIgual * ladoIgual - (baseIso / 2) * (baseIso / 2));
            area = (baseIso * altura) / 2;

            System.out.println("O triângulo é Isósceles e sua área é: " + area);

        } else {
            // Escaleno
            double semiperimetro = (ladoA + ladoB + ladoC) / 2;
            area = Math.sqrt(semiperimetro * (semiperimetro - ladoA) * (semiperimetro - ladoB) * (semiperimetro - ladoC));

            System.out.println("O triângulo é Escaleno e sua área é: " + area);

        }

    }

}