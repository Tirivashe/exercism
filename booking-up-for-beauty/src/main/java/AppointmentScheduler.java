import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

class AppointmentScheduler {
    public LocalDateTime schedule(String appointmentDateDescription) {
        DateTimeFormatter parser = DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm:ss");
        return LocalDateTime.parse(appointmentDateDescription, parser);
    }

    public boolean hasPassed(LocalDateTime appointmentDate) {
        LocalDateTime today = LocalDateTime.now();
        return appointmentDate.isBefore(today);
    }

    public boolean isAfternoonAppointment(LocalDateTime appointmentDate) {
        int hourTime = appointmentDate.getHour();
        return hourTime >= 12 && hourTime < 18;
    }

    public String getDescription(LocalDateTime appointmentDate) {
        DateTimeFormatter printer = DateTimeFormatter.ofPattern("EEEE, MMMM d, yyyy, 'at' h:mm a.", Locale.US);
        return "You have an appointment on " + appointmentDate.format(printer);
    }

    public LocalDate getAnniversaryDate() {
        LocalDate today = LocalDate.now();
        return today.withMonth(9).withDayOfMonth(15);
    }
}
