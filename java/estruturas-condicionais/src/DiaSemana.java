import java.util.Scanner;
public class DiaSemana {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o dia da semana em letras minusculas");
        String diaSemana = scanner.nextLine();
        if (diaSemana.equals("sabado") || diaSemana.equals("domingo")) {
            System.out.println("Fim de semana");
        }
        else {
            System.out.println("Dia util");
        }
    }
}
