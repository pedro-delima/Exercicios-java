import java.time.LocalDate;

public class LembreteData {
    public static void main(String[] args) {
        LocalDate dataVencimento = LocalDate.of(2025, 8, 20);
        LocalDate aviso = dataVencimento.minusDays(15);
        System.out.println("O aviso será desparado na data: "+ aviso);
    }
}
