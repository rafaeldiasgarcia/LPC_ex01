import java.util.Scanner;

public class calculo_cotacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantos Dolares você quer converter?");
        double quantidadeDolar = scanner.nextDouble();

        System.out.println("Qual o valor de cambio?");
        double valorCambio = scanner.nextDouble();

        double valorReal = quantidadeDolar * valorCambio;

        System.out.println("Você tem R$" + valorReal);
    }
}
