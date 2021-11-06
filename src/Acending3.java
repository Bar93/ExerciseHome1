import java.util.Scanner;

public class Acending3 {
    public static void main (String [] args) {
        Scanner scanner = new Scanner(System.in);
        int num1, num2, num3;
        System.out.println("Enter three numbers");
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();
        num3 = scanner.nextInt();
        int big=0, mid=0, small=0;
        if (num1 > num2 && num1 > num3) {
            big = num1;
            mid =Math.max (num2,num3);
            small = Math.min (num2,num3);
        }
        if (num2 > num1 && num2 > num3) {
            big = num2;
            mid =Math.max (num3,num1);
            small = Math.min (num3,num1);
        }
        if (num3 > num1 && num3 > num2) {
            big = num3;
            mid =Math.max (num2,num1);
            small = Math.min (num2,num1);
        }
        System.out.println("the order is" +small +   mid    +   big);



    }

}




