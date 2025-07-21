import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidarCodigo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pattern pattern = Pattern.compile("^[A-Z]{3}[-][0-9]{4}");
        System.out.println("Digite o codigo");
        String senha = scanner.nextLine();
        Matcher matcher = pattern.matcher(senha);

        if (matcher.find()) {
            System.out.printf("Formato adequado");

        }
        else {
            System.out.println("Formato inadequado");
        }
    }
}
