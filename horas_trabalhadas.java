import java.util.Scanner;

public class horas_trabalhadas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantas horas foram trabalhadas?");
        double horasTrabalhadas = scanner.nextDouble();

        System.out.println("Quanto você recebe por hora?");
        double valorHoras = scanner.nextDouble();

        System.out.println("Quantos % de imposto sera retido?");
        double valorImposto = scanner.nextDouble() / 100;

        double salario = horasTrabalhadas * valorHoras;

        double salarioFinal = salario - (salario * valorImposto);
        System.out.println("Seu salário é de R$" + salarioFinal);
    }
}
