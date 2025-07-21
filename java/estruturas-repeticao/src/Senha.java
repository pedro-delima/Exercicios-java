import java.util.Scanner;

public class Senha {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int senhaCorreta = 123456;
        int senha = 0;
        int i = 1;
        while (i <= 3) {
            System.out.println("Digite sua senha: ");
            senha = scanner.nextInt();
            if (senha == senhaCorreta) {
                System.out.println("Senha correta");
                break;
            } else {

                System.out.println(i);

            }
            i++;
        }
    }
}
