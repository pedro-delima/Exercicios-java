import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Formatter;
import java.util.Scanner;
import java.util.regex.Pattern;

public class TareaHora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o tarefa desejada: ");
        System.out.println("1 - enviar Relatorio");
        System.out.println("2- Excluir relatorio");
        System.out.println("3 - Refazer relatorio");
        System.out.println("4 - sair");
        int resposta = scanner.nextInt();

        LocalDate dataLocal = LocalDate.now();
        DateTimeFormatter formatoData = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalTime horario = LocalTime.now();

        if (resposta != 0) {
            System.out.println("Data atual: "+ dataLocal.format(formatoData));
            System.out.println("Horario: "+ horario);

        }
    }
}
