import java.util.Scanner;

public class PulandoCinco {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe um numero: ");
        int numero = scanner.nextInt();

        for (int i = 1; i<= numero; i++) {
            if (i % 10 == 5) {
                continue;
            }
            System.out.printf(" %s ", i);
        }
    }
}
