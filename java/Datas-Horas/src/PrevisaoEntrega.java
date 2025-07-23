import java.time.LocalDate;
import java.time.LocalTime;

public class PrevisaoEntrega {
    public static void main(String[] args) {
        LocalDate dataCompra = LocalDate.of(2025, 7, 22);
        LocalDate datEntrega = dataCompra.plusDays(15);

        System.out.println("Data entrega: "+ datEntrega);
    }
}
