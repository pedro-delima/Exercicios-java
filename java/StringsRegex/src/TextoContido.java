import java.util.Scanner;

public class TextoContido {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a frase: ");
        String frase = scanner.nextLine();

        System.out.println("Digite a palavra");
        String palavra = scanner.nextLine();

        if (frase.contains(palavra)) {
            System.out.println("A frase contem a palvra " + palavra);
        }
        else {
            System.out.println("O texto nao tem a palavra "+ palavra);
        }

    }
}
