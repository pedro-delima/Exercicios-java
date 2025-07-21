import java.util.Scanner;

public class RemovendoEspacos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um nome");
        String nome = scanner.nextLine();
        String nomeSemEspaco = nome.trim();
        System.out.println("Nome sem espaco: "+ nomeSemEspaco);

    }
}
