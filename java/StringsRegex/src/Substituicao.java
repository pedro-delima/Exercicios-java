import java.util.Scanner;

public class Substituicao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe a frase: ");
        String frase = scanner.nextLine();

        System.out.println("Informe a palavra que deseja substituir: ");
        String palavraSubstituida = scanner.nextLine();

        System.out.println("Informe a palavra substituta: ");
        String palavraSubstituta = scanner.nextLine();

        String novaFrase = frase.replace(palavraSubstituida, palavraSubstituta);
        System.out.println(novaFrase);
    }
}
