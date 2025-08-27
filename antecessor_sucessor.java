import java.util.Scanner;

public class antecessor_sucessor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha um numro intiero: ");
        int numero = scanner.nextInt();

        System.out.println((numero - 1) + " - " + numero + " - " + (numero + 1));
    }
}
