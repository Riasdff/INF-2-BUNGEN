import java.time.*;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

class A8a {
    public static void main(String[] args) {
        System.out.print("Your Birthday (YYYY-MM-DD): ");
        Scanner birthday = new Scanner(System.in);

        String bDay = birthday.nextLine();

        System.out.println(bDay);
        createLocalData(bDay);
    }
    public static void createLocalData(String bDay) {
        LocalDate nextBirthday = LocalDate.parse(bDay);
        while (nextBirthday.isBefore(LocalDate.now())) {
            nextBirthday = nextBirthday.plusYears(1);
        }
        System.out.println(nextBirthday);
        double daysTillNextBday = ChronoUnit.DAYS.between(LocalDate.now(), nextBirthday);
        System.out.println("Next birthday is in " + daysTillNextBday + " days.");
    }
}