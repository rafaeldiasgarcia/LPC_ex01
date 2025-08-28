import java.util.Scanner;

public class area_triangulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double ladoA, ladoB, base, altura, area;

        System.out.println("Qual o valor do lado A do triângulo?");
        ladoA = scanner.nextDouble();

        System.out.println("Qual o valor do lado B do triângulo?");
        ladoB = scanner.nextDouble();

        System.out.println("Qual o valor da base do triângulo?");
        base = scanner.nextDouble();

        if (ladoA == ladoB && ladoA == base) {
            area = (ladoA * ladoA * Math.sqrt(3)) / 4;
            System.out.println("O triângulo é Equilátero e sua área é: " + area);
        } else if (ladoA == ladoB || ladoA == base || ladoB == base) {
            altura = Math.sqrt(ladoA * ladoA - (base / 2) * (base / 2));
            area = (base * altura) / 2;
            System.out.println("O triângulo é Isósceles e sua área é: " + area);
        } else {
            double semiperimetro = (ladoA + ladoB + base) / 2;
            area = Math.sqrt(semiperimetro * (semiperimetro - ladoA) * (semiperimetro - ladoB) * (semiperimetro - base));
            System.out.println("O triângulo é Escaleno e sua área é: " + area);
        }
    }
}
