import java.util.Scanner;

public class Minusculas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite uma frase");
        String frase = scanner.nextLine();
        String fraseMaiuscula = frase.toUpperCase();
        String fraseMinuscula = frase.toLowerCase();
        System.out.printf("Frase minuscula: %s", fraseMinuscula);
        System.out.printf("\nFrase maiuscula: %s", fraseMaiuscula);

    }
}
