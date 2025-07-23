import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class FusorarioCompra {
    public static void main(String[] args) {

        ZonedDateTime horarioJapao = ZonedDateTime.now(ZoneId.of("Asia/Tokyo"));
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        String horarioFormatado = horarioJapao.format(formatter);

        System.out.println("Horario de Tokio: "+ horarioFormatado);
    }
}
