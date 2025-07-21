import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidarCpf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Informe o seu CPF: ");
        String cpf = scanner.nextLine();



        Pattern pattern = Pattern.compile("^[0-9]{3}[.][0-9]{3}[.][0-9]{3}[-][0-9]{2}$");
        Matcher matcher = pattern.matcher(cpf);

        if (matcher.find()) {
            System.out.printf("O CPF: %s está no formato correto", cpf);
        }
        else {
            System.out.printf("O CPF: %s está no formato incorreto", cpf);
        }


    }
}
