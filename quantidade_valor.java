import java.util.Scanner;

public class quantidade_valor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor do produto: ");
        double valor = scanner.nextDouble();

        System.out.println("Digite a quantidade de itens: ");
        double quantidade = scanner.nextDouble();

        double valorFinal = valor * quantidade;

        System.out.println("A compra vai ficar R$" + valorFinal);
    }
}
