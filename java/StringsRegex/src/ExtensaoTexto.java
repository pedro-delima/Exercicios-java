import java.util.Scanner;

public class ExtensaoTexto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o nome do arquivo: ");
        String nomeArquivo = scanner.nextLine();

        int posicaoPonto = nomeArquivo.lastIndexOf(".");
        if (posicaoPonto != -1) {
            String nomeSemExtensao = nomeArquivo.substring(0, posicaoPonto);
            System.out.println("Nome do arquivo sem extensao: "+ nomeSemExtensao);
        }
        else {
            System.out.println("O arquivo nao possui extensao");
        }
    }
}
