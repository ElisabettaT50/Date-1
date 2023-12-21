import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

/*
Crea un oggetto OffsetDateTime da questa stringa 2002-03-01T13:00:00Z
Formatta la data ottenuta in FULL, MEDIUM e SHORT
Stampa le varie versioni
 */
public class Main {
    public static void main(String[] args) {
        ZonedDateTime date = OffsetDateTime.parse("2002-03-01T13:00:00Z").atZoneSimilarLocal(ZoneId.of("GMT"));
        String formattedDateF = date.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL));
        String formattedDateL = date.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.LONG));
        String formattedDateM = date.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM));
        String formattedDateS = date.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT));

        System.out.println(formattedDateS);
        System.out.println(formattedDateM);
        System.out.println(formattedDateL);
        System.out.println(formattedDateF);
    }
}