import java.time.Duration;
import java.time.LocalTime;
import java.time.Period;
import java.util.Scanner;

public class TempoTarefa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o horario de inicio da tarefa (no formato HH:mm): ");
        String horarioInicial = scanner.nextLine();
        System.out.println("Informe o horario do fim da tarefa (no formato HH:mm): ");
        String horarioFinal = scanner.nextLine();;

        LocalTime horarioInicialConvertido = LocalTime.parse(horarioInicial);
        LocalTime horarioFinalConvertido = LocalTime.parse(horarioFinal);

        Duration diferenca = Duration.between(horarioInicialConvertido, horarioFinalConvertido);
        System.out.println("Diferença horas: "+ diferenca.toHours() + " Diferença minutos: "+ diferenca.toMinutesPart());

    }
}
