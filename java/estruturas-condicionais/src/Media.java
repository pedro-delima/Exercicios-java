import java.util.Scanner;
public class Media {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe a nota da primeira prova: ");
        double nota1 = scanner.nextDouble();
        System.out.println("Digite a nota da segunda prova: ");
        double nota2 = scanner.nextDouble();

        double media = (nota1 + nota2) / 2;

        String situacao = "Aprovado";
        if (media >= 7) {
            situacao = "Aprovado";
        } else if (media < 7) {
            situacao = "de Recuperação";
        } else {
            situacao = "Reprovado";
        }
        System.out.println("A sua media foi: "+ media + " e você está "+ situacao);
    }
}
