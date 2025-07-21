import java.util.Scanner;

public class Nome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nome = "";
        while (nome.length() < 3) {
            System.out.println("Informe o seu nome: ");
            nome = scanner.nextLine();
            if (nome.length() < 3) {
                System.out.println("Erro, tente novamente");
            }
        }
    }
}
