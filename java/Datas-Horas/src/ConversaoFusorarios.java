import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class ConversaoFusorarios {
    public static void main(String[] args) {
        ZonedDateTime horarioLocal = ZonedDateTime.now();
        ZonedDateTime horarioAustralia = horarioLocal.withZoneSameInstant(ZoneId.of("Australia/Sydney"));

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");
        System.out.println("Horario local: " + horarioLocal.format(formatter));
        System.out.println("Horario sidney: "+ horarioAustralia.format(formatter));
    }
}
