import java.util.Scanner;

public class Degraus {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Bem vindo ao programa de degraus");
        System.out.println("Informe a quantidade de dregaus");
        int degraus = leitura.nextInt();
        for (int i = 1; i <= degraus; i++) {
            System.out.printf("Subindo o degrau %s \n", i);
        }

    }
}
