import java.time.*;

class A8b {
    public static void main(String[] args) {
        LocalDate currentDate = LocalDate.now();
        LocalTime currentTime = LocalTime.now();
        LocalDateTime currentDateTime = LocalDateTime.of(currentDate, currentTime);
        LocalDateTime finalExamDateTime = LocalDateTime.of(2025, Month.AUGUST,5,12,0);
        Duration timeTillFinalExam = Duration.between(currentDateTime, finalExamDateTime);

        System.out.println(timeTillFinalExam.toHours() + " hours remaining until final exam.");
        System.out.println(timeTillFinalExam.getSeconds() / 3600 + " hours remaining until final exam.");
        double days = timeTillFinalExam.toDays();
        double hours = timeTillFinalExam.toHours();
        double minutes = timeTillFinalExam.toMinutes();
        double seconds = timeTillFinalExam.toSeconds();

        System.out.println((days*24 + hours + minutes/60 + seconds/3600) / 4 + " hours remaining until final exam.");
        System.out.println(days*24 + " hours remaining until final exam.");
        System.out.println(hours + " hours remaining until final exam.");
        System.out.println(minutes/60 + " hours remaining until final exam.");
        System.out.println(seconds/3600 + " hours remaining until final exam.");
    }
}