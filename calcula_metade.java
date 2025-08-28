import java.util.Scanner;

public class calcula_metade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha um número inteiro: ");
        int numero = scanner.nextInt();

        System.out.println("A metade de " + numero + " é " + numero / 2 + ".");
    }
}
