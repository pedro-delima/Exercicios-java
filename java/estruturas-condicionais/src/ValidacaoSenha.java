import java.util.Scanner;
public class ValidacaoSenha {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String senha = "Erro404!";
        System.out.println("Bem vindo ao Banco Legal =)");
        System.out.println("Informe sua senha para acessar sua conta: ");
        String testeSenha = scanner.nextLine();

        if (testeSenha.equals(senha)) {
            System.out.println("Bem vindo");
        }
        else {
            System.out.println("Erro, tente novamente");
        }
    }
}
