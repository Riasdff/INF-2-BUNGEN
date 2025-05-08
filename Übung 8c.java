import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;

class A8c {
    public static void main(String[] args) {
        int counter = 0;
        LocalDateTime nextMeeting = LocalDateTime.of(2025, Month.MAY, 7, 10, 0);
        LocalDateTime[] meetings = new LocalDateTime[31];
        while (nextMeeting.getMonth() == LocalDate.now().getMonth()) {
            if (nextMeeting.getDayOfWeek().getValue() < DayOfWeek.SATURDAY.getValue()) {
                meetings[counter] = nextMeeting;
                counter++;
            }
            nextMeeting = nextMeeting.plusDays(1);
        }
        for (int i = 0; i < counter; i++) {
            System.out.println("Weekday: " + meetings[i].getDayOfWeek() + " and Date: " + meetings[i].toLocalDate());
        }
    }
}