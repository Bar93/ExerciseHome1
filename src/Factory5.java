import java.util.Scanner;

public class Factory5 {
    public static void main (String [] args){
        Scanner scanner = new Scanner(System.in);
        int x =1;
        while (x==1) {
            System.out.println("press 1 if senior and 0 if junior");
            int kind = scanner.nextInt();
            System.out.println("enter number of hours");
            int hours = scanner.nextInt();
            System.out.println("enter number of bonus day");
            int bonus = scanner.nextInt();
            employ(kind, hours, bonus);
            System.out.println("for new employ press 1 to end press 0");
            x = scanner.nextInt();
        }
    }
    public static void employ (int kind, int hours, int bonus){
        int salery;
        if (kind ==0) {
            salery = 50 * hours + bonus * 250;
            System.out.println("the salery is" + salery);
        }
            else {
                salery = 200*hours+bonus*250;
                System.out.println("the salery is" + salery);
            }
        }

    }

