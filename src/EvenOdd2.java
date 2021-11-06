import java.util.Scanner ;

public class EvenOdd2 {
    public static void main (String [] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two numbers");
        int number1, number2, sum;
        number1 = scanner.nextInt();
        number2 = scanner.nextInt();
        sum = number1 + number2;
        if (sum % 2 == 0) {
            System.out.println("The sum is even");
        } else {
            System.out.println("The sum is odd");
        }
    }
}
