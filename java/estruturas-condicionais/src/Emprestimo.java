import java.util.Scanner;
public class Emprestimo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o valor do emprestimo: ");
        double valorEmprestimo = scanner.nextDouble();
        String situacao = "Negado";
        if (valorEmprestimo < 1000 || valorEmprestimo > 5000) {
            situacao = "Negado";
        }
        else {
            situacao = "Aprovado";
        }
        System.out.println("Emprestimo "+ situacao);
    }
}
