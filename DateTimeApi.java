import java.time.*;

public class DateTimeApi {
    public static void main(String args[])
    {
        LocalDate d=LocalDate.now();
        System.out.println(d.getYear());
        System.out.println(d.getMonth());
        System.out.println(d.getMonthValue());
        System.out.println(d.getDayOfMonth());
        System.out.println(d.getDayOfWeek());
        System.out.println(d.getDayOfYear());
        System.out.println(d);
        Instant i=Instant.now();
        System.out.println(i);
        LocalDate d1=LocalDate.of(2023,12,31);
        System.out.println(d1);
        LocalTime it=LocalTime.now();
        System.out.println(it);
        LocalTime it1=LocalTime.of(13,04);
        System.out.println(it1);
        LocalDateTime idt=LocalDateTime.now(ZoneId.of("Australia/Melbourne"));
        System.out.println(idt);



    }
}
