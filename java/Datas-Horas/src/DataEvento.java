import java.time.LocalDate;

public class DataEvento {
    public static void main(String[] args) {
        LocalDate dataEvento = LocalDate.of(2025, 6, 15); // Informe a data do evento no formato (yyyy, mm, dd)
        LocalDate dataAtual = LocalDate.now();

        if (dataEvento.isBefore(dataAtual)) {
            System.out.println("O evento ja ocorreu");
        }
        else {
            System.out.println("O evento ainda vai ocorrer");
        }
    }
}
