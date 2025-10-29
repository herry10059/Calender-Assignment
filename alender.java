import java.time.LocalDate;
import java.util.Scanner;

public class alender {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the month number (1-12): ");
        int month = sc.nextInt();

        System.out.print("Enter the year: ");
        int year = sc.nextInt();

        LocalDate firstDay = LocalDate.of(year, month, 1);

        System.out.println("\nSu  Mo  Tu  We  Th  Fr  Sa");

        int dayOfWeek = firstDay.getDayOfWeek().getValue();
        if (dayOfWeek == 7) {
            dayOfWeek = 0;
        }

        for (int i = 0; i < dayOfWeek; i++) {
            System.out.print("    ");
        }

        for (int day = 1; day <= firstDay.lengthOfMonth(); day++) {
            System.out.printf("%2d  ", day);
            if ((day + dayOfWeek) % 7 == 0) {
                System.out.println();
            }
        }

        sc.close();
    }
}
