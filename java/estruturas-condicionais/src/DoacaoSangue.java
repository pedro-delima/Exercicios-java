import java.util.Scanner;
public class DoacaoSangue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe sua Idade");
        int idade = scanner.nextInt();
        System.out.println("Informe seu peso");
        double peso = scanner.nextDouble();

        if (idade > 18 && idade < 65 && peso > 50) {
            System.out.println("Voce pode doar sangue");
        }
        else {
            System.out.println("Voce n'ao pode doar sangue");
        }

    }
}
