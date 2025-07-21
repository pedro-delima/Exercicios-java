import java.util.Scanner;

public class ValorFormatado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o valor");
        double valor = scanner.nextDouble();

        System.out.printf("O valor formatado e %.2f", valor);
    }
}
