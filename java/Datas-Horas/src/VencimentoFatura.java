import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class VencimentoFatura {
    public static void main(String[] args) {
        LocalDate vencimentoPadrao = LocalDate.of(2025, 8, 10); //Informe o vencimento da fatura no formato (yyyy, MM, dd)
        LocalDate novoVencimento = vencimentoPadrao.plusDays(55);

        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("Nova data de vencimento: "+ novoVencimento.format(formato));
    }

}
