import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DataFormatada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o tarefa desejada: ");
        System.out.println("1 - enviar Relatorio");
        System.out.println("2- Excluir relatorio");
        System.out.println("3 - Refazer relatorio");
        System.out.println("4 - sair");
        int resposta = scanner.nextInt();


        LocalDate dataAtual = LocalDate.now();
        LocalTime horarioAtual = LocalTime.now();
        DateTimeFormatter formatoData = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter formatoHoras = DateTimeFormatter.ofPattern("HH:mm");


        if (resposta != 0) {
            System.out.println("Data atual: "+ dataAtual.format(formatoData));
            System.out.println("Horario atual: " + horarioAtual.format(formatoHoras));
        }

    }
}
