import java.util.Scanner;

public class OpeningTime7 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the day you want");
        int day = scanner.nextInt();
        boolean approved =false;
        if (day >= 6) {
            if (day > 7)
                System.out.println("illegal day");
            else {
                System.out.println("the office are close between friday to saturday");
            }
        }
        else {
            System.out.println("enter the early hour");
            int early = scanner.nextInt();
            System.out.println("enter the late hour");
            int late = scanner.nextInt();
            if (early>23||early<0||late>23||late<0){
                System.out.println("illegal hour");
            }
            if (early>late){
                System.out.println("worng hour");
            }
            else {
                if (day == 3) {
                    if (early < 8 || late > 12) {
                        System.out.println("the opening hours are in tuesday 08:00-12:00");
                    }
                    if (early >= 8 && late <= 12) {
                        approved = true;
                    }
                }
                if (day == 1 || day == 2 || day == 4 || day == 5) {
                    if (early < 9 || late > 17) {
                        System.out.println("the opening hours are in this days 09:00-17:00");
                    }
                    if (early >= 9 && late <= 17) {
                        approved = true;
                    }
                }
            }

            }
            if (approved == true){
                System.out.println("expected");
    }
}
}
